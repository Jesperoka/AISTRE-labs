package nl.tudelft.instrumentation.symbolic;

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
    private static final int TRACE_LENGTH = 10;
    private static final long NANOSECS_PER_SEC = 1000l*1000*1000;
    private static final long FIVE_MIN_IN_NANOSECS = 5*60*NANOSECS_PER_SEC;
    private static final int INITIAL_QUEUE_LENGTH = 11;
    private static final Random RNG = new Random();
    private static final Context CTX = PathTracker.ctx; // make final?

    // Variables used by the fuzzer
    private static class FuzzerState {
            static List<String> currentTrace = Arrays.asList("");
            static Set<MyPair<Boolean, Integer>> currentUniqueBranchesCovered = new HashSet<>();
            static PriorityQueue<LinkedList<String>> satisfiableInputs = new PriorityQueue<>(INITIAL_QUEUE_LENGTH, new InputComparator());
            static boolean isFinished = false;
    }
    // Values output by the fuzzer at the end
    private static class FuzzerOutput {
            static Set<String> triggeredErrorCodes = new HashSet<>();
            static Set<MyPair<Boolean, Integer>> uniqueVisitedBranches = new HashSet<>();
            static int mostBranchesCovered = 0;
            static List<String> mostCoveringInput = Arrays.asList("");

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
        switch (operator) {
            case "==":
                return new MyVar(CTX.mkEq(left_var, right_var));
            default:
                throw new IllegalArgumentException("\nUnexpected operator in createStringExpr(): "+ operator);
        }
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
        FuzzerState.currentUniqueBranchesCovered.add(new MyPair<Boolean, Integer>(value, lineNumber));
        if (FuzzerState.currentUniqueBranchesCovered.size() > FuzzerOutput.mostBranchesCovered) {
            FuzzerOutput.mostBranchesCovered = FuzzerState.currentUniqueBranchesCovered.size();
            FuzzerOutput.mostCoveringInput = FuzzerState.currentTrace;
        }
        // Guard clauses
        if (!condition.z3var.isBool()) { throw new IllegalArgumentException("\nUnexpected Expr Sort in encounteredNewBranch(): "+ condition.z3var.getSort()); }
        if (!FuzzerOutput.uniqueVisitedBranches.add(new MyPair<Boolean, Integer>(value, lineNumber))) {return;} // TODO: think about whether we want to do something if branch is not unique
        
        // Conditionally do
        int numSatisfiableInputsPriorToSolving = FuzzerState.satisfiableInputs.size();
        PathTracker.solve((BoolExpr)condition.z3var, true); // check solvability, but does not permanently add to path constraint
        if (FuzzerState.satisfiableInputs.size() > numSatisfiableInputsPriorToSolving) {
            PathTracker.addToBranches((BoolExpr)condition.z3var);
        };
    }

    // Called when PathTracker.solve() finds a SATISFIABLE input. Adds found inputs to priority queue for use with fuzzer.
    static void newSatisfiableInput(LinkedList<String> new_inputs) {
        PRINT_FUNCTION_NAME();
        System.out.println("newSatisfiableInput(new_inputs), new_inputs: " + new_inputs);
        FuzzerState.satisfiableInputs.add(new_inputs);
    }

    // Return first element of FuzzerState.satisfiableInputs is it exists, otherwise return randomly generated trace.
    static List<String> fuzz(String[] inputSymbols){
        PRINT_FUNCTION_NAME();
        return FuzzerState.satisfiableInputs.peek() != null ? FuzzerState.satisfiableInputs.poll() : generateRandomTrace(inputSymbols);
    }

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
        PRINT_FUNCTION_NAME(); printDebugWarning();

        int i = 0; 
        assert(Double.class.isInstance(MAX_ITERATIONS) && Integer.class.isInstance(i) && Integer.SIZE == 32 && Double.SIZE >= 32); // making sure int < double comparison is safe (enough)
        double startTime = System.nanoTime();
        while(!FuzzerState.isFinished && i < MAX_ITERATIONS) {
            // TODO: THINK, should we call PathTracker.reset() every iteration (the comment in PathTracker.java seems to imply this)?
            // or should we only call it if satisfiableInputs is empty? Something else?
            FuzzerState.currentUniqueBranchesCovered.clear();
            FuzzerState.currentTrace = fuzz(PathTracker.inputSymbols);
            PathTracker.reset(); // <-- THINK
            System.out.println("DEBUG: "+FuzzerState.currentTrace);
            PathTracker.runNextFuzzedSequence(FuzzerState.currentTrace.toArray(new String[0]));

            FuzzerState.isFinished = (System.nanoTime() - startTime) < FIVE_MIN_IN_NANOSECS ? false : true;
            i++;
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
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                    e.printStackTrace();
            }
        }  
    }

    // TODO: verify correctness (and think about if we want this kind of sorting)
    // Used to implement priority queue
    private static class InputComparator implements Comparator<LinkedList<String>>{
                
        // Overriding compare() method of Comparator for descending list length
        public int compare(LinkedList<String> s1, LinkedList<String> s2) {
            if (s1.size() < s2.size()) return 1;
            else if (s1.size() > s2.size()) return -1;
            else return 0;
            }
    }

    // PAIR CLASS RIPPED AND ADAPTED FROM JAVAFX: http://www.java2s.com/example/java-src/pkg/javafx/util/pair-7999d.html
    /**
     * <p>A convenience class to represent name-value pairs.</p>
     * @since JavaFX 2.0
     */
    private static class MyPair<K, V> implements Serializable {
        private K key;
        private V value;
        public K getKey() {return key;}
        public V getValue() {return value;}

        public MyPair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 31 * hash + (key != null ? key.hashCode() : 0);
            hash = 31 * hash + (value != null ? value.hashCode() : 0);
            return hash;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o instanceof MyPair<?,?>) {
                MyPair<?,?> pair = (MyPair<?,?>) o;
                if (key != null ? !key.equals(pair.key) : pair.key != null)
                    return false;
                if (value != null ? !value.equals(pair.value) : pair.value != null)
                    return false;
                return true;
            }
            return false;
        }
    }
}