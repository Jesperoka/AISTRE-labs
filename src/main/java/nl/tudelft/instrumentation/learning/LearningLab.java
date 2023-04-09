package nl.tudelft.instrumentation.learning;

import org.checkerframework.checker.nullness.Opt;

import java.util.*;

/**
 * You should write your own solution using this class.
 */
public class LearningLab {
    public static final boolean DEBUG = false;
    
    private static Random r = new Random();
    private static int traceLength = 10;
    private static boolean isFinished = false;
    private static long startTime = 0;
    public static int membershipQueries = 0;

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
        Optional<Word<String>> newSuffix = observationTable.checkForConsistent();
        while (newSuffix.isPresent()) {
            observationTable.addToE(newSuffix.get());
            newSuffix = observationTable.checkForConsistent();
        }
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
            observationTable.print();
            displayPerformanceStatistics();
            return;
        }
        // System.out.println("Counter Example: " + res.get());
        List<String> counterExample = res.get().asList();

        for(int i = 1; i <= counterExample.size(); i++) {
            // Add all prefixes of the counterExample to S.
            if (DEBUG) System.out.println(counterExample.subList(0, i));
            observationTable.addToS(new Word<>(counterExample.subList(0, i)));
        }

        // might need another method in ObservationTable as it seems you might need to access S.

        if (DEBUG) System.out.println("was a counterExample but could not find z?");
    }

    static void run() {
        startTime = System.currentTimeMillis();
        // Base variables.
        observationTable = new ObservationTable(LearningTracker.inputSymbols, sul);
        // equivalenceChecker = new RandomWalkEquivalenceChecker(sul, LearningTracker.inputSymbols, 100, 1000);
        equivalenceChecker = new WMethodEquivalenceChecker(sul, LearningTracker.inputSymbols, 3, observationTable, observationTable);
        hypothesis = observationTable.generateHypothesis();
        observationTable.print();
        // equivalenceChecker = new WMethodEquivalenceChecker(sul, LearningTracker.inputSymbols, 1, observationTable, observationTable);

        // Place here your code to learn a model of the RERS problem.
        // Implement the checks for consistent and closed in the observation table.
        // Use the observation table and the equivalence checker to implement the L* learning algorithm.
        while (!isFinished) {
            makeConsistent();

            makeComplete();

            verify();

            // Update the hypothesis.
            hypothesis = observationTable.generateHypothesis();
            hypothesis.writeToDot("hypothesis.dot");
        }
    }

    public static void displayPerformanceStatistics(){
        long runTime = System.currentTimeMillis() - startTime;
        System.out.println("Number of States: " + hypothesis.getStates().length);
        System.out.println("Runtime (ms): " + runTime);
        System.out.println("Membership Queries: " + membershipQueries);
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
