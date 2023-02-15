import java.io.BufferedReader;
import java.io.InputStreamReader;
import nl.tudelft.instrumentation.fuzzing.*;
import nl.tudelft.instrumentation.runner.CallableTraceRunner;

public class Problem1 implements CallableTraceRunner<Void> {

    static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    private String[] inputs = { "iA", "iB", "iC", "iD", "iE", "iF", "iG", "iH", "iI", "iJ" };

    public int a1122863037 = 10;

    public int a691849188 = 10;

    public int a1305805768 = 13;

    public int a612577343 = 8;

    public String a1855872761 = "g";

    public boolean cf = true;

    public String a547336540 = "g";

    private void calculateOutputm1(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), "&&"), ((((a547336540.equals("e")) && cf) && (input.equals("iE"))) && (a691849188 == 4)), 18);
        if (((((a547336540.equals("e")) && cf) && (input.equals("iE"))) && (a691849188 == 4))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 8;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((input.equals("iJ")) && (((a691849188 == 4) && cf) && (a547336540.equals("e")))), 23);
        if (((input.equals("iJ")) && (((a691849188 == 4) && cf) && (a547336540.equals("e"))))) {
            cf = false;
            a547336540 = "h";
            a1855872761 = "e";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((a691849188 == 4) && ((input.equals("iB")) && cf)) && (a547336540.equals("e"))), 28);
        if ((((a691849188 == 4) && ((input.equals("iB")) && cf)) && (a547336540.equals("e")))) {
            cf = false;
            a691849188 = 7;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a691849188 == 4) && ((a547336540.equals("e")) && ((input.equals("iC")) && cf))), 32);
        if (((a691849188 == 4) && ((a547336540.equals("e")) && ((input.equals("iC")) && cf)))) {
            cf = false;
            a691849188 = 7;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), ((((a691849188 == 4) && cf) && (input.equals("iF"))) && (a547336540.equals("e"))), 36);
        if (((((a691849188 == 4) && cf) && (input.equals("iF"))) && (a547336540.equals("e")))) {
            cf = false;
            a691849188 = 7;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), "&&"), ((a691849188 == 4) && ((a547336540.equals("e")) && (cf && (input.equals("iH"))))), 40);
        if (((a691849188 == 4) && ((a547336540.equals("e")) && (cf && (input.equals("iH")))))) {
            cf = false;
            a691849188 = 7;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a691849188 == 4) && ((input.equals("iI")) && ((a547336540.equals("e")) && cf))), 44);
        if (((a691849188 == 4) && ((input.equals("iI")) && ((a547336540.equals("e")) && cf)))) {
            cf = false;
            a691849188 = 7;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), "&&"), "&&"), "&&"), ((a547336540.equals("e")) && ((input.equals("iA")) && (cf && (a691849188 == 4)))), 48);
        if (((a547336540.equals("e")) && ((input.equals("iA")) && (cf && (a691849188 == 4))))) {
            cf = false;
            a691849188 = 7;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((input.equals("iG")) && (((a691849188 == 4) && cf) && (a547336540.equals("e")))), 52);
        if (((input.equals("iG")) && (((a691849188 == 4) && cf) && (a547336540.equals("e"))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 15;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), "&&"), "&&"), ((input.equals("iD")) && ((cf && (a547336540.equals("e"))) && (a691849188 == 4))), 57);
        if (((input.equals("iD")) && ((cf && (a547336540.equals("e"))) && (a691849188 == 4)))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
    }

    private void calculateOutputm2(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a691849188 == 5) && (((a547336540.equals("e")) && cf) && (input.equals("iH")))), 65);
        if (((a691849188 == 5) && (((a547336540.equals("e")) && cf) && (input.equals("iH"))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a547336540.equals("e")) && ((a691849188 == 5) && ((input.equals("iB")) && cf))), 70);
        if (((a547336540.equals("e")) && ((a691849188 == 5) && ((input.equals("iB")) && cf)))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oY");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), "&&"), ((a547336540.equals("e")) && ((a691849188 == 5) && (cf && (input.equals("iC"))))), 74);
        if (((a547336540.equals("e")) && ((a691849188 == 5) && (cf && (input.equals("iC")))))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oY");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((input.equals("iD")) && ((a691849188 == 5) && cf)) && (a547336540.equals("e"))), 78);
        if ((((input.equals("iD")) && ((a691849188 == 5) && cf)) && (a547336540.equals("e")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oY");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), "&&"), (((input.equals("iE")) && (cf && (a547336540.equals("e")))) && (a691849188 == 5)), 82);
        if ((((input.equals("iE")) && (cf && (a547336540.equals("e")))) && (a691849188 == 5))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oY");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), "&&"), "&&"), "&&"), ((input.equals("iF")) && ((a547336540.equals("e")) && (cf && (a691849188 == 5)))), 86);
        if (((input.equals("iF")) && ((a547336540.equals("e")) && (cf && (a691849188 == 5))))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oY");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), "&&"), "&&"), ((input.equals("iG")) && (((a547336540.equals("e")) && cf) && (a691849188 == 5))), 90);
        if (((input.equals("iG")) && (((a547336540.equals("e")) && cf) && (a691849188 == 5)))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oY");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a547336540.equals("e")) && ((a691849188 == 5) && cf)) && (input.equals("iI"))), 94);
        if ((((a547336540.equals("e")) && ((a691849188 == 5) && cf)) && (input.equals("iI")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oY");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((cf && (a691849188 == 5)) && (input.equals("iJ"))) && (a547336540.equals("e"))), 98);
        if ((((cf && (a691849188 == 5)) && (input.equals("iJ"))) && (a547336540.equals("e")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oY");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((cf && (a691849188 == 5)) && (a547336540.equals("e"))) && (input.equals("iA"))), 102);
        if ((((cf && (a691849188 == 5)) && (a547336540.equals("e"))) && (input.equals("iA")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oY");
        }
    }

    private void calculateOutputm3(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), ((((a691849188 == 6) && cf) && (input.equals("iD"))) && (a547336540.equals("e"))), 109);
        if (((((a691849188 == 6) && cf) && (input.equals("iD"))) && (a547336540.equals("e")))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), "&&"), "&&"), "&&"), ((input.equals("iB")) && ((a547336540.equals("e")) && (cf && (a691849188 == 6)))), 114);
        if (((input.equals("iB")) && ((a547336540.equals("e")) && (cf && (a691849188 == 6))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a691849188 == 6) && ((cf && (a547336540.equals("e"))) && (input.equals("iC")))), 119);
        if (((a691849188 == 6) && ((cf && (a547336540.equals("e"))) && (input.equals("iC"))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((input.equals("iE")) && ((a691849188 == 6) && ((a547336540.equals("e")) && cf))), 124);
        if (((input.equals("iE")) && ((a691849188 == 6) && ((a547336540.equals("e")) && cf)))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a691849188 == 6) && ((a547336540.equals("e")) && cf)) && (input.equals("iF"))), 129);
        if ((((a691849188 == 6) && ((a547336540.equals("e")) && cf)) && (input.equals("iF")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), "&&"), ((a691849188 == 6) && ((input.equals("iH")) && (cf && (a547336540.equals("e"))))), 134);
        if (((a691849188 == 6) && ((input.equals("iH")) && (cf && (a547336540.equals("e")))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((cf && (a547336540.equals("e"))) && (a691849188 == 6)) && (input.equals("iI"))), 139);
        if ((((cf && (a547336540.equals("e"))) && (a691849188 == 6)) && (input.equals("iI")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), "&&"), ((((input.equals("iJ")) && cf) && (a547336540.equals("e"))) && (a691849188 == 6)), 144);
        if (((((input.equals("iJ")) && cf) && (a547336540.equals("e"))) && (a691849188 == 6))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), ((((a547336540.equals("e")) && cf) && (a691849188 == 6)) && (input.equals("iA"))), 149);
        if (((((a547336540.equals("e")) && cf) && (a691849188 == 6)) && (input.equals("iA")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a691849188 == 6) && ((a547336540.equals("e")) && ((input.equals("iG")) && cf))), 154);
        if (((a691849188 == 6) && ((a547336540.equals("e")) && ((input.equals("iG")) && cf)))) {
            cf = false;
            a691849188 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
    }

    private void calculateOutputm4(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((a691849188 == 7) && ((input.equals("iB")) && cf)) && (a547336540.equals("e"))), 161);
        if ((((a691849188 == 7) && ((input.equals("iB")) && cf)) && (a547336540.equals("e")))) {
            cf = false;
            a691849188 = 6;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((cf && (a547336540.equals("e"))) && (a691849188 == 7)) && (input.equals("iC"))), 165);
        if ((((cf && (a547336540.equals("e"))) && (a691849188 == 7)) && (input.equals("iC")))) {
            cf = false;
            a691849188 = 6;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a691849188 == 7) && (((a547336540.equals("e")) && cf) && (input.equals("iE")))), 169);
        if (((a691849188 == 7) && (((a547336540.equals("e")) && cf) && (input.equals("iE"))))) {
            cf = false;
            a691849188 = 6;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((a691849188 == 7) && (((input.equals("iF")) && cf) && (a547336540.equals("e")))), 173);
        if (((a691849188 == 7) && (((input.equals("iF")) && cf) && (a547336540.equals("e"))))) {
            cf = false;
            a691849188 = 6;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), "&&"), ((((input.equals("iH")) && cf) && (a547336540.equals("e"))) && (a691849188 == 7)), 177);
        if (((((input.equals("iH")) && cf) && (a547336540.equals("e"))) && (a691849188 == 7))) {
            cf = false;
            a691849188 = 6;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((cf && (a691849188 == 7)) && (input.equals("iI"))) && (a547336540.equals("e"))), 181);
        if ((((cf && (a691849188 == 7)) && (input.equals("iI"))) && (a547336540.equals("e")))) {
            cf = false;
            a691849188 = 6;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), "&&"), ((a691849188 == 7) && ((a547336540.equals("e")) && (cf && (input.equals("iJ"))))), 185);
        if (((a691849188 == 7) && ((a547336540.equals("e")) && (cf && (input.equals("iJ")))))) {
            cf = false;
            a691849188 = 6;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((cf && (input.equals("iA"))) && (a691849188 == 7)) && (a547336540.equals("e"))), 189);
        if ((((cf && (input.equals("iA"))) && (a691849188 == 7)) && (a547336540.equals("e")))) {
            cf = false;
            a691849188 = 6;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a691849188 == 7) && ((input.equals("iG")) && ((a547336540.equals("e")) && cf))), 193);
        if (((a691849188 == 7) && ((input.equals("iG")) && ((a547336540.equals("e")) && cf)))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 9;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((a691849188 == 7) && (cf && (input.equals("iD")))) && (a547336540.equals("e"))), 198);
        if ((((a691849188 == 7) && (cf && (input.equals("iD")))) && (a547336540.equals("e")))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
    }

    private void calculateOutputm5(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), ((((a547336540.equals("e")) && cf) && (a691849188 == 8)) && (input.equals("iE"))), 206);
        if (((((a547336540.equals("e")) && cf) && (a691849188 == 8)) && (input.equals("iE")))) {
            cf = false;
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((a691849188 == 8) && ((input.equals("iH")) && cf)) && (a547336540.equals("e"))), 210);
        if ((((a691849188 == 8) && ((input.equals("iH")) && cf)) && (a547336540.equals("e")))) {
            cf = false;
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), ((((input.equals("iG")) && cf) && (a691849188 == 8)) && (a547336540.equals("e"))), 214);
        if (((((input.equals("iG")) && cf) && (a691849188 == 8)) && (a547336540.equals("e")))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a547336540.equals("e")) && (cf && (a691849188 == 8))) && (input.equals("iD"))), 219);
        if ((((a547336540.equals("e")) && (cf && (a691849188 == 8))) && (input.equals("iD")))) {
            cf = false;
            a547336540 = "h";
            a1855872761 = "g";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), "&&"), (((cf && (a547336540.equals("e"))) && (input.equals("iC"))) && (a691849188 == 8)), 224);
        if ((((cf && (a547336540.equals("e"))) && (input.equals("iC"))) && (a691849188 == 8))) {
            cf = false;
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oY");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), "&&"), (((a547336540.equals("e")) && ((input.equals("iF")) && cf)) && (a691849188 == 8)), 228);
        if ((((a547336540.equals("e")) && ((input.equals("iF")) && cf)) && (a691849188 == 8))) {
            cf = false;
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oY");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), "&&"), "&&"), ((input.equals("iI")) && ((cf && (a547336540.equals("e"))) && (a691849188 == 8))), 232);
        if (((input.equals("iI")) && ((cf && (a547336540.equals("e"))) && (a691849188 == 8)))) {
            cf = false;
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oY");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), ((((a691849188 == 8) && cf) && (a547336540.equals("e"))) && (input.equals("iJ"))), 236);
        if (((((a691849188 == 8) && cf) && (a547336540.equals("e"))) && (input.equals("iJ")))) {
            cf = false;
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oY");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a691849188 == 8) && ((a547336540.equals("e")) && ((input.equals("iA")) && cf))), 240);
        if (((a691849188 == 8) && ((a547336540.equals("e")) && ((input.equals("iA")) && cf)))) {
            cf = false;
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oY");
        }
    }

    private void calculateOutputm6(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((a691849188 == 9) && ((cf && (input.equals("iC"))) && (a547336540.equals("e")))), 247);
        if (((a691849188 == 9) && ((cf && (input.equals("iC"))) && (a547336540.equals("e"))))) {
            cf = false;
            a691849188 = 11;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a547336540.equals("e")) && ((cf && (a691849188 == 9)) && (input.equals("iE")))), 251);
        if (((a547336540.equals("e")) && ((cf && (a691849188 == 9)) && (input.equals("iE"))))) {
            cf = false;
            a691849188 = 11;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), "&&"), ((a547336540.equals("e")) && ((cf && (input.equals("iF"))) && (a691849188 == 9))), 255);
        if (((a547336540.equals("e")) && ((cf && (input.equals("iF"))) && (a691849188 == 9)))) {
            cf = false;
            a691849188 = 11;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), (((input.equals("iI")) && (cf && (a547336540.equals("e")))) && (a691849188 == 9)), 259);
        if ((((input.equals("iI")) && (cf && (a547336540.equals("e")))) && (a691849188 == 9))) {
            cf = false;
            a691849188 = 11;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((cf && (a547336540.equals("e"))) && (a691849188 == 9)) && (input.equals("iJ"))), 263);
        if ((((cf && (a547336540.equals("e"))) && (a691849188 == 9)) && (input.equals("iJ")))) {
            cf = false;
            a691849188 = 11;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), (((cf && (a547336540.equals("e"))) && (input.equals("iA"))) && (a691849188 == 9)), 267);
        if ((((cf && (a547336540.equals("e"))) && (input.equals("iA"))) && (a691849188 == 9))) {
            cf = false;
            a691849188 = 11;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), "&&"), ((a691849188 == 9) && ((a547336540.equals("e")) && (cf && (input.equals("iH"))))), 271);
        if (((a691849188 == 9) && ((a547336540.equals("e")) && (cf && (input.equals("iH")))))) {
            cf = false;
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), "&&"), ((input.equals("iG")) && (((a547336540.equals("e")) && cf) && (a691849188 == 9))), 275);
        if (((input.equals("iG")) && (((a547336540.equals("e")) && cf) && (a691849188 == 9)))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), (((a547336540.equals("e")) && (cf && (input.equals("iD")))) && (a691849188 == 9)), 280);
        if ((((a547336540.equals("e")) && (cf && (input.equals("iD")))) && (a691849188 == 9))) {
            cf = false;
            a547336540 = "h";
            a1855872761 = "g";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
    }

    private void calculateOutputm7(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((a691849188 == 10) && (cf && (input.equals("iG")))) && (a547336540.equals("e"))), 288);
        if ((((a691849188 == 10) && (cf && (input.equals("iG")))) && (a547336540.equals("e")))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), "&&"), ((a547336540.equals("e")) && ((a691849188 == 10) && (cf && (input.equals("iD"))))), 293);
        if (((a547336540.equals("e")) && ((a691849188 == 10) && (cf && (input.equals("iD")))))) {
            cf = false;
            a547336540 = "h";
            a1855872761 = "g";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), "&&"), ((a691849188 == 10) && ((a547336540.equals("e")) && (cf && (input.equals("iC"))))), 298);
        if (((a691849188 == 10) && ((a547336540.equals("e")) && (cf && (input.equals("iC")))))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), "&&"), ((a547336540.equals("e")) && ((cf && (input.equals("iE"))) && (a691849188 == 10))), 302);
        if (((a547336540.equals("e")) && ((cf && (input.equals("iE"))) && (a691849188 == 10)))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a547336540.equals("e")) && ((cf && (a691849188 == 10)) && (input.equals("iF")))), 306);
        if (((a547336540.equals("e")) && ((cf && (a691849188 == 10)) && (input.equals("iF"))))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((cf && (a691849188 == 10)) && (input.equals("iH"))) && (a547336540.equals("e"))), 310);
        if ((((cf && (a691849188 == 10)) && (input.equals("iH"))) && (a547336540.equals("e")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((input.equals("iI")) && ((a547336540.equals("e")) && ((a691849188 == 10) && cf))), 314);
        if (((input.equals("iI")) && ((a547336540.equals("e")) && ((a691849188 == 10) && cf)))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), (((input.equals("iJ")) && ((a547336540.equals("e")) && cf)) && (a691849188 == 10)), 318);
        if ((((input.equals("iJ")) && ((a547336540.equals("e")) && cf)) && (a691849188 == 10))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), ((((a547336540.equals("e")) && cf) && (input.equals("iA"))) && (a691849188 == 10)), 322);
        if (((((a547336540.equals("e")) && cf) && (input.equals("iA"))) && (a691849188 == 10))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
    }

    private void calculateOutputm8(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), "&&"), ((a547336540.equals("e")) && ((a691849188 == 11) && (cf && (input.equals("iG"))))), 329);
        if (((a547336540.equals("e")) && ((a691849188 == 11) && (cf && (input.equals("iG")))))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a547336540.equals("e")) && ((a691849188 == 11) && cf)) && (input.equals("iC"))), 334);
        if ((((a547336540.equals("e")) && ((a691849188 == 11) && cf)) && (input.equals("iC")))) {
            cf = false;
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), "&&"), (((cf && (input.equals("iE"))) && (a547336540.equals("e"))) && (a691849188 == 11)), 338);
        if ((((cf && (input.equals("iE"))) && (a547336540.equals("e"))) && (a691849188 == 11))) {
            cf = false;
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a547336540.equals("e")) && ((a691849188 == 11) && cf)) && (input.equals("iF"))), 342);
        if ((((a547336540.equals("e")) && ((a691849188 == 11) && cf)) && (input.equals("iF")))) {
            cf = false;
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), "&&"), "&&"), "&&"), ((a547336540.equals("e")) && ((input.equals("iH")) && (cf && (a691849188 == 11)))), 346);
        if (((a547336540.equals("e")) && ((input.equals("iH")) && (cf && (a691849188 == 11))))) {
            cf = false;
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), ((((a691849188 == 11) && cf) && (input.equals("iI"))) && (a547336540.equals("e"))), 350);
        if (((((a691849188 == 11) && cf) && (input.equals("iI"))) && (a547336540.equals("e")))) {
            cf = false;
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), "&&"), (((input.equals("iJ")) && ((a547336540.equals("e")) && cf)) && (a691849188 == 11)), 354);
        if ((((input.equals("iJ")) && ((a547336540.equals("e")) && cf)) && (a691849188 == 11))) {
            cf = false;
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((a691849188 == 11) && (((input.equals("iA")) && cf) && (a547336540.equals("e")))), 358);
        if (((a691849188 == 11) && (((input.equals("iA")) && cf) && (a547336540.equals("e"))))) {
            cf = false;
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
    }

    private void calculateOutputm9(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((a1305805768 == 9) && ((input.equals("iH")) && cf)) && (a547336540.equals("f"))), 365);
        if ((((a1305805768 == 9) && ((input.equals("iH")) && cf)) && (a547336540.equals("f")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), ((((input.equals("iC")) && cf) && (a1305805768 == 9)) && (a547336540.equals("f"))), 370);
        if (((((input.equals("iC")) && cf) && (a1305805768 == 9)) && (a547336540.equals("f")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((input.equals("iD")) && (((a1305805768 == 9) && cf) && (a547336540.equals("f")))), 375);
        if (((input.equals("iD")) && (((a1305805768 == 9) && cf) && (a547336540.equals("f"))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), "&&"), ((a547336540.equals("f")) && (((input.equals("iE")) && cf) && (a1305805768 == 9))), 380);
        if (((a547336540.equals("f")) && (((input.equals("iE")) && cf) && (a1305805768 == 9)))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), "&&"), ((a1305805768 == 9) && ((a547336540.equals("f")) && (cf && (input.equals("iF"))))), 385);
        if (((a1305805768 == 9) && ((a547336540.equals("f")) && (cf && (input.equals("iF")))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a547336540.equals("f")) && ((a1305805768 == 9) && ((input.equals("iI")) && cf))), 390);
        if (((a547336540.equals("f")) && ((a1305805768 == 9) && ((input.equals("iI")) && cf)))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), "&&"), ((input.equals("iJ")) && (((a547336540.equals("f")) && cf) && (a1305805768 == 9))), 395);
        if (((input.equals("iJ")) && (((a547336540.equals("f")) && cf) && (a1305805768 == 9)))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((a1305805768 == 9) && (cf && (input.equals("iA")))) && (a547336540.equals("f"))), 400);
        if ((((a1305805768 == 9) && (cf && (input.equals("iA")))) && (a547336540.equals("f")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((a1305805768 == 9) && (((input.equals("iB")) && cf) && (a547336540.equals("f")))), 405);
        if (((a1305805768 == 9) && (((input.equals("iB")) && cf) && (a547336540.equals("f"))))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((a1305805768 == 9) && (((input.equals("iG")) && cf) && (a547336540.equals("f")))), 410);
        if (((a1305805768 == 9) && (((input.equals("iG")) && cf) && (a547336540.equals("f"))))) {
            cf = false;
            a1305805768 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
    }

    private void calculateOutputm10(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((cf && (a1305805768 == 10)) && (a547336540.equals("f"))) && (input.equals("iC"))), 417);
        if ((((cf && (a1305805768 == 10)) && (a547336540.equals("f"))) && (input.equals("iC")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a547336540.equals("f")) && ((input.equals("iD")) && ((a1305805768 == 10) && cf))), 421);
        if (((a547336540.equals("f")) && ((input.equals("iD")) && ((a1305805768 == 10) && cf)))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), (((input.equals("iE")) && (cf && (a547336540.equals("f")))) && (a1305805768 == 10)), 425);
        if ((((input.equals("iE")) && (cf && (a547336540.equals("f")))) && (a1305805768 == 10))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), "&&"), ((a547336540.equals("f")) && (((input.equals("iF")) && cf) && (a1305805768 == 10))), 429);
        if (((a547336540.equals("f")) && (((input.equals("iF")) && cf) && (a1305805768 == 10)))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), (((cf && (a547336540.equals("f"))) && (input.equals("iI"))) && (a1305805768 == 10)), 433);
        if ((((cf && (a547336540.equals("f"))) && (input.equals("iI"))) && (a1305805768 == 10))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a547336540.equals("f")) && (((a1305805768 == 10) && cf) && (input.equals("iJ")))), 437);
        if (((a547336540.equals("f")) && (((a1305805768 == 10) && cf) && (input.equals("iJ"))))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), ((((a1305805768 == 10) && cf) && (a547336540.equals("f"))) && (input.equals("iA"))), 441);
        if (((((a1305805768 == 10) && cf) && (a547336540.equals("f"))) && (input.equals("iA")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), "&&"), ((a547336540.equals("f")) && ((cf && (input.equals("iB"))) && (a1305805768 == 10))), 445);
        if (((a547336540.equals("f")) && ((cf && (input.equals("iB"))) && (a1305805768 == 10)))) {
            cf = false;
            a1305805768 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((a1305805768 == 10) && (((input.equals("iH")) && cf) && (a547336540.equals("f")))), 449);
        if (((a1305805768 == 10) && (((input.equals("iH")) && cf) && (a547336540.equals("f"))))) {
            cf = false;
            a1305805768 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
    }

    private void calculateOutputm11(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a1305805768 == 11) && ((input.equals("iD")) && ((a547336540.equals("f")) && cf))), 456);
        if (((a1305805768 == 11) && ((input.equals("iD")) && ((a547336540.equals("f")) && cf)))) {
            cf = false;
            a1305805768 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a547336540.equals("f")) && ((cf && (a1305805768 == 11)) && (input.equals("iB")))), 460);
        if (((a547336540.equals("f")) && ((cf && (a1305805768 == 11)) && (input.equals("iB"))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), "&&"), ((a1305805768 == 11) && ((input.equals("iH")) && (cf && (a547336540.equals("f"))))), 465);
        if (((a1305805768 == 11) && ((input.equals("iH")) && (cf && (a547336540.equals("f")))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a547336540.equals("f")) && ((a1305805768 == 11) && ((input.equals("iG")) && cf))), 470);
        if (((a547336540.equals("f")) && ((a1305805768 == 11) && ((input.equals("iG")) && cf)))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((input.equals("iC")) && ((a547336540.equals("f")) && ((a1305805768 == 11) && cf))), 475);
        if (((input.equals("iC")) && ((a547336540.equals("f")) && ((a1305805768 == 11) && cf)))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), "&&"), ((((input.equals("iE")) && cf) && (a547336540.equals("f"))) && (a1305805768 == 11)), 480);
        if (((((input.equals("iE")) && cf) && (a547336540.equals("f"))) && (a1305805768 == 11))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a1305805768 == 11) && ((a547336540.equals("f")) && ((input.equals("iF")) && cf))), 485);
        if (((a1305805768 == 11) && ((a547336540.equals("f")) && ((input.equals("iF")) && cf)))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((a1305805768 == 11) && ((cf && (input.equals("iI"))) && (a547336540.equals("f")))), 490);
        if (((a1305805768 == 11) && ((cf && (input.equals("iI"))) && (a547336540.equals("f"))))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), "&&"), "&&"), ((a547336540.equals("f")) && ((cf && (input.equals("iJ"))) && (a1305805768 == 11))), 495);
        if (((a547336540.equals("f")) && ((cf && (input.equals("iJ"))) && (a1305805768 == 11)))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((a1305805768 == 11) && ((cf && (input.equals("iA"))) && (a547336540.equals("f")))), 500);
        if (((a1305805768 == 11) && ((cf && (input.equals("iA"))) && (a547336540.equals("f"))))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
    }

    private void calculateOutputm12(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(12), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), ((((input.equals("iB")) && cf) && (a1305805768 == 12)) && (a547336540.equals("f"))), 508);
        if (((((input.equals("iB")) && cf) && (a1305805768 == 12)) && (a547336540.equals("f")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 15;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(12), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), "&&"), ((input.equals("iC")) && ((a1305805768 == 12) && (cf && (a547336540.equals("f"))))), 513);
        if (((input.equals("iC")) && ((a1305805768 == 12) && (cf && (a547336540.equals("f")))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 15;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(12), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((input.equals("iE")) && ((cf && (a1305805768 == 12)) && (a547336540.equals("f")))), 518);
        if (((input.equals("iE")) && ((cf && (a1305805768 == 12)) && (a547336540.equals("f"))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 15;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(12), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((input.equals("iF")) && ((cf && (a1305805768 == 12)) && (a547336540.equals("f")))), 523);
        if (((input.equals("iF")) && ((cf && (a1305805768 == 12)) && (a547336540.equals("f"))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 15;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(12), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a1305805768 == 12) && (cf && (a547336540.equals("f")))) && (input.equals("iG"))), 528);
        if ((((a1305805768 == 12) && (cf && (a547336540.equals("f")))) && (input.equals("iG")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 15;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(12), "=="), "&&"), (((cf && (input.equals("iI"))) && (a547336540.equals("f"))) && (a1305805768 == 12)), 533);
        if ((((cf && (input.equals("iI"))) && (a547336540.equals("f"))) && (a1305805768 == 12))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 15;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(12), "=="), "&&"), (((cf && (input.equals("iJ"))) && (a547336540.equals("f"))) && (a1305805768 == 12)), 538);
        if ((((cf && (input.equals("iJ"))) && (a547336540.equals("f"))) && (a1305805768 == 12))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 15;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(12), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((input.equals("iA")) && ((a1305805768 == 12) && cf)) && (a547336540.equals("f"))), 543);
        if ((((input.equals("iA")) && ((a1305805768 == 12) && cf)) && (a547336540.equals("f")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 15;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(12), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a1305805768 == 12) && (cf && (a547336540.equals("f")))) && (input.equals("iH"))), 548);
        if ((((a1305805768 == 12) && (cf && (a547336540.equals("f")))) && (input.equals("iH")))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 7;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(12), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), ((((a1305805768 == 12) && cf) && (a547336540.equals("f"))) && (input.equals("iD"))), 553);
        if (((((a1305805768 == 12) && cf) && (a547336540.equals("f"))) && (input.equals("iD")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 15;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
    }

    private void calculateOutputm13(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(13), "=="), "&&"), (((cf && (a547336540.equals("f"))) && (input.equals("iC"))) && (a1305805768 == 13)), 561);
        if ((((cf && (a547336540.equals("f"))) && (input.equals("iC"))) && (a1305805768 == 13))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(13), "=="), "&&"), ((((a547336540.equals("f")) && cf) && (input.equals("iD"))) && (a1305805768 == 13)), 565);
        if (((((a547336540.equals("f")) && cf) && (input.equals("iD"))) && (a1305805768 == 13))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(13), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a547336540.equals("f")) && ((a1305805768 == 13) && cf)) && (input.equals("iE"))), 569);
        if ((((a547336540.equals("f")) && ((a1305805768 == 13) && cf)) && (input.equals("iE")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(13), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a1305805768 == 13) && ((input.equals("iF")) && ((a547336540.equals("f")) && cf))), 573);
        if (((a1305805768 == 13) && ((input.equals("iF")) && ((a547336540.equals("f")) && cf)))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(13), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a547336540.equals("f")) && ((a1305805768 == 13) && cf)) && (input.equals("iG"))), 577);
        if ((((a547336540.equals("f")) && ((a1305805768 == 13) && cf)) && (input.equals("iG")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(13), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), ((((a547336540.equals("f")) && cf) && (a1305805768 == 13)) && (input.equals("iI"))), 581);
        if (((((a547336540.equals("f")) && cf) && (a1305805768 == 13)) && (input.equals("iI")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(13), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((cf && (a1305805768 == 13)) && (input.equals("iJ"))) && (a547336540.equals("f"))), 585);
        if ((((cf && (a1305805768 == 13)) && (input.equals("iJ"))) && (a547336540.equals("f")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(13), "=="), "&&"), (((input.equals("iA")) && ((a547336540.equals("f")) && cf)) && (a1305805768 == 13)), 589);
        if ((((input.equals("iA")) && ((a547336540.equals("f")) && cf)) && (a1305805768 == 13))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(13), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a1305805768 == 13) && ((cf && (a547336540.equals("f"))) && (input.equals("iH")))), 593);
        if (((a1305805768 == 13) && ((cf && (a547336540.equals("f"))) && (input.equals("iH"))))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
    }

    private void calculateOutputm14(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(14), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a547336540.equals("f")) && ((a1305805768 == 14) && ((input.equals("iB")) && cf))), 601);
        if (((a547336540.equals("f")) && ((a1305805768 == 14) && ((input.equals("iB")) && cf)))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(14), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((a1305805768 == 14) && (((input.equals("iC")) && cf) && (a547336540.equals("f")))), 605);
        if (((a1305805768 == 14) && (((input.equals("iC")) && cf) && (a547336540.equals("f"))))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(14), "=="), "&&"), ((((input.equals("iD")) && cf) && (a547336540.equals("f"))) && (a1305805768 == 14)), 609);
        if (((((input.equals("iD")) && cf) && (a547336540.equals("f"))) && (a1305805768 == 14))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(14), "=="), "&&"), ((((a547336540.equals("f")) && cf) && (input.equals("iE"))) && (a1305805768 == 14)), 613);
        if (((((a547336540.equals("f")) && cf) && (input.equals("iE"))) && (a1305805768 == 14))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(14), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), ((((a1305805768 == 14) && cf) && (input.equals("iF"))) && (a547336540.equals("f"))), 617);
        if (((((a1305805768 == 14) && cf) && (input.equals("iF"))) && (a547336540.equals("f")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(14), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), ((((input.equals("iH")) && cf) && (a1305805768 == 14)) && (a547336540.equals("f"))), 621);
        if (((((input.equals("iH")) && cf) && (a1305805768 == 14)) && (a547336540.equals("f")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(14), "=="), "&&"), (((input.equals("iI")) && ((a547336540.equals("f")) && cf)) && (a1305805768 == 14)), 625);
        if ((((input.equals("iI")) && ((a547336540.equals("f")) && cf)) && (a1305805768 == 14))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(14), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((input.equals("iJ")) && ((cf && (a1305805768 == 14)) && (a547336540.equals("f")))), 629);
        if (((input.equals("iJ")) && ((cf && (a1305805768 == 14)) && (a547336540.equals("f"))))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(14), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), "&&"), ((input.equals("iA")) && ((a1305805768 == 14) && (cf && (a547336540.equals("f"))))), 633);
        if (((input.equals("iA")) && ((a1305805768 == 14) && (cf && (a547336540.equals("f")))))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
    }

    private void calculateOutputm15(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), ((((input.equals("iH")) && cf) && (a1305805768 == 15)) && (a547336540.equals("f"))), 640);
        if (((((input.equals("iH")) && cf) && (a1305805768 == 15)) && (a547336540.equals("f")))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 7;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((a1305805768 == 15) && (((input.equals("iD")) && cf) && (a547336540.equals("f")))), 645);
        if (((a1305805768 == 15) && (((input.equals("iD")) && cf) && (a547336540.equals("f"))))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 11;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), "&&"), ((a1305805768 == 15) && ((input.equals("iJ")) && (cf && (a547336540.equals("f"))))), 650);
        if (((a1305805768 == 15) && ((input.equals("iJ")) && (cf && (a547336540.equals("f")))))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 4;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oW");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a1305805768 == 15) && ((cf && (a547336540.equals("f"))) && (input.equals("iC")))), 655);
        if (((a1305805768 == 15) && ((cf && (a547336540.equals("f"))) && (input.equals("iC"))))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 11;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a547336540.equals("f")) && ((cf && (a1305805768 == 15)) && (input.equals("iE")))), 660);
        if (((a547336540.equals("f")) && ((cf && (a1305805768 == 15)) && (input.equals("iE"))))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 11;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), "&&"), (((a547336540.equals("f")) && (cf && (input.equals("iF")))) && (a1305805768 == 15)), 665);
        if ((((a547336540.equals("f")) && (cf && (input.equals("iF")))) && (a1305805768 == 15))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 11;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a547336540.equals("f")) && ((a1305805768 == 15) && ((input.equals("iG")) && cf))), 670);
        if (((a547336540.equals("f")) && ((a1305805768 == 15) && ((input.equals("iG")) && cf)))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 11;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((a1305805768 == 15) && ((input.equals("iI")) && cf)) && (a547336540.equals("f"))), 675);
        if ((((a1305805768 == 15) && ((input.equals("iI")) && cf)) && (a547336540.equals("f")))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 11;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), "&&"), ((((input.equals("iA")) && cf) && (a547336540.equals("f"))) && (a1305805768 == 15)), 680);
        if (((((input.equals("iA")) && cf) && (a547336540.equals("f"))) && (a1305805768 == 15))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 11;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((cf && (a1305805768 == 15)) && (a547336540.equals("f"))) && (input.equals("iB"))), 685);
        if ((((cf && (a1305805768 == 15)) && (a547336540.equals("f"))) && (input.equals("iB")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 15;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
    }

    private void calculateOutputm16(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(16), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a1305805768 == 16) && (cf && (a547336540.equals("f")))) && (input.equals("iH"))), 693);
        if ((((a1305805768 == 16) && (cf && (a547336540.equals("f")))) && (input.equals("iH")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(16), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((a1305805768 == 16) && (cf && (input.equals("iC")))) && (a547336540.equals("f"))), 698);
        if ((((a1305805768 == 16) && (cf && (input.equals("iC")))) && (a547336540.equals("f")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(16), "=="), "&&"), (((cf && (a547336540.equals("f"))) && (input.equals("iE"))) && (a1305805768 == 16)), 703);
        if ((((cf && (a547336540.equals("f"))) && (input.equals("iE"))) && (a1305805768 == 16))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(16), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((a1305805768 == 16) && (((input.equals("iF")) && cf) && (a547336540.equals("f")))), 708);
        if (((a1305805768 == 16) && (((input.equals("iF")) && cf) && (a547336540.equals("f"))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(16), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((a1305805768 == 16) && (((input.equals("iG")) && cf) && (a547336540.equals("f")))), 713);
        if (((a1305805768 == 16) && (((input.equals("iG")) && cf) && (a547336540.equals("f"))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(16), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((cf && (a1305805768 == 16)) && (input.equals("iI"))) && (a547336540.equals("f"))), 718);
        if ((((cf && (a1305805768 == 16)) && (input.equals("iI"))) && (a547336540.equals("f")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(16), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((input.equals("iJ")) && ((a1305805768 == 16) && cf)) && (a547336540.equals("f"))), 723);
        if ((((input.equals("iJ")) && ((a1305805768 == 16) && cf)) && (a547336540.equals("f")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(16), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), ((((input.equals("iA")) && cf) && (a1305805768 == 16)) && (a547336540.equals("f"))), 728);
        if (((((input.equals("iA")) && cf) && (a1305805768 == 16)) && (a547336540.equals("f")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(16), "=="), "&&"), "&&"), "&&"), ((a547336540.equals("f")) && ((input.equals("iB")) && (cf && (a1305805768 == 16)))), 733);
        if (((a547336540.equals("f")) && ((input.equals("iB")) && (cf && (a1305805768 == 16))))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oY");
        }
    }

    private void calculateOutputm17(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((input.equals("iC")) && (((a612577343 == 4) && cf) && (a547336540.equals("g")))), 741);
        if (((input.equals("iC")) && (((a612577343 == 4) && cf) && (a547336540.equals("g"))))) {
            cf = false;
            a612577343 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((input.equals("iD")) && (cf && (a612577343 == 4))) && (a547336540.equals("g"))), 745);
        if ((((input.equals("iD")) && (cf && (a612577343 == 4))) && (a547336540.equals("g")))) {
            cf = false;
            a612577343 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), "&&"), "&&"), "&&"), ((input.equals("iE")) && ((a547336540.equals("g")) && (cf && (a612577343 == 4)))), 749);
        if (((input.equals("iE")) && ((a547336540.equals("g")) && (cf && (a612577343 == 4))))) {
            cf = false;
            a612577343 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), "&&"), "&&"), "&&"), ((a547336540.equals("g")) && ((input.equals("iF")) && (cf && (a612577343 == 4)))), 753);
        if (((a547336540.equals("g")) && ((input.equals("iF")) && (cf && (a612577343 == 4))))) {
            cf = false;
            a612577343 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), ((((a612577343 == 4) && cf) && (input.equals("iG"))) && (a547336540.equals("g"))), 757);
        if (((((a612577343 == 4) && cf) && (input.equals("iG"))) && (a547336540.equals("g")))) {
            cf = false;
            a612577343 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((cf && (a612577343 == 4)) && (a547336540.equals("g"))) && (input.equals("iI"))), 761);
        if ((((cf && (a612577343 == 4)) && (a547336540.equals("g"))) && (input.equals("iI")))) {
            cf = false;
            a612577343 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), "&&"), (((input.equals("iJ")) && (cf && (a547336540.equals("g")))) && (a612577343 == 4)), 765);
        if ((((input.equals("iJ")) && (cf && (a547336540.equals("g")))) && (a612577343 == 4))) {
            cf = false;
            a612577343 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), "&&"), ((input.equals("iB")) && ((a612577343 == 4) && (cf && (a547336540.equals("g"))))), 769);
        if (((input.equals("iB")) && ((a612577343 == 4) && (cf && (a547336540.equals("g")))))) {
            cf = false;
            a612577343 = 9;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((a612577343 == 4) && ((cf && (input.equals("iH"))) && (a547336540.equals("g")))), 773);
        if (((a612577343 == 4) && ((cf && (input.equals("iH"))) && (a547336540.equals("g"))))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 8;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a612577343 == 4) && ((input.equals("iA")) && ((a547336540.equals("g")) && cf))), 778);
        if (((a612577343 == 4) && ((input.equals("iA")) && ((a547336540.equals("g")) && cf)))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 9;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oY");
        }
    }

    private void calculateOutputm18(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((input.equals("iH")) && ((a547336540.equals("g")) && ((a612577343 == 5) && cf))), 786);
        if (((input.equals("iH")) && ((a547336540.equals("g")) && ((a612577343 == 5) && cf)))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((a612577343 == 5) && (((input.equals("iC")) && cf) && (a547336540.equals("g")))), 791);
        if (((a612577343 == 5) && (((input.equals("iC")) && cf) && (a547336540.equals("g"))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((input.equals("iD")) && ((a547336540.equals("g")) && ((a612577343 == 5) && cf))), 796);
        if (((input.equals("iD")) && ((a547336540.equals("g")) && ((a612577343 == 5) && cf)))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a547336540.equals("g")) && ((a612577343 == 5) && ((input.equals("iE")) && cf))), 801);
        if (((a547336540.equals("g")) && ((a612577343 == 5) && ((input.equals("iE")) && cf)))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((a612577343 == 5) && (((input.equals("iF")) && cf) && (a547336540.equals("g")))), 806);
        if (((a612577343 == 5) && (((input.equals("iF")) && cf) && (a547336540.equals("g"))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), "&&"), ((input.equals("iG")) && ((a612577343 == 5) && (cf && (a547336540.equals("g"))))), 811);
        if (((input.equals("iG")) && ((a612577343 == 5) && (cf && (a547336540.equals("g")))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((cf && (a547336540.equals("g"))) && (a612577343 == 5)) && (input.equals("iI"))), 816);
        if ((((cf && (a547336540.equals("g"))) && (a612577343 == 5)) && (input.equals("iI")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), "&&"), "&&"), ((input.equals("iJ")) && ((cf && (a547336540.equals("g"))) && (a612577343 == 5))), 821);
        if (((input.equals("iJ")) && ((cf && (a547336540.equals("g"))) && (a612577343 == 5)))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a547336540.equals("g")) && ((input.equals("iA")) && ((a612577343 == 5) && cf))), 826);
        if (((a547336540.equals("g")) && ((input.equals("iA")) && ((a612577343 == 5) && cf)))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a612577343 == 5) && (cf && (a547336540.equals("g")))) && (input.equals("iB"))), 831);
        if ((((a612577343 == 5) && (cf && (a547336540.equals("g")))) && (input.equals("iB")))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
    }

    private void calculateOutputm19(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((input.equals("iB")) && ((a547336540.equals("g")) && ((a612577343 == 6) && cf))), 839);
        if (((input.equals("iB")) && ((a547336540.equals("g")) && ((a612577343 == 6) && cf)))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 15;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), ((((input.equals("iC")) && cf) && (a612577343 == 6)) && (a547336540.equals("g"))), 844);
        if (((((input.equals("iC")) && cf) && (a612577343 == 6)) && (a547336540.equals("g")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 15;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), "&&"), (((a547336540.equals("g")) && (cf && (input.equals("iD")))) && (a612577343 == 6)), 849);
        if ((((a547336540.equals("g")) && (cf && (input.equals("iD")))) && (a612577343 == 6))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 15;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((input.equals("iE")) && ((a612577343 == 6) && ((a547336540.equals("g")) && cf))), 854);
        if (((input.equals("iE")) && ((a612577343 == 6) && ((a547336540.equals("g")) && cf)))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 15;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((cf && (input.equals("iF"))) && (a612577343 == 6)) && (a547336540.equals("g"))), 859);
        if ((((cf && (input.equals("iF"))) && (a612577343 == 6)) && (a547336540.equals("g")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 15;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a547336540.equals("g")) && ((input.equals("iG")) && ((a612577343 == 6) && cf))), 864);
        if (((a547336540.equals("g")) && ((input.equals("iG")) && ((a612577343 == 6) && cf)))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 15;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), "&&"), ((a612577343 == 6) && ((a547336540.equals("g")) && (cf && (input.equals("iI"))))), 869);
        if (((a612577343 == 6) && ((a547336540.equals("g")) && (cf && (input.equals("iI")))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 15;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((a612577343 == 6) && (cf && (input.equals("iJ")))) && (a547336540.equals("g"))), 874);
        if ((((a612577343 == 6) && (cf && (input.equals("iJ")))) && (a547336540.equals("g")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 15;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a547336540.equals("g")) && (cf && (a612577343 == 6))) && (input.equals("iA"))), 879);
        if ((((a547336540.equals("g")) && (cf && (a612577343 == 6))) && (input.equals("iA")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 15;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a612577343 == 6) && (((a547336540.equals("g")) && cf) && (input.equals("iH")))), 884);
        if (((a612577343 == 6) && (((a547336540.equals("g")) && cf) && (input.equals("iH"))))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 7;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
    }

    private void calculateOutputm20(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), "&&"), (((a547336540.equals("g")) && (cf && (input.equals("iJ")))) && (a612577343 == 7)), 892);
        if ((((a547336540.equals("g")) && (cf && (input.equals("iJ")))) && (a612577343 == 7))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 9;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((a612577343 == 7) && ((input.equals("iC")) && cf)) && (a547336540.equals("g"))), 897);
        if ((((a612577343 == 7) && ((input.equals("iC")) && cf)) && (a547336540.equals("g")))) {
            cf = false;
            a612577343 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), "&&"), "&&"), ((input.equals("iE")) && (((a547336540.equals("g")) && cf) && (a612577343 == 7))), 901);
        if (((input.equals("iE")) && (((a547336540.equals("g")) && cf) && (a612577343 == 7)))) {
            cf = false;
            a612577343 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), "&&"), (((cf && (a547336540.equals("g"))) && (input.equals("iF"))) && (a612577343 == 7)), 905);
        if ((((cf && (a547336540.equals("g"))) && (input.equals("iF"))) && (a612577343 == 7))) {
            cf = false;
            a612577343 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), "&&"), (((a547336540.equals("g")) && (cf && (input.equals("iI")))) && (a612577343 == 7)), 909);
        if ((((a547336540.equals("g")) && (cf && (input.equals("iI")))) && (a612577343 == 7))) {
            cf = false;
            a612577343 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), "&&"), "&&"), "&&"), ((input.equals("iB")) && ((a547336540.equals("g")) && (cf && (a612577343 == 7)))), 913);
        if (((input.equals("iB")) && ((a547336540.equals("g")) && (cf && (a612577343 == 7))))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 6;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a547336540.equals("g")) && ((a612577343 == 7) && ((input.equals("iH")) && cf))), 918);
        if (((a547336540.equals("g")) && ((a612577343 == 7) && ((input.equals("iH")) && cf)))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 6;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((input.equals("iA")) && ((a547336540.equals("g")) && ((a612577343 == 7) && cf))), 923);
        if (((input.equals("iA")) && ((a547336540.equals("g")) && ((a612577343 == 7) && cf)))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 11;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oW");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a612577343 == 7) && ((a547336540.equals("g")) && cf)) && (input.equals("iG"))), 928);
        if ((((a612577343 == 7) && ((a547336540.equals("g")) && cf)) && (input.equals("iG")))) {
            cf = false;
            a547336540 = "h";
            a1855872761 = "h";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((input.equals("iD")) && (((a612577343 == 7) && cf) && (a547336540.equals("g")))), 933);
        if (((input.equals("iD")) && (((a612577343 == 7) && cf) && (a547336540.equals("g"))))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
    }

    private void calculateOutputm21(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), "&&"), (((a547336540.equals("g")) && (cf && (input.equals("iE")))) && (a612577343 == 8)), 941);
        if ((((a547336540.equals("g")) && (cf && (input.equals("iE")))) && (a612577343 == 8))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 15;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((input.equals("iH")) && ((a612577343 == 8) && cf)) && (a547336540.equals("g"))), 946);
        if ((((input.equals("iH")) && ((a612577343 == 8) && cf)) && (a547336540.equals("g")))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 4;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oY");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((input.equals("iD")) && (((a612577343 == 8) && cf) && (a547336540.equals("g")))), 951);
        if (((input.equals("iD")) && (((a612577343 == 8) && cf) && (a547336540.equals("g"))))) {
            cf = false;
            a612577343 = 6;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), "&&"), ((a612577343 == 8) && ((a547336540.equals("g")) && (cf && (input.equals("iC"))))), 955);
        if (((a612577343 == 8) && ((a547336540.equals("g")) && (cf && (input.equals("iC")))))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 12;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), "&&"), "&&"), "&&"), ((a547336540.equals("g")) && ((input.equals("iF")) && (cf && (a612577343 == 8)))), 960);
        if (((a547336540.equals("g")) && ((input.equals("iF")) && (cf && (a612577343 == 8))))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 12;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), "&&"), (((input.equals("iG")) && (cf && (a547336540.equals("g")))) && (a612577343 == 8)), 965);
        if ((((input.equals("iG")) && (cf && (a547336540.equals("g")))) && (a612577343 == 8))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 12;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a547336540.equals("g")) && ((a612577343 == 8) && cf)) && (input.equals("iJ"))), 970);
        if ((((a547336540.equals("g")) && ((a612577343 == 8) && cf)) && (input.equals("iJ")))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 12;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), "&&"), (((cf && (a547336540.equals("g"))) && (input.equals("iA"))) && (a612577343 == 8)), 975);
        if ((((cf && (a547336540.equals("g"))) && (input.equals("iA"))) && (a612577343 == 8))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 12;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((cf && (input.equals("iB"))) && (a612577343 == 8)) && (a547336540.equals("g"))), 980);
        if ((((cf && (input.equals("iB"))) && (a612577343 == 8)) && (a547336540.equals("g")))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 12;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), ((((a612577343 == 8) && cf) && (a547336540.equals("g"))) && (input.equals("iI"))), 985);
        if (((((a612577343 == 8) && cf) && (a547336540.equals("g"))) && (input.equals("iI")))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 12;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
    }

    private void calculateOutputm22(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((a612577343 == 9) && (((input.equals("iH")) && cf) && (a547336540.equals("g")))), 993);
        if (((a612577343 == 9) && (((input.equals("iH")) && cf) && (a547336540.equals("g"))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((cf && (a612577343 == 9)) && (a547336540.equals("g"))) && (input.equals("iB"))), 998);
        if ((((cf && (a612577343 == 9)) && (a547336540.equals("g"))) && (input.equals("iB")))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), "&&"), ((a612577343 == 9) && ((input.equals("iC")) && (cf && (a547336540.equals("g"))))), 1003);
        if (((a612577343 == 9) && ((input.equals("iC")) && (cf && (a547336540.equals("g")))))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((input.equals("iD")) && (cf && (a612577343 == 9))) && (a547336540.equals("g"))), 1008);
        if ((((input.equals("iD")) && (cf && (a612577343 == 9))) && (a547336540.equals("g")))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((input.equals("iE")) && ((a547336540.equals("g")) && ((a612577343 == 9) && cf))), 1013);
        if (((input.equals("iE")) && ((a547336540.equals("g")) && ((a612577343 == 9) && cf)))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a547336540.equals("g")) && (cf && (a612577343 == 9))) && (input.equals("iF"))), 1018);
        if ((((a547336540.equals("g")) && (cf && (a612577343 == 9))) && (input.equals("iF")))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), "&&"), ((input.equals("iG")) && (((a547336540.equals("g")) && cf) && (a612577343 == 9))), 1023);
        if (((input.equals("iG")) && (((a547336540.equals("g")) && cf) && (a612577343 == 9)))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), "&&"), "&&"), ((a547336540.equals("g")) && ((input.equals("iI")) && (cf && (a612577343 == 9)))), 1028);
        if (((a547336540.equals("g")) && ((input.equals("iI")) && (cf && (a612577343 == 9))))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), "&&"), ((a612577343 == 9) && ((input.equals("iJ")) && (cf && (a547336540.equals("g"))))), 1033);
        if (((a612577343 == 9) && ((input.equals("iJ")) && (cf && (a547336540.equals("g")))))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), "&&"), ((input.equals("iA")) && ((cf && (a547336540.equals("g"))) && (a612577343 == 9))), 1038);
        if (((input.equals("iA")) && ((cf && (a547336540.equals("g"))) && (a612577343 == 9)))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
    }

    private void calculateOutputm23(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((cf && (input.equals("iC"))) && (a612577343 == 10)) && (a547336540.equals("g"))), 1046);
        if ((((cf && (input.equals("iC"))) && (a612577343 == 10)) && (a547336540.equals("g")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a612577343 == 10) && ((input.equals("iE")) && ((a547336540.equals("g")) && cf))), 1050);
        if (((a612577343 == 10) && ((input.equals("iE")) && ((a547336540.equals("g")) && cf)))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a612577343 == 10) && (((a547336540.equals("g")) && cf) && (input.equals("iF")))), 1054);
        if (((a612577343 == 10) && (((a547336540.equals("g")) && cf) && (input.equals("iF"))))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((cf && (a612577343 == 10)) && (input.equals("iI"))) && (a547336540.equals("g"))), 1058);
        if ((((cf && (a612577343 == 10)) && (input.equals("iI"))) && (a547336540.equals("g")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((input.equals("iJ")) && (((a612577343 == 10) && cf) && (a547336540.equals("g")))), 1062);
        if (((input.equals("iJ")) && (((a612577343 == 10) && cf) && (a547336540.equals("g"))))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), (((input.equals("iA")) && ((a547336540.equals("g")) && cf)) && (a612577343 == 10)), 1066);
        if ((((input.equals("iA")) && ((a547336540.equals("g")) && cf)) && (a612577343 == 10))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), (((cf && (input.equals("iD"))) && (a547336540.equals("g"))) && (a612577343 == 10)), 1070);
        if ((((cf && (input.equals("iD"))) && (a547336540.equals("g"))) && (a612577343 == 10))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), "&&"), ((input.equals("iB")) && (((a547336540.equals("g")) && cf) && (a612577343 == 10))), 1075);
        if (((input.equals("iB")) && (((a547336540.equals("g")) && cf) && (a612577343 == 10)))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((input.equals("iH")) && (cf && (a612577343 == 10))) && (a547336540.equals("g"))), 1080);
        if ((((input.equals("iH")) && (cf && (a612577343 == 10))) && (a547336540.equals("g")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), "&&"), ((a612577343 == 10) && ((input.equals("iG")) && (cf && (a547336540.equals("g"))))), 1085);
        if (((a612577343 == 10) && ((input.equals("iG")) && (cf && (a547336540.equals("g")))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
    }

    private void calculateOutputm24(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((a612577343 == 11) && ((input.equals("iH")) && cf)) && (a547336540.equals("g"))), 1093);
        if ((((a612577343 == 11) && ((input.equals("iH")) && cf)) && (a547336540.equals("g")))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 6;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), "&&"), (((a547336540.equals("g")) && ((input.equals("iC")) && cf)) && (a612577343 == 11)), 1098);
        if ((((a547336540.equals("g")) && ((input.equals("iC")) && cf)) && (a612577343 == 11))) {
            cf = false;
            a612577343 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a547336540.equals("g")) && ((a612577343 == 11) && ((input.equals("iD")) && cf))), 1102);
        if (((a547336540.equals("g")) && ((a612577343 == 11) && ((input.equals("iD")) && cf)))) {
            cf = false;
            a612577343 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), "&&"), "&&"), ((input.equals("iE")) && (((a547336540.equals("g")) && cf) && (a612577343 == 11))), 1106);
        if (((input.equals("iE")) && (((a547336540.equals("g")) && cf) && (a612577343 == 11)))) {
            cf = false;
            a612577343 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), "&&"), "&&"), ((a547336540.equals("g")) && (((input.equals("iF")) && cf) && (a612577343 == 11))), 1110);
        if (((a547336540.equals("g")) && (((input.equals("iF")) && cf) && (a612577343 == 11)))) {
            cf = false;
            a612577343 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), "&&"), (((input.equals("iG")) && (cf && (a547336540.equals("g")))) && (a612577343 == 11)), 1114);
        if ((((input.equals("iG")) && (cf && (a547336540.equals("g")))) && (a612577343 == 11))) {
            cf = false;
            a612577343 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), "&&"), (((cf && (a547336540.equals("g"))) && (input.equals("iI"))) && (a612577343 == 11)), 1118);
        if ((((cf && (a547336540.equals("g"))) && (input.equals("iI"))) && (a612577343 == 11))) {
            cf = false;
            a612577343 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), "&&"), (((cf && (a547336540.equals("g"))) && (input.equals("iJ"))) && (a612577343 == 11)), 1122);
        if ((((cf && (a547336540.equals("g"))) && (input.equals("iJ"))) && (a612577343 == 11))) {
            cf = false;
            a612577343 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), "&&"), "&&"), "&&"), ((a547336540.equals("g")) && ((input.equals("iA")) && (cf && (a612577343 == 11)))), 1126);
        if (((a547336540.equals("g")) && ((input.equals("iA")) && (cf && (a612577343 == 11))))) {
            cf = false;
            a612577343 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), "&&"), (((a547336540.equals("g")) && (cf && (input.equals("iB")))) && (a612577343 == 11)), 1130);
        if ((((a547336540.equals("g")) && (cf && (input.equals("iB")))) && (a612577343 == 11))) {
            cf = false;
            a612577343 = 9;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
    }

    private void calculateOutputm25(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), (((cf && (a547336540.equals("h"))) && (input.equals("iE"))) && (a1855872761.equals("e"))), 1137);
        if ((((cf && (a547336540.equals("h"))) && (input.equals("iE"))) && (a1855872761.equals("e")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 12;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((cf && (a547336540.equals("h"))) && (a1855872761.equals("e"))) && (input.equals("iG"))), 1142);
        if ((((cf && (a547336540.equals("h"))) && (a1855872761.equals("e"))) && (input.equals("iG")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 9;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((input.equals("iB")) && ((a1855872761.equals("e")) && ((a547336540.equals("h")) && cf))), 1147);
        if (((input.equals("iB")) && ((a1855872761.equals("e")) && ((a547336540.equals("h")) && cf)))) {
            cf = false;
            a1855872761 = "f";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a547336540.equals("h")) && (((a1855872761.equals("e")) && cf) && (input.equals("iC")))), 1151);
        if (((a547336540.equals("h")) && (((a1855872761.equals("e")) && cf) && (input.equals("iC"))))) {
            cf = false;
            a1855872761 = "f";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), "&&"), ((input.equals("iF")) && ((a1855872761.equals("e")) && (cf && (a547336540.equals("h"))))), 1155);
        if (((input.equals("iF")) && ((a1855872761.equals("e")) && (cf && (a547336540.equals("h")))))) {
            cf = false;
            a1855872761 = "f";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((cf && (input.equals("iH"))) && (a1855872761.equals("e"))) && (a547336540.equals("h"))), 1159);
        if ((((cf && (input.equals("iH"))) && (a1855872761.equals("e"))) && (a547336540.equals("h")))) {
            cf = false;
            a1855872761 = "f";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((input.equals("iI")) && ((a547336540.equals("h")) && ((a1855872761.equals("e")) && cf))), 1163);
        if (((input.equals("iI")) && ((a547336540.equals("h")) && ((a1855872761.equals("e")) && cf)))) {
            cf = false;
            a1855872761 = "f";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((a1855872761.equals("e")) && (cf && (input.equals("iJ")))) && (a547336540.equals("h"))), 1167);
        if ((((a1855872761.equals("e")) && (cf && (input.equals("iJ")))) && (a547336540.equals("h")))) {
            cf = false;
            a1855872761 = "f";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((input.equals("iA")) && ((a1855872761.equals("e")) && ((a547336540.equals("h")) && cf))), 1171);
        if (((input.equals("iA")) && ((a1855872761.equals("e")) && ((a547336540.equals("h")) && cf)))) {
            cf = false;
            a1855872761 = "f";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
    }

    private void calculateOutputm26(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), (((cf && (input.equals("iB"))) && (a547336540.equals("h"))) && (a1855872761.equals("f"))), 1178);
        if ((((cf && (input.equals("iB"))) && (a547336540.equals("h"))) && (a1855872761.equals("f")))) {
            cf = false;
            a1855872761 = "i";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), "&&"), ((input.equals("iC")) && (((a547336540.equals("h")) && cf) && (a1855872761.equals("f")))), 1182);
        if (((input.equals("iC")) && (((a547336540.equals("h")) && cf) && (a1855872761.equals("f"))))) {
            cf = false;
            a1855872761 = "i";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), ((((a547336540.equals("h")) && cf) && (a1855872761.equals("f"))) && (input.equals("iE"))), 1186);
        if (((((a547336540.equals("h")) && cf) && (a1855872761.equals("f"))) && (input.equals("iE")))) {
            cf = false;
            a1855872761 = "i";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((a1855872761.equals("f")) && ((cf && (input.equals("iF"))) && (a547336540.equals("h")))), 1190);
        if (((a1855872761.equals("f")) && ((cf && (input.equals("iF"))) && (a547336540.equals("h"))))) {
            cf = false;
            a1855872761 = "i";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a1855872761.equals("f")) && ((cf && (a547336540.equals("h"))) && (input.equals("iH")))), 1194);
        if (((a1855872761.equals("f")) && ((cf && (a547336540.equals("h"))) && (input.equals("iH"))))) {
            cf = false;
            a1855872761 = "i";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a547336540.equals("h")) && ((cf && (a1855872761.equals("f"))) && (input.equals("iI")))), 1198);
        if (((a547336540.equals("h")) && ((cf && (a1855872761.equals("f"))) && (input.equals("iI"))))) {
            cf = false;
            a1855872761 = "i";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((cf && (a1855872761.equals("f"))) && (input.equals("iJ"))) && (a547336540.equals("h"))), 1202);
        if ((((cf && (a1855872761.equals("f"))) && (input.equals("iJ"))) && (a547336540.equals("h")))) {
            cf = false;
            a1855872761 = "i";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), ((((a1855872761.equals("f")) && cf) && (input.equals("iA"))) && (a547336540.equals("h"))), 1206);
        if (((((a1855872761.equals("f")) && cf) && (input.equals("iA"))) && (a547336540.equals("h")))) {
            cf = false;
            a1855872761 = "i";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), "&&"), ((a547336540.equals("h")) && (((input.equals("iG")) && cf) && (a1855872761.equals("f")))), 1210);
        if (((a547336540.equals("h")) && (((input.equals("iG")) && cf) && (a1855872761.equals("f"))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
    }

    private void calculateOutputm27(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((cf && (input.equals("iC"))) && (a1855872761.equals("g"))) && (a547336540.equals("h"))), 1218);
        if ((((cf && (input.equals("iC"))) && (a1855872761.equals("g"))) && (a547336540.equals("h")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a547336540.equals("h")) && ((cf && (a1855872761.equals("g"))) && (input.equals("iD")))), 1222);
        if (((a547336540.equals("h")) && ((cf && (a1855872761.equals("g"))) && (input.equals("iD"))))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((a1855872761.equals("g")) && ((input.equals("iE")) && cf)) && (a547336540.equals("h"))), 1226);
        if ((((a1855872761.equals("g")) && ((input.equals("iE")) && cf)) && (a547336540.equals("h")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((cf && (input.equals("iF"))) && (a1855872761.equals("g"))) && (a547336540.equals("h"))), 1230);
        if ((((cf && (input.equals("iF"))) && (a1855872761.equals("g"))) && (a547336540.equals("h")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a547336540.equals("h")) && ((cf && (a1855872761.equals("g"))) && (input.equals("iH")))), 1234);
        if (((a547336540.equals("h")) && ((cf && (a1855872761.equals("g"))) && (input.equals("iH"))))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((cf && (a547336540.equals("h"))) && (a1855872761.equals("g"))) && (input.equals("iI"))), 1238);
        if ((((cf && (a547336540.equals("h"))) && (a1855872761.equals("g"))) && (input.equals("iI")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((a1855872761.equals("g")) && ((input.equals("iJ")) && cf)) && (a547336540.equals("h"))), 1242);
        if ((((a1855872761.equals("g")) && ((input.equals("iJ")) && cf)) && (a547336540.equals("h")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), "&&"), ((input.equals("iA")) && ((a1855872761.equals("g")) && (cf && (a547336540.equals("h"))))), 1246);
        if (((input.equals("iA")) && ((a1855872761.equals("g")) && (cf && (a547336540.equals("h")))))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
    }

    private void calculateOutputm28(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((input.equals("iC")) && ((a547336540.equals("h")) && ((a1855872761.equals("h")) && cf))), 1253);
        if (((input.equals("iC")) && ((a547336540.equals("h")) && ((a1855872761.equals("h")) && cf)))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((cf && (a1855872761.equals("h"))) && (a547336540.equals("h"))) && (input.equals("iD"))), 1258);
        if ((((cf && (a1855872761.equals("h"))) && (a547336540.equals("h"))) && (input.equals("iD")))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), "&&"), ((input.equals("iF")) && ((cf && (a547336540.equals("h"))) && (a1855872761.equals("h")))), 1263);
        if (((input.equals("iF")) && ((cf && (a547336540.equals("h"))) && (a1855872761.equals("h"))))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a547336540.equals("h")) && (cf && (a1855872761.equals("h")))) && (input.equals("iG"))), 1268);
        if ((((a547336540.equals("h")) && (cf && (a1855872761.equals("h")))) && (input.equals("iG")))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), "&&"), ((a1855872761.equals("h")) && ((input.equals("iJ")) && (cf && (a547336540.equals("h"))))), 1273);
        if (((a1855872761.equals("h")) && ((input.equals("iJ")) && (cf && (a547336540.equals("h")))))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), "&&"), ((a1855872761.equals("h")) && ((a547336540.equals("h")) && (cf && (input.equals("iA"))))), 1278);
        if (((a1855872761.equals("h")) && ((a547336540.equals("h")) && (cf && (input.equals("iA")))))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((input.equals("iH")) && ((a1855872761.equals("h")) && cf)) && (a547336540.equals("h"))), 1283);
        if ((((input.equals("iH")) && ((a1855872761.equals("h")) && cf)) && (a547336540.equals("h")))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((a1855872761.equals("h")) && (((input.equals("iB")) && cf) && (a547336540.equals("h")))), 1288);
        if (((a1855872761.equals("h")) && (((input.equals("iB")) && cf) && (a547336540.equals("h"))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a1855872761.equals("h")) && ((a547336540.equals("h")) && cf)) && (input.equals("iE"))), 1293);
        if ((((a1855872761.equals("h")) && ((a547336540.equals("h")) && cf)) && (input.equals("iE")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), "&&"), ((a1855872761.equals("h")) && ((a547336540.equals("h")) && (cf && (input.equals("iI"))))), 1298);
        if (((a1855872761.equals("h")) && ((a547336540.equals("h")) && (cf && (input.equals("iI")))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
    }

    private void calculateOutputm29(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), "&&"), ((input.equals("iC")) && ((a1855872761.equals("i")) && (cf && (a547336540.equals("h"))))), 1306);
        if (((input.equals("iC")) && ((a1855872761.equals("i")) && (cf && (a547336540.equals("h")))))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((input.equals("iE")) && ((a1855872761.equals("i")) && cf)) && (a547336540.equals("h"))), 1311);
        if ((((input.equals("iE")) && ((a1855872761.equals("i")) && cf)) && (a547336540.equals("h")))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), (((a547336540.equals("h")) && (cf && (input.equals("iF")))) && (a1855872761.equals("i"))), 1316);
        if ((((a547336540.equals("h")) && (cf && (input.equals("iF")))) && (a1855872761.equals("i")))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), "&&"), "&&"), ((input.equals("iI")) && ((a547336540.equals("h")) && (cf && (a1855872761.equals("i"))))), 1321);
        if (((input.equals("iI")) && ((a547336540.equals("h")) && (cf && (a1855872761.equals("i")))))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a1855872761.equals("i")) && ((input.equals("iJ")) && ((a547336540.equals("h")) && cf))), 1326);
        if (((a1855872761.equals("i")) && ((input.equals("iJ")) && ((a547336540.equals("h")) && cf)))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a1855872761.equals("i")) && ((a547336540.equals("h")) && ((input.equals("iA")) && cf))), 1331);
        if (((a1855872761.equals("i")) && ((a547336540.equals("h")) && ((input.equals("iA")) && cf)))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), "&&"), ((a1855872761.equals("i")) && ((input.equals("iB")) && (cf && (a547336540.equals("h"))))), 1336);
        if (((a1855872761.equals("i")) && ((input.equals("iB")) && (cf && (a547336540.equals("h")))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), (((a547336540.equals("h")) && (cf && (input.equals("iH")))) && (a1855872761.equals("i"))), 1341);
        if ((((a547336540.equals("h")) && (cf && (input.equals("iH")))) && (a1855872761.equals("i")))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((input.equals("iG")) && (((a1855872761.equals("i")) && cf) && (a547336540.equals("h")))), 1346);
        if (((input.equals("iG")) && (((a1855872761.equals("i")) && cf) && (a547336540.equals("h"))))) {
            cf = false;
            a547336540 = "i";
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
    }

    private void calculateOutputm30(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), ((((a1122863037 == 8) && cf) && (input.equals("iB"))) && (a547336540.equals("i"))), 1354);
        if (((((a1122863037 == 8) && cf) && (input.equals("iB"))) && (a547336540.equals("i")))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 6;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a1122863037 == 8) && (cf && (a547336540.equals("i")))) && (input.equals("iC"))), 1359);
        if ((((a1122863037 == 8) && (cf && (a547336540.equals("i")))) && (input.equals("iC")))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 6;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), "&&"), ((((input.equals("iE")) && cf) && (a547336540.equals("i"))) && (a1122863037 == 8)), 1364);
        if (((((input.equals("iE")) && cf) && (a547336540.equals("i"))) && (a1122863037 == 8))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 6;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), ((((input.equals("iF")) && cf) && (a1122863037 == 8)) && (a547336540.equals("i"))), 1369);
        if (((((input.equals("iF")) && cf) && (a1122863037 == 8)) && (a547336540.equals("i")))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 6;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a1122863037 == 8) && ((cf && (a547336540.equals("i"))) && (input.equals("iH")))), 1374);
        if (((a1122863037 == 8) && ((cf && (a547336540.equals("i"))) && (input.equals("iH"))))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 6;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((input.equals("iI")) && ((a547336540.equals("i")) && ((a1122863037 == 8) && cf))), 1379);
        if (((input.equals("iI")) && ((a547336540.equals("i")) && ((a1122863037 == 8) && cf)))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 6;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), ((((a1122863037 == 8) && cf) && (input.equals("iA"))) && (a547336540.equals("i"))), 1384);
        if (((((a1122863037 == 8) && cf) && (input.equals("iA"))) && (a547336540.equals("i")))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 6;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), "&&"), ((a1122863037 == 8) && ((a547336540.equals("i")) && (cf && (input.equals("iG"))))), 1389);
        if (((a1122863037 == 8) && ((a547336540.equals("i")) && (cf && (input.equals("iG")))))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 9;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((cf && (a1122863037 == 8)) && (input.equals("iJ"))) && (a547336540.equals("i"))), 1394);
        if ((((cf && (a1122863037 == 8)) && (input.equals("iJ"))) && (a547336540.equals("i")))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 11;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a1122863037 == 8) && (((a547336540.equals("i")) && cf) && (input.equals("iD")))), 1399);
        if (((a1122863037 == 8) && (((a547336540.equals("i")) && cf) && (input.equals("iD"))))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
    }

    private void calculateOutputm31(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), "&&"), ((a1122863037 == 9) && ((input.equals("iH")) && (cf && (a547336540.equals("i"))))), 1407);
        if (((a1122863037 == 9) && ((input.equals("iH")) && (cf && (a547336540.equals("i")))))) {
            cf = false;
            a547336540 = "h";
            a1855872761 = "i";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), ((((a547336540.equals("i")) && cf) && (input.equals("iB"))) && (a1122863037 == 9)), 1412);
        if (((((a547336540.equals("i")) && cf) && (input.equals("iB"))) && (a1122863037 == 9))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 16;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), "&&"), ((a547336540.equals("i")) && (((input.equals("iE")) && cf) && (a1122863037 == 9))), 1417);
        if (((a547336540.equals("i")) && (((input.equals("iE")) && cf) && (a1122863037 == 9)))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 16;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((input.equals("iC")) && (((a1122863037 == 9) && cf) && (a547336540.equals("i")))), 1422);
        if (((input.equals("iC")) && (((a1122863037 == 9) && cf) && (a547336540.equals("i"))))) {
            cf = false;
            a1122863037 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), (((a547336540.equals("i")) && ((input.equals("iF")) && cf)) && (a1122863037 == 9)), 1426);
        if ((((a547336540.equals("i")) && ((input.equals("iF")) && cf)) && (a1122863037 == 9))) {
            cf = false;
            a1122863037 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((input.equals("iG")) && ((a1122863037 == 9) && ((a547336540.equals("i")) && cf))), 1430);
        if (((input.equals("iG")) && ((a1122863037 == 9) && ((a547336540.equals("i")) && cf)))) {
            cf = false;
            a1122863037 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), "&&"), ((input.equals("iI")) && (((a547336540.equals("i")) && cf) && (a1122863037 == 9))), 1434);
        if (((input.equals("iI")) && (((a547336540.equals("i")) && cf) && (a1122863037 == 9)))) {
            cf = false;
            a1122863037 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a1122863037 == 9) && (cf && (a547336540.equals("i")))) && (input.equals("iJ"))), 1438);
        if ((((a1122863037 == 9) && (cf && (a547336540.equals("i")))) && (input.equals("iJ")))) {
            cf = false;
            a1122863037 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a1122863037 == 9) && (((a547336540.equals("i")) && cf) && (input.equals("iA")))), 1442);
        if (((a1122863037 == 9) && (((a547336540.equals("i")) && cf) && (input.equals("iA"))))) {
            cf = false;
            a1122863037 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
    }

    private void calculateOutputm32(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a1122863037 == 10) && (((a547336540.equals("i")) && cf) && (input.equals("iC")))), 1449);
        if (((a1122863037 == 10) && (((a547336540.equals("i")) && cf) && (input.equals("iC"))))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), "&&"), "&&"), ((input.equals("iE")) && ((a547336540.equals("i")) && (cf && (a1122863037 == 10)))), 1454);
        if (((input.equals("iE")) && ((a547336540.equals("i")) && (cf && (a1122863037 == 10))))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), "&&"), ((a1122863037 == 10) && ((a547336540.equals("i")) && (cf && (input.equals("iF"))))), 1459);
        if (((a1122863037 == 10) && ((a547336540.equals("i")) && (cf && (input.equals("iF")))))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a547336540.equals("i")) && ((input.equals("iG")) && ((a1122863037 == 10) && cf))), 1464);
        if (((a547336540.equals("i")) && ((input.equals("iG")) && ((a1122863037 == 10) && cf)))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), "&&"), ((a547336540.equals("i")) && (((input.equals("iI")) && cf) && (a1122863037 == 10))), 1469);
        if (((a547336540.equals("i")) && (((input.equals("iI")) && cf) && (a1122863037 == 10)))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a547336540.equals("i")) && (cf && (a1122863037 == 10))) && (input.equals("iJ"))), 1474);
        if ((((a547336540.equals("i")) && (cf && (a1122863037 == 10))) && (input.equals("iJ")))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a1122863037 == 10) && ((cf && (a547336540.equals("i"))) && (input.equals("iA")))), 1479);
        if (((a1122863037 == 10) && ((cf && (a547336540.equals("i"))) && (input.equals("iA"))))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), "&&"), ((input.equals("iH")) && (((a547336540.equals("i")) && cf) && (a1122863037 == 10))), 1484);
        if (((input.equals("iH")) && (((a547336540.equals("i")) && cf) && (a1122863037 == 10)))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oZ");
        }
    }

    private void calculateOutputm33(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((input.equals("iC")) && (((a1122863037 == 11) && cf) && (a547336540.equals("i")))), 1492);
        if (((input.equals("iC")) && (((a1122863037 == 11) && cf) && (a547336540.equals("i"))))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), "&&"), ((((a547336540.equals("i")) && cf) && (input.equals("iF"))) && (a1122863037 == 11)), 1497);
        if (((((a547336540.equals("i")) && cf) && (input.equals("iF"))) && (a1122863037 == 11))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a547336540.equals("i")) && ((input.equals("iI")) && ((a1122863037 == 11) && cf))), 1502);
        if (((a547336540.equals("i")) && ((input.equals("iI")) && ((a1122863037 == 11) && cf)))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a547336540.equals("i")) && (cf && (a1122863037 == 11))) && (input.equals("iJ"))), 1507);
        if ((((a547336540.equals("i")) && (cf && (a1122863037 == 11))) && (input.equals("iJ")))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((input.equals("iA")) && ((a547336540.equals("i")) && ((a1122863037 == 11) && cf))), 1512);
        if (((input.equals("iA")) && ((a547336540.equals("i")) && ((a1122863037 == 11) && cf)))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), "&&"), ((((a547336540.equals("i")) && cf) && (input.equals("iD"))) && (a1122863037 == 11)), 1517);
        if (((((a547336540.equals("i")) && cf) && (input.equals("iD"))) && (a1122863037 == 11))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a1122863037 == 11) && ((cf && (a547336540.equals("i"))) && (input.equals("iB")))), 1522);
        if (((a1122863037 == 11) && ((cf && (a547336540.equals("i"))) && (input.equals("iB"))))) {
            cf = false;
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), "&&"), "&&"), "&&"), ((input.equals("iH")) && ((a547336540.equals("i")) && (cf && (a1122863037 == 11)))), 1526);
        if (((input.equals("iH")) && ((a547336540.equals("i")) && (cf && (a1122863037 == 11))))) {
            cf = false;
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a547336540.equals("i")) && ((a1122863037 == 11) && cf)) && (input.equals("iG"))), 1530);
        if ((((a547336540.equals("i")) && ((a1122863037 == 11) && cf)) && (input.equals("iG")))) {
            cf = false;
            a1122863037 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a547336540.equals("i")) && (((a1122863037 == 11) && cf) && (input.equals("iE")))), 1534);
        if (((a547336540.equals("i")) && (((a1122863037 == 11) && cf) && (input.equals("iE"))))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 10;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oX");
        }
    }

    private void calculateOutputm34(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(12), "=="), "&&"), "&&"), ((a547336540.equals("i")) && (((input.equals("iB")) && cf) && (a1122863037 == 12))), 1542);
        if (((a547336540.equals("i")) && (((input.equals("iB")) && cf) && (a1122863037 == 12)))) {
            cf = false;
            a547336540 = "h";
            a1855872761 = "i";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(12), "=="), "&&"), "&&"), ((input.equals("iC")) && ((cf && (a547336540.equals("i"))) && (a1122863037 == 12))), 1547);
        if (((input.equals("iC")) && ((cf && (a547336540.equals("i"))) && (a1122863037 == 12)))) {
            cf = false;
            a547336540 = "h";
            a1855872761 = "i";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(12), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((a1122863037 == 12) && ((input.equals("iE")) && cf)) && (a547336540.equals("i"))), 1552);
        if ((((a1122863037 == 12) && ((input.equals("iE")) && cf)) && (a547336540.equals("i")))) {
            cf = false;
            a547336540 = "h";
            a1855872761 = "i";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(12), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a547336540.equals("i")) && ((input.equals("iF")) && ((a1122863037 == 12) && cf))), 1557);
        if (((a547336540.equals("i")) && ((input.equals("iF")) && ((a1122863037 == 12) && cf)))) {
            cf = false;
            a547336540 = "h";
            a1855872761 = "i";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(12), "=="), "&&"), "&&"), ((a547336540.equals("i")) && (((input.equals("iH")) && cf) && (a1122863037 == 12))), 1562);
        if (((a547336540.equals("i")) && (((input.equals("iH")) && cf) && (a1122863037 == 12)))) {
            cf = false;
            a547336540 = "h";
            a1855872761 = "i";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(12), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a547336540.equals("i")) && ((a1122863037 == 12) && cf)) && (input.equals("iI"))), 1567);
        if ((((a547336540.equals("i")) && ((a1122863037 == 12) && cf)) && (input.equals("iI")))) {
            cf = false;
            a547336540 = "h";
            a1855872761 = "i";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(12), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((a1122863037 == 12) && (cf && (input.equals("iJ")))) && (a547336540.equals("i"))), 1572);
        if ((((a1122863037 == 12) && (cf && (input.equals("iJ")))) && (a547336540.equals("i")))) {
            cf = false;
            a547336540 = "h";
            a1855872761 = "i";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(12), "=="), "&&"), "&&"), ((input.equals("iA")) && (((a547336540.equals("i")) && cf) && (a1122863037 == 12))), 1577);
        if (((input.equals("iA")) && (((a547336540.equals("i")) && cf) && (a1122863037 == 12)))) {
            cf = false;
            a547336540 = "h";
            a1855872761 = "i";
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(12), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((input.equals("iG")) && (((a1122863037 == 12) && cf) && (a547336540.equals("i")))), 1582);
        if (((input.equals("iG")) && (((a1122863037 == 12) && cf) && (a547336540.equals("i"))))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 16;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oV");
        }
    }

    private void calculateOutputm35(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(13), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((input.equals("iD")) && ((a547336540.equals("i")) && ((a1122863037 == 13) && cf))), 1590);
        if (((input.equals("iD")) && ((a547336540.equals("i")) && ((a1122863037 == 13) && cf)))) {
            cf = false;
            a547336540 = "f";
            a1305805768 = 14;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(13), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((a1122863037 == 13) && (cf && (input.equals("iB")))) && (a547336540.equals("i"))), 1595);
        if ((((a1122863037 == 13) && (cf && (input.equals("iB")))) && (a547336540.equals("i")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(13), "=="), "&&"), "&&"), ((a547336540.equals("i")) && ((cf && (input.equals("iC"))) && (a1122863037 == 13))), 1599);
        if (((a547336540.equals("i")) && ((cf && (input.equals("iC"))) && (a1122863037 == 13)))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(13), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((input.equals("iE")) && (((a1122863037 == 13) && cf) && (a547336540.equals("i")))), 1603);
        if (((input.equals("iE")) && (((a1122863037 == 13) && cf) && (a547336540.equals("i"))))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(13), "=="), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((input.equals("iF")) && (cf && (a1122863037 == 13))) && (a547336540.equals("i"))), 1607);
        if ((((input.equals("iF")) && (cf && (a1122863037 == 13))) && (a547336540.equals("i")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(13), "=="), "&&"), (((a547336540.equals("i")) && (cf && (input.equals("iH")))) && (a1122863037 == 13)), 1611);
        if ((((a547336540.equals("i")) && (cf && (input.equals("iH")))) && (a1122863037 == 13))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(13), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((input.equals("iI")) && ((a1122863037 == 13) && ((a547336540.equals("i")) && cf))), 1615);
        if (((input.equals("iI")) && ((a1122863037 == 13) && ((a547336540.equals("i")) && cf)))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(13), "=="), "&&"), (((input.equals("iJ")) && ((a547336540.equals("i")) && cf)) && (a1122863037 == 13)), 1619);
        if ((((input.equals("iJ")) && ((a547336540.equals("i")) && cf)) && (a1122863037 == 13))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(13), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), ((a1122863037 == 13) && (((a547336540.equals("i")) && cf) && (input.equals("iA")))), 1623);
        if (((a1122863037 == 13) && (((a547336540.equals("i")) && cf) && (input.equals("iA"))))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(13), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((cf && (a1122863037 == 13)) && (a547336540.equals("i"))) && (input.equals("iG"))), 1627);
        if ((((cf && (a1122863037 == 13)) && (a547336540.equals("i"))) && (input.equals("iG")))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oY");
        }
    }

    private void calculateOutputm36(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(14), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((cf && (input.equals("iH"))) && (a1122863037 == 14)) && (a547336540.equals("i"))), 1635);
        if ((((cf && (input.equals("iH"))) && (a1122863037 == 14)) && (a547336540.equals("i")))) {
            cf = false;
            a1122863037 = 13;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(14), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((input.equals("iC")) && ((a547336540.equals("i")) && ((a1122863037 == 14) && cf))), 1639);
        if (((input.equals("iC")) && ((a547336540.equals("i")) && ((a1122863037 == 14) && cf)))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(14), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((cf && (a1122863037 == 14)) && (input.equals("iD"))) && (a547336540.equals("i"))), 1643);
        if ((((cf && (a1122863037 == 14)) && (input.equals("iD"))) && (a547336540.equals("i")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(14), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), "&&"), "&&"), ((a1122863037 == 14) && ((a547336540.equals("i")) && (cf && (input.equals("iE"))))), 1647);
        if (((a1122863037 == 14) && ((a547336540.equals("i")) && (cf && (input.equals("iE")))))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(14), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (((cf && (input.equals("iF"))) && (a1122863037 == 14)) && (a547336540.equals("i"))), 1651);
        if ((((cf && (input.equals("iF"))) && (a1122863037 == 14)) && (a547336540.equals("i")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(14), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((input.equals("iG")) && ((cf && (a1122863037 == 14)) && (a547336540.equals("i")))), 1655);
        if (((input.equals("iG")) && ((cf && (a1122863037 == 14)) && (a547336540.equals("i"))))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(14), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), ((((input.equals("iI")) && cf) && (a1122863037 == 14)) && (a547336540.equals("i"))), 1659);
        if (((((input.equals("iI")) && cf) && (a1122863037 == 14)) && (a547336540.equals("i")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(14), "=="), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a547336540.equals("i")) && (cf && (a1122863037 == 14))) && (input.equals("iJ"))), 1663);
        if ((((a547336540.equals("i")) && (cf && (a1122863037 == 14))) && (input.equals("iJ")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(14), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), ((((a547336540.equals("i")) && cf) && (a1122863037 == 14)) && (input.equals("iA"))), 1667);
        if (((((a547336540.equals("i")) && cf) && (a1122863037 == 14)) && (input.equals("iA")))) {
            cf = false;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(14), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), ((((a1122863037 == 14) && cf) && (a547336540.equals("i"))) && (input.equals("iB"))), 1671);
        if (((((a1122863037 == 14) && cf) && (a547336540.equals("i"))) && (input.equals("iB")))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 5;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oY");
        }
    }

    private void calculateOutputm37(String input) {
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iH"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), "&&"), ((((a547336540.equals("i")) && cf) && (input.equals("iH"))) && (a1122863037 == 15)), 1679);
        if (((((a547336540.equals("i")) && cf) && (input.equals("iH"))) && (a1122863037 == 15))) {
            cf = false;
            a547336540 = "e";
            a691849188 = 6;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iB"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a547336540.equals("i")) && ((a1122863037 == 15) && ((input.equals("iB")) && cf))), 1684);
        if (((a547336540.equals("i")) && ((a1122863037 == 15) && ((input.equals("iB")) && cf)))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 9;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iC"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), "&&"), "&&"), "&&"), ((input.equals("iC")) && ((a547336540.equals("i")) && (cf && (a1122863037 == 15)))), 1689);
        if (((input.equals("iC")) && ((a547336540.equals("i")) && (cf && (a1122863037 == 15))))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 9;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iD"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((a547336540.equals("i")) && (cf && (a1122863037 == 15))) && (input.equals("iD"))), 1694);
        if ((((a547336540.equals("i")) && (cf && (a1122863037 == 15))) && (input.equals("iD")))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 9;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iE"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), ((((a1122863037 == 15) && cf) && (input.equals("iE"))) && (a547336540.equals("i"))), 1699);
        if (((((a1122863037 == 15) && cf) && (input.equals("iE"))) && (a547336540.equals("i")))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 9;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iF"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), "&&"), "&&"), "&&"), ((input.equals("iF")) && ((a547336540.equals("i")) && (cf && (a1122863037 == 15)))), 1704);
        if (((input.equals("iF")) && ((a547336540.equals("i")) && (cf && (a1122863037 == 15))))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 9;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iG"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), "&&"), (((a547336540.equals("i")) && ((input.equals("iG")) && cf)) && (a1122863037 == 15)), 1709);
        if ((((a547336540.equals("i")) && ((input.equals("iG")) && cf)) && (a1122863037 == 15))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 9;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iI"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), "&&"), "&&"), ((a1122863037 == 15) && ((a547336540.equals("i")) && ((input.equals("iI")) && cf))), 1714);
        if (((a1122863037 == 15) && ((a547336540.equals("i")) && ((input.equals("iI")) && cf)))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 9;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iJ"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), (((cf && (a547336540.equals("i"))) && (a1122863037 == 15)) && (input.equals("iJ"))), 1719);
        if ((((cf && (a547336540.equals("i"))) && (a1122863037 == 15)) && (input.equals("iJ")))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 9;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("iA"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(input)), "&&"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), "&&"), ((a1122863037 == 15) && ((cf && (input.equals("iA"))) && (a547336540.equals("i")))), 1724);
        if (((a1122863037 == 15) && ((cf && (input.equals("iA"))) && (a547336540.equals("i"))))) {
            cf = false;
            a547336540 = "g";
            a612577343 = 9;
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.output("oU");
        }
    }

    public void calculateOutput(String input) {
        cf = true;
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), ((a547336540.equals("e")) && cf), 1736);
        if (((a547336540.equals("e")) && cf)) {
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), ((a691849188 == 4) && cf), 1737);
            if (((a691849188 == 4) && cf)) {
                calculateOutputm1(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), "&&"), (cf && (a691849188 == 5)), 1740);
            if ((cf && (a691849188 == 5))) {
                calculateOutputm2(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), "&&"), (cf && (a691849188 == 6)), 1743);
            if ((cf && (a691849188 == 6))) {
                calculateOutputm3(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), ((a691849188 == 7) && cf), 1746);
            if (((a691849188 == 7) && cf)) {
                calculateOutputm4(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), ((a691849188 == 8) && cf), 1749);
            if (((a691849188 == 8) && cf)) {
                calculateOutputm5(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), ((a691849188 == 9) && cf), 1752);
            if (((a691849188 == 9) && cf)) {
                calculateOutputm6(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), ((a691849188 == 10) && cf), 1755);
            if (((a691849188 == 10) && cf)) {
                calculateOutputm7(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a691849188), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), "&&"), (cf && (a691849188 == 11)), 1758);
            if ((cf && (a691849188 == 11))) {
                calculateOutputm8(input);
            }
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), ((a547336540.equals("f")) && cf), 1762);
        if (((a547336540.equals("f")) && cf)) {
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), (cf && (a1305805768 == 9)), 1763);
            if ((cf && (a1305805768 == 9))) {
                calculateOutputm9(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), (cf && (a1305805768 == 10)), 1766);
            if ((cf && (a1305805768 == 10))) {
                calculateOutputm10(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), ((a1305805768 == 11) && cf), 1769);
            if (((a1305805768 == 11) && cf)) {
                calculateOutputm11(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(12), "=="), "&&"), (cf && (a1305805768 == 12)), 1772);
            if ((cf && (a1305805768 == 12))) {
                calculateOutputm12(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(13), "=="), "&&"), (cf && (a1305805768 == 13)), 1775);
            if ((cf && (a1305805768 == 13))) {
                calculateOutputm13(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(14), "=="), "&&"), (cf && (a1305805768 == 14)), 1778);
            if ((cf && (a1305805768 == 14))) {
                calculateOutputm14(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), "&&"), (cf && (a1305805768 == 15)), 1781);
            if ((cf && (a1305805768 == 15))) {
                calculateOutputm15(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1305805768), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(16), "=="), "&&"), (cf && (a1305805768 == 16)), 1784);
            if ((cf && (a1305805768 == 16))) {
                calculateOutputm16(input);
            }
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), ((a547336540.equals("g")) && cf), 1788);
        if (((a547336540.equals("g")) && cf)) {
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(4), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), ((a612577343 == 4) && cf), 1789);
            if (((a612577343 == 4) && cf)) {
                calculateOutputm17(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(5), "=="), "&&"), (cf && (a612577343 == 5)), 1792);
            if ((cf && (a612577343 == 5))) {
                calculateOutputm18(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(6), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), ((a612577343 == 6) && cf), 1795);
            if (((a612577343 == 6) && cf)) {
                calculateOutputm19(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(7), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), ((a612577343 == 7) && cf), 1798);
            if (((a612577343 == 7) && cf)) {
                calculateOutputm20(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), ((a612577343 == 8) && cf), 1801);
            if (((a612577343 == 8) && cf)) {
                calculateOutputm21(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), ((a612577343 == 9) && cf), 1804);
            if (((a612577343 == 9) && cf)) {
                calculateOutputm22(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), "&&"), (cf && (a612577343 == 10)), 1807);
            if ((cf && (a612577343 == 10))) {
                calculateOutputm23(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a612577343), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), "&&"), (cf && (a612577343 == 11)), 1810);
            if ((cf && (a612577343 == 11))) {
                calculateOutputm24(input);
            }
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), "&&"), (cf && (a547336540.equals("h"))), 1814);
        if ((cf && (a547336540.equals("h")))) {
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("e"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), (cf && (a1855872761.equals("e"))), 1815);
            if ((cf && (a1855872761.equals("e")))) {
                calculateOutputm25(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("f"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), (cf && (a1855872761.equals("f"))), 1818);
            if ((cf && (a1855872761.equals("f")))) {
                calculateOutputm26(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("g"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), (cf && (a1855872761.equals("g"))), 1821);
            if ((cf && (a1855872761.equals("g")))) {
                calculateOutputm27(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("h"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), "&&"), (cf && (a1855872761.equals("h"))), 1824);
            if ((cf && (a1855872761.equals("h")))) {
                calculateOutputm28(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1855872761)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), ((a1855872761.equals("i")) && cf), 1827);
            if (((a1855872761.equals("i")) && cf)) {
                calculateOutputm29(input);
            }
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.equals(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar("i"), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a547336540)), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), ((a547336540.equals("i")) && cf), 1831);
        if (((a547336540.equals("i")) && cf)) {
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(8), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), ((a1122863037 == 8) && cf), 1832);
            if (((a1122863037 == 8) && cf)) {
                calculateOutputm30(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(9), "=="), "&&"), (cf && (a1122863037 == 9)), 1835);
            if ((cf && (a1122863037 == 9))) {
                calculateOutputm31(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(10), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), ((a1122863037 == 10) && cf), 1838);
            if (((a1122863037 == 10) && cf)) {
                calculateOutputm32(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(11), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), ((a1122863037 == 11) && cf), 1841);
            if (((a1122863037 == 11) && cf)) {
                calculateOutputm33(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(12), "=="), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), "&&"), ((a1122863037 == 12) && cf), 1844);
            if (((a1122863037 == 12) && cf)) {
                calculateOutputm34(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(13), "=="), "&&"), (cf && (a1122863037 == 13)), 1847);
            if ((cf && (a1122863037 == 13))) {
                calculateOutputm35(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(14), "=="), "&&"), (cf && (a1122863037 == 14)), 1850);
            if ((cf && (a1122863037 == 14))) {
                calculateOutputm36(input);
            }
            nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), nl.tudelft.instrumentation.fuzzing.DistanceTracker.binaryExpr(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(a1122863037), nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(15), "=="), "&&"), (cf && (a1122863037 == 15)), 1853);
            if ((cf && (a1122863037 == 15))) {
                calculateOutputm37(input);
            }
        }
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.myIf(nl.tudelft.instrumentation.fuzzing.DistanceTracker.MyVar(cf), cf, 1859);
        if (cf)
            throw new IllegalArgumentException("Current state has no transition for this input!");
    }

    public static void main(String[] args) throws Exception {
        // init system and input reader
        Problem1 eca = new Problem1();
        nl.tudelft.instrumentation.fuzzing.DistanceTracker.run(eca.inputs, eca);
    }

    public String[] sequence;

    public Void call() {
        Problem1 cp = new Problem1();
        for (String s : sequence) {
            try {
                cp.calculateOutput(s);
            } catch (Exception e) {
                nl.tudelft.instrumentation.fuzzing.FuzzingLab.output("Invalid input: " + e.getMessage());
            }
        }
        return null;
    }

    public void setSequence(String[] trace) {
        sequence = trace;
    }
}

