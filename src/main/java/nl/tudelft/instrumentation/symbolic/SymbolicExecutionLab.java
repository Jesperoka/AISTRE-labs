package nl.tudelft.instrumentation.symbolic;

import java.sql.Array;
import java.util.*;
import com.microsoft.z3.*;
import nl.tudelft.instrumentation.fuzzing.DistanceTracker;

import java.io.FileWriter;
import java.io.IOException;

// Student imports
import java.io.Serializable;

/**
 * You should write your solution using this class.
 */
public class SymbolicExecutionLab {
    // Constants
    private static final boolean DEBUG = false;
    private static final double MAX_ITERATIONS = 1000; // double because then we can use infinity to run based on time only
    private static int TRACE_LENGTH = 1;
    private static final long NANOSECS_PER_SEC = 1000L*1000*1000;
    private static final long FIVE_MIN_IN_NANOSECS = 5*60*NANOSECS_PER_SEC;
    private static final int INITIAL_QUEUE_LENGTH = 11;
    private static final Random RNG = new Random();
    private static final Context CTX = PathTracker.ctx;

    private static LinkedList<String> pot_new = new LinkedList<>();
    private static boolean satisfied = false;

    // Variables used by the fuzzer
    private static class FuzzerState {
            static List<String> currentTrace = new ArrayList<>();
            static Set<AbstractMap.SimpleEntry<Boolean, Integer>> currentUniqueBranchesCovered = new HashSet<>();
            static Stack<LinkedList<String>> satisfiableInputs = new Stack<>();
            static boolean isFinished = false;
    }
    // Values output by the fuzzer at the end
    private static class FuzzerOutput {
            static Set<String> triggeredErrorCodes = new HashSet<>();
            static Set<AbstractMap.SimpleEntry<Boolean, Integer>> uniqueVisitedBranches = new HashSet<>();
            static int mostBranchesCovered = 0;
            static List<String> mostCoveringInput = new ArrayList<>();

            static void display() {
                    System.out.println("\nNumber of unique branches: " + FuzzerOutput.uniqueVisitedBranches.size() + "\n");
                    System.out.println("Error codes triggered:\n" + FuzzerOutput.triggeredErrorCodes + "\n");
                    System.out.println("The input covering the most branches was:\n" + FuzzerOutput.mostCoveringInput + "\nWith " + FuzzerOutput.mostBranchesCovered + " branches covered.\n");
            }
    }

    static void initialize(String[] inputSymbols){
        // Initialise a random trace from the input symbols of the problem.
        FuzzerState.currentTrace = generateRandomTrace(inputSymbols);
    }

    // Create var, assign value and add to path constraint.
    static MyVar createVar(String name, Expr value, Sort s){
        PRINT_FUNCTION_NAME();
        Expr z3var = CTX.mkConst(CTX.mkSymbol(name + "_" + PathTracker.z3counter++), s);
        PathTracker.addToModel(CTX.mkEq(z3var, value));
        return new MyVar(z3var, name);
    }

    // Create an input var, these should be free variables. TODO: verify correctness
    static MyVar createInput(String name, Expr value, Sort s){ // TODO: check for correct input
        PRINT_FUNCTION_NAME();
        // System.out.println("DEBUG: "+PathTracker.inputSymbols.toString());
        // System.out.println("DEBUG: "+value.toString());
        // if(!Arrays.asList(PathTracker.inputSymbols).contains(value.toString())){
        //     throw new IllegalArgumentException("\nUnexpected input not in inputSymbols");
        // }
        Expr z3var = CTX.mkConst(CTX.mkSymbol(name + "_" + PathTracker.z3counter++), s);
        MyVar var = new MyVar(z3var, name);
        PathTracker.inputs.push(var); // TODO: unsure about this, but unless we do this PathTracker.inputs is always empty?
        return var;
    }

    // Creates a boolean expression with a unary operator
    static MyVar createBoolExpr(BoolExpr var, String operator){
        PRINT_FUNCTION_NAME();
        // Any unary expression (!)
        switch (operator) {
            case "!":
                return new MyVar(CTX.mkNot(var));
            case "":
                return new MyVar(var);
            default:
                throw new IllegalArgumentException("\nUnexpected operator in (unary) createBoolExpr(): "+ operator);
        }
    }

    // Creates a boolean expression with a binary operator
    static MyVar createBoolExpr(BoolExpr left_var, BoolExpr right_var, String operator){
        PRINT_FUNCTION_NAME();
        // Any binary expression (&, &&, |, ||)
        switch (operator) {
            case "&":
            case "&&":
                return new MyVar(CTX.mkAnd(left_var, right_var));
            case "|":
            case "||":
                return new MyVar(CTX.mkOr(left_var, right_var));
            default:
                throw new IllegalArgumentException("\nUnexpected operator in (binary) createBoolExpr(): "+ operator);
        }
    }

    // Create an integer expression with a unary operator
    static MyVar createIntExpr(IntExpr var, String operator){
        PRINT_FUNCTION_NAME();
        // Any unary expression (+, -)
        switch (operator) {
            case "+":
                return new MyVar(var);
            case "-":
                return new MyVar(CTX.mkUnaryMinus(var));
            default:
                throw new IllegalArgumentException("\nUnexpected operator in (unary) createBoolExpr(): "+ operator);
        }
    }

    // Create an expression from integer expressions with a binary operator. Can result in boolean expression or arithmetic expression.
    static MyVar createIntExpr(IntExpr left_var, IntExpr right_var, String operator){
        PRINT_FUNCTION_NAME();
        // Any binary expression (+, -, /, *, %, ^, etc)
        switch (operator) {

            // Arithmetic expressions
            case "+":
                return new MyVar(CTX.mkAdd(left_var, right_var));
            case "-":
                return new MyVar(CTX.mkSub(left_var, right_var));
            case "/":
                return new MyVar(CTX.mkDiv(left_var, right_var));
            case "*":
                return new MyVar(CTX.mkMul(left_var, right_var));
            case "%":
                return new MyVar(CTX.mkMod(left_var, right_var));
            case "^":
                System.out.println("That's interesting, we have an XOR");
                return new MyVar(CTX.mkBV2Int(CTX.mkBVXOR(CTX.mkInt2BV(32, left_var), CTX.mkInt2BV(32, right_var)), true));

            // Boolean expressions
            case "==":
                return new MyVar(CTX.mkEq(left_var, right_var)); // TODO: maybe call .simplify() for some expressions
            case "!=":
                return new MyVar(CTX.mkNot(CTX.mkEq(left_var, right_var)));
            case "<":
                return new MyVar(CTX.mkGt(left_var, right_var));
            case ">":
                return new MyVar(CTX.mkLt(left_var, right_var));
            case "<=":
                return new MyVar(CTX.mkLe(left_var, right_var));
            case ">=":
                return new MyVar(CTX.mkGe(left_var, right_var));
            default:
                throw new IllegalArgumentException("\nUnexpected operator in (binary) createIntExpr(): "+ operator);
        }
    }

    // Create a boolean equality expression from string expressions.
    static MyVar createStringExpr(SeqExpr left_var, SeqExpr right_var, String operator){
        PRINT_FUNCTION_NAME();
        // We only support String.equals
        if ("==".equals(operator)) {
            return new MyVar(CTX.mkEq(left_var, right_var));
        }
        throw new IllegalArgumentException("\nUnexpected operator in createStringExpr(): " + operator);
    }

    // Assignment changes the z3var in a MyVar variable. Uses single static assignment. TODO: verify correctness
    static void assign(MyVar var, String name, Expr value, Sort s){
        PRINT_FUNCTION_NAME();
        var.z3var = CTX.mkConst(CTX.mkSymbol(name + "_" + PathTracker.z3counter++), s); // This should actually change the value in Java right?
        PathTracker.addToModel(CTX.mkEq(var.z3var, value));
    }

    // TODO: function description
    static void encounteredNewBranch(MyVar condition, boolean value, int lineNumber){

        PRINT_FUNCTION_NAME();
        // Always do
        if(FuzzerState.currentUniqueBranchesCovered.add(new AbstractMap.SimpleEntry<>(value, lineNumber))) {
            if (FuzzerState.currentUniqueBranchesCovered.size() > FuzzerOutput.mostBranchesCovered) {
                FuzzerOutput.mostBranchesCovered = FuzzerState.currentUniqueBranchesCovered.size();
                FuzzerOutput.mostCoveringInput = FuzzerState.currentTrace;
            }

            if (satisfied) {
                satisfied = false;
                //System.out.println("I am satisfied!");
                FuzzerState.satisfiableInputs.push(pot_new);
            }
        }
        FuzzerOutput.uniqueVisitedBranches.add(new AbstractMap.SimpleEntry<>(value, lineNumber));

        // Guard clauses
        if (!condition.z3var.isBool()) {
            throw new IllegalArgumentException("\nUnexpected Expr Sort in encounteredNewBranch(): "+ condition.z3var.getSort());
        }
        PathTracker.solve((BoolExpr)condition.z3var, false); // checks satisfiability, but does not permanently add to path constraint

        /*
        // Conditionally do
        int numSatisfiableInputsPriorToSolving = FuzzerState.satisfiableInputs.size();
        if (FuzzerState.satisfiableInputs.size() > numSatisfiableInputsPriorToSolving) {
            PathTracker.addToBranches((BoolExpr)condition.z3var);
        };*/


    }

    // Called when PathTracker.solve() finds a SATISFIABLE input. Adds found inputs to priority queue for use with fuzzer.
    static void newSatisfiableInput(LinkedList<String> new_inputs) {
        /*
        PRINT_FUNCTION_NAME();
        System.out.println("newSatisfiableInput(new_inputs), new_inputs: " + new_inputs);*/
        //FuzzerState.satisfiableInputs.add(new_inputs);
        pot_new = new_inputs;
        satisfied = true;
        //FuzzerState.newInputs.push(new_inputs);
    }
    /*
    // Return first element of FuzzerState.satisfiableInputs is it exists, otherwise return randomly generated trace.
    static List<String> fuzz(String[] inputSymbols){
        PRINT_FUNCTION_NAME();
        return FuzzerState.satisfiableInputs.peek() != null ? FuzzerState.satisfiableInputs.poll() : generateRandomTrace(inputSymbols);
    }*/

    // Generate a random trace from an array of symbols.
    static List<String> generateRandomTrace(String[] symbols) {
        ArrayList<String> trace = new ArrayList<>();
        for (int i = 0; i < TRACE_LENGTH; i++) {
            trace.add(symbols[RNG.nextInt(symbols.length)]);
        }
        return trace;
    }

    // TODO: function description
    static void run() {
        PRINT_FUNCTION_NAME();
        printDebugWarning();

        //int i = 0;

        double startTime = System.nanoTime();
        while(!FuzzerState.isFinished) {
            System.out.println(FuzzerState.satisfiableInputs.size());
            if (FuzzerState.satisfiableInputs.size() == 0) {
                TRACE_LENGTH++;
                FuzzerState.currentUniqueBranchesCovered.clear();
                System.out.println("DEBUG: Exhausted options, thus increasing trace length!");
                FuzzerState.currentTrace = generateRandomTrace(PathTracker.inputSymbols);
            } else {
                FuzzerState.currentTrace = FuzzerState.satisfiableInputs.pop();
            }

            PathTracker.reset(); // <-- THINK
            //System.out.println("DEBUG: "+FuzzerState.currentTrace);
            PathTracker.runNextFuzzedSequence(FuzzerState.currentTrace.toArray(new String[0]));

            FuzzerState.isFinished = !((System.nanoTime() - startTime) < FIVE_MIN_IN_NANOSECS);
            if(TRACE_LENGTH > 30) {
                FuzzerState.isFinished = true;
            }
            //i++;
        }
        FuzzerOutput.display();
    }

    // Method that is used for catching the output from standard out.
    public static void output(String out){
        System.out.println(out);
        String[] splitOutput = out.split("error_", 2);
        if (splitOutput.length == 2) {
                FuzzerOutput.triggeredErrorCodes.add(splitOutput[1]);
        }
    }

    // Helper for debugging (this implementation is not foolproof)
    public static void PRINT_FUNCTION_NAME(){
        if(DEBUG) System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());;
    }

    // Helper for warning about debug printing
    private static void printDebugWarning() {
        if (DEBUG) {
            System.err.println("\n\n\n\n\n\n\n\n\n\nDEBUG PRINTING IS ON, EXECUTION WILL BE SLOW...\n\n\n\n\n\n\n\n\n\n");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                    e.printStackTrace();
            }
        }  
    }
}