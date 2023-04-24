package nl.tudelft.instrumentation.patching;
import java.util.*;

import com.google.common.reflect.TypeToken;

// student imports
import org.apache.commons.lang3.ArrayUtils;

public class PatchingLab {
        // Hyperparameters
        private static final int      POPULATION_SIZE   = 44;
        private static final double   SURVIVOR_FRACTION = 0.1;  // fraction of population that survives selection process
        private static final float    MUTATION_RATE     = 0.2f;
        
        // Constants
        private static final String[] POSSIBLE_OPERATORS = {"!=", "==", "<", ">", "<=", ">="};
        private static final Random   RNG = new Random();
        private static final int      NUM_OPERATORS = OperatorTracker.operators.length;

        // Visualization and Performance Tracking
        // TODO: re-add stuff for plotting

        // EA state
        private static class Individual {
                String[]      operators    = new String[NUM_OPERATORS];
                List<Boolean> testResults  = new ArrayList<>();
                double        fitnessScore = 0.0;
                double[]      tarantulaScores;
                boolean       newborn      = true;

                // Mutates operators as indices given by mutationIndices
                void mutate(int mutationIndex) {
                        if (mutationIndex == -1) return; // no mutation if no suspicious index was found
                        int length = 0;
                        if (operatorTypes[mutationIndex] == typeEnum.INT) {length = POSSIBLE_OPERATORS.length;}
                        else if (operatorTypes[mutationIndex] == typeEnum.BOOL) {length = 2;}
                        else {  length = POSSIBLE_OPERATORS.length;} // Special case, operator wasn't covered by any tests. Let's mutate it anyway (and hope for the best regarding type).
                        operators[mutationIndex] = POSSIBLE_OPERATORS[RNG.nextInt(length)];       
                }
        }

        private static Individual ancestor;

        private static enum typeEnum {
                INT,
                BOOL,
                UNDEFINED
        }
        private static typeEnum[] operatorTypes = new typeEnum[NUM_OPERATORS];
        private static List<Individual> population = new ArrayList<>();
        private static Map<Integer, List<Integer>> currentTestSpectrum = new HashMap<>(); 

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
                return (double) totalResults[PASS] / ((double) totalResults[PASS] + (double) totalResults[FAIL]);
        }

        private static int[] countTotalResults(List<Boolean> testResults) {
                int trueCount = 0;
                for (boolean bool : testResults) {if (bool) {trueCount++;}}
                return new int[] {trueCount, testResults.size() - trueCount};
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
                int[] totalResults = countTotalResults(testResults);
                for (int operatorNumber = 0; operatorNumber < numOperators; operatorNumber++) {
                        int[] results = countLineResults(testResults, testSpectrum.getOrDefault(operatorNumber, new ArrayList<>()));
                        if (totalResults[PASS] == 0 || totalResults[FAIL] == 0 || (results[PASS] + results[FAIL] == 0) ) { scores[operatorNumber] = 0; } // undefined tarantula scores are set to 0
                        else {scores[operatorNumber] = ((double) results[FAIL] / totalResults[FAIL] ) / ( ( (double) results[PASS] / totalResults[PASS]) + ( (double) results[FAIL] / totalResults[FAIL]) );}
                }
                return scores;
        }

        private static int computeRandomDuelLoser(List<Individual> population) {
                int firstIdx = RNG.nextInt(population.size());
                int secondIdx = RNG.nextInt(population.size());
                Individual first = population.get(firstIdx);
                Individual second = population.get(secondIdx);
                int loserIdx =  first.fitnessScore  > second.fitnessScore ? secondIdx : // first wins  => second loses
                                second.fitnessScore > first.fitnessScore  ? firstIdx :  // second wins => first loses
                                new int[] {firstIdx, secondIdx}[RNG.nextInt(2)];        // coin flip if equal
                return loserIdx;
        }

        private static int indexOf(double value, double[] array) { // TODO: add very small tolerance
                for (int i = 0; i < array.length; i++){
                        if (value == array[i]) {return i;}
                }
                System.out.println("indexOf() couldn't find index, got value: " + value +" and array: "+ Arrays.toString(array));
                return -1;
        }

        /// INIT ///

        private static void initialize() {
                java.util.Arrays.fill(operatorTypes, typeEnum.UNDEFINED);

                ancestor = new Individual() {{operators = OperatorTracker.operators.clone();}};
                ancestor.testResults = runTests(ancestor.operators);
                ancestor.tarantulaScores = computeTarantulaScores(ancestor.testResults, NUM_OPERATORS, currentTestSpectrum);

                for (int i = 0; i < POPULATION_SIZE-1; i++) {
                        Individual offspring = new Individual() {{operators = ancestor.operators.clone();}};
                        population.add(offspring);
                }
                population.add(ancestor);
        }

        /// RUN TESTS ///

        // Wrapper for management of operator string array and test spectrum during test runs
        private static List<Boolean> runTests(String[] operators) {
                currentTestSpectrum.clear();
                OperatorTracker.operators = operators.clone();
                return OperatorTracker.runAllTests();
        }

        private static void evaluation() {
                for (int i = 0; i < population.size(); i++) {
                        Individual individual      = population.get(i);
                        individual.testResults     = runTests(individual.operators);
                        individual.fitnessScore    = computeFitnessScore(individual.testResults);
                        individual.tarantulaScores = computeTarantulaScores(individual.testResults, NUM_OPERATORS, currentTestSpectrum);
                        individual.newborn         = false;
                }
        }

        /// SELECTION ///

        private static void selection() {
                // Iterate over population
                while (population.size() > SURVIVOR_FRACTION * POPULATION_SIZE) {
                        population.remove(computeRandomDuelLoser(population));
                }
        }

        /// MUTATION ///
        

        private static int tarantulaIndex(double[] tarantulaScores) {
                double tarantulaScoreThreshold = 0.7;
                int mutationIndex = -1;
                int i = 0;
                while (true) {
                        int idx = RNG.nextInt(tarantulaScores.length);
                        if (tarantulaScores[idx] >= tarantulaScoreThreshold) { mutationIndex = idx; break; }
                        if (i % 10000 == 0) { tarantulaScoreThreshold -= 0.1;}
                        if (tarantulaScoreThreshold <= 0.0) { break; }
                        i++;
                }
                return mutationIndex;
        }

        // Mutate small percentage of population based on tarantula fault localization
        private static void mutation() {
                for (int i = 0; i < population.size(); i++) {
                        Individual individual = population.get(i);
                        if (RNG.nextFloat() < MUTATION_RATE) {
                                if (individual.newborn) {
                                        individual.newborn         = false;
                                        individual.testResults     = runTests(individual.operators);
                                        individual.tarantulaScores = computeTarantulaScores(individual.testResults, NUM_OPERATORS, currentTestSpectrum);
                                }
                                individual.mutate(tarantulaIndex(individual.tarantulaScores));
                        }
                }
        }

        /// CROSSOVER ///

        // Single Point Crossover at random index
        private static Individual[] singlePointCrossover(Individual A, Individual B) {
                return singlePointCrossover(A, B, RNG.nextInt(A.operators.length));
        }

        // Single Point Crossover at specified index
        private static Individual[] singlePointCrossover(Individual A, Individual B, int crossoverPoint) {
                Individual child1 = new Individual(), child2 = new Individual();
                for(int j = 0; j < NUM_OPERATORS; j++) {
                        child1.operators[j] = j > crossoverPoint ? A.operators[j] : B.operators[j];
                        child2.operators[j] = j <= crossoverPoint ? A.operators[j] : B.operators[j];
                }
                return new Individual[] {child1, child2};
        }

        // 
        private static void crossover() {
                List<Individual> nextGenerationPopulation = new ArrayList(POPULATION_SIZE);
                while (nextGenerationPopulation.size() < POPULATION_SIZE) {
                        Individual[] children = singlePointCrossover(population.get(RNG.nextInt(population.size())), population.get(RNG.nextInt(population.size())));
                        nextGenerationPopulation.add(children[0]);
                        nextGenerationPopulation.add(children[1]);
                }
                population = nextGenerationPopulation;
        }

        /**
         * This is the main loop of the genetic algorith. Every iteration it calls the selection, mutation and crossover methods.
         */
        static void run() {
                boolean isFinished = false;
                long startTime = System.currentTimeMillis();

                // Initial population
                initialize();

                while (!isFinished) {
                        // Evaluation of fitness and suspicious operators
                        evaluation();
                        isFinished = monitor() || System.currentTimeMillis() - startTime > 5*60000;

                        // Tournament style selection
                        selection();

                        // Single point crossover reproduction
                        crossover();

                        // Random mutation
                        mutation();
                }
                System.out.println("\n\nEND\n\n");
        }

        /// HELPER METHODS ///

        private static boolean monitor() {
                double bestFitness = 0.0;
                for (Individual individual : population) {bestFitness = individual.fitnessScore > bestFitness ? individual.fitnessScore : bestFitness;}
                
                System.out.println("bestFitness: " + bestFitness);
                if(bestFitness < 0.999999) { return false; }

                System.out.println("\nAlgorithm finished (with perfect tests).\n");
                return true;
        }
        
        public static void output(String out){
                // if(!out.contains("no transition")) {
                //     System.out.println(out);
                // }
        }

        // Helper for debugging (this implementation is not foolproof)
        public static void PRINT_FUNCTION_NAME(){
                System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());;
        }
}