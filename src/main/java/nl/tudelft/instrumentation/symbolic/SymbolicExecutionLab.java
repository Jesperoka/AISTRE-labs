package nl.tudelft.instrumentation.symbolic;

import java.util.*;
import com.microsoft.z3.*;
import nl.tudelft.instrumentation.fuzzing.DistanceTracker;

import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

/**
 * You should write your solution using this class.
 */
public class SymbolicExecutionLab {

    // Added as comment so I don't forget. TODO: adapt to this lab
    /*#########################################################################################################################*/
    /*#########################################################################################################################*/
    // private static final int TRACE_LENGTH = 10;
    // private static final int STRICT_INEQUALITY_MINIMUM_BRANCH_DISTANCE = 1;
    // private static final int RANDOM_MUTATION_ATTEMPTS = 10;
    // private static final long NANOSECS_PER_SEC = 1000l*1000*1000;
    // private static final long FIVE_MIN_IN_NANOSECS = 5*60*NANOSECS_PER_SEC;
    private static final int INITIAL_QUEUE_LENGTH = 11;

    // private static final Random RNG = new Random();

    // // Variables used by the fuzzer
    // private static class FuzzerState {
    //         static List<String> currentTrace = Arrays.asList("");
    //         static double currentSumOfBranchDistances = 0;
    //         static Set<Integer> currentUniqueBranchesCovered = new HashSet<>();
    //         static boolean isFinished = false;
    // }
    // // Values output by the fuzzer at the end
    // private static class FuzzerOutput {
    //         static Set<String> triggeredErrorCodes = new HashSet<>();
    //         static Set<AbstractMap.SimpleEntry<Boolean, Integer>> uniqueVisitedBranches = new HashSet<>();
    //         static int mostBranchesCovered = 0;
    //         static List<String> mostCoveringInput = Arrays.asList("");

    //         static void display() {
    //                 System.out.println("\nNumber of unique branches: " + FuzzerOutput.uniqueVisitedBranches.size() + "\n");
    //                 System.out.println("Error codes triggered:\n" + FuzzerOutput.triggeredErrorCodes + "\n");
    //                 System.out.println("The input covering the most branches was:\n" + FuzzerOutput.mostCoveringInput + "\nWith " + FuzzerOutput.mostBranchesCovered + " branches covered.\n");
    //         }
    // }
    /*#########################################################################################################################*/
    /*#########################################################################################################################*/

    static Random r = new Random();
    static Boolean isFinished = false;
    static List<String> currentTrace;
    static int traceLength = 10;
    private static Context c = PathTracker.ctx;

    // Strategy: set currentTrace to first element of satisfiableInputs, if no elements, generate random trace or mutate or something.
    // Problem: how to sort satisfiableInputs? length (go for depth)?
    private static PriorityQueue<LinkedList<String>> satisfiableInputs = new PriorityQueue<>(INITIAL_QUEUE_LENGTH, new InputComparator());

    static void initialize(String[] inputSymbols){
        // Initialise a random trace from the input symbols of the problem.
        currentTrace = generateRandomTrace(inputSymbols);
    }

    static MyVar createVar(String name, Expr value, Sort s){
        PRINT_FUNCTION_NAME();
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        /**
         * Create var, assign value and add to path constraint.
         * We show how to do it for creating new symbols, please
         * add similar steps to the functions below in order to
         * obtain a path constraint.
         */
        Expr z3var = c.mkConst(c.mkSymbol(name + "_" + PathTracker.z3counter++), s);
        PathTracker.addToModel(c.mkEq(z3var, value));
        return new MyVar(z3var, name);
    }

    static MyVar createInput(String name, Expr value, Sort s){
        PRINT_FUNCTION_NAME();
        // Create an input var, these should be free variables!
        Expr z3var = c.mkConst(c.mkSymbol(name + "_" + PathTracker.z3counter++), s);
        return new MyVar(z3var, name);
    }

    static MyVar createBoolExpr(BoolExpr var, String operator){
        PRINT_FUNCTION_NAME();
        // Any unary expression (!)
        switch (operator) {
            case "!":
                return new MyVar(c.mkNot(var));
            case "":
                return new MyVar(var);
            default:
                throw new IllegalArgumentException("\nUnexpected operator in (unary) createBoolExpr(): "+ operator);
        }
    }

    static MyVar createBoolExpr(BoolExpr left_var, BoolExpr right_var, String operator){
        PRINT_FUNCTION_NAME();
        // Any binary expression (&, &&, |, ||)
        switch (operator) {
            case "&":
            case "&&":
                return new MyVar(c.mkAnd(left_var, right_var));
            case "|":
            case "||":
                return new MyVar(c.mkOr(left_var, right_var));
            default:
                throw new IllegalArgumentException("\nUnexpected operator in (binary) createBoolExpr(): "+ operator);
        }
    }

    static MyVar createIntExpr(IntExpr var, String operator){
        PRINT_FUNCTION_NAME();
        // Any unary expression (+, -)
        switch (operator) {
            case "+":
                return new MyVar(var);
            case "-":
                return new MyVar(c.mkUnaryMinus(var));
            default:
                throw new IllegalArgumentException("\nUnexpected operator in (unary) createBoolExpr(): "+ operator);
        }
    }

    static MyVar createIntExpr(IntExpr left_var, IntExpr right_var, String operator){
        PRINT_FUNCTION_NAME();
        // Any binary expression (+, -, /, *, %, ^, etc)
        switch (operator) {

            // Arithmetic expressions
            case "+":
                return new MyVar(c.mkAdd(left_var, right_var));
            case "-":
                return new MyVar(c.mkSub(left_var, right_var));
            case "/":
                return new MyVar(c.mkDiv(left_var, right_var));
            case "*":
                return new MyVar(c.mkMul(left_var, right_var));
            case "%":
                return new MyVar(c.mkMod(left_var, right_var));
            case "^":
                System.out.println("That's interesting, we have an XOR");
                return new MyVar(c.mkBV2Int(c.mkBVXOR(c.mkInt2BV(32, left_var), c.mkInt2BV(32, right_var)), true));

            // Boolean expressions
            case "==":
                return new MyVar(c.mkEq(left_var, right_var)); // TODO: maybe call .simplify() for some expressions
            case "!=":
                return new MyVar(c.mkNot(c.mkEq(left_var, right_var)));
            case "<":
                return new MyVar(c.mkGt(left_var, right_var));
            case ">":
                return new MyVar(c.mkLt(left_var, right_var));
            case "<=":
                return new MyVar(c.mkLe(left_var, right_var));
            case ">=":
                return new MyVar(c.mkGe(left_var, right_var));
            default:
                throw new IllegalArgumentException("\nUnexpected operator in (binary) createIntExpr(): "+ operator);
        }
    }

    static MyVar createStringExpr(SeqExpr left_var, SeqExpr right_var, String operator){
        PRINT_FUNCTION_NAME();
        // We only support String.equals
        switch (operator) {
            case "==":
                return new MyVar(c.mkEq(left_var, right_var));
            default:
                throw new IllegalArgumentException("\nUnexpected operator in createStringExpr(): "+ operator);
        }
    }

    static void assign(MyVar var, String name, Expr value, Sort s){
        PRINT_FUNCTION_NAME();
        // All variable assignments, use single static assignment
        Expr z3var = c.mkConst(c.mkSymbol(name + "_" + PathTracker.z3counter++), s);
        PathTracker.addToModel(c.mkEq(z3var, value));
    }

    static void encounteredNewBranch(MyVar condition, boolean value, int line_nr){  
        PRINT_FUNCTION_NAME();
        System.out.println("\n\nDEBUG:" + condition.z3var + "\n\n");
        System.out.println("\nDEBUG:" + condition.z3var.isBool());
        System.out.println("\nDEBUG:" + condition.z3var.getSort());

        // PESUDOCODE:
        /*
         * if we the encountered branch has not been visited before do:
         *      make sure condition is well formed (i.e. a BoolExpr)
         *      add to the path constraints
         *      (NOTE: the variables z3branches and z3model are just for printing, 
         *      addToModel and addToBranches both add an expression to the solver object, aka. to the path constraint)
         * otherwise do:
         *      ??? reset? do nothing?
         */

        // Guard clauses
        if (!condition.z3var.isBool()) { throw new IllegalArgumentException("\nUnexpected Expr Sort in encounteredNewBranch(): "+ condition.z3var.getSort()); }
        // if (!unique.add()) {return;} // TODO: keep track of unique branches (like before or with more stuff)

        // Main function body
        int numInputsInQueue0 = satisfiableInputs.size();
        PathTracker.solve((BoolExpr)condition.z3var, true); // check solvability, but does not permanently add to path constraint
        if (satisfiableInputs.size() > numInputsInQueue0) {
            PathTracker.addToBranches((BoolExpr)condition.z3var);
        };
    }

    static void newSatisfiableInput(LinkedList<String> new_inputs) {
        PRINT_FUNCTION_NAME();
        // Hurray! found a new branch using these new inputs!
        System.out.println("newSatisfiableInput(new_inputs), new_inputs: " + new_inputs);

        // Add to priority queue for use with 'smart' fuzzer
        satisfiableInputs.add(new_inputs);
    }

    /**
     * Method for fuzzing new inputs for a program.
     * @param inputSymbols the inputSymbols to fuzz from.
     * @return a fuzzed sequence
     */
    static List<String> fuzz(String[] inputSymbols){
        PRINT_FUNCTION_NAME();
        // Get first element of satisfiableInputs is it exists, otherwise generate random trace
        return satisfiableInputs.peek() != null ? satisfiableInputs.poll() : generateRandomTrace(inputSymbols);
    }

    /**
     * Generate a random trace from an array of symbols.
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
        PRINT_FUNCTION_NAME();
        initialize(PathTracker.inputSymbols);
        PathTracker.runNextFuzzedSequence(currentTrace.toArray(new String[0]));
        // Place here your code to guide your fuzzer with its search using Symbolic Execution.
        while(!isFinished) {
            // Do things!
            currentTrace = fuzz(PathTracker.inputSymbols);
            PathTracker.runNextFuzzedSequence(currentTrace.toArray(new String[0]));
            try {
                System.out.println("Woohoo, looping!");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void output(String out){
        System.out.println(out);
    }

    // Helper for debugging (this implementation is not foolproof)
    public static void PRINT_FUNCTION_NAME(){
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
    }

}

// EXTERNAL CLASSES

// TODO: verify correctness (and think about if we want this kind of sorting)
class InputComparator implements Comparator<LinkedList<String>>{
             
    // Overriding compare() method of Comparator for descending list length
    public int compare(LinkedList<String> s1, LinkedList<String> s2) {
        if (s1.size() < s2.size()) return 1;
        else if (s1.size() > s2.size()) return -1;
        else return 0;
        }
}