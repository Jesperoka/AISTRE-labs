package nl.tudelft.instrumentation.learning;

import org.checkerframework.checker.nullness.Opt;

import java.util.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * You should write your own solution using this class.
 */
public class LearningLab {
    public static final boolean DEBUG = false;
    private static final boolean PRINT_OBS_TABLE = false;
    private static final int DEPTH = 3;

    private static boolean isFinished = false;
    private static long startTime = 0;
    private static List<float[]> timeStateList = new ArrayList<>();

    static ObservationTable observationTable;
    static EquivalenceChecker equivalenceChecker;
    static MealyMachine hypothesis;
    static SystemUnderLearn sul = new RersSUL();
    public static int membershipQueries = 0;

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
        Optional<Word<String>> res = equivalenceChecker.verify(hypothesis);
        if(!res.isPresent()) {
            isFinished = true;
            if(PRINT_OBS_TABLE) observationTable.print();
            displayPerformanceStatistics();
            return;
        }
        if (DEBUG) System.out.println("Counter Example: " + res.get());
        List<String> counterExample = res.get().asList();

        for(int i = 0; i < counterExample.size(); i++) {
            // Add all prefixes of the counterExample to S.
            if (DEBUG) System.out.println(counterExample.subList(0, i));
            observationTable.addToS(new Word<>(counterExample.subList(0, i)));
        }
    }

    static void run() {
        startTime = System.currentTimeMillis();
        observationTable = new ObservationTable(LearningTracker.inputSymbols, sul);

        // equivalenceChecker = new RandomWalkEquivalenceChecker(sul, LearningTracker.inputSymbols, 100, 1000);
        equivalenceChecker = new WMethodEquivalenceChecker(sul, LearningTracker.inputSymbols, DEPTH, observationTable, observationTable);

        hypothesis = observationTable.generateHypothesis();
        if(PRINT_OBS_TABLE) observationTable.print();
        displayStartInfoMessage();
        while (!isFinished) {
            makeConsistent();
            makeComplete();
            verify();

            // Update the hypothesis.
            hypothesis = observationTable.generateHypothesis();
            hypothesis.writeToDot("hypothesis.dot");
            timeStateList.add(new float[] {System.currentTimeMillis() - startTime, hypothesis.getStates().length});
        }
        writeToTxt(timeStateList);
    }

    /**
     * Print out final performance statistics as defined by "Lab 4 - Example Performance Statistics.pdf".
     */
    public static void displayPerformanceStatistics(){
        long runTime = System.currentTimeMillis() - startTime;
        System.out.println("Number of States: " + hypothesis.getStates().length);
        System.out.println("Runtime (ms): " + runTime);
        System.out.println("Membership Queries: " + membershipQueries);
    }

    public static void displayStartInfoMessage() {
        System.out.println("\n\nRunning L-star learning.\n\nExpected runtimes with DEPTH = 3 (actual DEPTH: "+DEPTH+"):\n-------------------------------------------------------\nProblem 1: [15 000, 60 000] ms\nProblem 2: [60 000, 160 000] ms\nProblem 4: [80 000, 270 000] ms\nProblem 7: [420 000, 1 530 000] ms\n-------------------------------------------------------\n\n . . . R u n n i n g (DEBUG = "+DEBUG+") . . .");
    }

    // 
    public static void writeToTxt(List<float[]> listOfFloatArrays) {
        String FILE_NAME = "timeState.txt";
        int fileNumber = 0;
        File file = new File(FILE_NAME);
        
        // check if file exists in current directory
        while (file.exists()) {
            fileNumber++;
            file = new File(FILE_NAME.substring(0, FILE_NAME.indexOf(".")) + fileNumber + ".txt");
        }
        
        // create new file
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.err.println("Error creating new file: " + e.getMessage());
            return;
        }
        
        // write data to file
        try (FileWriter writer = new FileWriter(file)) {
            for (float[] floatArray : listOfFloatArrays) {
                for (int i = 0; i < floatArray.length; i++) {
                    writer.write(String.valueOf(floatArray[i]));
                    if (i != floatArray.length - 1) {
                        writer.write(", ");
                    }
                }
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            return;
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
