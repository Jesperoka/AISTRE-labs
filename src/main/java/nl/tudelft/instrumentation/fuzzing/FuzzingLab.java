package nl.tudelft.instrumentation.fuzzing;

import java.util.*;
import java.util.Random;

/**
 * You should write your own solution using this class.
 */
public class FuzzingLab {
        // Constants
        static final int TRACE_LENGTH = 10;
        static final int STRICT_INEQUALITY_MINIMUM_BRANCH_DISTANCE = 1;
        static final int RANDOM_MUTATION_ATTEMPTS = 10;

        // Variables used by the fuzzer
        private static class FuzzerState {
                static List<String> currentTrace; // raii?
                static double currentSumOfBranchDistances = 0;
                static boolean isFinished = false;
        }
        private static final Random rng = new Random(); // make final?
        private static Set<String> triggeredErrorCodes = new HashSet<>();
        private static Set<AbstractMap.SimpleEntry<Boolean, Integer>> uniqueVisitedBranches = new HashSet<>();

        // If a new branch is found, keep track of it and update the total branch distance.
        static void encounteredNewBranch(MyVar condition, boolean value, int line_nr) {
                if (uniqueVisitedBranches.add(new AbstractMap.SimpleEntry<Boolean,Integer>(value, line_nr))) {
                        FuzzerState.currentSumOfBranchDistances += branchDistance(condition, value);
                }
        }

        // Copies the input trace and changes one element to a random element of inputSymbols
        static List<String> fuzz(String[] inputSymbols, List<String> trace){
                List<String> fuzzedTrace = new ArrayList<>(trace);
                fuzzedTrace.set(rng.nextInt(FuzzerState.currentTrace.size()), inputSymbols[rng.nextInt(inputSymbols.length)]);
                return fuzzedTrace;
        }

        /**
         * Generate a random trace from an array of symbols.
         * @param symbols the symbols from which a trace should be generated from.
         * @return a random trace that is generated from the given symbols.
         */
        static List<String> generateRandomTrace(String[] symbols) {
                ArrayList<String> trace = new ArrayList<>();
                for (int i = 0; i < TRACE_LENGTH; i++) {
                        trace.add(symbols[rng.nextInt(symbols.length)]);
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
                        case INT:
                                return Math.abs(condition.left.int_value-condition.right.int_value);
                        case STRING:
                                return editDistance(condition.left.str_value, condition.right.str_value);
                        default:
                                return -1;
                }
        }

        // TODO: function description
        static double branchDistanceNotEquality(MyVar condition) {
                switch (condition.left.type) {
                        case BOOL:
                                return condition.left.value != condition.right.value ? 0 : 1;
                        case INT:
                                return condition.left.int_value != condition.right.int_value ? 0 : 1;
                        case STRING:
                                return condition.left.str_value.equals(condition.right.str_value) ? 1 : 0;
                        default:
                                return -1;
                }
        }

        static double branchDistanceLessThan(MyVar condition, int k) {
                if (condition.left.type == TypeEnum.INT) {
                        return condition.left.int_value < condition.right.int_value ? 0 : condition.left.int_value - condition.right.int_value + k;
                }
                return -1;
        }

        static double branchDistanceGreaterThan(MyVar condition, int k) {
                if (condition.left.type == TypeEnum.INT) {
                        return condition.left.int_value > condition.right.int_value ? 0 : condition.right.int_value - condition.left.int_value + k;
                }
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
                                branchDistance = condition.left.value ? 0 : 1;
                                break;
                        case BINARY:
                                branchDistance = branchDistanceBinary(condition, value);
                                break;
                        default:
                                System.out.println("Unexpected condition type: " + condition.type);
                                throw new IllegalArgumentException("Unexpected or unknown condition\n");
                    }

                if (branchDistance < 0) { 
                        throw new IllegalArgumentException("Negative branch distance!\n"); 
                }

                branchDistance = branchDistance / (branchDistance + 1);
                if (!value) { 
                        branchDistance = 1 - branchDistance; 
                }
                return branchDistance;
        }

        
        
        static void run() {
                // Initialize
                int maxIterations = 1000;
                FuzzerState.currentTrace = generateRandomTrace(DistanceTracker.inputSymbols);
                DistanceTracker.runNextFuzzedSequence(FuzzerState.currentTrace.toArray(new String[0]));

                int i = 0;
                while(!FuzzerState.isFinished && i <= maxIterations) {
                        List<String> bestNewTrace = FuzzerState.currentTrace;
                        double bestNewDistance = FuzzerState.currentSumOfBranchDistances;

                        // try X random mutations of the current trace.
                        for(int j = 0; j < RANDOM_MUTATION_ATTEMPTS; j++) {
                                FuzzerState.currentSumOfBranchDistances = 0;
                                List<String> fuzzedTrace = fuzz(DistanceTracker.inputSymbols, FuzzerState.currentTrace);
                                DistanceTracker.runNextFuzzedSequence(fuzzedTrace.toArray(new String[0]));
                                if (FuzzerState.currentSumOfBranchDistances < bestNewDistance) {
                                        bestNewTrace = fuzzedTrace;
                                        bestNewDistance = FuzzerState.currentSumOfBranchDistances;
                                }
                        }
                        // if no better trace was found, reset. Otherwise update the current trace.
                        if (FuzzerState.currentTrace.equals(bestNewTrace)) {
                                FuzzerState.currentSumOfBranchDistances = 0;
                                FuzzerState.currentTrace = generateRandomTrace(DistanceTracker.inputSymbols);
                                DistanceTracker.runNextFuzzedSequence(FuzzerState.currentTrace.toArray(new String[0]));
                        } else {
                                FuzzerState.currentTrace = bestNewTrace;
                        }
                        i++;
                }
                System.out.println("\nNumber of unique branches: " + uniqueVisitedBranches.size() + "\n");
                System.out.println("Error codes triggered:\n" + triggeredErrorCodes + "\n");
        }

        /**
         * Method that is used for catching the output from standard out.
         * You should write your own logic here.
         * @param out the string that has been outputted in the standard out.
         */
        public static void output(String out){
                System.out.println(out);
                String[] splitOutput = out.split("error_", 2);
                if (splitOutput.length == 2) {
                        triggeredErrorCodes.add(splitOutput[1]);
                }
        }
}
