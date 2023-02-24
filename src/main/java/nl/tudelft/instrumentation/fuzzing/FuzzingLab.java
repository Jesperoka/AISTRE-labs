package nl.tudelft.instrumentation.fuzzing;

import java.util.*;
import java.util.Random;

/**
 * You should write your own solution using this class.
 */
public class FuzzingLab {
        static Random r = new Random();
        static List<String> currentTrace;
        static int traceLength = 10;
        static boolean isFinished = false;

        static Set<AbstractMap.SimpleEntry<Boolean, Integer>> totalVisitedBranches = new HashSet<>();
        static int branchesVisited = 0;
        static double totalCurrentBranchDistance = 0;

        //static List<String> bestTrace;

        static void initialize(String[] inputSymbols){
                // Initialise a random trace from the input symbols of the problem.
                currentTrace = generateRandomTrace(inputSymbols);
        }

        /**
         * Write your solution that specifies what should happen when a new branch has been found.
         */
        static void encounteredNewBranch(MyVar condition, boolean value, int line_nr) {
                // do something useful
                //System.out.println(branchDistance(condition, value));
                totalVisitedBranches.add(new AbstractMap.SimpleEntry<Boolean,Integer>(value, line_nr));
                // calculating the total branch distance
                totalCurrentBranchDistance+=branchDistance(condition, value);
                branchesVisited++;
        }

        /**
         * Method for fuzzing new inputs for a program.
         * @param inputSymbols the inputSymbols to fuzz from.
         * @return a fuzzed sequence
         */
        static List<String> fuzz(String[] inputSymbols){
                /*
                 * Add here your code for fuzzing a new sequence for the RERS problem.
                 * You can guide your fuzzer to fuzz "smart" input sequences to cover
                 * more branches. Right now we just generate a complete random sequence
                 * using the given input symbols. Please change it to your own code.
                 */
                List<String> fuzzedTrace = new ArrayList<>(currentTrace);
                fuzzedTrace.set(r.nextInt(currentTrace.size()), inputSymbols[r.nextInt(inputSymbols.length)]);
                return generateRandomTrace(inputSymbols);
        }

        /**
         * Generate a random trace from an array of symbols.
         * @param symbols the symbols from which a trace should be generated from.
         * @return a random trace that is generated from the given symbols.
         */
        static List<String> generateRandomTrace(String[] symbols) {
                ArrayList<String> trace = new ArrayList<>();
                for (int i = 0; i < traceLength; i++) {
                        trace.add(symbols[r.nextInt(symbols.length)]);
                }
                return trace;
        }

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

        static int k = 1;

        static double branchDistanceLessThan(MyVar condition) {
                if (condition.left.type == TypeEnum.INT) {
                        return condition.left.int_value < condition.right.int_value ? 0 : condition.left.int_value - condition.right.int_value + k;
                }
                return -1;
        }

        static double branchDistanceGreaterThan(MyVar condition) {
                if (condition.left.type == TypeEnum.INT) {
                        return condition.left.int_value > condition.right.int_value ? 0 : condition.right.int_value - condition.left.int_value + k;
                }
                return -1;
        }

        static double branchDistanceLessThanEqual(MyVar condition) {
                if (condition.left.type == TypeEnum.INT) {
                        return condition.left.int_value < condition.right.int_value ? 0 : condition.left.int_value - condition.right.int_value;
                }
                return -1;
        }

        static double branchDistanceGreaterThanEqual(MyVar condition) {
                if (condition.left.type == TypeEnum.INT) {
                        return condition.left.int_value > condition.right.int_value ? 0 : condition.right.int_value - condition.left.int_value;
                }
                return -1;
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
                                return branchDistanceLessThan(condition);
                        case ">":
                                return branchDistanceGreaterThan(condition);
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
                // Place here your code to guide your fuzzer with its search.
                int maxIterations = 100;
                int i = 0;

                initialize(DistanceTracker.inputSymbols);
                DistanceTracker.runNextFuzzedSequence(currentTrace.toArray(new String[0]));
                while(!isFinished) {
                        List<String> current = currentTrace;
                        List<String> bestNewTrace = currentTrace;
                        double bestNewDistance = totalCurrentBranchDistance;
                        // try 10 random mutations of the currentTrace.
                        for(int j = 0; j < 10; j++) {
                                totalCurrentBranchDistance = 0;
                                branchesVisited = 0;
                                DistanceTracker.runNextFuzzedSequence(fuzz(DistanceTracker.inputSymbols).toArray(new String[0]));
                                System.out.println("test");
                                //DistanceTracker.runNextFuzzedSequence(currentTrace.toArray(new String[0]));
                                if (totalCurrentBranchDistance < bestNewDistance) {
                                        bestNewTrace = currentTrace;
                                        bestNewDistance = totalCurrentBranchDistance;
                                }
                        }
                        // if no better trace was found reset.
                        if (current.equals(bestNewTrace)) {
                                totalCurrentBranchDistance = 0;
                                branchesVisited = 0;
                                initialize(DistanceTracker.inputSymbols);
                                DistanceTracker.runNextFuzzedSequence(currentTrace.toArray(new String[0]));
                                System.out.println("no better branch found by fuzzing");
                        }
                        // set the new starting trace equal to the other traces
                        else {
                                totalCurrentBranchDistance = 0;
                                branchesVisited = 0;
                                currentTrace = bestNewTrace;

                        }
                        i++;
                        if (i >= maxIterations) { 
                                System.out.println("Number of branches: " + totalVisitedBranches.size());
                                isFinished = true;
                        }
                }
        }

        /**
         * Method that is used for catching the output from standard out.
         * You should write your own logic here.
         * @param out the string that has been outputted in the standard out.
         */
        public static void output(String out){
                System.out.println(out);
        }
}
