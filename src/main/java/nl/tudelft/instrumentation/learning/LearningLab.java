package nl.tudelft.instrumentation.learning;

import java.util.*;
import java.util.Random;

/**
 * You should write your own solution using this class.
 */
public class LearningLab {
    static Random r = new Random();
    static List<String> currentTrace;
    static int traceLength = 10;
    static boolean isFinished = false;

    static ObservationTable observationTable;
    static EquivalenceChecker equivalenceChecker;

    static void initialize(String[] inputSymbols) {
        // Initialise a random trace from the input symbols of the problem.
        currentTrace = generateRandomTrace(inputSymbols);
    }

    /**
     * Method for fuzzing new inputs for a program.
     * 
     * @param inputSymbols the inputSymbols to fuzz from.
     * @return a fuzzed sequence
     */
    static List<String> fuzz(String[] inputSymbols) {
        /*
         * Add here your code for fuzzing a new sequence for the RERS problem.
         * You can guide your fuzzer to fuzz "smart" input sequences to cover
         * more branches. Right now we just generate a complete random sequence
         * using the given input symbols. Please change it to your own code.
         */
        return generateRandomTrace(inputSymbols);
    }

    /**
     * Generate a random trace from an array of symbols.
     * 
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

    static void run() {
        initialize(LearningTracker.inputSymbols);
        // LearningTracker.runNextTrace(currentTrace.toArray(new String[0]));
        learn();

        // Place here your code to guide your fuzzer with its search.
        while (!isFinished) {
            // Do things!
            try {
                System.out.println("Woohoo, looping!");
                System.exit(1);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static boolean isConsistent(ObservationTable ot) {
        return false;
    }

    static boolean isClosed(ObservationTable ot) {
        return false;
    }

    static void learn() {
        // while (true) {
        //     MealyMachine hypothesis = observationTable.toHypothesis();
        // }
        SystemUnderLearn sul = new RersSUL();
        observationTable = new ObservationTable(LearningTracker.inputSymbols, sul);
        equivalenceChecker = new RandomWalkEquivalenceChecker(sul, LearningTracker.inputSymbols, 10, 10);
        observationTable.print();
        observationTable.addToS("iB");
        // observationTable.addToS("iA");
        observationTable.addToE("iE");
        // observationTable.addToE("C");
        observationTable.print();
    }

    /**
     * Method that is used for catching the output from standard out.
     * You should write your own logic here.
     * 
     * @param out the string that has been outputted in the standard out.
     */
    public static void output(String out) {
        // System.out.println(out);
    }
}
