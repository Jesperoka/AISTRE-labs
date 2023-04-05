package nl.tudelft.instrumentation.learning;

import org.checkerframework.checker.nullness.Opt;

import java.util.*;

/**
 * You should write your own solution using this class.
 */
public class LearningLab {
    static Random r = new Random();
    static int traceLength = 10;
    static boolean isFinished = false;

    static ObservationTable observationTable;
    static EquivalenceChecker equivalenceChecker;
    static MealyMachine hypothesis;
    static SystemUnderLearn sul = new RersSUL();

    /**
     * In a loop.
     *  check if the observation table is closed.
     *  if not, add new state to S.
     */
    private static void makeComplete() {
        Optional<Word<String>> newState = observationTable.checkForClosed();
        while (newState.isPresent()) {
            observationTable.addToS(newState.get());
            newState = observationTable.checkForClosed();
        }
    }

    /**
     * Check if the observation table is consistent.
     * if not then make it consistent.
     */
    private static void makeConsistent() {
        // TODO
    }

    /**
     * Run the equivalence checker.
     * if no counterexample then done.
     * else process counter example.
     */
    private static void verify() {
        // TODO make work
        Optional<Word<String>> res = equivalenceChecker.verify(hypothesis);
        if(!res.isPresent()) {
            isFinished = true;
            System.out.println("DONE FOR REALSIES");
            return;
        }
        System.out.println("Counter Example: " + res.get());

        // might need another method in ObservationTable as it seems you might need to access S.

        /* initial wrong attempt
        List<String> counterExample = res.get().asList();
        System.out.println(counterExample);
        for(int i = 0; i <= counterExample.size(); i++) {
            Word<String> test = new Word<>(counterExample.subList(i, counterExample.size()));
            System.out.println(test);
            if(!hypothesis.getLastOutput(test).equals(sul.getLastOutput(test))) {
                System.out.println("Outputs not the same for: " + test);
                observationTable.addToE(test);
                return;
            }
        }
        System.out.println("was a counterExample but could not find z?");*/
    }

    static void run() {
        // Base variables.
        observationTable = new ObservationTable(LearningTracker.inputSymbols, sul);
        equivalenceChecker = new RandomWalkEquivalenceChecker(sul, LearningTracker.inputSymbols, 100, 1000);
        hypothesis = observationTable.generateHypothesis();
        // TODO implement the WMethod and then switch to it.
        // equivalenceChecker = new WMethodEquivalenceChecker(sul, LearningTracker.inputSymbols, 1, observationTable, observationTable);

        // Place here your code to learn a model of the RERS problem.
        // Implement the checks for consistent and closed in the observation table.
        // Use the observation table and the equivalence checker to implement the L* learning algorithm.
        while (!isFinished) {
            observationTable.print();

            makeComplete();

            makeConsistent();

            // Update the hypothesis.
            hypothesis = observationTable.generateHypothesis();

            verify();
        }
    }


    /**
     * Method that is used for catching the output from standard out.
     * 
     * @param out the string that has been outputted in the standard out.
     */
    public static void output(String out) {
        // System.out.println(out);
    }
}
