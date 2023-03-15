package nl.tudelft.instrumentation.patching;
import java.util.*;

public class PatchingLab {

        // Constants
        private static final Random RNG = new Random();

        // EA state
        private static class Individual {
                String[] operators = new String[OperatorTracker.operators.length];
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
        
        static double computeFitnessScore(List<Boolean> testReturns) {
                assert(testReturns.size() > 0);
                int trueReturns = 0;
                for (Boolean b: testReturns) {
                        trueReturns += b ? 1 : 0;
                }
                return trueReturns/(testReturns.size());
        }

        private static void initialize(){
                // initialize the population based on OperatorTracker.operators
                // OperatorTracker.operators;
                
        }

        private static void selection() {
                // Iterate over population
                while (!population.isEmpty()) {
                        Individual first = population.remove(RNG.nextInt(0, population.size()));
                        Individual second = population.remove(RNG.nextInt(0, population.size()));
                        
                }
                // Compute fitness in some scheme
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

                        // Crossover

                        // Mutation


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