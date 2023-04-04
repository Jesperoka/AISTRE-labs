package nl.tudelft.instrumentation.learning;

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

    static void run() {

        SystemUnderLearn sul = new RersSUL();
        observationTable = new ObservationTable(LearningTracker.inputSymbols, sul);
        equivalenceChecker = new RandomWalkEquivalenceChecker(sul, LearningTracker.inputSymbols, 100, 1000);
        // equivalenceChecker = new WMethodEquivalenceChecker(sul, LearningTracker.inputSymbols, 1, observationTable, observationTable);

        //observationTable.print();
        MealyMachine hypothesis = observationTable.generateHypothesis();
        hypothesis.writeToDot("hypothesis.dot");

        // Place here your code to learn a model of the RERS problem.
        // Implement the checks for consistent and closed in the observation table.
        // Use the observation table and the equivalence checker to implement the L* learning algorithm.
        while (!isFinished) {
            observationTable.print();

            Optional<Word<String>> TT = observationTable.checkForClosed();
            if(!TT.isPresent()) {
                System.out.println("DONE for now");
                System.exit(0);
            }

            observationTable.addToS(TT.get());
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
