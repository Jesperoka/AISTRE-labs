import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem14 {
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

	private String[] inputs = {"K","G","E","H","A","N","O","B","I","C","D","J","M","L","F"};

	public String a948320041 = "e";
	public String a681527819 = "e";
	public String a1163913646 = "e";
	public String a1708500674 = "f";
	public int a942522795 = 11;
	public int a322699279 = 9;
	public String a998691543 = "h";
	public String a1588068131 = "e";
	public String a1404083158 = "h";
	public String a400180708 = "f";
	public int a1410369705 = 1;
	public boolean cf = true;
	public int a1368342524 = 16;
	public String a1204585576 = "e";
	public int a677112242 = 6;
	public int a2083228155 = 4;
	public int a573660885 = 3;
	public int a608032282 = 5;
	public String a1926168604 = "h";
	public String a554726731 = "f";
	public int a1288456936 = 10;
	public int a947182640 = 11;
	public int a768322760 = 14;
	public int a1520738029 = 13;
	public int a372963703 = 14;
	public String a200251173 = "h";
	public String a1276394160 = "i";
	public int a1410514914 = 12;
	public int a1500959558 = 10;
	public int a470663134 = 10;
	public int a18652935 = 3;
	public String a150836410 = "f";
	public int a1916167078 = 16;
	public int a775360537 = 13;
	public String a777244229 = "g";
	public int a524497834 = 8;
	public int a710810301 = 7;
	public int a175435081 = 14;
	public String a1516401282 = "h";
	public int a599073259 = 12;
	public String a2047437785 = "h";
	public int a650139459 = 13;
	public int a1213256257 = 14;
	public String a1466212053 = "h";
	public int a878535168 = 11;
	public String a213146198 = "i";
	public int a647992626 = 4;
	public int a966113011 = 8;
	public String a1012822964 = "h";
	public int a1280269169 = 7;
	public int a129815901 = 9;
	public String a1712019689 = "g";
	public String a460729584 = "e";
	public int a619470312 = 1;
	public int a2068151937 = 15;
	public int a1279395252 = 8;
	public int a191699712 = 9;

	private void errorCheck() {
	    if((((a470663134 == 8) && (a1368342524 == 16)) && (a710810301 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(0);
	    }
	    if((((a554726731.equals("h")) && (a1012822964.equals("g"))) && (a710810301 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(1);
	    }
	    if((((a1288456936 == 15) && (a647992626 == 7)) && (a710810301 == 3))){
	    	cf = false;
	    	Errors.__VERIFIER_error(2);
	    }
	    if((((a966113011 == 5) && (a1213256257 == 9)) && (a710810301 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(3);
	    }
	    if((((a18652935 == 4) && (a1368342524 == 10)) && (a710810301 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(4);
	    }
	    if((((a150836410.equals("e")) && (a2068151937 == 15)) && (a710810301 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(5);
	    }
	    if((((a372963703 == 12) && (a460729584.equals("g"))) && (a710810301 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(6);
	    }
	    if((((a524497834 == 4) && (a1926168604.equals("f"))) && (a710810301 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(7);
	    }
	    if((((a1280269169 == 13) && (a1012822964.equals("i"))) && (a710810301 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(8);
	    }
	    if((((a677112242 == 10) && (a1368342524 == 14)) && (a710810301 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(9);
	    }
	    if((((a942522795 == 11) && (a1926168604.equals("i"))) && (a710810301 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(10);
	    }
	    if((((a1410514914 == 10) && (a608032282 == 4)) && (a710810301 == 7))){
	    	cf = false;
	    	Errors.__VERIFIER_error(11);
	    }
	    if((((a573660885 == 4) && (a608032282 == 6)) && (a710810301 == 7))){
	    	cf = false;
	    	Errors.__VERIFIER_error(12);
	    }
	    if((((a1279395252 == 6) && (a2068151937 == 14)) && (a710810301 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(13);
	    }
	    if((((a947182640 == 11) && (a1012822964.equals("e"))) && (a710810301 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(14);
	    }
	    if((((a1163913646.equals("e")) && (a1368342524 == 13)) && (a710810301 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(15);
	    }
	    if((((a1708500674.equals("e")) && (a1213256257 == 11)) && (a710810301 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(16);
	    }
	    if((((a554726731.equals("g")) && (a1012822964.equals("g"))) && (a710810301 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(17);
	    }
	    if((((a1916167078 == 15) && (a1213256257 == 12)) && (a710810301 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(18);
	    }
	    if((((a1410369705 == 7) && (a2068151937 == 13)) && (a710810301 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(19);
	    }
	    if((((a599073259 == 8) && (a1368342524 == 15)) && (a710810301 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(20);
	    }
	    if((((a573660885 == 7) && (a608032282 == 6)) && (a710810301 == 7))){
	    	cf = false;
	    	Errors.__VERIFIER_error(21);
	    }
	    if((((a947182640 == 12) && (a1012822964.equals("e"))) && (a710810301 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(22);
	    }
	    if((((a175435081 == 14) && (a1926168604.equals("h"))) && (a710810301 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(23);
	    }
	    if((((a200251173.equals("f")) && (a1213256257 == 13)) && (a710810301 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(24);
	    }
	    if((((a18652935 == 8) && (a1368342524 == 10)) && (a710810301 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(25);
	    }
	    if((((a1500959558 == 11) && (a647992626 == 6)) && (a710810301 == 3))){
	    	cf = false;
	    	Errors.__VERIFIER_error(26);
	    }
	    if((((a768322760 == 14) && (a1213256257 == 10)) && (a710810301 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(27);
	    }
	    if((((a129815901 == 12) && (a1012822964.equals("h"))) && (a710810301 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(28);
	    }
	    if((((a878535168 == 13) && (a460729584.equals("i"))) && (a710810301 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(29);
	    }
	    if((((a2083228155 == 7) && (a1012822964.equals("f"))) && (a710810301 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(30);
	    }
	    if((((a599073259 == 9) && (a460729584.equals("e"))) && (a710810301 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(31);
	    }
	    if((((a524497834 == 6) && (a1926168604.equals("f"))) && (a710810301 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(32);
	    }
	    if((((a599073259 == 10) && (a460729584.equals("e"))) && (a710810301 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(33);
	    }
	    if((((a948320041.equals("i")) && (a2068151937 == 11)) && (a710810301 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(34);
	    }
	    if((((a175435081 == 10) && (a1926168604.equals("h"))) && (a710810301 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(35);
	    }
	    if((((a175435081 == 13) && (a1926168604.equals("h"))) && (a710810301 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(36);
	    }
	    if((((a1916167078 == 9) && (a1213256257 == 12)) && (a710810301 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(37);
	    }
	    if((((a1520738029 == 12) && (a608032282 == 2)) && (a710810301 == 7))){
	    	cf = false;
	    	Errors.__VERIFIER_error(38);
	    }
	    if((((a681527819.equals("i")) && (a2068151937 == 12)) && (a710810301 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(39);
	    }
	    if((((a599073259 == 9) && (a1368342524 == 15)) && (a710810301 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(40);
	    }
	    if((((a878535168 == 10) && (a460729584.equals("i"))) && (a710810301 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(41);
	    }
	    if((((a1410514914 == 9) && (a608032282 == 4)) && (a710810301 == 7))){
	    	cf = false;
	    	Errors.__VERIFIER_error(42);
	    }
	    if((((a1708500674.equals("i")) && (a1213256257 == 16)) && (a710810301 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(43);
	    }
	    if((((a200251173.equals("h")) && (a1213256257 == 13)) && (a710810301 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(44);
	    }
	    if((((a677112242 == 7) && (a1368342524 == 14)) && (a710810301 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(45);
	    }
	    if((((a1466212053.equals("g")) && (a1368342524 == 11)) && (a710810301 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(46);
	    }
	    if((((a677112242 == 5) && (a1368342524 == 14)) && (a710810301 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(47);
	    }
	    if((((a1708500674.equals("f")) && (a1213256257 == 11)) && (a710810301 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(48);
	    }
	    if((((a470663134 == 11) && (a1368342524 == 16)) && (a710810301 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(49);
	    }
	    if((((a677112242 == 6) && (a1368342524 == 14)) && (a710810301 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(50);
	    }
	    if((((a2083228155 == 1) && (a1012822964.equals("f"))) && (a710810301 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(51);
	    }
	    if((((a1280269169 == 7) && (a1012822964.equals("i"))) && (a710810301 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(52);
	    }
	    if((((a1404083158.equals("g")) && (a2068151937 == 9)) && (a710810301 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(53);
	    }
	    if((((a775360537 == 13) && (a1926168604.equals("e"))) && (a710810301 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(54);
	    }
	    if((((a372963703 == 14) && (a460729584.equals("g"))) && (a710810301 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(55);
	    }
	    if((((a2047437785.equals("g")) && (a647992626 == 3)) && (a710810301 == 3))){
	    	cf = false;
	    	Errors.__VERIFIER_error(56);
	    }
	    if((((a372963703 == 13) && (a460729584.equals("g"))) && (a710810301 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(57);
	    }
	    if((((a150836410.equals("f")) && (a2068151937 == 15)) && (a710810301 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(58);
	    }
	    if((((a619470312 == 5) && (a1213256257 == 15)) && (a710810301 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(59);
	    }
	    if((((a1280269169 == 12) && (a1012822964.equals("i"))) && (a710810301 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(60);
	    }
	    if((((a1280269169 == 9) && (a647992626 == 5)) && (a710810301 == 3))){
	    	cf = false;
	    	Errors.__VERIFIER_error(61);
	    }
	    if((((a775360537 == 8) && (a1926168604.equals("e"))) && (a710810301 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(62);
	    }
	    if((((a1280269169 == 8) && (a647992626 == 5)) && (a710810301 == 3))){
	    	cf = false;
	    	Errors.__VERIFIER_error(63);
	    }
	    if((((a768322760 == 9) && (a1213256257 == 10)) && (a710810301 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(64);
	    }
	    if((((a1279395252 == 7) && (a2068151937 == 14)) && (a710810301 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(65);
	    }
	    if((((a129815901 == 7) && (a1012822964.equals("h"))) && (a710810301 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(66);
	    }
	    if((((a942522795 == 14) && (a1926168604.equals("i"))) && (a710810301 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(67);
	    }
	    if((((a1280269169 == 12) && (a647992626 == 5)) && (a710810301 == 3))){
	    	cf = false;
	    	Errors.__VERIFIER_error(68);
	    }
	    if((((a470663134 == 6) && (a1368342524 == 16)) && (a710810301 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(69);
	    }
	    if((((a213146198.equals("i")) && (a1213256257 == 14)) && (a710810301 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(70);
	    }
	    if((((a1012822964.equals("f")) && (a2068151937 == 10)) && (a710810301 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(71);
	    }
	    if((((a777244229.equals("f")) && (a460729584.equals("h"))) && (a710810301 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(72);
	    }
	    if((((a599073259 == 15) && (a460729584.equals("e"))) && (a710810301 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(73);
	    }
	    if((((a681527819.equals("i")) && (a460729584.equals("f"))) && (a710810301 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(74);
	    }
	    if((((a677112242 == 4) && (a1368342524 == 14)) && (a710810301 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(75);
	    }
	    if((((a129815901 == 8) && (a1012822964.equals("h"))) && (a710810301 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(76);
	    }
	    if((((a2083228155 == 3) && (a1012822964.equals("f"))) && (a710810301 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(77);
	    }
	    if((((a573660885 == 6) && (a608032282 == 6)) && (a710810301 == 7))){
	    	cf = false;
	    	Errors.__VERIFIER_error(78);
	    }
	    if((((a1516401282.equals("f")) && (a647992626 == 8)) && (a710810301 == 3))){
	    	cf = false;
	    	Errors.__VERIFIER_error(79);
	    }
	    if((((a2047437785.equals("i")) && (a647992626 == 3)) && (a710810301 == 3))){
	    	cf = false;
	    	Errors.__VERIFIER_error(80);
	    }
	    if((((a681527819.equals("f")) && (a2068151937 == 12)) && (a710810301 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(81);
	    }
	    if((((a2047437785.equals("e")) && (a647992626 == 3)) && (a710810301 == 3))){
	    	cf = false;
	    	Errors.__VERIFIER_error(82);
	    }
	    if((((a650139459 == 12) && (a608032282 == 8)) && (a710810301 == 7))){
	    	cf = false;
	    	Errors.__VERIFIER_error(83);
	    }
	    if((((a947182640 == 17) && (a1012822964.equals("e"))) && (a710810301 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(84);
	    }
	    if((((a2083228155 == 5) && (a1012822964.equals("f"))) && (a710810301 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(85);
	    }
	    if((((a599073259 == 13) && (a460729584.equals("e"))) && (a710810301 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(86);
	    }
	    if((((a322699279 == 14) && (a608032282 == 7)) && (a710810301 == 7))){
	    	cf = false;
	    	Errors.__VERIFIER_error(87);
	    }
	    if((((a1288456936 == 11) && (a647992626 == 7)) && (a710810301 == 3))){
	    	cf = false;
	    	Errors.__VERIFIER_error(88);
	    }
	    if((((a191699712 == 14) && (a1368342524 == 17)) && (a710810301 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(89);
	    }
	    if((((a650139459 == 8) && (a608032282 == 8)) && (a710810301 == 7))){
	    	cf = false;
	    	Errors.__VERIFIER_error(90);
	    }
	    if((((a191699712 == 12) && (a1368342524 == 17)) && (a710810301 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(91);
	    }
	    if((((a942522795 == 8) && (a1926168604.equals("i"))) && (a710810301 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(92);
	    }
	    if((((a554726731.equals("i")) && (a1012822964.equals("g"))) && (a710810301 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(93);
	    }
	    if((((a470663134 == 9) && (a1368342524 == 16)) && (a710810301 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(94);
	    }
	    if((((a878535168 == 12) && (a460729584.equals("i"))) && (a710810301 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(95);
	    }
	    if((((a1404083158.equals("h")) && (a2068151937 == 9)) && (a710810301 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(96);
	    }
	    if((((a599073259 == 11) && (a1368342524 == 15)) && (a710810301 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(97);
	    }
	    if((((a524497834 == 7) && (a1926168604.equals("f"))) && (a710810301 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(98);
	    }
	    if((((a942522795 == 9) && (a1926168604.equals("i"))) && (a710810301 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(99);
	    }
	}private  void calculateOutputm56(String input) {
    if((((a710810301 == 3) && (((a1276394160.equals("h")) && cf) && (input.equals("D")))) && (a647992626 == 2))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if((((((a1276394160.equals("h")) && cf) && (a647992626 == 2)) && (input.equals("M"))) && (a710810301 == 3))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm57(String input) {
    if(((((input.equals("A")) && ((a1276394160.equals("i")) && cf)) && (a710810301 == 3)) && (a647992626 == 2))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((input.equals("J")) && (((cf && (a647992626 == 2)) && (a1276394160.equals("i"))) && (a710810301 == 3)))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm1(String input) {
    if((cf && (a1276394160.equals("h")))) {
    	calculateOutputm56(input);
    } 
    if((cf && (a1276394160.equals("i")))) {
    	calculateOutputm57(input);
    } 
}
private  void calculateOutputm61(String input) {
    if((((a1588068131.equals("f")) && ((cf && (input.equals("F"))) && (a647992626 == 4))) && (a710810301 == 3))) {
    	cf = false;
    	a1213256257 = 9;
    	a710810301 = 6;
    	a966113011 = 11; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm3(String input) {
    if(((a1588068131.equals("f")) && cf)) {
    	calculateOutputm61(input);
    } 
}
private  void calculateOutputm62(String input) {
    if(((a710810301 == 3) && ((input.equals("D")) && ((a1280269169 == 6) && (cf && (a647992626 == 5)))))) {
    	cf = false;
    	a710810301 = 5;
    	a1926168604 = "f";
    	a524497834 = 9; 
    	System.out.println("T");
    } if(((a710810301 == 3) && (((a1280269169 == 6) && ((input.equals("F")) && cf)) && (a647992626 == 5)))) {
    	cf = false;
    	a1712019689 = "f";
    	a647992626 = 9; 
    	System.out.println("Q");
    } if(((input.equals("G")) && ((a710810301 == 3) && ((a647992626 == 5) && ((a1280269169 == 6) && cf))))) {
    	cf = false;
    	a608032282 = 7;
    	a710810301 = 7;
    	a322699279 = 13; 
    	System.out.println("T");
    } if((((a1280269169 == 6) && (((input.equals("L")) && cf) && (a647992626 == 5))) && (a710810301 == 3))) {
    	cf = false;
    	a647992626 = 6;
    	a1500959558 = 7; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm63(String input) {
    if(((a710810301 == 3) && (((cf && (a1280269169 == 7)) && (input.equals("G"))) && (a647992626 == 5)))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((input.equals("K")) && ((((a647992626 == 5) && cf) && (a710810301 == 3)) && (a1280269169 == 7)))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if((((((a710810301 == 3) && cf) && (input.equals("M"))) && (a647992626 == 5)) && (a1280269169 == 7))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm4(String input) {
    if((cf && (a1280269169 == 6))) {
    	calculateOutputm62(input);
    } 
    if(((a1280269169 == 7) && cf)) {
    	calculateOutputm63(input);
    } 
}
private  void calculateOutputm67(String input) {
    if(((input.equals("B")) && ((a647992626 == 6) && (((a710810301 == 3) && cf) && (a1500959558 == 5))))) {
    	cf = false;
    	a710810301 = 7;
    	a608032282 = 8;
    	a650139459 = 13; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm68(String input) {
    if(((a710810301 == 3) && ((input.equals("A")) && ((a1500959558 == 6) && (cf && (a647992626 == 6)))))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("Q");
    } if(((a710810301 == 3) && (((cf && (a647992626 == 6)) && (a1500959558 == 6)) && (input.equals("O"))))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("P");
    } 
}
private  void calculateOutputm69(String input) {
    if(((a1500959558 == 7) && ((((a647992626 == 6) && cf) && (input.equals("B"))) && (a710810301 == 3)))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("V");
    } if(((a1500959558 == 7) && ((a710810301 == 3) && ((input.equals("G")) && (cf && (a647992626 == 6)))))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("R");
    } if((((a710810301 == 3) && ((a1500959558 == 7) && ((input.equals("L")) && cf))) && (a647992626 == 6))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("Y");
    } if(((a710810301 == 3) && ((a647992626 == 6) && ((cf && (input.equals("M"))) && (a1500959558 == 7))))) {
    	cf = false;
    	a710810301 = 9;
    	a2068151937 = 13;
    	a1410369705 = 5; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm70(String input) {
    if(((((a647992626 == 6) && (cf && (a710810301 == 3))) && (a1500959558 == 9)) && (input.equals("H")))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a1500959558 == 9) && ((a647992626 == 6) && (((input.equals("L")) && cf) && (a710810301 == 3))))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm5(String input) {
    if(((a1500959558 == 5) && cf)) {
    	calculateOutputm67(input);
    } 
    if((cf && (a1500959558 == 6))) {
    	calculateOutputm68(input);
    } 
    if((cf && (a1500959558 == 7))) {
    	calculateOutputm69(input);
    } 
    if((cf && (a1500959558 == 9))) {
    	calculateOutputm70(input);
    } 
}
private  void calculateOutputm73(String input) {
    if(((input.equals("C")) && (((a710810301 == 3) && (cf && (a647992626 == 7))) && (a1288456936 == 12)))) {
    	cf = false;
    	a460729584 = "f";
    	a681527819 = "f";
    	a710810301 = 4; 
    	System.out.println("S");
    } 
}
private  void calculateOutputm74(String input) {
    if(((((a710810301 == 3) && (cf && (a1288456936 == 13))) && (input.equals("C"))) && (a647992626 == 7))) {
    	cf = false;
    	a710810301 = 4;
    	a460729584 = "g";
    	a372963703 = 17; 
    	System.out.println("P");
    } if(((((cf && (a710810301 == 3)) && (input.equals("F"))) && (a1288456936 == 13)) && (a647992626 == 7))) {
    	cf = false;
    	a460729584 = "i";
    	a710810301 = 4;
    	a878535168 = 10; 
    	System.out.println("P");
    } 
}
private  void calculateOutputm6(String input) {
    if(((a1288456936 == 12) && cf)) {
    	calculateOutputm73(input);
    } 
    if((cf && (a1288456936 == 13))) {
    	calculateOutputm74(input);
    } 
}
private  void calculateOutputm76(String input) {
    if(((a647992626 == 8) && ((a710810301 == 3) && ((a1516401282.equals("e")) && ((input.equals("E")) && cf))))) {
    	cf = false;
    	a948320041 = "h";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("T");
    } if(((input.equals("H")) && ((a710810301 == 3) && ((a1516401282.equals("e")) && ((a647992626 == 8) && cf))))) {
    	cf = false;
    	a710810301 = 7;
    	a998691543 = "g";
    	a608032282 = 3; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm7(String input) {
    if((cf && (a1516401282.equals("e")))) {
    	calculateOutputm76(input);
    } 
}
private  void calculateOutputm78(String input) {
    if((((a1712019689.equals("f")) && (((input.equals("G")) && cf) && (a710810301 == 3))) && (a647992626 == 9))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("S");
    } if(((a1712019689.equals("f")) && ((input.equals("I")) && ((a710810301 == 3) && ((a647992626 == 9) && cf))))) {
    	cf = false;
    	a2068151937 = 13;
    	a710810301 = 9;
    	a1410369705 = 5; 
    	System.out.println("Z");
    } if(((input.equals("J")) && ((a1712019689.equals("f")) && (((a710810301 == 3) && cf) && (a647992626 == 9))))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("Y");
    } if(((((cf && (a710810301 == 3)) && (a1712019689.equals("f"))) && (input.equals("K"))) && (a647992626 == 9))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm79(String input) {
    if(((a710810301 == 3) && (((a1712019689.equals("g")) && (cf && (a647992626 == 9))) && (input.equals("C"))))) {
    	cf = false;
    	a460729584 = "g";
    	a710810301 = 4;
    	a372963703 = 17; 
    	System.out.println("Z");
    } if(((((a1712019689.equals("g")) && (cf && (a647992626 == 9))) && (input.equals("K"))) && (a710810301 == 3))) {
    	cf = false;
    	a647992626 = 7;
    	a1288456936 = 13; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm80(String input) {
    if(((a647992626 == 9) && (((a1712019689.equals("h")) && (cf && (input.equals("E")))) && (a710810301 == 3)))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((((a1712019689.equals("h")) && ((a647992626 == 9) && cf)) && (input.equals("K"))) && (a710810301 == 3))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm81(String input) {
    if(((a710810301 == 3) && ((((a1712019689.equals("i")) && cf) && (a647992626 == 9)) && (input.equals("C"))))) {
    	cf = false;
    	a710810301 = 6;
    	a213146198 = "h";
    	a1213256257 = 14; 
    	System.out.println("Q");
    } if(((a710810301 == 3) && (((cf && (input.equals("N"))) && (a1712019689.equals("i"))) && (a647992626 == 9)))) {
    	cf = false;
    	a647992626 = 5;
    	a1280269169 = 6; 
    	System.out.println("Q");
    } if(((((a1712019689.equals("i")) && ((a710810301 == 3) && cf)) && (a647992626 == 9)) && (input.equals("O")))) {
    	cf = false;
    	a608032282 = 7;
    	a710810301 = 7;
    	a322699279 = 9; 
    	System.out.println("S");
    } 
}
private  void calculateOutputm8(String input) {
    if(((a1712019689.equals("f")) && cf)) {
    	calculateOutputm78(input);
    } 
    if((cf && (a1712019689.equals("g")))) {
    	calculateOutputm79(input);
    } 
    if((cf && (a1712019689.equals("h")))) {
    	calculateOutputm80(input);
    } 
    if(((a1712019689.equals("i")) && cf)) {
    	calculateOutputm81(input);
    } 
}
private  void calculateOutputm85(String input) {
    if(((((cf && (a460729584.equals("e"))) && (input.equals("D"))) && (a710810301 == 4)) && (a599073259 == 14))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((input.equals("H")) && ((a460729584.equals("e")) && ((a710810301 == 4) && ((a599073259 == 14) && cf))))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if((((((input.equals("L")) && cf) && (a710810301 == 4)) && (a599073259 == 14)) && (a460729584.equals("e")))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a460729584.equals("e")) && ((input.equals("O")) && ((a710810301 == 4) && ((a599073259 == 14) && cf))))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm9(String input) {
    if((cf && (a599073259 == 14))) {
    	calculateOutputm85(input);
    } 
}
private  void calculateOutputm87(String input) {
    if(((input.equals("F")) && ((((a710810301 == 4) && cf) && (a460729584.equals("f"))) && (a681527819.equals("e"))))) {
    	cf = false;
    	a400180708 = "i";
    	a710810301 = 8;
    	a1368342524 = 12; 
    	System.out.println("Y");
    } if((((a460729584.equals("f")) && ((a681527819.equals("e")) && ((a710810301 == 4) && cf))) && (input.equals("J")))) {
    	cf = false;
    	a608032282 = 5;
    	a710810301 = 7;
    	a1410369705 = 5; 
    	System.out.println("U");
    } if(((input.equals("N")) && ((a710810301 == 4) && ((a460729584.equals("f")) && (cf && (a681527819.equals("e"))))))) {
    	cf = false;
    	a710810301 = 3;
    	a1276394160 = "h";
    	a647992626 = 2; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm88(String input) {
    if(((((a681527819.equals("f")) && ((input.equals("K")) && cf)) && (a710810301 == 4)) && (a460729584.equals("f")))) {
    	cf = false;
    	a710810301 = 5;
    	a1926168604 = "e";
    	a775360537 = 7; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm89(String input) {
    if(((((input.equals("H")) && ((a681527819.equals("g")) && cf)) && (a710810301 == 4)) && (a460729584.equals("f")))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if((((a460729584.equals("f")) && ((input.equals("M")) && (cf && (a710810301 == 4)))) && (a681527819.equals("g")))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm10(String input) {
    if(((a681527819.equals("e")) && cf)) {
    	calculateOutputm87(input);
    } 
    if(((a681527819.equals("f")) && cf)) {
    	calculateOutputm88(input);
    } 
    if(((a681527819.equals("g")) && cf)) {
    	calculateOutputm89(input);
    } 
}
private  void calculateOutputm94(String input) {
    if(((((a460729584.equals("g")) && ((a710810301 == 4) && cf)) && (input.equals("E"))) && (a372963703 == 16))) {
    	cf = false;
    	a710810301 = 6;
    	a1213256257 = 9;
    	a966113011 = 8; 
    	System.out.println("V");
    } if(((input.equals("K")) && ((a710810301 == 4) && (((a372963703 == 16) && cf) && (a460729584.equals("g")))))) {
    	cf = false;
    	a608032282 = 4;
    	a710810301 = 7;
    	a1410514914 = 14; 
    	System.out.println("R");
    } 
}
private  void calculateOutputm95(String input) {
    if(((input.equals("J")) && (((cf && (a710810301 == 4)) && (a372963703 == 17)) && (a460729584.equals("g"))))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if((((a460729584.equals("g")) && (((input.equals("F")) && cf) && (a710810301 == 4))) && (a372963703 == 17))) {
    	cf = false;
    	a1012822964 = "f";
    	a710810301 = 10;
    	a2083228155 = 3; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm11(String input) {
    if((cf && (a372963703 == 16))) {
    	calculateOutputm94(input);
    } 
    if(((a372963703 == 17) && cf)) {
    	calculateOutputm95(input);
    } 
}
private  void calculateOutputm96(String input) {
    if(((a460729584.equals("h")) && ((a777244229.equals("e")) && ((cf && (a710810301 == 4)) && (input.equals("D")))))) {
    	cf = false;
    	a710810301 = 5;
    	a1926168604 = "e";
    	a775360537 = 7; 
    	System.out.println("Z");
    } if(((a460729584.equals("h")) && (((input.equals("F")) && (cf && (a710810301 == 4))) && (a777244229.equals("e"))))) {
    	cf = false;
    	a200251173 = "g";
    	a710810301 = 6;
    	a1213256257 = 13; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm98(String input) {
    if(((input.equals("I")) && ((a460729584.equals("h")) && (((a777244229.equals("g")) && cf) && (a710810301 == 4))))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if((((((a710810301 == 4) && cf) && (a777244229.equals("g"))) && (a460729584.equals("h"))) && (input.equals("J")))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if((((input.equals("M")) && ((a460729584.equals("h")) && ((a710810301 == 4) && cf))) && (a777244229.equals("g")))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((input.equals("N")) && ((((a710810301 == 4) && cf) && (a460729584.equals("h"))) && (a777244229.equals("g"))))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm99(String input) {
    if((((input.equals("F")) && (((a460729584.equals("h")) && cf) && (a777244229.equals("h")))) && (a710810301 == 4))) {
    	cf = false;
    	a1276394160 = "i";
    	a710810301 = 3;
    	a647992626 = 2; 
    	System.out.println("U");
    } if(((a460729584.equals("h")) && (((input.equals("I")) && ((a710810301 == 4) && cf)) && (a777244229.equals("h"))))) {
    	cf = false;
    	a710810301 = 7;
    	a608032282 = 4;
    	a1410514914 = 7; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm100(String input) {
    if(((((a710810301 == 4) && ((a460729584.equals("h")) && cf)) && (input.equals("H"))) && (a777244229.equals("i")))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a777244229.equals("i")) && ((input.equals("N")) && ((a460729584.equals("h")) && (cf && (a710810301 == 4)))))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm12(String input) {
    if(((a777244229.equals("e")) && cf)) {
    	calculateOutputm96(input);
    } 
    if((cf && (a777244229.equals("g")))) {
    	calculateOutputm98(input);
    } 
    if((cf && (a777244229.equals("h")))) {
    	calculateOutputm99(input);
    } 
    if(((a777244229.equals("i")) && cf)) {
    	calculateOutputm100(input);
    } 
}
private  void calculateOutputm101(String input) {
    if(((((a710810301 == 4) && ((input.equals("K")) && cf)) && (a878535168 == 9)) && (a460729584.equals("i")))) {
    	cf = false;
    	a608032282 = 4;
    	a710810301 = 7;
    	a1410514914 = 12; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm105(String input) {
    if(((((cf && (a710810301 == 4)) && (input.equals("H"))) && (a460729584.equals("i"))) && (a878535168 == 14))) {
    	cf = false;
    	a710810301 = 7;
    	a608032282 = 2;
    	a1520738029 = 6; 
    	System.out.println("Z");
    } if(((a460729584.equals("i")) && (((a710810301 == 4) && (cf && (a878535168 == 14))) && (input.equals("I"))))) {
    	cf = false;
    	a608032282 = 2;
    	a710810301 = 7;
    	a1520738029 = 6; 
    	System.out.println("Z");
    } if((((input.equals("O")) && ((a878535168 == 14) && ((a710810301 == 4) && cf))) && (a460729584.equals("i")))) {
    	cf = false;
    	a608032282 = 2;
    	a710810301 = 7;
    	a1520738029 = 6; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm13(String input) {
    if((cf && (a878535168 == 9))) {
    	calculateOutputm101(input);
    } 
    if(((a878535168 == 14) && cf)) {
    	calculateOutputm105(input);
    } 
}
private  void calculateOutputm106(String input) {
    if(((((input.equals("E")) && (cf && (a1926168604.equals("e")))) && (a710810301 == 5)) && (a775360537 == 7))) {
    	cf = false;
    	a710810301 = 8;
    	a1163913646 = "g";
    	a1368342524 = 13; 
    	System.out.println("S");
    } 
}
private  void calculateOutputm108(String input) {
    if((((input.equals("J")) && ((a1926168604.equals("e")) && ((a710810301 == 5) && cf))) && (a775360537 == 11))) {
    	cf = false;
    	a710810301 = 8;
    	a1466212053 = "e";
    	a1368342524 = 11; 
    	System.out.println("Z");
    } if(((((a775360537 == 11) && (cf && (a710810301 == 5))) && (input.equals("N"))) && (a1926168604.equals("e")))) {
    	cf = false;
    	a710810301 = 10;
    	a1012822964 = "f";
    	a2083228155 = 4; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm14(String input) {
    if((cf && (a775360537 == 7))) {
    	calculateOutputm106(input);
    } 
    if(((a775360537 == 11) && cf)) {
    	calculateOutputm108(input);
    } 
}
private  void calculateOutputm111(String input) {
    if((((a1926168604.equals("f")) && (((a524497834 == 5) && cf) && (a710810301 == 5))) && (input.equals("C")))) {
    	cf = false;
    	a998691543 = "h";
    	a710810301 = 7;
    	a608032282 = 3; 
    	System.out.println("Y");
    } if(((a1926168604.equals("f")) && ((a524497834 == 5) && (((input.equals("I")) && cf) && (a710810301 == 5))))) {
    	cf = false;
    	a710810301 = 6;
    	a1213256257 = 15;
    	a619470312 = 6; 
    	System.out.println("P");
    } if(((a1926168604.equals("f")) && (((cf && (a524497834 == 5)) && (input.equals("J"))) && (a710810301 == 5)))) {
    	cf = false;
    	a2068151937 = 13;
    	a710810301 = 9;
    	a1410369705 = 1; 
    	System.out.println("V");
    } if(((a1926168604.equals("f")) && ((input.equals("M")) && ((a524497834 == 5) && (cf && (a710810301 == 5)))))) {
    	cf = false;
    	a1368342524 = 17;
    	a710810301 = 8;
    	a191699712 = 13; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm114(String input) {
    if((((input.equals("H")) && ((cf && (a1926168604.equals("f"))) && (a524497834 == 9))) && (a710810301 == 5))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("R");
    } if(((a710810301 == 5) && ((a1926168604.equals("f")) && (((a524497834 == 9) && cf) && (input.equals("L")))))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("R");
    } 
}
private  void calculateOutputm115(String input) {
    if((((a1926168604.equals("f")) && ((input.equals("A")) && (cf && (a524497834 == 11)))) && (a710810301 == 5))) {
    	cf = false;
    	a608032282 = 2;
    	a710810301 = 7;
    	a1520738029 = 6; 
    	System.out.println("Z");
    } if(((input.equals("D")) && (((a710810301 == 5) && (cf && (a1926168604.equals("f")))) && (a524497834 == 11)))) {
    	cf = false;
    	a710810301 = 7;
    	a608032282 = 2;
    	a1520738029 = 6; 
    	System.out.println("Z");
    } if((((a710810301 == 5) && ((a1926168604.equals("f")) && ((input.equals("M")) && cf))) && (a524497834 == 11))) {
    	cf = false;
    	a710810301 = 7;
    	a608032282 = 2;
    	a1520738029 = 6; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm15(String input) {
    if(((a524497834 == 5) && cf)) {
    	calculateOutputm111(input);
    } 
    if((cf && (a524497834 == 9))) {
    	calculateOutputm114(input);
    } 
    if((cf && (a524497834 == 11))) {
    	calculateOutputm115(input);
    } 
}
private  void calculateOutputm116(String input) {
    if(((((a681527819.equals("e")) && (cf && (input.equals("D")))) && (a1926168604.equals("g"))) && (a710810301 == 5))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a1926168604.equals("g")) && ((((input.equals("G")) && cf) && (a681527819.equals("e"))) && (a710810301 == 5)))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm117(String input) {
    if(((a710810301 == 5) && ((((a1926168604.equals("g")) && cf) && (input.equals("K"))) && (a681527819.equals("f"))))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a681527819.equals("f")) && ((a710810301 == 5) && ((a1926168604.equals("g")) && ((input.equals("L")) && cf))))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm118(String input) {
    if(((((a681527819.equals("g")) && ((a1926168604.equals("g")) && cf)) && (input.equals("A"))) && (a710810301 == 5))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a681527819.equals("g")) && ((input.equals("N")) && ((a710810301 == 5) && (cf && (a1926168604.equals("g"))))))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm119(String input) {
    if((((a681527819.equals("h")) && ((a710810301 == 5) && (cf && (input.equals("A"))))) && (a1926168604.equals("g")))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm120(String input) {
    if((((input.equals("A")) && ((a681527819.equals("i")) && ((a710810301 == 5) && cf))) && (a1926168604.equals("g")))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a710810301 == 5) && ((a681527819.equals("i")) && ((input.equals("D")) && ((a1926168604.equals("g")) && cf))))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a1926168604.equals("g")) && ((a681527819.equals("i")) && ((input.equals("N")) && ((a710810301 == 5) && cf))))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm16(String input) {
    if((cf && (a681527819.equals("e")))) {
    	calculateOutputm116(input);
    } 
    if((cf && (a681527819.equals("f")))) {
    	calculateOutputm117(input);
    } 
    if(((a681527819.equals("g")) && cf)) {
    	calculateOutputm118(input);
    } 
    if((cf && (a681527819.equals("h")))) {
    	calculateOutputm119(input);
    } 
    if((cf && (a681527819.equals("i")))) {
    	calculateOutputm120(input);
    } 
}
private  void calculateOutputm121(String input) {
    if(((a175435081 == 8) && (((input.equals("A")) && ((a1926168604.equals("h")) && cf)) && (a710810301 == 5)))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("P");
    } if(((input.equals("L")) && ((a710810301 == 5) && ((cf && (a175435081 == 8)) && (a1926168604.equals("h")))))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("P");
    } if(((a175435081 == 8) && ((a710810301 == 5) && (((a1926168604.equals("h")) && cf) && (input.equals("M")))))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("P");
    } if(((((a710810301 == 5) && (cf && (a1926168604.equals("h")))) && (input.equals("O"))) && (a175435081 == 8))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("P");
    } 
}
private  void calculateOutputm122(String input) {
    if(((a1926168604.equals("h")) && (((cf && (input.equals("B"))) && (a710810301 == 5)) && (a175435081 == 9)))) {
    	cf = false;
    	a460729584 = "g";
    	a710810301 = 4;
    	a372963703 = 16; 
    	System.out.println("V");
    } if(((input.equals("G")) && (((a175435081 == 9) && ((a1926168604.equals("h")) && cf)) && (a710810301 == 5)))) {
    	cf = false;
    	a710810301 = 7;
    	a608032282 = 8;
    	a650139459 = 9; 
    	System.out.println("S");
    } if(((a175435081 == 9) && ((a1926168604.equals("h")) && ((a710810301 == 5) && (cf && (input.equals("I"))))))) {
    	cf = false;
    	a710810301 = 6;
    	a1213256257 = 9;
    	a966113011 = 7; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm124(String input) {
    if(((((a710810301 == 5) && (cf && (input.equals("E")))) && (a175435081 == 12)) && (a1926168604.equals("h")))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm17(String input) {
    if(((a175435081 == 8) && cf)) {
    	calculateOutputm121(input);
    } 
    if(((a175435081 == 9) && cf)) {
    	calculateOutputm122(input);
    } 
    if((cf && (a175435081 == 12))) {
    	calculateOutputm124(input);
    } 
}
private  void calculateOutputm130(String input) {
    if(((((cf && (a942522795 == 12)) && (input.equals("H"))) && (a1926168604.equals("i"))) && (a710810301 == 5))) {
    	cf = false;
    	a710810301 = 7;
    	a608032282 = 7;
    	a322699279 = 7; 
    	System.out.println("R");
    } if(((((input.equals("K")) && (cf && (a942522795 == 12))) && (a710810301 == 5)) && (a1926168604.equals("i")))) {
    	cf = false;
    	a1926168604 = "f";
    	a524497834 = 5; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm131(String input) {
    if(((a942522795 == 13) && (((a710810301 == 5) && (cf && (input.equals("E")))) && (a1926168604.equals("i"))))) {
    	cf = false;
    	a710810301 = 3;
    	a1516401282 = "e";
    	a647992626 = 8; 
    	System.out.println("Z");
    } if((((a1926168604.equals("i")) && ((a710810301 == 5) && ((input.equals("I")) && cf))) && (a942522795 == 13))) {
    	cf = false;
    	a647992626 = 7;
    	a710810301 = 3;
    	a1288456936 = 12; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm18(String input) {
    if((cf && (a942522795 == 12))) {
    	calculateOutputm130(input);
    } 
    if((cf && (a942522795 == 13))) {
    	calculateOutputm131(input);
    } 
}
private  void calculateOutputm134(String input) {
    if((((input.equals("L")) && (((a710810301 == 6) && cf) && (a966113011 == 6))) && (a1213256257 == 9))) {
    	cf = false;
    	a213146198 = "g";
    	a1213256257 = 14; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm135(String input) {
    if(((a966113011 == 7) && ((((input.equals("E")) && cf) && (a710810301 == 6)) && (a1213256257 == 9)))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if((((input.equals("G")) && ((cf && (a1213256257 == 9)) && (a966113011 == 7))) && (a710810301 == 6))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a710810301 == 6) && ((input.equals("J")) && ((a966113011 == 7) && (cf && (a1213256257 == 9)))))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a710810301 == 6) && ((input.equals("N")) && ((cf && (a966113011 == 7)) && (a1213256257 == 9))))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm136(String input) {
    if(((a966113011 == 8) && (((a1213256257 == 9) && ((a710810301 == 6) && cf)) && (input.equals("K"))))) {
    	cf = false;
    	a710810301 = 7;
    	a554726731 = "i";
    	a608032282 = 1; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm137(String input) {
    if((((a966113011 == 10) && ((input.equals("I")) && ((a710810301 == 6) && cf))) && (a1213256257 == 9))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm138(String input) {
    if((((a1213256257 == 9) && ((a966113011 == 11) && (cf && (input.equals("D"))))) && (a710810301 == 6))) {
    	cf = false;
    	a150836410 = "i";
    	a710810301 = 9;
    	a2068151937 = 15; 
    	System.out.println("Z");
    } if(((a1213256257 == 9) && (((input.equals("H")) && (cf && (a966113011 == 11))) && (a710810301 == 6)))) {
    	cf = false;
    	a1213256257 = 10;
    	a768322760 = 13; 
    	System.out.println("Y");
    } if((((((a710810301 == 6) && cf) && (input.equals("L"))) && (a1213256257 == 9)) && (a966113011 == 11))) {
    	cf = false;
    	a608032282 = 2;
    	a710810301 = 7;
    	a1520738029 = 7; 
    	System.out.println("V");
    } if(((((a966113011 == 11) && (cf && (input.equals("O")))) && (a710810301 == 6)) && (a1213256257 == 9))) {
    	cf = false;
    	a710810301 = 5;
    	a1926168604 = "h";
    	a175435081 = 13; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm139(String input) {
    if(((input.equals("A")) && ((((a1213256257 == 9) && cf) && (a966113011 == 12)) && (a710810301 == 6)))) {
    	cf = false;
    	a647992626 = 5;
    	a710810301 = 3;
    	a1280269169 = 7; 
    	System.out.println("R");
    } if(((((cf && (a966113011 == 12)) && (input.equals("B"))) && (a1213256257 == 9)) && (a710810301 == 6))) {
    	cf = false;
    	a710810301 = 7;
    	a608032282 = 2;
    	a1520738029 = 13; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm19(String input) {
    if(((a966113011 == 6) && cf)) {
    	calculateOutputm134(input);
    } 
    if(((a966113011 == 7) && cf)) {
    	calculateOutputm135(input);
    } 
    if(((a966113011 == 8) && cf)) {
    	calculateOutputm136(input);
    } 
    if((cf && (a966113011 == 10))) {
    	calculateOutputm137(input);
    } 
    if(((a966113011 == 11) && cf)) {
    	calculateOutputm138(input);
    } 
    if(((a966113011 == 12) && cf)) {
    	calculateOutputm139(input);
    } 
}
private  void calculateOutputm140(String input) {
    if((((a1213256257 == 10) && ((input.equals("D")) && (cf && (a768322760 == 7)))) && (a710810301 == 6))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("S");
    } if(((((cf && (a768322760 == 7)) && (a1213256257 == 10)) && (a710810301 == 6)) && (input.equals("J")))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("Y");
    } if((((a1213256257 == 10) && (((a768322760 == 7) && cf) && (a710810301 == 6))) && (input.equals("K")))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm142(String input) {
    if((((((a1213256257 == 10) && cf) && (a768322760 == 11)) && (a710810301 == 6)) && (input.equals("C")))) {
    	cf = false;
    	a710810301 = 10;
    	a1012822964 = "h";
    	a129815901 = 10; 
    	System.out.println("W");
    } if(((input.equals("G")) && (((a768322760 == 11) && (cf && (a1213256257 == 10))) && (a710810301 == 6)))) {
    	cf = false;
    	a710810301 = 8;
    	a1163913646 = "f";
    	a1368342524 = 13; 
    	System.out.println("Q");
    } if((((((a710810301 == 6) && cf) && (input.equals("J"))) && (a1213256257 == 10)) && (a768322760 == 11))) {
    	cf = false;
    	a1588068131 = "f";
    	a710810301 = 3;
    	a647992626 = 4; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm143(String input) {
    if((((a710810301 == 6) && ((input.equals("D")) && ((a768322760 == 12) && cf))) && (a1213256257 == 10))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm144(String input) {
    if(((a1213256257 == 10) && ((input.equals("E")) && ((a768322760 == 13) && (cf && (a710810301 == 6)))))) {
    	cf = false;
    	a777244229 = "h";
    	a460729584 = "h";
    	a710810301 = 4; 
    	System.out.println("Y");
    } if(((a1213256257 == 10) && (((cf && (a768322760 == 13)) && (input.equals("G"))) && (a710810301 == 6)))) {
    	cf = false;
    	a1012822964 = "h";
    	a710810301 = 10;
    	a129815901 = 11; 
    	System.out.println("S");
    } if(((((input.equals("J")) && ((a1213256257 == 10) && cf)) && (a710810301 == 6)) && (a768322760 == 13))) {
    	cf = false;
    	a710810301 = 8;
    	a400180708 = "g";
    	a1368342524 = 12; 
    	System.out.println("W");
    } if((((((a710810301 == 6) && cf) && (input.equals("H"))) && (a1213256257 == 10)) && (a768322760 == 13))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 15;
    	a599073259 = 11; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm20(String input) {
    if(((a768322760 == 7) && cf)) {
    	calculateOutputm140(input);
    } 
    if(((a768322760 == 11) && cf)) {
    	calculateOutputm142(input);
    } 
    if((cf && (a768322760 == 12))) {
    	calculateOutputm143(input);
    } 
    if(((a768322760 == 13) && cf)) {
    	calculateOutputm144(input);
    } 
}
private  void calculateOutputm148(String input) {
    if(((input.equals("B")) && ((a710810301 == 6) && ((cf && (a1213256257 == 11)) && (a1708500674.equals("h")))))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("Y");
    } if(((a710810301 == 6) && (((cf && (input.equals("C"))) && (a1213256257 == 11)) && (a1708500674.equals("h"))))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("W");
    } if((((a710810301 == 6) && ((cf && (a1708500674.equals("h"))) && (a1213256257 == 11))) && (input.equals("K")))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("T");
    } if(((a1708500674.equals("h")) && (((a710810301 == 6) && ((input.equals("M")) && cf)) && (a1213256257 == 11)))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("R");
    } 
}
private  void calculateOutputm21(String input) {
    if((cf && (a1708500674.equals("h")))) {
    	calculateOutputm148(input);
    } 
}
private  void calculateOutputm150(String input) {
    if(((a710810301 == 6) && ((((input.equals("A")) && cf) && (a1213256257 == 12)) && (a1916167078 == 10)))) {
    	cf = false;
    	a200251173 = "e";
    	a1213256257 = 13; 
    	System.out.println("V");
    } if(((((cf && (a1213256257 == 12)) && (a1916167078 == 10)) && (a710810301 == 6)) && (input.equals("B")))) {
    	cf = false;
    	a710810301 = 9;
    	a1404083158 = "e";
    	a2068151937 = 9; 
    	System.out.println("S");
    } if(((a1213256257 == 12) && ((a710810301 == 6) && ((input.equals("L")) && ((a1916167078 == 10) && cf))))) {
    	cf = false;
    	a1368342524 = 10;
    	a710810301 = 8;
    	a18652935 = 9; 
    	System.out.println("W");
    } if((((input.equals("D")) && ((cf && (a1916167078 == 10)) && (a1213256257 == 12))) && (a710810301 == 6))) {
    	cf = false;
    	a1012822964 = "h";
    	a710810301 = 10;
    	a129815901 = 8; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm151(String input) {
    if((((a1916167078 == 11) && ((a710810301 == 6) && ((input.equals("E")) && cf))) && (a1213256257 == 12))) {
    	cf = false;
    	a710810301 = 4;
    	a460729584 = "i";
    	a878535168 = 9; 
    	System.out.println("P");
    } 
}
private  void calculateOutputm152(String input) {
    if(((input.equals("E")) && (((a1916167078 == 12) && (cf && (a710810301 == 6))) && (a1213256257 == 12)))) {
    	cf = false;
    	a710810301 = 7;
    	a608032282 = 2;
    	a1520738029 = 6; 
    	System.out.println("Z");
    } if(((a1213256257 == 12) && (((a710810301 == 6) && ((a1916167078 == 12) && cf)) && (input.equals("J"))))) {
    	cf = false;
    	a608032282 = 2;
    	a710810301 = 7;
    	a1520738029 = 6; 
    	System.out.println("Z");
    } if((((((input.equals("O")) && cf) && (a710810301 == 6)) && (a1916167078 == 12)) && (a1213256257 == 12))) {
    	cf = false;
    	a710810301 = 7;
    	a608032282 = 2;
    	a1520738029 = 6; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm153(String input) {
    if(((input.equals("C")) && (((a1213256257 == 12) && (cf && (a710810301 == 6))) && (a1916167078 == 13)))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 10;
    	a18652935 = 6; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm154(String input) {
    if(((input.equals("B")) && ((((a1916167078 == 14) && cf) && (a710810301 == 6)) && (a1213256257 == 12)))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a1916167078 == 14) && ((a1213256257 == 12) && (((input.equals("F")) && cf) && (a710810301 == 6))))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a1916167078 == 14) && ((input.equals("G")) && (((a1213256257 == 12) && cf) && (a710810301 == 6))))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm22(String input) {
    if(((a1916167078 == 10) && cf)) {
    	calculateOutputm150(input);
    } 
    if(((a1916167078 == 11) && cf)) {
    	calculateOutputm151(input);
    } 
    if(((a1916167078 == 12) && cf)) {
    	calculateOutputm152(input);
    } 
    if((cf && (a1916167078 == 13))) {
    	calculateOutputm153(input);
    } 
    if((cf && (a1916167078 == 14))) {
    	calculateOutputm154(input);
    } 
}
private  void calculateOutputm156(String input) {
    if((((a1213256257 == 13) && ((input.equals("I")) && (cf && (a710810301 == 6)))) && (a200251173.equals("e")))) {
    	cf = false;
    	a1213256257 = 15;
    	a619470312 = 3; 
    	System.out.println("S");
    } if(((a710810301 == 6) && ((a1213256257 == 13) && ((cf && (a200251173.equals("e"))) && (input.equals("K")))))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 17;
    	a191699712 = 7; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm158(String input) {
    if(((a1213256257 == 13) && ((a200251173.equals("g")) && ((input.equals("A")) && ((a710810301 == 6) && cf))))) {
    	cf = false;
    	a1368342524 = 15;
    	a710810301 = 8;
    	a599073259 = 14; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm160(String input) {
    if((((a200251173.equals("i")) && ((a1213256257 == 13) && ((a710810301 == 6) && cf))) && (input.equals("F")))) {
    	cf = false;
    	a710810301 = 7;
    	a608032282 = 7;
    	a322699279 = 11; 
    	System.out.println("P");
    } 
}
private  void calculateOutputm23(String input) {
    if(((a200251173.equals("e")) && cf)) {
    	calculateOutputm156(input);
    } 
    if((cf && (a200251173.equals("g")))) {
    	calculateOutputm158(input);
    } 
    if(((a200251173.equals("i")) && cf)) {
    	calculateOutputm160(input);
    } 
}
private  void calculateOutputm161(String input) {
    if(((a1213256257 == 14) && (((cf && (a213146198.equals("g"))) && (a710810301 == 6)) && (input.equals("K"))))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a710810301 == 6) && (((cf && (input.equals("N"))) && (a213146198.equals("g"))) && (a1213256257 == 14)))) {
    	cf = false;
    	a1204585576 = "g";
    	a710810301 = 9;
    	a2068151937 = 8; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm162(String input) {
    if((((a710810301 == 6) && (((input.equals("A")) && cf) && (a1213256257 == 14))) && (a213146198.equals("h")))) {
    	cf = false;
    	a1708500674 = "h";
    	a1213256257 = 11; 
    	System.out.println("W");
    } if(((input.equals("F")) && ((a710810301 == 6) && ((a1213256257 == 14) && (cf && (a213146198.equals("h"))))))) {
    	cf = false;
    	a608032282 = 6;
    	a710810301 = 7;
    	a573660885 = 8; 
    	System.out.println("Q");
    } if(((a213146198.equals("h")) && (((a710810301 == 6) && (cf && (a1213256257 == 14))) && (input.equals("J"))))) {
    	cf = false;
    	a608032282 = 2;
    	a710810301 = 7;
    	a1520738029 = 9; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm24(String input) {
    if(((a213146198.equals("g")) && cf)) {
    	calculateOutputm161(input);
    } 
    if((cf && (a213146198.equals("h")))) {
    	calculateOutputm162(input);
    } 
}
private  void calculateOutputm164(String input) {
    if((((a1213256257 == 15) && ((a710810301 == 6) && (cf && (input.equals("A"))))) && (a619470312 == 1))) {
    	cf = false;
    	a1926168604 = "h";
    	a710810301 = 5;
    	a175435081 = 12; 
    	System.out.println("S");
    } if(((a710810301 == 6) && ((a619470312 == 1) && ((a1213256257 == 15) && (cf && (input.equals("C"))))))) {
    	cf = false;
    	a681527819 = "e";
    	a1926168604 = "g";
    	a710810301 = 5; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm165(String input) {
    if(((a619470312 == 3) && (((input.equals("F")) && (cf && (a710810301 == 6))) && (a1213256257 == 15)))) {
    	cf = false;
    	a1368342524 = 17;
    	a710810301 = 8;
    	a191699712 = 10; 
    	System.out.println("Y");
    } if(((((cf && (a710810301 == 6)) && (input.equals("J"))) && (a1213256257 == 15)) && (a619470312 == 3))) {
    	cf = false;
    	a554726731 = "f";
    	a710810301 = 7;
    	a608032282 = 1; 
    	System.out.println("V");
    } if(((a710810301 == 6) && (((cf && (a619470312 == 3)) && (a1213256257 == 15)) && (input.equals("K"))))) {
    	cf = false;
    	a710810301 = 10;
    	a1012822964 = "i";
    	a1280269169 = 9; 
    	System.out.println("U");
    } if((((input.equals("O")) && ((cf && (a710810301 == 6)) && (a1213256257 == 15))) && (a619470312 == 3))) {
    	cf = false;
    	a460729584 = "f";
    	a681527819 = "g";
    	a710810301 = 4; 
    	System.out.println("S");
    } 
}
private  void calculateOutputm166(String input) {
    if((((a1213256257 == 15) && ((input.equals("H")) && (cf && (a619470312 == 4)))) && (a710810301 == 6))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if((((a710810301 == 6) && ((input.equals("O")) && (cf && (a619470312 == 4)))) && (a1213256257 == 15))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm168(String input) {
    if(((input.equals("I")) && (((a619470312 == 6) && ((a710810301 == 6) && cf)) && (a1213256257 == 15)))) {
    	cf = false;
    	a608032282 = 2;
    	a710810301 = 7;
    	a1520738029 = 6; 
    	System.out.println("Z");
    } if(((((a1213256257 == 15) && ((a619470312 == 6) && cf)) && (a710810301 == 6)) && (input.equals("O")))) {
    	cf = false;
    	a608032282 = 2;
    	a710810301 = 7;
    	a1520738029 = 6; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm169(String input) {
    if(((((cf && (a710810301 == 6)) && (input.equals("F"))) && (a1213256257 == 15)) && (a619470312 == 8))) {
    	cf = false;
    	a200251173 = "i";
    	a1213256257 = 13; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm25(String input) {
    if((cf && (a619470312 == 1))) {
    	calculateOutputm164(input);
    } 
    if(((a619470312 == 3) && cf)) {
    	calculateOutputm165(input);
    } 
    if(((a619470312 == 4) && cf)) {
    	calculateOutputm166(input);
    } 
    if(((a619470312 == 6) && cf)) {
    	calculateOutputm168(input);
    } 
    if((cf && (a619470312 == 8))) {
    	calculateOutputm169(input);
    } 
}
private  void calculateOutputm170(String input) {
    if(((a1213256257 == 16) && ((a710810301 == 6) && ((input.equals("B")) && ((a1708500674.equals("e")) && cf))))) {
    	cf = false;
    	a710810301 = 7;
    	a608032282 = 7;
    	a322699279 = 8; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm171(String input) {
    if(((a710810301 == 6) && (((a1213256257 == 16) && (cf && (input.equals("L")))) && (a1708500674.equals("f"))))) {
    	cf = false;
    	a1708500674 = "h"; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm172(String input) {
    if(((((a1213256257 == 16) && ((a1708500674.equals("g")) && cf)) && (a710810301 == 6)) && (input.equals("L")))) {
    	cf = false;
    	a608032282 = 4;
    	a710810301 = 7;
    	a1410514914 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm173(String input) {
    if((((((a710810301 == 6) && cf) && (input.equals("A"))) && (a1708500674.equals("h"))) && (a1213256257 == 16))) {
    	cf = false;
    	a710810301 = 5;
    	a1926168604 = "h";
    	a175435081 = 8; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm26(String input) {
    if(((a1708500674.equals("e")) && cf)) {
    	calculateOutputm170(input);
    } 
    if((cf && (a1708500674.equals("f")))) {
    	calculateOutputm171(input);
    } 
    if(((a1708500674.equals("g")) && cf)) {
    	calculateOutputm172(input);
    } 
    if((cf && (a1708500674.equals("h")))) {
    	calculateOutputm173(input);
    } 
}
private  void calculateOutputm175(String input) {
    if(((((input.equals("A")) && ((a608032282 == 1) && cf)) && (a710810301 == 7)) && (a554726731.equals("f")))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if((((((a554726731.equals("f")) && cf) && (input.equals("C"))) && (a608032282 == 1)) && (a710810301 == 7))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if((((((a710810301 == 7) && cf) && (a608032282 == 1)) && (a554726731.equals("f"))) && (input.equals("F")))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a710810301 == 7) && ((input.equals("L")) && ((a554726731.equals("f")) && (cf && (a608032282 == 1)))))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm176(String input) {
    if(((input.equals("F")) && ((a554726731.equals("i")) && ((a710810301 == 7) && (cf && (a608032282 == 1)))))) {
    	cf = false;
    	a710810301 = 6;
    	a1213256257 = 12;
    	a1916167078 = 13; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm27(String input) {
    if((cf && (a554726731.equals("f")))) {
    	calculateOutputm175(input);
    } 
    if(((a554726731.equals("i")) && cf)) {
    	calculateOutputm176(input);
    } 
}
private  void calculateOutputm177(String input) {
    if(((((cf && (a710810301 == 7)) && (a1520738029 == 6)) && (input.equals("D"))) && (a608032282 == 2))) {
    	cf = false;
    	a1926168604 = "i";
    	a710810301 = 5;
    	a942522795 = 12; 
    	System.out.println("Q");
    } if((((((a608032282 == 2) && cf) && (a1520738029 == 6)) && (a710810301 == 7)) && (input.equals("E")))) {
    	cf = false;
    	a608032282 = 8;
    	a650139459 = 8; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm178(String input) {
    if((((input.equals("C")) && ((a710810301 == 7) && (cf && (a608032282 == 2)))) && (a1520738029 == 7))) {
    	cf = false;
    	a1012822964 = "e";
    	a710810301 = 10;
    	a947182640 = 14; 
    	System.out.println("V");
    } if((((a608032282 == 2) && (((a1520738029 == 7) && cf) && (a710810301 == 7))) && (input.equals("D")))) {
    	cf = false;
    	a1213256257 = 10;
    	a710810301 = 6;
    	a768322760 = 11; 
    	System.out.println("Y");
    } if(((input.equals("G")) && ((a608032282 == 2) && (((a710810301 == 7) && cf) && (a1520738029 == 7))))) {
    	cf = false;
    	a1213256257 = 9;
    	a710810301 = 6;
    	a966113011 = 12; 
    	System.out.println("T");
    } if(((input.equals("K")) && ((a608032282 == 2) && ((a710810301 == 7) && (cf && (a1520738029 == 7)))))) {
    	cf = false;
    	a1926168604 = "h";
    	a710810301 = 5;
    	a175435081 = 9; 
    	System.out.println("W");
    } if(((a710810301 == 7) && (((a1520738029 == 7) && ((a608032282 == 2) && cf)) && (input.equals("F"))))) {
    	cf = false;
    	a1368342524 = 10;
    	a710810301 = 8;
    	a18652935 = 4; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm179(String input) {
    if(((a710810301 == 7) && ((a608032282 == 2) && ((input.equals("A")) && ((a1520738029 == 9) && cf))))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("S");
    } if(((a608032282 == 2) && ((input.equals("F")) && (((a1520738029 == 9) && cf) && (a710810301 == 7))))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("Q");
    } if(((a608032282 == 2) && ((a710810301 == 7) && ((a1520738029 == 9) && ((input.equals("L")) && cf))))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm180(String input) {
    if(((a710810301 == 7) && ((a1520738029 == 10) && ((a608032282 == 2) && (cf && (input.equals("G"))))))) {
    	cf = false;
    	a1708500674 = "f";
    	a710810301 = 6;
    	a1213256257 = 16; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm182(String input) {
    if(((a608032282 == 2) && (((a710810301 == 7) && (cf && (a1520738029 == 13))) && (input.equals("C"))))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if((((a608032282 == 2) && ((cf && (a1520738029 == 13)) && (a710810301 == 7))) && (input.equals("E")))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a1520738029 == 13) && ((input.equals("G")) && ((cf && (a608032282 == 2)) && (a710810301 == 7))))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm28(String input) {
    if(((a1520738029 == 6) && cf)) {
    	calculateOutputm177(input);
    } 
    if(((a1520738029 == 7) && cf)) {
    	calculateOutputm178(input);
    } 
    if(((a1520738029 == 9) && cf)) {
    	calculateOutputm179(input);
    } 
    if((cf && (a1520738029 == 10))) {
    	calculateOutputm180(input);
    } 
    if(((a1520738029 == 13) && cf)) {
    	calculateOutputm182(input);
    } 
}
private  void calculateOutputm183(String input) {
    if(((((a710810301 == 7) && (cf && (a608032282 == 3))) && (input.equals("F"))) && (a998691543.equals("g")))) {
    	cf = false;
    	a710810301 = 5;
    	a1926168604 = "e";
    	a775360537 = 7; 
    	System.out.println("Z");
    } if(((((cf && (a998691543.equals("g"))) && (a710810301 == 7)) && (a608032282 == 3)) && (input.equals("O")))) {
    	cf = false;
    	a710810301 = 5;
    	a1926168604 = "e";
    	a775360537 = 7; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm184(String input) {
    if((((a710810301 == 7) && (((input.equals("I")) && cf) && (a998691543.equals("h")))) && (a608032282 == 3))) {
    	cf = false;
    	a608032282 = 2;
    	a1520738029 = 6; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm185(String input) {
    if(((a608032282 == 3) && ((input.equals("B")) && ((a710810301 == 7) && (cf && (a998691543.equals("i"))))))) {
    	cf = false;
    	a681527819 = "g";
    	a710810301 = 9;
    	a2068151937 = 12; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm29(String input) {
    if((cf && (a998691543.equals("g")))) {
    	calculateOutputm183(input);
    } 
    if((cf && (a998691543.equals("h")))) {
    	calculateOutputm184(input);
    } 
    if(((a998691543.equals("i")) && cf)) {
    	calculateOutputm185(input);
    } 
}
private  void calculateOutputm186(String input) {
    if(((input.equals("L")) && (((a608032282 == 4) && (cf && (a710810301 == 7))) && (a1410514914 == 7)))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm189(String input) {
    if((((a608032282 == 4) && ((a710810301 == 7) && ((a1410514914 == 11) && cf))) && (input.equals("A")))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("P");
    } if(((a710810301 == 7) && ((a608032282 == 4) && (((a1410514914 == 11) && cf) && (input.equals("J")))))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("P");
    } if(((input.equals("N")) && ((a1410514914 == 11) && ((a710810301 == 7) && ((a608032282 == 4) && cf))))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("P");
    } 
}
private  void calculateOutputm190(String input) {
    if(((a1410514914 == 12) && ((input.equals("M")) && ((a710810301 == 7) && ((a608032282 == 4) && cf))))) {
    	cf = false;
    	a608032282 = 6;
    	a573660885 = 9; 
    	System.out.println("P");
    } 
}
private  void calculateOutputm191(String input) {
    if((((a1410514914 == 14) && ((a710810301 == 7) && ((a608032282 == 4) && cf))) && (input.equals("J")))) {
    	cf = false;
    	a1213256257 = 9;
    	a710810301 = 6;
    	a966113011 = 10; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm30(String input) {
    if(((a1410514914 == 7) && cf)) {
    	calculateOutputm186(input);
    } 
    if((cf && (a1410514914 == 11))) {
    	calculateOutputm189(input);
    } 
    if((cf && (a1410514914 == 12))) {
    	calculateOutputm190(input);
    } 
    if(((a1410514914 == 14) && cf)) {
    	calculateOutputm191(input);
    } 
}
private  void calculateOutputm192(String input) {
    if((((a1410369705 == 1) && (((a608032282 == 5) && cf) && (a710810301 == 7))) && (input.equals("N")))) {
    	cf = false;
    	a710810301 = 3;
    	a647992626 = 7;
    	a1288456936 = 13; 
    	System.out.println("R");
    } 
}
private  void calculateOutputm193(String input) {
    if(((input.equals("I")) && ((a608032282 == 5) && (((a710810301 == 7) && cf) && (a1410369705 == 2))))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if((((input.equals("J")) && (((a608032282 == 5) && cf) && (a1410369705 == 2))) && (a710810301 == 7))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a1410369705 == 2) && ((a608032282 == 5) && (((input.equals("L")) && cf) && (a710810301 == 7))))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm194(String input) {
    if((((((a710810301 == 7) && cf) && (input.equals("I"))) && (a608032282 == 5)) && (a1410369705 == 3))) {
    	cf = false;
    	a710810301 = 10;
    	a1012822964 = "f";
    	a2083228155 = 8; 
    	System.out.println("R");
    } if(((input.equals("K")) && (((cf && (a1410369705 == 3)) && (a608032282 == 5)) && (a710810301 == 7)))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("Y");
    } if((((a1410369705 == 3) && (((a608032282 == 5) && cf) && (input.equals("L")))) && (a710810301 == 7))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("W");
    } if(((a608032282 == 5) && (((a1410369705 == 3) && (cf && (a710810301 == 7))) && (input.equals("O"))))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("P");
    } 
}
private  void calculateOutputm195(String input) {
    if((((a710810301 == 7) && ((input.equals("J")) && (cf && (a608032282 == 5)))) && (a1410369705 == 4))) {
    	cf = false;
    	a1926168604 = "h";
    	a710810301 = 5;
    	a175435081 = 8; 
    	System.out.println("Q");
    } if(((a1410369705 == 4) && ((a608032282 == 5) && (((a710810301 == 7) && cf) && (input.equals("N")))))) {
    	cf = false;
    	a608032282 = 2;
    	a1520738029 = 10; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm196(String input) {
    if(((a608032282 == 5) && (((a1410369705 == 5) && (cf && (a710810301 == 7))) && (input.equals("A"))))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm197(String input) {
    if(((input.equals("E")) && ((a1410369705 == 6) && ((cf && (a710810301 == 7)) && (a608032282 == 5))))) {
    	cf = false;
    	a1926168604 = "i";
    	a710810301 = 5;
    	a942522795 = 13; 
    	System.out.println("S");
    } if((((a1410369705 == 6) && ((cf && (input.equals("N"))) && (a710810301 == 7))) && (a608032282 == 5))) {
    	cf = false;
    	a710810301 = 8;
    	a1163913646 = "g";
    	a1368342524 = 13; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm31(String input) {
    if((cf && (a1410369705 == 1))) {
    	calculateOutputm192(input);
    } 
    if((cf && (a1410369705 == 2))) {
    	calculateOutputm193(input);
    } 
    if((cf && (a1410369705 == 3))) {
    	calculateOutputm194(input);
    } 
    if((cf && (a1410369705 == 4))) {
    	calculateOutputm195(input);
    } 
    if((cf && (a1410369705 == 5))) {
    	calculateOutputm196(input);
    } 
    if((cf && (a1410369705 == 6))) {
    	calculateOutputm197(input);
    } 
}
private  void calculateOutputm198(String input) {
    if(((input.equals("G")) && ((a573660885 == 3) && (((a710810301 == 7) && cf) && (a608032282 == 6))))) {
    	cf = false;
    	a1712019689 = "h";
    	a710810301 = 3;
    	a647992626 = 9; 
    	System.out.println("P");
    } 
}
private  void calculateOutputm202(String input) {
    if(((a608032282 == 6) && (((a710810301 == 7) && (cf && (a573660885 == 8))) && (input.equals("A"))))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("V");
    } if(((((a608032282 == 6) && ((input.equals("D")) && cf)) && (a573660885 == 8)) && (a710810301 == 7))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("R");
    } if(((a608032282 == 6) && ((((input.equals("N")) && cf) && (a573660885 == 8)) && (a710810301 == 7)))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("P");
    } 
}
private  void calculateOutputm203(String input) {
    if((((((input.equals("M")) && cf) && (a608032282 == 6)) && (a573660885 == 9)) && (a710810301 == 7))) {
    	cf = false;
    	a710810301 = 6;
    	a1708500674 = "e";
    	a1213256257 = 16; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm204(String input) {
    if((((a608032282 == 6) && ((input.equals("C")) && ((a710810301 == 7) && cf))) && (a573660885 == 10))) {
    	cf = false;
    	a608032282 = 2;
    	a1520738029 = 6; 
    	System.out.println("Z");
    } if((((a710810301 == 7) && ((cf && (input.equals("E"))) && (a573660885 == 10))) && (a608032282 == 6))) {
    	cf = false;
    	a608032282 = 2;
    	a1520738029 = 6; 
    	System.out.println("Z");
    } if(((input.equals("N")) && (((a573660885 == 10) && ((a608032282 == 6) && cf)) && (a710810301 == 7)))) {
    	cf = false;
    	a608032282 = 2;
    	a1520738029 = 6; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm32(String input) {
    if((cf && (a573660885 == 3))) {
    	calculateOutputm198(input);
    } 
    if(((a573660885 == 8) && cf)) {
    	calculateOutputm202(input);
    } 
    if((cf && (a573660885 == 9))) {
    	calculateOutputm203(input);
    } 
    if((cf && (a573660885 == 10))) {
    	calculateOutputm204(input);
    } 
}
private  void calculateOutputm205(String input) {
    if(((((a608032282 == 7) && (cf && (input.equals("A")))) && (a710810301 == 7)) && (a322699279 == 7))) {
    	cf = false;
    	a1926168604 = "f";
    	a710810301 = 5;
    	a524497834 = 11; 
    	System.out.println("V");
    } if(((input.equals("I")) && (((cf && (a710810301 == 7)) && (a322699279 == 7)) && (a608032282 == 7)))) {
    	cf = false;
    	a710810301 = 6;
    	a1213256257 = 12;
    	a1916167078 = 12; 
    	System.out.println("P");
    } if(((a710810301 == 7) && ((a608032282 == 7) && (((input.equals("K")) && cf) && (a322699279 == 7))))) {
    	cf = false;
    	a710810301 = 4;
    	a460729584 = "i";
    	a878535168 = 14; 
    	System.out.println("R");
    } if(((a608032282 == 7) && (((cf && (a322699279 == 7)) && (a710810301 == 7)) && (input.equals("L"))))) {
    	cf = false;
    	a608032282 = 6;
    	a573660885 = 10; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm206(String input) {
    if(((a710810301 == 7) && ((input.equals("A")) && (((a608032282 == 7) && cf) && (a322699279 == 8))))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("R");
    } if((((a710810301 == 7) && ((a322699279 == 8) && ((a608032282 == 7) && cf))) && (input.equals("E")))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("S");
    } if(((a710810301 == 7) && ((a608032282 == 7) && ((cf && (a322699279 == 8)) && (input.equals("H")))))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("P");
    } if(((((cf && (a710810301 == 7)) && (a322699279 == 8)) && (a608032282 == 7)) && (input.equals("K")))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm207(String input) {
    if(((a608032282 == 7) && (((cf && (input.equals("H"))) && (a322699279 == 9)) && (a710810301 == 7)))) {
    	cf = false;
    	a710810301 = 6;
    	a1213256257 = 12;
    	a1916167078 = 11; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm208(String input) {
    if(((((input.equals("G")) && (cf && (a710810301 == 7))) && (a608032282 == 7)) && (a322699279 == 11))) {
    	cf = false;
    	a2068151937 = 14;
    	a710810301 = 9;
    	a1279395252 = 10; 
    	System.out.println("T");
    } if(((a608032282 == 7) && ((a710810301 == 7) && ((a322699279 == 11) && ((input.equals("L")) && cf))))) {
    	cf = false;
    	a710810301 = 6;
    	a1213256257 = 12;
    	a1916167078 = 10; 
    	System.out.println("Z");
    } if(((((a710810301 == 7) && (cf && (a322699279 == 11))) && (a608032282 == 7)) && (input.equals("N")))) {
    	cf = false;
    	a2068151937 = 13;
    	a710810301 = 9;
    	a1410369705 = 8; 
    	System.out.println("V");
    } if(((((cf && (a322699279 == 11)) && (a710810301 == 7)) && (a608032282 == 7)) && (input.equals("A")))) {
    	cf = false;
    	a460729584 = "e";
    	a710810301 = 4;
    	a599073259 = 15; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm209(String input) {
    if(((a608032282 == 7) && (((cf && (a710810301 == 7)) && (input.equals("D"))) && (a322699279 == 13)))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("S");
    } 
}
private  void calculateOutputm33(String input) {
    if(((a322699279 == 7) && cf)) {
    	calculateOutputm205(input);
    } 
    if(((a322699279 == 8) && cf)) {
    	calculateOutputm206(input);
    } 
    if((cf && (a322699279 == 9))) {
    	calculateOutputm207(input);
    } 
    if(((a322699279 == 11) && cf)) {
    	calculateOutputm208(input);
    } 
    if(((a322699279 == 13) && cf)) {
    	calculateOutputm209(input);
    } 
}
private  void calculateOutputm211(String input) {
    if(((((cf && (a608032282 == 8)) && (a650139459 == 7)) && (input.equals("K"))) && (a710810301 == 7))) {
    	cf = false;
    	a608032282 = 5;
    	a1410369705 = 2; 
    	System.out.println("T");
    } if(((input.equals("O")) && ((a608032282 == 8) && ((cf && (a710810301 == 7)) && (a650139459 == 7))))) {
    	cf = false;
    	a681527819 = "f";
    	a1926168604 = "g";
    	a710810301 = 5; 
    	System.out.println("P");
    } 
}
private  void calculateOutputm213(String input) {
    if((((a650139459 == 9) && ((cf && (a710810301 == 7)) && (a608032282 == 8))) && (input.equals("N")))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm215(String input) {
    if((((a608032282 == 8) && ((a650139459 == 13) && (cf && (a710810301 == 7)))) && (input.equals("A")))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((input.equals("O")) && (((a710810301 == 7) && (cf && (a608032282 == 8))) && (a650139459 == 13)))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm34(String input) {
    if(((a650139459 == 7) && cf)) {
    	calculateOutputm211(input);
    } 
    if(((a650139459 == 9) && cf)) {
    	calculateOutputm213(input);
    } 
    if((cf && (a650139459 == 13))) {
    	calculateOutputm215(input);
    } 
}
private  void calculateOutputm216(String input) {
    if((((a710810301 == 8) && ((cf && (input.equals("C"))) && (a18652935 == 3))) && (a1368342524 == 10))) {
    	cf = false;
    	a710810301 = 10;
    	a1012822964 = "f";
    	a2083228155 = 4; 
    	System.out.println("Z");
    } if((((a1368342524 == 10) && ((cf && (a710810301 == 8)) && (input.equals("I")))) && (a18652935 == 3))) {
    	cf = false;
    	a710810301 = 10;
    	a1012822964 = "f";
    	a2083228155 = 4; 
    	System.out.println("Z");
    } if((((a710810301 == 8) && ((a1368342524 == 10) && (cf && (input.equals("K"))))) && (a18652935 == 3))) {
    	cf = false;
    	a1466212053 = "e";
    	a1368342524 = 11; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm218(String input) {
    if((((a18652935 == 5) && ((cf && (a710810301 == 8)) && (a1368342524 == 10))) && (input.equals("A")))) {
    	cf = false;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("S");
    } 
}
private  void calculateOutputm219(String input) {
    if((((input.equals("L")) && ((a1368342524 == 10) && (cf && (a710810301 == 8)))) && (a18652935 == 6))) {
    	cf = false;
    	a1926168604 = "g";
    	a681527819 = "h";
    	a710810301 = 5; 
    	System.out.println("S");
    } 
}
private  void calculateOutputm221(String input) {
    if(((a1368342524 == 10) && ((a710810301 == 8) && (((a18652935 == 9) && cf) && (input.equals("D")))))) {
    	cf = false;
    	a1012822964 = "f";
    	a710810301 = 10;
    	a2083228155 = 2; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm35(String input) {
    if((cf && (a18652935 == 3))) {
    	calculateOutputm216(input);
    } 
    if((cf && (a18652935 == 5))) {
    	calculateOutputm218(input);
    } 
    if((cf && (a18652935 == 6))) {
    	calculateOutputm219(input);
    } 
    if((cf && (a18652935 == 9))) {
    	calculateOutputm221(input);
    } 
}
private  void calculateOutputm222(String input) {
    if(((input.equals("D")) && ((((a710810301 == 8) && cf) && (a1368342524 == 11)) && (a1466212053.equals("e"))))) {
    	cf = false;
    	a1368342524 = 14;
    	a677112242 = 9; 
    	System.out.println("Y");
    } if(((((a1466212053.equals("e")) && (cf && (a710810301 == 8))) && (input.equals("N"))) && (a1368342524 == 11))) {
    	cf = false;
    	a1012822964 = "f";
    	a710810301 = 10;
    	a2083228155 = 4; 
    	System.out.println("Z");
    } if(((a1368342524 == 11) && ((input.equals("G")) && ((a710810301 == 8) && (cf && (a1466212053.equals("e"))))))) {
    	cf = false;
    	a1163913646 = "e";
    	a1368342524 = 13; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm223(String input) {
    if((((((a710810301 == 8) && cf) && (input.equals("C"))) && (a1466212053.equals("f"))) && (a1368342524 == 11))) {
    	cf = false;
    	a681527819 = "i";
    	a1926168604 = "g";
    	a710810301 = 5; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm225(String input) {
    if((((a710810301 == 8) && ((cf && (input.equals("A"))) && (a1466212053.equals("i")))) && (a1368342524 == 11))) {
    	cf = false;
    	a1204585576 = "f";
    	a710810301 = 9;
    	a2068151937 = 8; 
    	System.out.println("Z");
    } if(((((cf && (a1466212053.equals("i"))) && (a1368342524 == 11)) && (input.equals("I"))) && (a710810301 == 8))) {
    	cf = false;
    	a710810301 = 4;
    	a460729584 = "e";
    	a599073259 = 14; 
    	System.out.println("T");
    } if(((a710810301 == 8) && ((a1466212053.equals("i")) && ((a1368342524 == 11) && ((input.equals("K")) && cf))))) {
    	cf = false;
    	a1368342524 = 16;
    	a470663134 = 12; 
    	System.out.println("T");
    } if(((a1466212053.equals("i")) && ((a1368342524 == 11) && (((input.equals("O")) && cf) && (a710810301 == 8))))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "f";
    	a2068151937 = 11; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm36(String input) {
    if((cf && (a1466212053.equals("e")))) {
    	calculateOutputm222(input);
    } 
    if((cf && (a1466212053.equals("f")))) {
    	calculateOutputm223(input);
    } 
    if(((a1466212053.equals("i")) && cf)) {
    	calculateOutputm225(input);
    } 
}
private  void calculateOutputm226(String input) {
    if((((((a400180708.equals("g")) && cf) && (a710810301 == 8)) && (a1368342524 == 12)) && (input.equals("A")))) {
    	cf = false;
    	a777244229 = "g";
    	a460729584 = "h";
    	a710810301 = 4; 
    	System.out.println("P");
    } 
}
private  void calculateOutputm227(String input) {
    if((((input.equals("M")) && ((a710810301 == 8) && ((a400180708.equals("h")) && cf))) && (a1368342524 == 12))) {
    	cf = false;
    	a1204585576 = "h";
    	a710810301 = 9;
    	a2068151937 = 8; 
    	System.out.println("R");
    } 
}
private  void calculateOutputm228(String input) {
    if(((a710810301 == 8) && ((input.equals("B")) && ((a1368342524 == 12) && ((a400180708.equals("i")) && cf))))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if((((a1368342524 == 12) && (((input.equals("H")) && cf) && (a400180708.equals("i")))) && (a710810301 == 8))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a710810301 == 8) && ((a1368342524 == 12) && ((input.equals("K")) && ((a400180708.equals("i")) && cf))))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm37(String input) {
    if(((a400180708.equals("g")) && cf)) {
    	calculateOutputm226(input);
    } 
    if((cf && (a400180708.equals("h")))) {
    	calculateOutputm227(input);
    } 
    if((cf && (a400180708.equals("i")))) {
    	calculateOutputm228(input);
    } 
}
private  void calculateOutputm230(String input) {
    if((((((a1163913646.equals("f")) && cf) && (a710810301 == 8)) && (a1368342524 == 13)) && (input.equals("M")))) {
    	cf = false;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("Q");
    } if((((a710810301 == 8) && ((a1163913646.equals("f")) && ((a1368342524 == 13) && cf))) && (input.equals("N")))) {
    	cf = false;
    	a710810301 = 6;
    	a1213256257 = 9;
    	a966113011 = 11; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm231(String input) {
    if(((a1163913646.equals("g")) && ((a710810301 == 8) && ((input.equals("C")) && ((a1368342524 == 13) && cf))))) {
    	cf = false;
    	a608032282 = 5;
    	a710810301 = 7;
    	a1410369705 = 6; 
    	System.out.println("Q");
    } if(((a710810301 == 8) && ((((a1368342524 == 13) && cf) && (a1163913646.equals("g"))) && (input.equals("L"))))) {
    	cf = false;
    	a710810301 = 6;
    	a1708500674 = "g";
    	a1213256257 = 16; 
    	System.out.println("P");
    } 
}
private  void calculateOutputm38(String input) {
    if((cf && (a1163913646.equals("f")))) {
    	calculateOutputm230(input);
    } 
    if(((a1163913646.equals("g")) && cf)) {
    	calculateOutputm231(input);
    } 
}
private  void calculateOutputm236(String input) {
    if(((a1368342524 == 14) && (((cf && (input.equals("K"))) && (a677112242 == 9)) && (a710810301 == 8)))) {
    	cf = false;
    	a1466212053 = "f";
    	a1368342524 = 11; 
    	System.out.println("S");
    } 
}
private  void calculateOutputm39(String input) {
    if(((a677112242 == 9) && cf)) {
    	calculateOutputm236(input);
    } 
}
private  void calculateOutputm241(String input) {
    if(((((cf && (a599073259 == 12)) && (input.equals("C"))) && (a1368342524 == 15)) && (a710810301 == 8))) {
    	cf = false;
    	a710810301 = 5;
    	a1926168604 = "e";
    	a775360537 = 11; 
    	System.out.println("Q");
    } if(((input.equals("L")) && (((a599073259 == 12) && (cf && (a1368342524 == 15))) && (a710810301 == 8)))) {
    	cf = false;
    	a1368342524 = 10;
    	a18652935 = 3; 
    	System.out.println("Y");
    } if(((((input.equals("M")) && (cf && (a599073259 == 12))) && (a710810301 == 8)) && (a1368342524 == 15))) {
    	cf = false;
    	a710810301 = 3;
    	a647992626 = 6;
    	a1500959558 = 6; 
    	System.out.println("V");
    } if(((a1368342524 == 15) && ((a599073259 == 12) && ((cf && (a710810301 == 8)) && (input.equals("N")))))) {
    	cf = false;
    	a1012822964 = "h";
    	a710810301 = 10;
    	a129815901 = 6; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm242(String input) {
    if(((input.equals("G")) && (((cf && (a599073259 == 13)) && (a710810301 == 8)) && (a1368342524 == 15)))) {
    	cf = false;
    	a777244229 = "e";
    	a460729584 = "h";
    	a710810301 = 4; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm243(String input) {
    if(((((input.equals("K")) && (cf && (a1368342524 == 15))) && (a599073259 == 14)) && (a710810301 == 8))) {
    	cf = false;
    	a608032282 = 5;
    	a710810301 = 7;
    	a1410369705 = 4; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm40(String input) {
    if(((a599073259 == 12) && cf)) {
    	calculateOutputm241(input);
    } 
    if((cf && (a599073259 == 13))) {
    	calculateOutputm242(input);
    } 
    if(((a599073259 == 14) && cf)) {
    	calculateOutputm243(input);
    } 
}
private  void calculateOutputm244(String input) {
    if((((a710810301 == 8) && ((a470663134 == 5) && ((input.equals("C")) && cf))) && (a1368342524 == 16))) {
    	cf = false;
    	a710810301 = 9;
    	a2068151937 = 13;
    	a1410369705 = 5; 
    	System.out.println("Z");
    } if(((((input.equals("N")) && ((a1368342524 == 16) && cf)) && (a470663134 == 5)) && (a710810301 == 8))) {
    	cf = false;
    	a608032282 = 7;
    	a710810301 = 7;
    	a322699279 = 11; 
    	System.out.println("T");
    } if(((a1368342524 == 16) && ((a470663134 == 5) && (((a710810301 == 8) && cf) && (input.equals("B")))))) {
    	cf = false;
    	a710810301 = 10;
    	a1012822964 = "h";
    	a129815901 = 12; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm246(String input) {
    if((((input.equals("C")) && ((a1368342524 == 16) && (cf && (a710810301 == 8)))) && (a470663134 == 7))) {
    	cf = false;
    	a460729584 = "h";
    	a777244229 = "i";
    	a710810301 = 4; 
    	System.out.println("Z");
    } if(((a470663134 == 7) && (((a710810301 == 8) && (cf && (input.equals("E")))) && (a1368342524 == 16)))) {
    	cf = false;
    	a1213256257 = 12;
    	a710810301 = 6;
    	a1916167078 = 14; 
    	System.out.println("Y");
    } if(((a1368342524 == 16) && (((a710810301 == 8) && (cf && (a470663134 == 7))) && (input.equals("K"))))) {
    	cf = false;
    	a1368342524 = 10;
    	a18652935 = 5; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm249(String input) {
    if(((((cf && (a1368342524 == 16)) && (a470663134 == 10)) && (input.equals("F"))) && (a710810301 == 8))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm251(String input) {
    if(((((cf && (a1368342524 == 16)) && (input.equals("B"))) && (a710810301 == 8)) && (a470663134 == 12))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((((cf && (input.equals("F"))) && (a470663134 == 12)) && (a710810301 == 8)) && (a1368342524 == 16))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a470663134 == 12) && ((input.equals("I")) && (((a710810301 == 8) && cf) && (a1368342524 == 16))))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((input.equals("N")) && ((a1368342524 == 16) && ((cf && (a470663134 == 12)) && (a710810301 == 8))))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm41(String input) {
    if((cf && (a470663134 == 5))) {
    	calculateOutputm244(input);
    } 
    if((cf && (a470663134 == 7))) {
    	calculateOutputm246(input);
    } 
    if((cf && (a470663134 == 10))) {
    	calculateOutputm249(input);
    } 
    if(((a470663134 == 12) && cf)) {
    	calculateOutputm251(input);
    } 
}
private  void calculateOutputm252(String input) {
    if(((a191699712 == 7) && (((cf && (input.equals("D"))) && (a1368342524 == 17)) && (a710810301 == 8)))) {
    	cf = false;
    	a1012822964 = "e";
    	a710810301 = 10;
    	a947182640 = 13; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm253(String input) {
    if((((a1368342524 == 17) && ((input.equals("J")) && ((a710810301 == 8) && cf))) && (a191699712 == 8))) {
    	cf = false;
    	a710810301 = 3;
    	a1712019689 = "g";
    	a647992626 = 9; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm254(String input) {
    if(((a1368342524 == 17) && (((a710810301 == 8) && ((a191699712 == 9) && cf)) && (input.equals("H"))))) {
    	cf = false;
    	a710810301 = 3;
    	a1712019689 = "i";
    	a647992626 = 9; 
    	System.out.println("R");
    } if(((((a1368342524 == 17) && (cf && (a710810301 == 8))) && (input.equals("K"))) && (a191699712 == 9))) {
    	cf = false;
    	a400180708 = "h";
    	a1368342524 = 12; 
    	System.out.println("P");
    } if(((a191699712 == 9) && (((a710810301 == 8) && ((input.equals("E")) && cf)) && (a1368342524 == 17)))) {
    	cf = false;
    	a710810301 = 6;
    	a1213256257 = 10;
    	a768322760 = 14; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm255(String input) {
    if(((a191699712 == 10) && ((((input.equals("D")) && cf) && (a1368342524 == 17)) && (a710810301 == 8)))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((input.equals("E")) && ((a191699712 == 10) && ((a1368342524 == 17) && (cf && (a710810301 == 8)))))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a191699712 == 10) && ((a710810301 == 8) && (((a1368342524 == 17) && cf) && (input.equals("G")))))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a1368342524 == 17) && (((input.equals("N")) && (cf && (a191699712 == 10))) && (a710810301 == 8)))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm256(String input) {
    if((((input.equals("C")) && (((a710810301 == 8) && cf) && (a1368342524 == 17))) && (a191699712 == 11))) {
    	cf = false;
    	a1926168604 = "g";
    	a681527819 = "g";
    	a710810301 = 5; 
    	System.out.println("U");
    } if(((input.equals("I")) && ((a191699712 == 11) && (((a1368342524 == 17) && cf) && (a710810301 == 8))))) {
    	cf = false;
    	a710810301 = 9;
    	a2068151937 = 13;
    	a1410369705 = 3; 
    	System.out.println("P");
    } 
}
private  void calculateOutputm258(String input) {
    if(((a1368342524 == 17) && ((((a710810301 == 8) && cf) && (a191699712 == 13)) && (input.equals("A"))))) {
    	cf = false;
    	a608032282 = 2;
    	a710810301 = 7;
    	a1520738029 = 6; 
    	System.out.println("Z");
    } if(((a710810301 == 8) && ((input.equals("H")) && ((cf && (a191699712 == 13)) && (a1368342524 == 17))))) {
    	cf = false;
    	a710810301 = 7;
    	a608032282 = 2;
    	a1520738029 = 6; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm42(String input) {
    if(((a191699712 == 7) && cf)) {
    	calculateOutputm252(input);
    } 
    if(((a191699712 == 8) && cf)) {
    	calculateOutputm253(input);
    } 
    if(((a191699712 == 9) && cf)) {
    	calculateOutputm254(input);
    } 
    if((cf && (a191699712 == 10))) {
    	calculateOutputm255(input);
    } 
    if(((a191699712 == 11) && cf)) {
    	calculateOutputm256(input);
    } 
    if(((a191699712 == 13) && cf)) {
    	calculateOutputm258(input);
    } 
}
private  void calculateOutputm260(String input) {
    if((((((a710810301 == 9) && cf) && (a1204585576.equals("f"))) && (a2068151937 == 8)) && (input.equals("A")))) {
    	cf = false;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a710810301 == 9) && ((a2068151937 == 8) && ((cf && (input.equals("C"))) && (a1204585576.equals("f")))))) {
    	cf = false;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if((((a710810301 == 9) && ((a2068151937 == 8) && (cf && (input.equals("I"))))) && (a1204585576.equals("f")))) {
    	cf = false;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((input.equals("N")) && ((a1204585576.equals("f")) && ((a2068151937 == 8) && (cf && (a710810301 == 9)))))) {
    	cf = false;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm261(String input) {
    if(((a710810301 == 9) && (((a2068151937 == 8) && (cf && (input.equals("E")))) && (a1204585576.equals("g"))))) {
    	cf = false;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if((((a710810301 == 9) && ((cf && (a2068151937 == 8)) && (a1204585576.equals("g")))) && (input.equals("J")))) {
    	cf = false;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm262(String input) {
    if(((a2068151937 == 8) && (((cf && (a1204585576.equals("h"))) && (input.equals("A"))) && (a710810301 == 9)))) {
    	cf = false;
    	a710810301 = 7;
    	a608032282 = 5;
    	a1410369705 = 3; 
    	System.out.println("V");
    } if(((a2068151937 == 8) && ((a710810301 == 9) && ((cf && (a1204585576.equals("h"))) && (input.equals("H")))))) {
    	cf = false;
    	a2068151937 = 14;
    	a1279395252 = 5; 
    	System.out.println("W");
    } if(((input.equals("I")) && ((a1204585576.equals("h")) && ((cf && (a710810301 == 9)) && (a2068151937 == 8))))) {
    	cf = false;
    	a1213256257 = 10;
    	a710810301 = 6;
    	a768322760 = 7; 
    	System.out.println("P");
    } 
}
private  void calculateOutputm43(String input) {
    if((cf && (a1204585576.equals("f")))) {
    	calculateOutputm260(input);
    } 
    if(((a1204585576.equals("g")) && cf)) {
    	calculateOutputm261(input);
    } 
    if((cf && (a1204585576.equals("h")))) {
    	calculateOutputm262(input);
    } 
}
private  void calculateOutputm263(String input) {
    if((((input.equals("D")) && ((a1404083158.equals("e")) && ((a2068151937 == 9) && cf))) && (a710810301 == 9))) {
    	cf = false;
    	a710810301 = 7;
    	a608032282 = 8;
    	a650139459 = 7; 
    	System.out.println("V");
    } if(((a2068151937 == 9) && ((a710810301 == 9) && ((cf && (a1404083158.equals("e"))) && (input.equals("N")))))) {
    	cf = false;
    	a1368342524 = 17;
    	a710810301 = 8;
    	a191699712 = 11; 
    	System.out.println("Y");
    } if(((a1404083158.equals("e")) && ((a2068151937 == 9) && ((cf && (a710810301 == 9)) && (input.equals("O")))))) {
    	cf = false;
    	a1213256257 = 15;
    	a710810301 = 6;
    	a619470312 = 8; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm266(String input) {
    if((((input.equals("J")) && ((a2068151937 == 9) && ((a1404083158.equals("i")) && cf))) && (a710810301 == 9))) {
    	cf = false;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm44(String input) {
    if(((a1404083158.equals("e")) && cf)) {
    	calculateOutputm263(input);
    } 
    if((cf && (a1404083158.equals("i")))) {
    	calculateOutputm266(input);
    } 
}
private  void calculateOutputm268(String input) {
    if(((a948320041.equals("e")) && ((a2068151937 == 11) && ((cf && (a710810301 == 9)) && (input.equals("D")))))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 5; 
    	System.out.println("P");
    } if(((((a2068151937 == 11) && ((a710810301 == 9) && cf)) && (input.equals("N"))) && (a948320041.equals("e")))) {
    	cf = false;
    	a1213256257 = 12;
    	a710810301 = 6;
    	a1916167078 = 15; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm269(String input) {
    if(((input.equals("D")) && ((a948320041.equals("f")) && ((cf && (a710810301 == 9)) && (a2068151937 == 11))))) {
    	cf = false;
    	a948320041 = "e"; 
    	System.out.println("Q");
    } if((((input.equals("N")) && ((a710810301 == 9) && (cf && (a948320041.equals("f"))))) && (a2068151937 == 11))) {
    	cf = false;
    	a948320041 = "e"; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm270(String input) {
    if(((input.equals("M")) && ((a2068151937 == 11) && (((a948320041.equals("g")) && cf) && (a710810301 == 9))))) {
    	cf = false;
    	a948320041 = "e"; 
    	System.out.println("Q");
    } if((((a948320041.equals("g")) && ((a2068151937 == 11) && ((input.equals("O")) && cf))) && (a710810301 == 9))) {
    	cf = false;
    	a948320041 = "e"; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm271(String input) {
    if((((a948320041.equals("h")) && (((input.equals("D")) && cf) && (a2068151937 == 11))) && (a710810301 == 9))) {
    	cf = false;
    	a710810301 = 5;
    	a1926168604 = "e";
    	a775360537 = 7; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm46(String input) {
    if(((a948320041.equals("e")) && cf)) {
    	calculateOutputm268(input);
    } 
    if((cf && (a948320041.equals("f")))) {
    	calculateOutputm269(input);
    } 
    if((cf && (a948320041.equals("g")))) {
    	calculateOutputm270(input);
    } 
    if((cf && (a948320041.equals("h")))) {
    	calculateOutputm271(input);
    } 
}
private  void calculateOutputm274(String input) {
    if(((a2068151937 == 12) && ((input.equals("M")) && (((a681527819.equals("g")) && cf) && (a710810301 == 9))))) {
    	cf = false;
    	a2068151937 = 14;
    	a1279395252 = 3; 
    	System.out.println("R");
    } 
}
private  void calculateOutputm47(String input) {
    if(((a681527819.equals("g")) && cf)) {
    	calculateOutputm274(input);
    } 
}
private  void calculateOutputm276(String input) {
    if(((((a710810301 == 9) && (cf && (a2068151937 == 13))) && (input.equals("F"))) && (a1410369705 == 1))) {
    	cf = false;
    	a608032282 = 2;
    	a710810301 = 7;
    	a1520738029 = 6; 
    	System.out.println("Z");
    } if((((input.equals("G")) && ((a2068151937 == 13) && ((a710810301 == 9) && cf))) && (a1410369705 == 1))) {
    	cf = false;
    	a608032282 = 2;
    	a710810301 = 7;
    	a1520738029 = 6; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm277(String input) {
    if(((a1410369705 == 2) && ((input.equals("A")) && ((a710810301 == 9) && (cf && (a2068151937 == 13)))))) {
    	cf = false;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a1410369705 == 2) && ((a710810301 == 9) && (((a2068151937 == 13) && cf) && (input.equals("F")))))) {
    	cf = false;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a710810301 == 9) && ((a1410369705 == 2) && ((cf && (a2068151937 == 13)) && (input.equals("I")))))) {
    	cf = false;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm278(String input) {
    if(((a710810301 == 9) && (((a1410369705 == 3) && ((input.equals("K")) && cf)) && (a2068151937 == 13)))) {
    	cf = false;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm279(String input) {
    if(((input.equals("A")) && ((((a710810301 == 9) && cf) && (a1410369705 == 5)) && (a2068151937 == 13)))) {
    	cf = false;
    	a1368342524 = 17;
    	a710810301 = 8;
    	a191699712 = 9; 
    	System.out.println("Q");
    } if(((a2068151937 == 13) && ((input.equals("D")) && ((cf && (a710810301 == 9)) && (a1410369705 == 5))))) {
    	cf = false;
    	a710810301 = 7;
    	a608032282 = 2;
    	a1520738029 = 6; 
    	System.out.println("P");
    } if((((a710810301 == 9) && (((a2068151937 == 13) && cf) && (input.equals("F")))) && (a1410369705 == 5))) {
    	cf = false;
    	a710810301 = 8;
    	a1466212053 = "e";
    	a1368342524 = 11; 
    	System.out.println("T");
    } if((((a2068151937 == 13) && ((cf && (input.equals("J"))) && (a1410369705 == 5))) && (a710810301 == 9))) {
    	cf = false;
    	a710810301 = 6;
    	a1213256257 = 9;
    	a966113011 = 11; 
    	System.out.println("V");
    } if(((a1410369705 == 5) && ((a710810301 == 9) && ((a2068151937 == 13) && ((input.equals("I")) && cf))))) {
    	cf = false;
    	a710810301 = 10;
    	a1012822964 = "i";
    	a1280269169 = 12; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm281(String input) {
    if(((a2068151937 == 13) && (((input.equals("D")) && ((a710810301 == 9) && cf)) && (a1410369705 == 8)))) {
    	cf = false;
    	a2068151937 = 14;
    	a1279395252 = 8; 
    	System.out.println("P");
    } if((((((a2068151937 == 13) && cf) && (input.equals("L"))) && (a1410369705 == 8)) && (a710810301 == 9))) {
    	cf = false;
    	a2068151937 = 14;
    	a1279395252 = 9; 
    	System.out.println("R");
    } if(((a2068151937 == 13) && (((input.equals("F")) && (cf && (a710810301 == 9))) && (a1410369705 == 8)))) {
    	cf = false;
    	a1213256257 = 15;
    	a710810301 = 6;
    	a619470312 = 5; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm48(String input) {
    if((cf && (a1410369705 == 1))) {
    	calculateOutputm276(input);
    } 
    if(((a1410369705 == 2) && cf)) {
    	calculateOutputm277(input);
    } 
    if((cf && (a1410369705 == 3))) {
    	calculateOutputm278(input);
    } 
    if((cf && (a1410369705 == 5))) {
    	calculateOutputm279(input);
    } 
    if(((a1410369705 == 8) && cf)) {
    	calculateOutputm281(input);
    } 
}
private  void calculateOutputm282(String input) {
    if(((((cf && (a2068151937 == 14)) && (input.equals("D"))) && (a1279395252 == 3)) && (a710810301 == 9))) {
    	cf = false;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if((((a2068151937 == 14) && (((a1279395252 == 3) && cf) && (a710810301 == 9))) && (input.equals("G")))) {
    	cf = false;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((((input.equals("K")) && ((a2068151937 == 14) && cf)) && (a1279395252 == 3)) && (a710810301 == 9))) {
    	cf = false;
    	a710810301 = 7;
    	a608032282 = 4;
    	a1410514914 = 11; 
    	System.out.println("Q");
    } if(((a2068151937 == 14) && (((cf && (input.equals("N"))) && (a1279395252 == 3)) && (a710810301 == 9)))) {
    	cf = false;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm283(String input) {
    if(((a1279395252 == 4) && (((a710810301 == 9) && (cf && (input.equals("L")))) && (a2068151937 == 14)))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm284(String input) {
    if((((input.equals("E")) && ((cf && (a2068151937 == 14)) && (a710810301 == 9))) && (a1279395252 == 5))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("T");
    } if((((a1279395252 == 5) && ((input.equals("G")) && (cf && (a2068151937 == 14)))) && (a710810301 == 9))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("P");
    } if((((((a2068151937 == 14) && cf) && (input.equals("O"))) && (a1279395252 == 5)) && (a710810301 == 9))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("R");
    } 
}
private  void calculateOutputm287(String input) {
    if(((input.equals("G")) && ((a2068151937 == 14) && ((cf && (a1279395252 == 8)) && (a710810301 == 9))))) {
    	cf = false;
    	a1368342524 = 17;
    	a710810301 = 8;
    	a191699712 = 8; 
    	System.out.println("R");
    } 
}
private  void calculateOutputm288(String input) {
    if((((input.equals("B")) && ((a1279395252 == 9) && ((a2068151937 == 14) && cf))) && (a710810301 == 9))) {
    	cf = false;
    	a710810301 = 7;
    	a998691543 = "i";
    	a608032282 = 3; 
    	System.out.println("Q");
    } if(((a1279395252 == 9) && ((input.equals("F")) && ((cf && (a2068151937 == 14)) && (a710810301 == 9))))) {
    	cf = false;
    	a1213256257 = 15;
    	a710810301 = 6;
    	a619470312 = 1; 
    	System.out.println("Z");
    } if(((input.equals("M")) && ((((a2068151937 == 14) && cf) && (a710810301 == 9)) && (a1279395252 == 9)))) {
    	cf = false;
    	a710810301 = 6;
    	a1213256257 = 9;
    	a966113011 = 6; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm289(String input) {
    if(((input.equals("G")) && ((((a710810301 == 9) && cf) && (a1279395252 == 10)) && (a2068151937 == 14)))) {
    	cf = false;
    	a710810301 = 10;
    	a1012822964 = "i";
    	a1280269169 = 10; 
    	System.out.println("W");
    } if(((a2068151937 == 14) && ((a1279395252 == 10) && ((a710810301 == 9) && ((input.equals("L")) && cf))))) {
    	cf = false;
    	a1368342524 = 15;
    	a710810301 = 8;
    	a599073259 = 13; 
    	System.out.println("Q");
    } if(((a2068151937 == 14) && ((((a710810301 == 9) && cf) && (a1279395252 == 10)) && (input.equals("A"))))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 10;
    	a18652935 = 8; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm49(String input) {
    if((cf && (a1279395252 == 3))) {
    	calculateOutputm282(input);
    } 
    if((cf && (a1279395252 == 4))) {
    	calculateOutputm283(input);
    } 
    if((cf && (a1279395252 == 5))) {
    	calculateOutputm284(input);
    } 
    if(((a1279395252 == 8) && cf)) {
    	calculateOutputm287(input);
    } 
    if((cf && (a1279395252 == 9))) {
    	calculateOutputm288(input);
    } 
    if((cf && (a1279395252 == 10))) {
    	calculateOutputm289(input);
    } 
}
private  void calculateOutputm292(String input) {
    if(((a2068151937 == 15) && (((a710810301 == 9) && (cf && (a150836410.equals("i")))) && (input.equals("M"))))) {
    	cf = false;
    	a710810301 = 7;
    	a608032282 = 6;
    	a573660885 = 3; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm50(String input) {
    if(((a150836410.equals("i")) && cf)) {
    	calculateOutputm292(input);
    } 
}
private  void calculateOutputm295(String input) {
    if(((a1012822964.equals("e")) && (((cf && (a710810301 == 10)) && (input.equals("B"))) && (a947182640 == 13)))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a710810301 == 10) && ((a1012822964.equals("e")) && ((cf && (a947182640 == 13)) && (input.equals("H")))))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm296(String input) {
    if(((a1012822964.equals("e")) && ((input.equals("A")) && ((cf && (a947182640 == 14)) && (a710810301 == 10))))) {
    	cf = false;
    	a2068151937 = 13;
    	a710810301 = 9;
    	a1410369705 = 2; 
    	System.out.println("Y");
    } if((((((a710810301 == 10) && cf) && (a947182640 == 14)) && (a1012822964.equals("e"))) && (input.equals("F")))) {
    	cf = false;
    	a1213256257 = 10;
    	a710810301 = 6;
    	a768322760 = 12; 
    	System.out.println("R");
    } 
}
private  void calculateOutputm51(String input) {
    if((cf && (a947182640 == 13))) {
    	calculateOutputm295(input);
    } 
    if(((a947182640 == 14) && cf)) {
    	calculateOutputm296(input);
    } 
}
private  void calculateOutputm299(String input) {
    if(((a2083228155 == 2) && ((((a710810301 == 10) && cf) && (input.equals("A"))) && (a1012822964.equals("f"))))) {
    	cf = false;
    	a1213256257 = 15;
    	a710810301 = 6;
    	a619470312 = 4; 
    	System.out.println("R");
    } if((((input.equals("H")) && ((cf && (a2083228155 == 2)) && (a710810301 == 10))) && (a1012822964.equals("f")))) {
    	cf = false;
    	a2068151937 = 14;
    	a710810301 = 9;
    	a1279395252 = 4; 
    	System.out.println("Q");
    } if(((a1012822964.equals("f")) && (((cf && (a710810301 == 10)) && (a2083228155 == 2)) && (input.equals("L"))))) {
    	cf = false;
    	a948320041 = "g";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("P");
    } 
}
private  void calculateOutputm301(String input) {
    if(((a2083228155 == 4) && ((a710810301 == 10) && ((a1012822964.equals("f")) && (cf && (input.equals("G"))))))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 7; 
    	System.out.println("U");
    } if(((a710810301 == 10) && ((a2083228155 == 4) && ((cf && (a1012822964.equals("f"))) && (input.equals("J")))))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 15;
    	a599073259 = 12; 
    	System.out.println("Q");
    } if(((((a710810301 == 10) && ((input.equals("K")) && cf)) && (a1012822964.equals("f"))) && (a2083228155 == 4))) {
    	cf = false;
    	a710810301 = 8;
    	a1466212053 = "i";
    	a1368342524 = 11; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm304(String input) {
    if(((input.equals("A")) && ((a710810301 == 10) && ((cf && (a1012822964.equals("f"))) && (a2083228155 == 8))))) {
    	cf = false;
    	a710810301 = 9;
    	a2068151937 = 13;
    	a1410369705 = 5; 
    	System.out.println("Z");
    } if(((a2083228155 == 8) && ((a1012822964.equals("f")) && ((input.equals("C")) && (cf && (a710810301 == 10)))))) {
    	cf = false;
    	a710810301 = 9;
    	a2068151937 = 13;
    	a1410369705 = 5; 
    	System.out.println("Z");
    } if(((input.equals("L")) && (((a2083228155 == 8) && (cf && (a710810301 == 10))) && (a1012822964.equals("f"))))) {
    	cf = false;
    	a2068151937 = 13;
    	a710810301 = 9;
    	a1410369705 = 5; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm52(String input) {
    if(((a2083228155 == 2) && cf)) {
    	calculateOutputm299(input);
    } 
    if(((a2083228155 == 4) && cf)) {
    	calculateOutputm301(input);
    } 
    if(((a2083228155 == 8) && cf)) {
    	calculateOutputm304(input);
    } 
}
private  void calculateOutputm308(String input) {
    if(((a1012822964.equals("h")) && ((a710810301 == 10) && ((input.equals("F")) && (cf && (a129815901 == 6)))))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("W");
    } if(((((a1012822964.equals("h")) && ((a129815901 == 6) && cf)) && (a710810301 == 10)) && (input.equals("J")))) {
    	cf = false;
    	a1368342524 = 16;
    	a710810301 = 8;
    	a470663134 = 5; 
    	System.out.println("S");
    } 
}
private  void calculateOutputm311(String input) {
    if(((a710810301 == 10) && ((input.equals("A")) && ((a1012822964.equals("h")) && (cf && (a129815901 == 10)))))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm312(String input) {
    if((((((a129815901 == 11) && cf) && (a710810301 == 10)) && (input.equals("K"))) && (a1012822964.equals("h")))) {
    	cf = false;
    	a647992626 = 6;
    	a710810301 = 3;
    	a1500959558 = 9; 
    	System.out.println("Y");
    } if(((a1012822964.equals("h")) && ((input.equals("L")) && ((a710810301 == 10) && ((a129815901 == 11) && cf))))) {
    	cf = false;
    	a1404083158 = "i";
    	a710810301 = 9;
    	a2068151937 = 9; 
    	System.out.println("W");
    } if((((((a1012822964.equals("h")) && cf) && (input.equals("O"))) && (a129815901 == 11)) && (a710810301 == 10))) {
    	cf = false;
    	a710810301 = 8;
    	a1368342524 = 16;
    	a470663134 = 10; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm54(String input) {
    if((cf && (a129815901 == 6))) {
    	calculateOutputm308(input);
    } 
    if((cf && (a129815901 == 10))) {
    	calculateOutputm311(input);
    } 
    if((cf && (a129815901 == 11))) {
    	calculateOutputm312(input);
    } 
}
private  void calculateOutputm315(String input) {
    if(((((cf && (a1012822964.equals("i"))) && (input.equals("A"))) && (a710810301 == 10)) && (a1280269169 == 9))) {
    	cf = false;
    	a948320041 = "e";
    	a710810301 = 9;
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if((((((a1012822964.equals("i")) && cf) && (input.equals("D"))) && (a1280269169 == 9)) && (a710810301 == 10))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a1012822964.equals("i")) && (((input.equals("I")) && (cf && (a710810301 == 10))) && (a1280269169 == 9)))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } if(((a710810301 == 10) && (((input.equals("O")) && ((a1012822964.equals("i")) && cf)) && (a1280269169 == 9)))) {
    	cf = false;
    	a710810301 = 9;
    	a948320041 = "e";
    	a2068151937 = 11; 
    	System.out.println("Q");
    } 
}
private  void calculateOutputm316(String input) {
    if(((((a710810301 == 10) && ((input.equals("L")) && cf)) && (a1012822964.equals("i"))) && (a1280269169 == 10))) {
    	cf = false;
    	a681527819 = "e";
    	a460729584 = "f";
    	a710810301 = 4; 
    	System.out.println("Z");
    } if((((a710810301 == 10) && ((cf && (a1280269169 == 10)) && (input.equals("M")))) && (a1012822964.equals("i")))) {
    	cf = false;
    	a710810301 = 3;
    	a647992626 = 6;
    	a1500959558 = 5; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm55(String input) {
    if((cf && (a1280269169 == 9))) {
    	calculateOutputm315(input);
    } 
    if((cf && (a1280269169 == 10))) {
    	calculateOutputm316(input);
    } 
}



public  void calculateOutput(String input) {
 	cf = true;
    if(((a710810301 == 3) && cf)) {
    	if(((a647992626 == 2) && cf)) {
    		calculateOutputm1(input);
    	} 
    	if((cf && (a647992626 == 4))) {
    		calculateOutputm3(input);
    	} 
    	if(((a647992626 == 5) && cf)) {
    		calculateOutputm4(input);
    	} 
    	if(((a647992626 == 6) && cf)) {
    		calculateOutputm5(input);
    	} 
    	if((cf && (a647992626 == 7))) {
    		calculateOutputm6(input);
    	} 
    	if(((a647992626 == 8) && cf)) {
    		calculateOutputm7(input);
    	} 
    	if((cf && (a647992626 == 9))) {
    		calculateOutputm8(input);
    	} 
    } 
    if(((a710810301 == 4) && cf)) {
    	if((cf && (a460729584.equals("e")))) {
    		calculateOutputm9(input);
    	} 
    	if((cf && (a460729584.equals("f")))) {
    		calculateOutputm10(input);
    	} 
    	if(((a460729584.equals("g")) && cf)) {
    		calculateOutputm11(input);
    	} 
    	if((cf && (a460729584.equals("h")))) {
    		calculateOutputm12(input);
    	} 
    	if((cf && (a460729584.equals("i")))) {
    		calculateOutputm13(input);
    	} 
    } 
    if(((a710810301 == 5) && cf)) {
    	if(((a1926168604.equals("e")) && cf)) {
    		calculateOutputm14(input);
    	} 
    	if((cf && (a1926168604.equals("f")))) {
    		calculateOutputm15(input);
    	} 
    	if((cf && (a1926168604.equals("g")))) {
    		calculateOutputm16(input);
    	} 
    	if((cf && (a1926168604.equals("h")))) {
    		calculateOutputm17(input);
    	} 
    	if(((a1926168604.equals("i")) && cf)) {
    		calculateOutputm18(input);
    	} 
    } 
    if(((a710810301 == 6) && cf)) {
    	if(((a1213256257 == 9) && cf)) {
    		calculateOutputm19(input);
    	} 
    	if((cf && (a1213256257 == 10))) {
    		calculateOutputm20(input);
    	} 
    	if(((a1213256257 == 11) && cf)) {
    		calculateOutputm21(input);
    	} 
    	if(((a1213256257 == 12) && cf)) {
    		calculateOutputm22(input);
    	} 
    	if((cf && (a1213256257 == 13))) {
    		calculateOutputm23(input);
    	} 
    	if(((a1213256257 == 14) && cf)) {
    		calculateOutputm24(input);
    	} 
    	if((cf && (a1213256257 == 15))) {
    		calculateOutputm25(input);
    	} 
    	if((cf && (a1213256257 == 16))) {
    		calculateOutputm26(input);
    	} 
    } 
    if((cf && (a710810301 == 7))) {
    	if((cf && (a608032282 == 1))) {
    		calculateOutputm27(input);
    	} 
    	if((cf && (a608032282 == 2))) {
    		calculateOutputm28(input);
    	} 
    	if((cf && (a608032282 == 3))) {
    		calculateOutputm29(input);
    	} 
    	if(((a608032282 == 4) && cf)) {
    		calculateOutputm30(input);
    	} 
    	if((cf && (a608032282 == 5))) {
    		calculateOutputm31(input);
    	} 
    	if(((a608032282 == 6) && cf)) {
    		calculateOutputm32(input);
    	} 
    	if(((a608032282 == 7) && cf)) {
    		calculateOutputm33(input);
    	} 
    	if(((a608032282 == 8) && cf)) {
    		calculateOutputm34(input);
    	} 
    } 
    if((cf && (a710810301 == 8))) {
    	if((cf && (a1368342524 == 10))) {
    		calculateOutputm35(input);
    	} 
    	if((cf && (a1368342524 == 11))) {
    		calculateOutputm36(input);
    	} 
    	if((cf && (a1368342524 == 12))) {
    		calculateOutputm37(input);
    	} 
    	if((cf && (a1368342524 == 13))) {
    		calculateOutputm38(input);
    	} 
    	if((cf && (a1368342524 == 14))) {
    		calculateOutputm39(input);
    	} 
    	if(((a1368342524 == 15) && cf)) {
    		calculateOutputm40(input);
    	} 
    	if(((a1368342524 == 16) && cf)) {
    		calculateOutputm41(input);
    	} 
    	if(((a1368342524 == 17) && cf)) {
    		calculateOutputm42(input);
    	} 
    } 
    if(((a710810301 == 9) && cf)) {
    	if(((a2068151937 == 8) && cf)) {
    		calculateOutputm43(input);
    	} 
    	if(((a2068151937 == 9) && cf)) {
    		calculateOutputm44(input);
    	} 
    	if(((a2068151937 == 11) && cf)) {
    		calculateOutputm46(input);
    	} 
    	if((cf && (a2068151937 == 12))) {
    		calculateOutputm47(input);
    	} 
    	if((cf && (a2068151937 == 13))) {
    		calculateOutputm48(input);
    	} 
    	if((cf && (a2068151937 == 14))) {
    		calculateOutputm49(input);
    	} 
    	if((cf && (a2068151937 == 15))) {
    		calculateOutputm50(input);
    	} 
    } 
    if(((a710810301 == 10) && cf)) {
    	if(((a1012822964.equals("e")) && cf)) {
    		calculateOutputm51(input);
    	} 
    	if(((a1012822964.equals("f")) && cf)) {
    		calculateOutputm52(input);
    	} 
    	if((cf && (a1012822964.equals("h")))) {
    		calculateOutputm54(input);
    	} 
    	if((cf && (a1012822964.equals("i")))) {
    		calculateOutputm55(input);
    	} 
    } 

    errorCheck();
    if(cf)
    	throw new IllegalArgumentException("Current state has no transition for this input!");
}


public static void main(String[] args) throws Exception {
	// init system and input reader
	Problem14 eca = new Problem14();

	// main i/o-loop
	while(true) {
		//read input
		String input = stdin.readLine();

		 if((input.equals("K")) && (input.equals("G")) && (input.equals("E")) && (input.equals("H")) && (input.equals("A")) && (input.equals("N")) && (input.equals("O")) && (input.equals("B")) && (input.equals("I")) && (input.equals("C")) && (input.equals("D")) && (input.equals("J")) && (input.equals("M")) && (input.equals("L")) && (input.equals("F")))
			throw new IllegalArgumentException("Current state has no transition for this input!");
		try {
			//operate eca engine output = 
			eca.calculateOutput(input);
		} catch(IllegalArgumentException e) {
			System.err.println("Invalid input: " + e.getMessage());
		}
	}
}
}