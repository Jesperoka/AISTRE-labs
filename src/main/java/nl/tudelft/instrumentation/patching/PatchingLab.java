package nl.tudelft.instrumentation.patching;
import java.util.*;

public class PatchingLab {

        // Constants
        private static final int POPULATION_SIZE = 10;
        private static final Random RNG = new Random();

        // EA state
        private static class Individual {
                String[] operators = new String[OperatorTracker.operators.length];
                Map<Integer, Integer[]> coverageMap = new HashMap<>();
                double fitnessScore = 0.0;
        }
        private static List<Individual> population;

        // encounteredOperator gets called for each operator encountered while running tests
        static boolean encounteredOperator(String operator, int left, int right, int operator_nr){
                // Do something useful


                String replacement = OperatorTracker.operators[operator_nr];
                if(replacement.equals("!=")) return left != right;
                if(replacement.equals("==")) return left == right;
                if(replacement.equals("<")) return left < right;
                if(replacement.equals(">")) return left > right;
                if(replacement.equals("<=")) return left <= right;
                if(replacement.equals(">=")) return left >= right;
                return false;
        }

        static boolean encounteredOperator(String operator, boolean left, boolean right, int operator_nr){
                // Do something useful

                String replacement = OperatorTracker.operators[operator_nr];
                if(replacement.equals("!=")) return left != right;
                if(replacement.equals("==")) return left == right;
                return false;
        }
        
        private static double computeFitnessScore(List<Boolean> testReturns) {
                assert(testReturns.size() > 0) : "Non-positive number of test results.";
                int trueReturns = 0;
                for (Boolean b: testReturns) {
                        trueReturns += b ? 1 : 0;
                }
                return trueReturns/(testReturns.size());
        }

        private static int[] countLineResults(Boolean[] testResults, Integer[] coveringTests) {
                int PASS = 0, FAIL = 1;
                int[] results = {0, 0};
                for (int idx : coveringTests) {
                        int dummyVar = testResults[idx] ? results[PASS]++ : results[FAIL]++;
                }
                return results;
        }

        private static double[] computeTarantulaScores(Boolean[] testResults, String[] operators, Map<Integer, Integer[]> coverageMap) {
                int PASS = 0, FAIL = 1;
                double[] scores = new double[operators.length];
                for (int operatorNumber = 0; operatorNumber < operators.length; operatorNumber++) {
                        // count passed and failed on that line
                        int[] results = countLineResults(testResults, coverageMap.get(operatorNumber));
                        scores[operatorNumber] = results[FAIL] / (results[PASS] + results[FAIL]);
                }
                return scores;
        }

        private static void initialize(){
                // initialize the population based on OperatorTracker.operators
                // OperatorTracker.operators;
                for (int i = 0; i < POPULATION_SIZE; i++) {

                        population.add(new Individual() {{operators = OperatorTracker.operators;}});      
                }
        }

        private static void selection() {
                // Iterate over population
                assert(population.size() % 2 == 0) : "Uneven population size, please specify an even number of individuals.";
                List<Individual> winners = new ArrayList<>();
                while (!population.isEmpty()) {
                        // Randomly remove two dueling individuals from the population
                        Individual first = population.remove(RNG.nextInt(0, population.size()));
                        Individual second = population.remove(RNG.nextInt(0, population.size()));
                        // Run tests and compute fitness scores
                        OperatorTracker.operators = first.operators; 
                        double firstScore = computeFitnessScore(OperatorTracker.runAllTests());
                        OperatorTracker.operators = second.operators; 
                        double secondScore = computeFitnessScore(OperatorTracker.runAllTests());
                        // Add highest score, otherwise flip a coin
                        winners.add(firstScore > secondScore ? first :
                                    secondScore > firstScore ? second :
                                    new Individual[] {first, second}[RNG.nextInt(0, 1)]);
                }
                // Re add the winner to the population
                population.addAll(winners);
        }

        private static void crossover() {
                // Parse 2 indivuals in population
                // Combine
        }

        private static void mutation() {
                // Find bad lines -> mutate them (probably)
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