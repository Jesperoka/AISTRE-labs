package nl.tudelft.instrumentation.patching;
import java.util.*;

import com.google.common.reflect.TypeToken;

// student imports
import org.apache.commons.lang3.ArrayUtils;

public class PatchingLab {

        // Hyperparameters
        private static final int      POPULATION_SIZE = 44; // must be an even number
        private static final double   SURVIVOR_FRACTION = 0.5; // what fraction of population survives selection process
        private static final float    MUTATION_RATE = 0.2f;
        private static final int      INITIAL_NUM_TOP_TARANTULA_SCORES = 5;
        private static final int      INITIAL_NUM_MUTATIONS = 2;
        private static final int      INITAL_PATIENCE = 25;
        // Constants
        private static final String[] POSSIBLE_OPERATORS = {"!=", "==", "<", ">", "<=", ">="};
        private static final Random   RNG = new Random();
        private static final int      NUM_OPERATORS = OperatorTracker.operators.length;

        // EA state
        private static class Individual {
                String[]      operators    = new String[NUM_OPERATORS];
                List<Boolean> testResults  = new ArrayList<>();
                double        fitnessScore = 0.0;
                double[]      tarantulaScores;
                boolean       newChild     = true; // marker to avoid running tests more times than necessary

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
        private static typeEnum[] operatorTypes = new typeEnum[NUM_OPERATORS];
        private static List<Individual> population = new ArrayList<>();
        private static Map<Integer, List<Integer>> currentTestSpectrum = new HashMap<>(); // scary global variable updated by functions based on async behavior
        
        private static class MutationScheduler {
                static int numTarantulaScores = INITIAL_NUM_TOP_TARANTULA_SCORES;
                static int numMutations = INITIAL_NUM_MUTATIONS;
                static int patience = INITAL_PATIENCE;
                static void safelyIncrementTarantula() { numTarantulaScores = numTarantulaScores < NUM_OPERATORS ? numTarantulaScores + 1 : numTarantulaScores; }
                static void safelyDecrementTarantula() { numTarantulaScores = numTarantulaScores > 1 ? numTarantulaScores - 1 : numTarantulaScores; }
                // static void safelyIncrementMutations() { numMutations = numMutations < NUM_OPERATORS ? numMutations + 1 : numMutations; }
                // static void safelyDecrementMutations() { numMutations = numMutations > 1 ? numMutations - 1 : numMutations; }
                static int patienceFunction() { return (int) Math.ceil(Math.exp(-0.5*iteration) + (INITAL_PATIENCE-2)*Math.exp(-0.05*iteration) + 0.05*iteration + 1); }
                static int numStuck = 0;
                static int numWorse = 0;
                static int iteration = 0;
                static double previousResult = Double.NEGATIVE_INFINITY;
                static void update(double iterationResults) {
                        if (previousResult == iterationResults) {numStuck++;} else {numStuck = 0; numTarantulaScores = INITIAL_NUM_TOP_TARANTULA_SCORES;}
                        if (previousResult < iterationResults) {numWorse++;} else {numWorse = 0;}
                        patience = patienceFunction();
                        if (numStuck > patience) { safelyIncrementTarantula(); }; // IDEA: have numTarantulaScores follow NUM_OPERATORS*sin(0.1x) or something instead.
                        if (numWorse > patience) { safelyDecrementTarantula(); };
                        // if (numStuck > 3*patience) { safelyIncrementMutations(); };
                        // if (numWorse > 3*patience) { safelyDecrementMutations(); };
                        previousResult = iterationResults; // copy?
                        iteration++;
                }
        }

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
                // return totalResults[PASS] / (totalResults[PASS] + totalResults[FAIL]); // last year TA fitness function
                return -positiveWeight*totalResults[PASS] - negativeWeight*totalResults[FAIL]; // yes both terms are supposed to have the same sign
                // return -totalResults[FAIL]; // Simple failed test count
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
                        if (results[PASS] == 0 && results[FAIL] == 0) {scores[operatorNumber] = 0.1;} // Some small value, cause' it is a bit suspicious.
                        else if (totalResults[PASS] == 0) { scores[operatorNumber] = 1; } // this is bad, but its all equally bad.
                        else if (totalResults[FAIL] == 0) { scores[operatorNumber] = 0; } // don't really care, this case means we won.
                        else {scores[operatorNumber] = ((double) results[FAIL] / totalResults[FAIL] ) / ( ( (double) results[PASS] / totalResults[PASS]) + ( (double) results[FAIL] / totalResults[FAIL]) );}
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
                System.out.println("indexOf() couldn't find index, got value: " + value +" and array: "+ Arrays.toString(array));
                return -1;
        }

        /// INIT ///

        private static void initialize(){
                java.util.Arrays.fill(operatorTypes, typeEnum.UNDEFINED);

                Individual ancestor = new Individual() {{operators = OperatorTracker.operators.clone();}};
                ancestor.testResults = runTests(ancestor.operators);
                ancestor.tarantulaScores = computeTarantulaScores(ancestor.testResults, NUM_OPERATORS, currentTestSpectrum);

                for (int i = 0; i < POPULATION_SIZE; i++) {
                        Individual offspring = new Individual() {{operators = ancestor.operators.clone();}};
                        offspring.mutate(tarantulaIndices(ancestor.tarantulaScores));
                        population.add(offspring);
                }
        }

        /// RUN TESTS ///

        // Wrapper for management of operator string array and test spectrum during test runs
        private static List<Boolean> runTests(String[] operators) {
                currentTestSpectrum.clear();
                OperatorTracker.operators = operators;
                return OperatorTracker.runAllTests();
        }

        private static void runAllTests(List<Individual> population) { // TODO: rename to avoid confusion with OperatorTracker.runAllTests
                for (Individual A : population) {
                        A.testResults = runTests(A.operators);
                        A.fitnessScore = computeFitnessScore(A.testResults);
                        A.tarantulaScores = computeTarantulaScores(A.testResults, NUM_OPERATORS, currentTestSpectrum);
                        A.newChild = false;
                }
        }

        /// SELECTION ///

        private static void selection() {
                assert(population.size() % 2 == 0) : "Uneven population size, please specify an even number of individuals.";

                // Iterate over population
                while (population.size() > SURVIVOR_FRACTION * POPULATION_SIZE) {
                        population.remove(computeRandomDuelLoser(population));
                }
        }

        /// MUTATION ///
        
        private static int[] tarantulaIndices(double[] tarantulaScores) {
                int[] mutationIndices = new int[MutationScheduler.numMutations];
                double[] sortedtarantulaScores = Arrays.copyOf(tarantulaScores, tarantulaScores.length);
                Arrays.sort(sortedtarantulaScores);
                int scoreIdx = Math.min((int)Math.floor(Math.abs(0.25*RNG.nextGaussian()*MutationScheduler.numTarantulaScores)), MutationScheduler.numTarantulaScores);
                sortedtarantulaScores = Arrays.copyOfRange(sortedtarantulaScores, sortedtarantulaScores.length-MutationScheduler.numTarantulaScores, sortedtarantulaScores.length);
                assert(sortedtarantulaScores.length == MutationScheduler.numTarantulaScores);
                // ArrayUtils.shuffle(sortedtarantulaScores);
                for (int i = 0; i < mutationIndices.length; i++) {
                        mutationIndices[i] = indexOf(sortedtarantulaScores[sortedtarantulaScores.length - scoreIdx - 1], tarantulaScores);
                        // mutationIndices[i] = indexOf(sortedtarantulaScores[sortedtarantulaScores.length - i - 1], tarantulaScores);
                }
                return mutationIndices;
        }

        // Mutate small percentage of population based on tarantula fault localization
        private static void mutation() {
                for (Individual A : population) {
                        if (RNG.nextFloat() < MUTATION_RATE) {
                                if (A.newChild) { // newly born children don't have initialized tarantulaScores
                                        A.testResults = runTests(A.operators);
                                        A.tarantulaScores = computeTarantulaScores(A.testResults, NUM_OPERATORS, currentTestSpectrum);
                                }
                                A.mutate(tarantulaIndices(A.tarantulaScores));
                        }
                }
        }

        /// CROSSOVER ///

        /**
         * Method that does single point crossover between two individuals
         * @param A The first individual
         * @param B The second individual
         * @return Returns a new individual based on the parents A and B.
         */
        private static Individual[] singlePointCrossover(Individual A, Individual B) {
                // TODO check if we want to set this point at the halfway mark.
                return singlePointCrossover(A, B, A.operators.length/2);
        }

        // For if you want to set the crossoverPoint yourself.
        // TODO check if this is necessary.
        private static Individual[] singlePointCrossover(Individual A, Individual B, int crossoverPoint) {
                assert(crossoverPoint > 0 && crossoverPoint < A.operators.length) : "SPC: The crossoverPoint should be within the array for it to make sense.";
                assert(A.operators.length == B.operators.length && A.operators.length == NUM_OPERATORS) : "SPC: Both individuals should have the same operator list size.";
                Individual child1 = new Individual();
                Individual child2 = new Individual();
                child1.operators = new String[NUM_OPERATORS];
                child2.operators = new String[NUM_OPERATORS];
                for(int j = 0; j < NUM_OPERATORS; j++) {
                        child1.operators[j] = j > crossoverPoint ? A.operators[j] : B.operators[j];
                        child2.operators[j] = j <= crossoverPoint ? A.operators[j] : B.operators[j];
                }
                child1.newChild = true; // TODO: dont need anymore
                child2.newChild = true; // TODO: dont need anymore
                return new Individual[] {child1, child2};
        }

        /**
         * Method that takes the population left after selection and generates new individuals based on the living individuals.
         */
        private static void crossover() {
               
                List<Individual> nextGenerationPopulation = new ArrayList(POPULATION_SIZE);
                while (nextGenerationPopulation.size() < POPULATION_SIZE) {
                        Individual[] children = singlePointCrossover(population.get(RNG.nextInt(population.size())), population.get(RNG.nextInt(population.size())));
                        nextGenerationPopulation.add(children[0]);
                        nextGenerationPopulation.add(children[1]);
                }
                assert(nextGenerationPopulation.size() == POPULATION_SIZE);
                population = nextGenerationPopulation;
        }

        /**
         * This is the main loop of the genetic algorith. Every iteration it calls the selection, mutation and crossover methods.
         */
        static void run() {
                boolean isFinished = false;

                // Initial population
                initialize();

                while (!isFinished) {
                        runAllTests(population);
                        isFinished = monitor();

                        // Selection
                        selection();

                        // Crossover
                        crossover();

                        // Mutation 
                        mutation();
                }
        }

        /// HELPER METHODS ///

        private static double[] bestResults() {
                double[] testResults = new double[4];
                double best = Double.NEGATIVE_INFINITY;
                double average = 0;
                int bestIdx = -1;
                double bestPassFrac = 0.0;

                for(int i = 0; i < population.size(); i++) {
                        if(population.get(i).fitnessScore > best) {
                                best = population.get(i).fitnessScore;
                                bestIdx = i;
                                int[] totalResults = countTotalResults(population.get(i).testResults);
                                bestPassFrac = (double) totalResults[0] / (totalResults[0] + totalResults[1]);
                        }
                        average += population.get(i).fitnessScore;
                }
                testResults[0] = (double) bestIdx; // yes its a double but whatever, just cast back and forth
                testResults[1] = best;
                testResults[2] = bestPassFrac;
                testResults[3] = average / population.size();
                return testResults;
        }

        private static boolean monitor() {
                double[] testResults = bestResults();
                System.out.println("DEBUG: values [bestIdx, bestFitness, bestPassFrac, avgFitness]: " + Arrays.toString(testResults));

                MutationScheduler.update(testResults[1]); // make sure to pass the correct value here
                System.out.println("DEBUG: MutationScheduler.numTarantulaScores: " + MutationScheduler.numTarantulaScores);
                System.out.println("DEBUG: MutationScheduler.numMutations: " + MutationScheduler.numMutations);
                System.out.println("DEBUG: MutationScheduler.numStuck: " + MutationScheduler.numStuck);
                System.out.println("DEBUG: MutationScheduler.numWorse: " + MutationScheduler.numWorse);
                System.out.println("DEBUG: MutationScheduler.patience: " + MutationScheduler.patience);

                // 1. store a history of testResults[2]
                // output something at the end
                // python exec() each problem and exec(kill) after end output

                if(testResults[2] != 1.0) {
                        return false;
                }
 
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