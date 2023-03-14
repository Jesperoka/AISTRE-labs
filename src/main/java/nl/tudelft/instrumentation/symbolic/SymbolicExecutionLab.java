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
    private static final double MAX_ITERATIONS = Double.POSITIVE_INFINITY; // double because then we can use infinity to run based on time only
    private static final int INITIAL_TRACE_LENGTH = 0;
    private static final long NANOSECS_PER_SEC = 1000L*1000*1000;
    private static final long FIVE_MIN_IN_NANOSECS = 6*60*NANOSECS_PER_SEC;
    private static final Random RNG = new Random();
    private static final Context CTX = PathTracker.ctx;

    // Variables used by the fuzzer
    private static class FuzzerState {
            static int currentTraceLength = INITIAL_TRACE_LENGTH;
            static List<String> currentTrace = new LinkedList<>();
            static Set<AbstractMap.SimpleEntry<Boolean, Integer>> currentUniqueBranchesCovered = new HashSet<>();
            static Stack<LinkedList<String>> satisfiableInputs = new Stack<>();
            static boolean isFinished = false;
    }
    // Values output by the fuzzer at the end
    private static class FuzzerOutput {
            static Set<String> triggeredErrorCodes = new HashSet<>();
            static Set<AbstractMap.SimpleEntry<Boolean, Integer>> uniqueVisitedBranches = new HashSet<>();
            static int mostBranchesCovered = 0;
            static List<String> mostCoveringInput = new LinkedList<>();

            static void display() {
                    System.out.println("\nNumber of unique branches: " + FuzzerOutput.uniqueVisitedBranches.size() + "\n");
                    System.out.println(FuzzerOutput.triggeredErrorCodes.size()+" error codes triggered:\n" + FuzzerOutput.triggeredErrorCodes + "\n");
                    System.out.println("The input covering the most branches was:\n" + FuzzerOutput.mostCoveringInput + "\nWith " + FuzzerOutput.mostBranchesCovered + " branches covered.\n");
            }
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
    
        Expr z3var = CTX.mkConst(CTX.mkSymbol(name + "_" + PathTracker.z3counter++), s);
        MyVar var = new MyVar(z3var, name);
        /// TESTING
        BoolExpr constraint = CTX.mkFalse();
        for (String input: PathTracker.inputSymbols) {
            constraint = CTX.mkOr(CTX.mkEq(z3var, CTX.mkString(input)), constraint);
        }
        PathTracker.addToModel(constraint);
        /// TESTING
        PathTracker.inputs.push(var);
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

    /**
     * Check if our current input trace covers more branches than the record so far,
     * and update FuzzerOutput.mostBranchesCovered and FuzzerOutput.mostCoveringInput if so.
     * @return true if an update was made, false otherwise
     */
    static boolean updateMaxCoveringInput() {
        if (FuzzerState.currentUniqueBranchesCovered.size() > FuzzerOutput.mostBranchesCovered) {
            FuzzerOutput.mostBranchesCovered = FuzzerState.currentUniqueBranchesCovered.size();
            FuzzerOutput.mostCoveringInput = FuzzerState.currentTrace;
            return true;
        }
        return false;
    }

    /**
     * This function is called whenever the executed program encounters a branch.
     * @param condition The condition of the encountered branch
     * @param value The actual value the branch evaluated to.
     * @param lineNumber The linenumber that the branch occurred at.
     */
    static void encounteredNewBranch(MyVar condition, boolean value, int lineNumber){
        PRINT_FUNCTION_NAME();
        
        // Guard clauses
        if (!condition.z3var.isBool()) { throw new IllegalArgumentException("\nUnexpected Expr Sort in encounteredNewBranch(): "+ condition.z3var.getSort());}
        if(!FuzzerState.currentUniqueBranchesCovered.add(new AbstractMap.SimpleEntry<>(value, lineNumber))) { return; } // There is no situation where a "current" branch is not unique to current branches, but is unique to all visited branches.
        
        updateMaxCoveringInput();
        FuzzerOutput.uniqueVisitedBranches.add(new AbstractMap.SimpleEntry<>(value, lineNumber)); 
        BoolExpr oppositeBranch = CTX.mkEq(condition.z3var, value ? CTX.mkFalse() : CTX.mkTrue());

        switch(PathTracker.solve(oppositeBranch, false)) {
            case SATISFIABLE:
                PathTracker.addToBranches(oppositeBranch);
                break;
            case UNSATISFIABLE: break; // Can we do something smart if we know the branch cannot be reached?
            case UNKNOWN: break; // Here one would hypothetically do concolic execution?
            default: throw new IllegalArgumentException("Unexpected return from PathTracker.solve()");
        }
        PathTracker.addToBranches((BoolExpr)condition.z3var); // add current branch after attempting to solve for oppositeBranch
    }

    /**
     * Called when the solver finds a trace that satisfies the branch.
     * @param new_inputs when these inputs are given to the program then it reaches the new branch.
     */
    static void newSatisfiableInput(LinkedList<String> new_inputs) {
        PRINT_FUNCTION_NAME();
        // increment trace length here as well? ( FuzzerState.currentTraceLength += 1; )
        FuzzerState.currentTraceLength++; // TESTING OUT SUGGESTION FROM MATTERMOST
        FuzzerState.satisfiableInputs.push((LinkedList<String>) fillTrace(new_inputs, PathTracker.inputSymbols));
        FuzzerState.currentTraceLength--; // TESTING (there was no difference with or without this)
    }

    /**
     * This method fills a trace given back by the solver up till the trace length to potentially trigger more branches.
     * @param newTrace The trace to be filled.
     * @param symbols THe set of allowed inputsymbols
     * @return the trace with potentially added characters.
     */
    static List<String> fillTrace(List<String> newTrace, String[] symbols) {
        while (newTrace.size() < FuzzerState.currentTraceLength) {
            newTrace.add(symbols[RNG.nextInt(symbols.length)]);
        }
        return newTrace;
    }

    /**
     * Uses the set of input symbols and the trace length to generate a new random trace.
     * @param symbols the set of allowed input symbols
     * @return a trace of length currentTraceLength that contains random input symbols
     */
    static List<String> generateRandomTrace(String[] symbols) {
        ArrayList<String> trace = new ArrayList<>();
        for (int i = 0; i < FuzzerState.currentTraceLength; i++) {
            trace.add(symbols[RNG.nextInt(symbols.length)]);
        }
        return trace;
    }

    // Return first element of FuzzerState.satisfiableInputs is it exists, otherwise return randomly generated trace.
    static List<String> fuzz(int i, String[] inputSymbols){
        PRINT_FUNCTION_NAME();

        if (FuzzerState.satisfiableInputs.size() > 0) {return FuzzerState.satisfiableInputs.pop();}

        System.out.println("DEBUG: no more satisfiableInputs, increasing trace length.");
        FuzzerState.currentTraceLength += 1;
        return generateRandomTrace(inputSymbols);
    }

    /**
     * This method runs the symbolic execution.
     */
    static void run() {
        PRINT_FUNCTION_NAME();
        printDebugWarning();

        int i = 0;
        double startTime = System.nanoTime();
        while(!FuzzerState.isFinished && i < MAX_ITERATIONS) {

            FuzzerState.currentUniqueBranchesCovered.clear();
            FuzzerState.currentTrace = fuzz(i, PathTracker.inputSymbols);
            PathTracker.reset();
            PathTracker.runNextFuzzedSequence(FuzzerState.currentTrace.toArray(new String[0]));

            FuzzerState.isFinished = ((System.nanoTime() - startTime) >= FIVE_MIN_IN_NANOSECS);
            i++;
            System.gc(); // Trying fix for timeout
        }
        FuzzerOutput.display();
    }

    // Method that is used for catching the output from standard out.
    public static void output(String out){
        if(!out.contains("no transition")) {
            System.out.println(out);
        }
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