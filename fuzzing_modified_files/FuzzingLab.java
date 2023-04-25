package nl.tudelft.instrumentation.fuzzing;

import java.util.*;

/**
 * You should write your own solution using this class.
 */
public class FuzzingLab {
        // Constants
        private static final int INITIAL_TRACE_LENGTH = 3; // must be greater than or equal to MAX_MUTATION_REACH
        private static final int MAX_MUTATION_REACH = 3; 
        private static final int STRICT_INEQUALITY_MINIMUM_BRANCH_DISTANCE = 1;
        private static final int RANDOM_MUTATION_ATTEMPTS = 10;
        private static final long NANOSECS_PER_SEC = 1000l*1000*1000;
        private static final long FIVE_MIN_IN_NANOSECS = 5*60*NANOSECS_PER_SEC;

        private static final Random RNG = new Random();

        // Variables used by the fuzzer
        private static class FuzzerState {
                static List<String> currentTrace = Arrays.asList("");
                static double currentSumOfBranchDistances = 0;
                static Set<AbstractMap.SimpleEntry<Boolean, Integer>> currentUniqueBranchesCovered = new HashSet<>();
                static boolean isFinished = false;
        }
        // Values output by the fuzzer at the end
        private static class FuzzerOutput {
                static Set<String> triggeredErrorCodes = new HashSet<>();
                static Set<AbstractMap.SimpleEntry<Boolean, Integer>> uniqueVisitedBranches = new HashSet<>();
                static int mostBranchesCovered = 0;
                static List<String> mostCoveringInput = Arrays.asList("");

                static void display() {
                        System.out.println("\nNumber of unique branches: " + FuzzerOutput.uniqueVisitedBranches.size() + "\n");
                        System.out.println("Error codes triggered:\n" + FuzzerOutput.triggeredErrorCodes + "\n");
                        System.out.println("The input covering the most branches was:\n" + FuzzerOutput.mostCoveringInput + "\nWith " + FuzzerOutput.mostBranchesCovered + " branches covered.\n");
                }
        }

        // If a new branch is found, keep track of it and update the total branch distance.
        static void encounteredNewBranch(MyVar condition, boolean value, int line_nr) {
                FuzzerState.currentUniqueBranchesCovered.add(new AbstractMap.SimpleEntry<Boolean, Integer>(value, line_nr));
                FuzzerState.currentSumOfBranchDistances += branchDistance(condition, value);
                FuzzerOutput.uniqueVisitedBranches.add(new AbstractMap.SimpleEntry<Boolean, Integer>(value, line_nr));
                if (FuzzerState.currentUniqueBranchesCovered.size() > FuzzerOutput.mostBranchesCovered) {
                        FuzzerOutput.mostBranchesCovered = FuzzerState.currentUniqueBranchesCovered.size();
                        FuzzerOutput.mostCoveringInput = FuzzerState.currentTrace;
                }
        }

        // Copies the input trace and makes MAX_MUTATION_REACH number of mutations, deletions and extensions respectively.
        static List<String> fuzz(String[] inputSymbols, List<String> trace){
                List<String> fuzzedTrace = new ArrayList<>(trace);
                for (int i = 0; i < MAX_MUTATION_REACH; i++) {
                        fuzzedTrace.set(RNG.nextInt(fuzzedTrace.size()), inputSymbols[RNG.nextInt(inputSymbols.length)]);       // multiple single element mutations
                        fuzzedTrace.remove(RNG.nextInt(fuzzedTrace.size()));                                                    // multiple single element deletions
                        fuzzedTrace.add(inputSymbols[RNG.nextInt(inputSymbols.length)]);                                        // multiple single element extensions
                }
                return fuzzedTrace;
        }

        /**
         * Helper function for getting the value of Unary expressions.
         * @param condition the MyVar object which holds the required int value.
         * @return the int value of the condition
         */
        private static int getIntValue(MyVar condition) {
                if(condition.type == TypeEnum.INT) {
                        return condition.int_value;
                }
                return -getIntValue(condition.left);
        }

        /**
         * Generate a random trace from an array of symbols.
         * @param symbols the symbols from which a trace should be generated from.
         * @return a random trace that is generated from the given symbols.
         */
        static List<String> generateRandomTrace(String[] symbols, int length) {
                ArrayList<String> trace = new ArrayList<>();
                for (int i = 0; i < length; i++) {
                        trace.add(symbols[RNG.nextInt(symbols.length)]);
                }
                return trace;
        }

        // TODO: function description
        static double editDistance(String leftString, String rightString) {
                int m = leftString.length();
                int n = rightString.length();
                int[][] table = new int[m + 1][n + 1];
                for (int i = 0; i <= m; i++) {
                        for (int j = 0; j <= n; j++) {
                                // If first string is empty
                                if (i == 0)
                                        table[i][j] = j;
                                // If second string is empty
                                else if (j == 0)
                                        table[i][j] = i;
                                // If last characters are same
                                else if (leftString.charAt(i - 1) == rightString.charAt(j - 1))
                                        table[i][j] = table[i - 1][j - 1];
                                // If the last character is different
                                else
                                        table[i][j] = 1 + Math.min(table[i][j - 1], Math.min(table[i - 1][j], table[i - 1][j - 1]));
                        }
                }
                return table[m][n];
        }

        // TODO: function description
        static double branchDistanceEquality(MyVar condition) {
                switch (condition.left.type) {
                        case BOOL:
                                return condition.left.value == condition.right.value ? 0 : 1;
                        case UNARY:
                                System.out.println("Found unary operator in equality: " + condition.operator + " " + condition.left.value);
                                return -1;
                        case INT:
                                return Math.abs(getIntValue(condition.left)-getIntValue(condition.right));
                        case STRING:
                                return editDistance(condition.left.str_value, condition.right.str_value);
                        default:
                                System.err.println("Equality | Unknown type: " + condition.toString());
                                return -1;
                }
        }

        // TODO: function description
        static double branchDistanceNotEquality(MyVar condition) {
                switch (condition.left.type) {
                        case BOOL:
                                return condition.left.value != condition.right.value ? 0 : 1;
                        case INT:
                                return getIntValue(condition.left) != getIntValue(condition.right) ? 0 : 1;
                        case STRING:
                                return condition.left.str_value.equals(condition.right.str_value) ? 1 : 0;
                        default:
                                System.err.println("NotEquality | Unknown type: " + condition.toString());
                                return -1;
                }
        }

        static double branchDistanceLessThan(MyVar condition, int k) {
                if (condition.left.type == TypeEnum.INT || condition.left.type == TypeEnum.UNARY) {
                        return getIntValue(condition.left) < getIntValue(condition.right) ? 0 : getIntValue(condition.left) - getIntValue(condition.right) + k;
                }
                System.err.println("LessThan | not an INT: " + condition.toString());
                return -1;
        }

        static double branchDistanceGreaterThan(MyVar condition, int k) {
                if (condition.left.type == TypeEnum.INT || condition.left.type == TypeEnum.UNARY) {
                        return getIntValue(condition.left) > getIntValue(condition.right) ? 0 : getIntValue(condition.right) - getIntValue(condition.left) + k;
                }
                System.err.println("GreaterThan | not an INT: " + condition.toString());
                return -1;
        }

        static double branchDistanceLessThanEqual(MyVar condition) {
                return branchDistanceLessThan(condition, 0);
        }

        static double branchDistanceGreaterThanEqual(MyVar condition) {
                return branchDistanceGreaterThan(condition, 0);
        }

        static double branchDistanceBinary(MyVar condition, boolean value) {
                switch (condition.operator) {
                        case "==":
                                return branchDistanceEquality(condition);
                        case "!=":
                                return branchDistanceNotEquality(condition);
                        case "<=":
                                return branchDistanceLessThanEqual(condition);
                        case ">=":
                                return branchDistanceGreaterThanEqual(condition);
                        case "<":
                                return branchDistanceLessThan(condition, STRICT_INEQUALITY_MINIMUM_BRANCH_DISTANCE);
                        case ">":
                                return branchDistanceGreaterThan(condition, STRICT_INEQUALITY_MINIMUM_BRANCH_DISTANCE);
                        case "&":
                        case "&&":
                                return branchDistance(condition.left, value) + branchDistance(condition.right, value);
                        case "|":
                        case "||":
                                return Math.min(branchDistance(condition.left, value), branchDistance(condition.right, value));
                        default:
                                System.err.println(condition.operator + " |  is UNKNOWN");
                                throw new IllegalArgumentException("Unexpected or unknown condition\n");
                }
        }


        static double branchDistance(MyVar condition, boolean value) {
                double branchDistance = -1;
                switch (condition.type) {
                        case BOOL:
                                branchDistance = condition.value ? 1 : 0; 
                                break;
                        case UNARY:
                                branchDistance = 1 - branchDistance(condition.left, value);
                                break;
                        case BINARY:
                                branchDistance = branchDistanceBinary(condition, value);
                                break;
                        default:
                                System.out.println("Unexpected condition type: " + condition.type);
                                throw new IllegalArgumentException("Unexpected or unknown condition\n");
                    }

                if (branchDistance < 0) { 
                        throw new IllegalArgumentException("Negative branch distance for condition:\n" + condition.toString() + "!\n");
                }

                branchDistance = branchDistance / (branchDistance + 1);
                if (!value) { 
                        branchDistance = 1 - branchDistance; 
                }
                return branchDistance;
        }

        
        
        static void run() {
                if(!(INITIAL_TRACE_LENGTH >= MAX_MUTATION_REACH)) {throw new AssertionError("INITIAL_TRACE_LENGTH must be >= MAX_MUTATION_REACH"); }; // assert keyword is turned off by default, I don't want that here.
                // Initialize
                // put this to 1000 for testing purposes.
                int maxIterations = 1000;
                int traceLength = INITIAL_TRACE_LENGTH;
                FuzzerState.currentTrace = generateRandomTrace(DistanceTracker.inputSymbols, traceLength);
                DistanceTracker.runNextFuzzedSequence(FuzzerState.currentTrace.toArray(new String[0]));

                int i = 0;
                double startTime = System.nanoTime();
                while(!FuzzerState.isFinished) { // && i <= maxIterations
                        List<String> bestNewTrace = FuzzerState.currentTrace;
                        double bestNewDistance = FuzzerState.currentSumOfBranchDistances;

                        // try X mutations of the current trace.
                        for(int j = 0; j < RANDOM_MUTATION_ATTEMPTS; j++) {
                                FuzzerState.currentSumOfBranchDistances = 0;
                                FuzzerState.currentUniqueBranchesCovered.clear();
                                List<String> fuzzedTrace = fuzz(DistanceTracker.inputSymbols, FuzzerState.currentTrace);
                                DistanceTracker.runNextFuzzedSequence(fuzzedTrace.toArray(new String[0]));
                                if (FuzzerState.currentSumOfBranchDistances < bestNewDistance) {
                                        bestNewTrace = fuzzedTrace;
                                        bestNewDistance = FuzzerState.currentSumOfBranchDistances;
                                }
                        }
                        // if no better trace was found, reset. Otherwise update the current trace.
                        if (FuzzerState.currentTrace.equals(bestNewTrace)) {
                                System.out.println("!no new better fuzzed trace!");
                                FuzzerState.currentSumOfBranchDistances = 0;
                                FuzzerState.currentUniqueBranchesCovered.clear();
                                FuzzerState.currentTrace = generateRandomTrace(DistanceTracker.inputSymbols, ++traceLength);
                                DistanceTracker.runNextFuzzedSequence(FuzzerState.currentTrace.toArray(new String[0]));
                        } else {
                                FuzzerState.currentTrace = bestNewTrace;
                        }
                        FuzzerState.isFinished = (System.nanoTime() - startTime) < FIVE_MIN_IN_NANOSECS ? false : true;
                        i++;
                }
                FuzzerOutput.display();
        }

        /**
         * Method that is used for catching the output from standard out.
         * You should write your own logic here.
         * @param out the string that has been outputted in the standard out.
         */
        public static void output(String out){
                if (out.contains("no transition")) { return; }
                System.out.println(out);
                String[] splitOutput = out.split("error_", 2);
                if (splitOutput.length == 2) {
                        FuzzerOutput.triggeredErrorCodes.add(splitOutput[1]);
                }
        }
}
