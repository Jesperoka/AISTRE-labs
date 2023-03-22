package nl.tudelft.instrumentation.patching;
import java.util.*;

public class PatchingLab {

        // Constants
        private static final int POPULATION_SIZE = 10; // must be an even number
        private static final String[] POSSIBLE_OPERATORS = {"!=", "==", "<", ">", "<=", ">="};
        private static final Random RNG = new Random();

        // EA state
        private static class Individual {
                String[] operators = new String[OperatorTracker.operators.length];
                double fitnessScore = 0.0;
        }
        private static List<Individual> population;
        private static Map<Integer, List<Integer>> currentTestSpectrum = new HashMap<>(); // scary global variable updated by functions based on async behavior

        // Wrapper for functional management of operator string array and test spectrum during test runs
        private static List<Boolean> runTests(String[] operators) {
                currentTestSpectrum.clear();
                OperatorTracker.operators = operators;
                return OperatorTracker.runAllTests();
        }

        // Add current test to list of tests that cover the operator associated to operator_nr
        private static void mapCurrentTestToOperator(int operator_nr) {
                if(currentTestSpectrum.putIfAbsent(operator_nr, Arrays.asList(new Integer[]{OperatorTracker.current_test})) == null) {return;}
                else {currentTestSpectrum.get(operator_nr).add(OperatorTracker.current_test);}
        }

        // encounteredOperator gets called for each operator encountered while running tests
        static boolean encounteredOperator(String operator, int left, int right, int operator_nr) {
                // Do something useful
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
                return positiveWeight*totalResults[PASS] - negativeWeight*totalResults[PASS];
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
                        int[] results = countLineResults(testResults, testSpectrum.get(operatorNumber));
                        scores[operatorNumber] = results[FAIL] / (results[PASS] + results[FAIL]);
                }
                return scores;
        }

        // Mutate a single individual
        private static String[] mutate(int[] mutationIndices, String[] operators, String[] possibleOperators) {
                // TODO: implement
                return operators;
        }

        private static void initialize(){
                // initialize the population based on most suspicious OperatorTracker.operators
                List<Boolean> testResults = runTests(OperatorTracker.operators);
                double[] tarantulaScores = computeTarantulaScores(testResults, OperatorTracker.operators.length, currentTestSpectrum);

                // TODO: sort indices based on tarantula scores
                // -> randomly select K of the top N operators 
                // -> randomly mutate those operator (by passing the index list to mutate())
                int[] mutationIndices = {0, 1, 2, 3}; // TODO: <<<--- TEMP

                for (int i = 0; i < POPULATION_SIZE; i++) {
                        String[] initialOperators = mutate(mutationIndices, OperatorTracker.operators, POSSIBLE_OPERATORS);
                        population.add(new Individual() {{operators = initialOperators;}});      
                }
        }

        private static void selection() {
                assert(population.size() % 2 == 0) : "Uneven population size, please specify an even number of individuals.";
                List<Individual> winners = new ArrayList<>();
                
                // Iterate over population
                while (!population.isEmpty()) {
                        // Randomly remove two dueling individuals from the population
                        Individual first = population.remove(RNG.nextInt(population.size()));
                        Individual second = population.remove(RNG.nextInt(population.size()));

                        // Run tests and compute fitness scores
                        double firstScore = computeFitnessScore(runTests(first.operators));
                        double secondScore = computeFitnessScore(runTests(second.operators));

                        // Add highest score, otherwise flip a coin
                        winners.add(firstScore > secondScore ? first :
                                    secondScore > firstScore ? second :
                                    new Individual[] {first, second}[RNG.nextInt(2)]);
                }
                
                // Re add the winner to the population
                population.addAll(winners);
        }

        /**
         * Method that takes the population left after selection and generates new individuals based on the living individuals.
         */
        private static void crossover() {
                // TODO make create a better method for this.
                //  - Ensure it cannot take the same one twice.
                //  - Check if you need to ignore the newly added individuals.
                //  - Check if the size of the population should stay equal.
                population.add(singlePointCrossover(population.get(RNG.nextInt(population.size())), population.get(RNG.nextInt(population.size()))));
        }

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
                return n;
        }

        private static void mutation() {
                // Find bad lines with tarantula, same as in first part of initialize, which means we can make it a function.

                // subroutine |   mutate(mutationIndices, operators, possibleOperators) -> mutatedOperators   | mutates a single individual

        }

        static void run() {
                initialize();

                // Place the code here you want to run once:
                // You want to change this of course, this is just an example
                // Tests are loaded from resources/rers2020_test_cases. If you are you are using
                // your own tests, make sure you put them in the same folder with the same
                // naming convention.
                OperatorTracker.runAllTests();
                System.out.println("Entered run");

                // Initial population

                
                // Loop here, running your genetic algorithm until you think it is done
                boolean isFinished = false;
                while (!isFinished) {

                        // Selection
                        selection();

                        // Crossover
                        crossover();

                        // Mutation
                        mutation();

                        try {
                                System.out.println("Woohoo, looping!");
                                Thread.sleep(1000);
                        } catch (InterruptedException e) {
                                e.printStackTrace();
                        }
                }
        }

        public static void output(String out){
                // This will get called when the problem code tries to print things,
                // the prints in the original code have been removed for your convenience

                System.out.println(out);
        }
}