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

    static Random r = new Random();
    static Boolean isFinished = false;
    static List<String> currentTrace;
    static int traceLength = 10;

    static void initialize(String[] inputSymbols){
        // Initialise a random trace from the input symbols of the problem.
        currentTrace = generateRandomTrace(inputSymbols);
    }

    static MyVar createVar(String name, Expr value, Sort s){
        PRINT_FUNCTION_NAME();
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        Context c = PathTracker.ctx;
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
        Context c = PathTracker.ctx;
        Expr z3var = c.mkConst(c.mkSymbol(name + "_" + PathTracker.z3counter++), s);
        // PathTracker.addToModel(c.mkEq(z3var, value)); // not sure about this, maybe add to PathTracker.inputs instead?
        return new MyVar(z3var, name);
    }

    static MyVar createBoolExpr(BoolExpr var, String operator){
        PRINT_FUNCTION_NAME();
        // Any unary expression (!)
        Context c = PathTracker.ctx;
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
        Context c = PathTracker.ctx;
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
        Context c = PathTracker.ctx;
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
        Context c = PathTracker.ctx;
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
                return new MyVar(c.mkPower(left_var, right_var));
            // Boolean expressions
            case "==":
                return new MyVar(c.mkEq(left_var, right_var));
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
        Context c = PathTracker.ctx;
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
        Context c = PathTracker.ctx;
        Expr z3var = c.mkConst(c.mkSymbol(name + "_" + PathTracker.z3counter++), s);
        PathTracker.addToModel(c.mkEq(z3var, value));
    }

    static void encounteredNewBranch(MyVar condition, boolean value, int line_nr){
        PRINT_FUNCTION_NAME();
        // Call the solver
        // Status staus = PathTracker.solver.check();
        // System.out.println("Solver says: " + staus);
        // System.out.println("Model: \n" + PathTracker.solver.getModel());
    }

    static void newSatisfiableInput(LinkedList<String> new_inputs) {
        PRINT_FUNCTION_NAME();
        // Hurray! found a new branch using these new inputs!
        System.out.println("newSatisfiableInput(new_inputs), new_inputs: " + new_inputs);
    }

    /**
     * Method for fuzzing new inputs for a program.
     * @param inputSymbols the inputSymbols to fuzz from.
     * @return a fuzzed sequence
     */
    static List<String> fuzz(String[] inputSymbols){
        PRINT_FUNCTION_NAME();
        /*
         * Add here your code for fuzzing a new sequence for the RERS problem.
         * You can guide your fuzzer to fuzz "smart" input sequences to cover
         * more branches using symbolic execution. Right now we just generate
         * a complete random sequence using the given input symbols. Please
         * change it to your own code.
         */
        return generateRandomTrace(inputSymbols);
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