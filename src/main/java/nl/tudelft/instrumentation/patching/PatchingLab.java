package nl.tudelft.instrumentation.patching;
import java.util.*;

import com.google.common.reflect.TypeToken;

import org.apache.commons.lang3.ArrayUtils;

public class PatchingLab {

        // Hyperparameters
        private static final int      POPULATION_SIZE = 10; // must be an even number
        private static final double   SURVIVOR_FRACTION = 0.5; // what fraction of population survives selection process
        private static final int      NUM_TOP_TARANTULA_SCORES = 3; 
        private static final int      NUM_MUTATIONS = 2;
        // Constants
        private static final String[] POSSIBLE_OPERATORS = {"!=", "==", "<", ">", "<=", ">="};
        private static final Random   RNG = new Random();

        // EA state
        private static class Individual {
                String[]      operators    = new String[OperatorTracker.operators.length];
                List<Boolean> testResults  = new ArrayList<>();
                double        fitnessScore = 0.0;
                double[]      tarantulaScores;

                /**
                 * Randomly changes elements of the inidividual's operators array
                 * @param mutationIndices indices of un-mutated array to randomly change
                */
                void mutate(int[] mutationIndices) {
                        int length = 0;
                        for (int idx : mutationIndices) {
                                if (operatorTypes[idx] == typeEnum.INT) {length = POSSIBLE_OPERATORS.length;}
                                else if (operatorTypes[idx] == typeEnum.BOOL) {length = 2;} 
                                else { throw new IllegalArgumentException("Cannot mutate UNDEFINED operator type"); }
                                operators[idx] = POSSIBLE_OPERATORS[RNG.nextInt(length)];
                        }
                }

        }

        private static enum typeEnum {
                INT,
                BOOL,
                UNDEFINED
        }
        private static typeEnum[] operatorTypes = new typeEnum[OperatorTracker.operators.length];
        private static List<Individual> population = new ArrayList<>();
        private static Map<Integer, List<Integer>> currentTestSpectrum = new HashMap<>(); // scary global variable updated by functions based on async behavior

        // Add current test to list of tests that cover the operator associated to operator_nr
        private static void mapCurrentTestToOperator(int operator_nr) {
                if(currentTestSpectrum.get(operator_nr) == null) {
                        currentTestSpectrum.put(operator_nr, new ArrayList<Integer>());
                }
                currentTestSpectrum.get(operator_nr).add(OperatorTracker.current_test);
        }

        // encounteredOperator gets called for each operator encountered while running tests
        static boolean encounteredOperator(String operator, int left, int right, int operator_nr) {
                // Do something useful
                if (operatorTypes[operator_nr] == typeEnum.UNDEFINED) {operatorTypes[operator_nr] = typeEnum.INT;}
                mapCurrentTestToOperator(operator_nr);

                String replacement = OperatorTracker.operators[operator_nr];
                if(replacement.equals("!=")) return left != right;
                if(replacement.equals("==")) return left == right;
                if(replacement.equals("<")) return left < right;
                if(replacement.equals(">")) return left > right;
                if(replacement.equals("<=")) return left <= right;
                if(replacement.equals(">=")) return left >= right;
                throw new IllegalArgumentException("Unexpected operator: " + operator);
        }

        static boolean encounteredOperator(String operator, boolean left, boolean right, int operator_nr) {
                // Do something useful
                if (operatorTypes[operator_nr] == typeEnum.UNDEFINED) {operatorTypes[operator_nr] = typeEnum.BOOL;}
                mapCurrentTestToOperator(operator_nr);

                String replacement = OperatorTracker.operators[operator_nr];
                if(replacement.equals("!=")) return left != right;
                if(replacement.equals("==")) return left == right;
                throw new IllegalArgumentException("Unexpected operator: " + operator);
        }
        
        private static double computeFitnessScore(List<Boolean> testResults) {
                int PASS = 0, FAIL = 1;
                int[] totalResults = {0, 0};
                double positiveWeight = 0.1, negativeWeight = 10;
                for (Boolean result : testResults) {
                        int dummyVar = result ? totalResults[PASS]++ : totalResults[FAIL]++;
                }
                // divide by the maximal total value to get a number <= 1;
                return (positiveWeight*totalResults[PASS] - negativeWeight*totalResults[FAIL]) / (positiveWeight * testResults.size());
        }

        private static int[] countLineResults(List<Boolean> testResults, List<Integer> coveringTests) {
                int PASS = 0, FAIL = 1;
                int[] lineResults = {0, 0};
                for (int testIndex : coveringTests) {
                        int dummyVar = testResults.get(testIndex) ? lineResults[PASS]++ : lineResults[FAIL]++;
                }
                return lineResults;

        }

        private static double[] computeTarantulaScores(List<Boolean> testResults, int numOperators, Map<Integer, List<Integer>> testSpectrum) {
                int PASS = 0, FAIL = 1;
                double[] scores = new double[numOperators];
                for (int operatorNumber = 0; operatorNumber < numOperators; operatorNumber++) {
                        int[] results = countLineResults(testResults, testSpectrum.getOrDefault(operatorNumber, new ArrayList<>()));
                        if (results[PASS] == 0 && results[FAIL] == 0) {scores[operatorNumber] = -1;}
                        else {scores[operatorNumber] = (double) results[FAIL] / (double) (results[PASS] + results[FAIL]);}
                }
                return scores;
        }

        private static int computeRandomDuelLoser(List<Individual> population) {
                int firstIdx = RNG.nextInt(population.size());
                int secondIdx = RNG.nextInt(population.size());
                Individual first = population.get(firstIdx);
                Individual second = population.get(secondIdx);
                int loserIdx =  first.fitnessScore  > second.fitnessScore ? secondIdx :
                                second.fitnessScore > first.fitnessScore  ? firstIdx :
                                new int[] {firstIdx, secondIdx}[RNG.nextInt(2)];
                return loserIdx;
        }

        private static int indexOf(double value, double[] array) {
                for (int i = 0; i < array.length; i++){
                        if (value == array[i]) {return i;}
                }
                return -1;
        }

        /// INIT ///

        private static void initialize(){
                java.util.Arrays.fill(operatorTypes, typeEnum.UNDEFINED);

                Individual ancestor = new Individual() {{operators = OperatorTracker.operators;}};
                ancestor.testResults = runTests(ancestor.operators);
                ancestor.tarantulaScores = computeTarantulaScores(ancestor.testResults, OperatorTracker.operators.length, currentTestSpectrum);

                for (int i = 0; i < POPULATION_SIZE; i++) {
                        Individual offspring = new Individual() {{operators = ancestor.operators;}};
                        offspring.mutate(tarantulaIndices(ancestor.tarantulaScores));
                        population.add(offspring);
                }
        }

        /// RUN TESTS ///

        // Wrapper for (impure) functional management of operator string array and test spectrum during test runs
        private static List<Boolean> runTests(String[] operators) {
                currentTestSpectrum.clear();
                OperatorTracker.operators = operators;
                return OperatorTracker.runAllTests();
        }

        private static void runAllTests(List<Individual> population) { // TODO: rename to avoid confusion with OperatorTracker.runAllTests
                for (Individual A : population) {
                        A.testResults = runTests(A.operators);
                        A.fitnessScore = computeFitnessScore(A.testResults);
                        A.tarantulaScores = computeTarantulaScores(A.testResults, OperatorTracker.operators.length, currentTestSpectrum);
                }
        }

        /// SELECTION ///

        private static void selection() {
                assert(population.size() % 2 == 0) : "Uneven population size, please specify an even number of individuals.";

                // Run tests on all individuals in the population
                runAllTests(population);

                // Iterate over population
                while (population.size() > SURVIVOR_FRACTION * POPULATION_SIZE) {
                        population.remove(computeRandomDuelLoser(population));
                }
        }

        /// MUTATION ///
        
        private static int[] tarantulaIndices(double[] tarantulaScores) {
                int[] mutationIndices = new int[NUM_MUTATIONS];
                double[] sortedtarantulaScores = Arrays.copyOf(tarantulaScores, tarantulaScores.length);
                Arrays.sort(sortedtarantulaScores);
                sortedtarantulaScores = Arrays.copyOfRange(sortedtarantulaScores, sortedtarantulaScores.length-NUM_TOP_TARANTULA_SCORES, sortedtarantulaScores.length);
                assert(sortedtarantulaScores.length == NUM_TOP_TARANTULA_SCORES);
                ArrayUtils.reverse(sortedtarantulaScores);
                Collections.shuffle(Arrays.asList(sortedtarantulaScores));
                for (int i = 0; i < mutationIndices.length; i++) {
                        mutationIndices[i] = indexOf(sortedtarantulaScores[sortedtarantulaScores.length - i - 1], tarantulaScores);
                }
                return mutationIndices;
        }

        // Mutate population based on tarantula fault localization
        private static void mutation() {
                for (Individual A : population) {
                        A.mutate(tarantulaIndices(A.tarantulaScores));
                }
        }

        /// CROSSOVER ///

        /**
         * Method that does single point crossover between two individuals
         * @param A The first individual
         * @param B The second individual
         * @return Returns a new individual based on the parents A and B.
         */
        private static Individual singlePointCrossover(Individual A, Individual B) {
                // TODO check if we want to set this point at the halfway mark.
                return singlePointCrossover(A, B, A.operators.length/2);
        }

        // For if you want to set the crossoverPoint yourself.
        // TODO check if this is necessary.
        private static Individual singlePointCrossover(Individual A, Individual B, int crossoverPoint) {
                assert(crossoverPoint > 0 && crossoverPoint < A.operators.length) : "SPC: The crossoverPoint should be within the array for it to make sense.";
                assert(A.operators.length == B.operators.length) : "SPC: Both individuals should have the same operator list size.";
                Individual n = new Individual();
                n.operators = new String[A.operators.length];
                for(int j = 0; j < n.operators.length; j++) {
                        n.operators[j] = j > crossoverPoint ? A.operators[j] : B.operators[j];
                }
                n.testResults = runTests(n.operators);
                n.tarantulaScores = computeTarantulaScores(n.testResults, OperatorTracker.operators.length, currentTestSpectrum);
                return n;
        }

        /**
         * Method that takes the population left after selection and generates new individuals based on the living individuals.
         */
        private static void crossover() {
                // TODO make create a better method for this.
                //  - Ensure it cannot take the same one twice.
                //  - Check if you need to ignore the newly added individuals.
                //  - Check if the size of the population should stay equal.
                while (population.size() < POPULATION_SIZE) {
                        population.add(singlePointCrossover(population.get(RNG.nextInt(population.size())), population.get(RNG.nextInt(population.size()))));
                }
        }

        /**
         * This is the main loop of the genetic algorith. Every iteration it calls the selection, mutation and crossover methods.
         */
        static void run() {
                boolean isFinished = false;

                // Initial population
                initialize();

                while (!isFinished) {
                        isFinished = monitor();

                        // Selection
                        selection();

                        // Mutation TODO: check with professors (keeping mutation before crossover for now)
                        mutation();

                        // Crossover
                        crossover();
                }
        }

        /// HELPER METHODS ///

        private static double[] bestResults() {
                double[] testResults = new double[2];
                double best = -1;
                double average = 0;
                for(Individual A: population) {
                        if(A.fitnessScore > best) {
                                best = A.fitnessScore;
                        }
                        average+=A.fitnessScore;
                }
                testResults[0] = best;
                testResults[1] = average / population.size();
                return testResults;
        }

        private static boolean monitor() {
                double[] testResults = bestResults();
                System.out.println("DEBUG values " + Arrays.toString(testResults));
                // if all tests pass then we found a fix.
                if(testResults[0] != 1) {
                        return false;
                }
                return true;
        }

        public static void output(String out){
                // This will get called when the problem code tries to print things,
                // the prints in the original code have been removed for your convenience

                System.out.println(out);
        }
}

/// GRAVEYARD ///

/**
         * Randomly selects NUM_MUTATIONS out of NUM_TOP_TARANTULA_SCORES scores and returns their indices in the tarantulaScores array.
         * @param tarantulaScores an array of scores to select indices from
         * @return an array of indices representing a NUM_MUTATIONS sized random subset of the top NUM_TOP_TARANTULA_SCORES scores
         */
        // private static int[] tarantulaIndices(double[] tarantulaScores) {
        //         int[] tarantulaIndices = new int[NUM_MUTATIONS];
        //         double[] sortedtarantulaScores = Arrays.copyOf(tarantulaScores, tarantulaScores.length);
        //         Arrays.sort(sortedtarantulaScores);
        //         // reverting back to manually swapping, no need to shorten the array here.
        //         for(int i = NUM_TOP_TARANTULA_SCORES-1; i >= 1; i--) {
        //                 int indxB = RNG.nextInt(NUM_TOP_TARANTULA_SCORES+1);
        //                 double A = sortedtarantulaScores[i];
        //                 sortedtarantulaScores[i] = sortedtarantulaScores[indxB];
        //                 sortedtarantulaScores[indxB] = A;
        //         }
        //         // For testing
        //         System.out.println("DEBUG mutation: " + Arrays.toString(sortedtarantulaScores));

        //         for (int i = 0; i < tarantulaIndices.length; i++) {
        //                 tarantulaIndices[i] = indexOf(sortedtarantulaScores[i], tarantulaScores);
        //         }
        //         System.out.println("HERE1");
        //         return tarantulaIndices;
        // }