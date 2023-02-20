import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem11 {
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

	private String[] inputs = {"D","C","J","B","I","F","A","H","G","E"};

	public String a780728121 = "h";
	public String a1360225377 = "g";
	public String a729595174 = "f";
	public String a270033534 = "i";
	public int a553986020 = 6;
	public int a419289115 = 10;
	public String a61085062 = "h";
	public String a76449788 = "h";
	public int a1209890889 = 9;
	public int a547511656 = 11;
	public String a1304806974 = "i";
	public String a2007907442 = "f";
	public int a2128642633 = 12;
	public String a1643269988 = "i";
	public int a168638684 = 15;
	public String a894128990 = "g";
	public String a572079232 = "i";
	public int a1537379265 = 14;
	public String a1980207818 = "f";
	public int a1735071167 = 14;
	public int a2021551447 = 8;
	public int a553209804 = 5;
	public int a1392217129 = 12;
	public int a823314445 = 9;
	public String a512217640 = "e";
	public String a278675587 = "g";
	public int a71487061 = 15;
	public String a1353794423 = "f";
	public boolean cf = true;
	public int a1370900715 = 10;
	public int a521273111 = 4;
	public int a1023470345 = 9;
	public int a919251806 = 5;
	public int a399501280 = 8;
	public String a1283870923 = "i";
	public int a1824730115 = 13;
	public int a1575755525 = 10;
	public String a990334020 = "e";
	public String a1367961664 = "f";
	public int a1565409750 = 10;

	private void errorCheck() {
	    if((((a1392217129 == 10) && (a1304806974.equals("i"))) && (a1537379265 == 15))){
	    	cf = false;
	    	Errors.__VERIFIER_error(0);
	    }
	    if((((a270033534.equals("h")) && (a894128990.equals("g"))) && (a1537379265 == 12))){
	    	cf = false;
	    	Errors.__VERIFIER_error(1);
	    }
	    if((((a2021551447 == 6) && (a71487061 == 15)) && (a1537379265 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(2);
	    }
	    if((((a553209804 == 8) && (a919251806 == 8)) && (a1537379265 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(3);
	    }
	    if((((a547511656 == 7) && (a168638684 == 8)) && (a1537379265 == 14))){
	    	cf = false;
	    	Errors.__VERIFIER_error(4);
	    }
	    if((((a1209890889 == 10) && (a1735071167 == 13)) && (a1537379265 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(5);
	    }
	    if((((a1209890889 == 11) && (a1735071167 == 13)) && (a1537379265 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(6);
	    }
	    if((((a894128990.equals("e")) && (a780728121.equals("h"))) && (a1537379265 == 13))){
	    	cf = false;
	    	Errors.__VERIFIER_error(7);
	    }
	    if((((a76449788.equals("f")) && (a71487061 == 12)) && (a1537379265 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(8);
	    }
	    if((((a76449788.equals("e")) && (a71487061 == 12)) && (a1537379265 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(9);
	    }
	    if((((a1367961664.equals("g")) && (a168638684 == 13)) && (a1537379265 == 14))){
	    	cf = false;
	    	Errors.__VERIFIER_error(10);
	    }
	    if((((a1023470345 == 16) && (a1735071167 == 10)) && (a1537379265 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(11);
	    }
	    if((((a553209804 == 7) && (a919251806 == 8)) && (a1537379265 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(12);
	    }
	    if((((a2021551447 == 5) && (a71487061 == 15)) && (a1537379265 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(13);
	    }
	    if((((a823314445 == 16) && (a1735071167 == 9)) && (a1537379265 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(14);
	    }
	    if((((a521273111 == 9) && (a1735071167 == 11)) && (a1537379265 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(15);
	    }
	    if((((a1575755525 == 7) && (a894128990.equals("h"))) && (a1537379265 == 12))){
	    	cf = false;
	    	Errors.__VERIFIER_error(16);
	    }
	    if((((a2021551447 == 3) && (a71487061 == 15)) && (a1537379265 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(17);
	    }
	    if((((a1304806974.equals("f")) && (a894128990.equals("e"))) && (a1537379265 == 12))){
	    	cf = false;
	    	Errors.__VERIFIER_error(18);
	    }
	    if((((a1980207818.equals("e")) && (a71487061 == 11)) && (a1537379265 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(19);
	    }
	    if((((a1643269988.equals("f")) && (a71487061 == 13)) && (a1537379265 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(20);
	    }
	    if((((a1023470345 == 9) && (a1735071167 == 10)) && (a1537379265 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(21);
	    }
	    if((((a61085062.equals("i")) && (a1360225377.equals("g"))) && (a1537379265 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(22);
	    }
	    if((((a2128642633 == 9) && (a168638684 == 11)) && (a1537379265 == 14))){
	    	cf = false;
	    	Errors.__VERIFIER_error(23);
	    }
	    if((((a894128990.equals("f")) && (a780728121.equals("h"))) && (a1537379265 == 13))){
	    	cf = false;
	    	Errors.__VERIFIER_error(24);
	    }
	    if((((a1575755525 == 10) && (a894128990.equals("h"))) && (a1537379265 == 12))){
	    	cf = false;
	    	Errors.__VERIFIER_error(25);
	    }
	    if((((a521273111 == 2) && (a1735071167 == 11)) && (a1537379265 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(26);
	    }
	    if((((a1643269988.equals("g")) && (a71487061 == 14)) && (a1537379265 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(27);
	    }
	    if((((a1209890889 == 9) && (a1735071167 == 13)) && (a1537379265 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(28);
	    }
	    if((((a1370900715 == 15) && (a780728121.equals("e"))) && (a1537379265 == 13))){
	    	cf = false;
	    	Errors.__VERIFIER_error(29);
	    }
	    if((((a1824730115 == 15) && (a168638684 == 15)) && (a1537379265 == 14))){
	    	cf = false;
	    	Errors.__VERIFIER_error(30);
	    }
	    if((((a1392217129 == 12) && (a1360225377.equals("e"))) && (a1537379265 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(31);
	    }
	    if((((a2128642633 == 11) && (a168638684 == 11)) && (a1537379265 == 14))){
	    	cf = false;
	    	Errors.__VERIFIER_error(32);
	    }
	    if((((a1392217129 == 14) && (a1304806974.equals("i"))) && (a1537379265 == 15))){
	    	cf = false;
	    	Errors.__VERIFIER_error(33);
	    }
	    if((((a1980207818.equals("f")) && (a71487061 == 11)) && (a1537379265 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(34);
	    }
	    if((((a1643269988.equals("h")) && (a71487061 == 14)) && (a1537379265 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(35);
	    }
	    if((((a419289115 == 14) && (a168638684 == 10)) && (a1537379265 == 14))){
	    	cf = false;
	    	Errors.__VERIFIER_error(36);
	    }
	    if((((a1980207818.equals("g")) && (a71487061 == 11)) && (a1537379265 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(37);
	    }
	    if((((a547511656 == 11) && (a168638684 == 8)) && (a1537379265 == 14))){
	    	cf = false;
	    	Errors.__VERIFIER_error(38);
	    }
	    if((((a894128990.equals("f")) && (a780728121.equals("i"))) && (a1537379265 == 13))){
	    	cf = false;
	    	Errors.__VERIFIER_error(39);
	    }
	    if((((a1360225377.equals("e")) && (a71487061 == 10)) && (a1537379265 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(40);
	    }
	    if((((a553986020 == 11) && (a1360225377.equals("f"))) && (a1537379265 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(41);
	    }
	    if((((a729595174.equals("e")) && (a168638684 == 14)) && (a1537379265 == 14))){
	    	cf = false;
	    	Errors.__VERIFIER_error(42);
	    }
	    if((((a419289115 == 10) && (a780728121.equals("g"))) && (a1537379265 == 13))){
	    	cf = false;
	    	Errors.__VERIFIER_error(43);
	    }
	    if((((a547511656 == 6) && (a168638684 == 8)) && (a1537379265 == 14))){
	    	cf = false;
	    	Errors.__VERIFIER_error(44);
	    }
	    if((((a419289115 == 14) && (a780728121.equals("g"))) && (a1537379265 == 13))){
	    	cf = false;
	    	Errors.__VERIFIER_error(45);
	    }
	    if((((a1392217129 == 17) && (a1304806974.equals("i"))) && (a1537379265 == 15))){
	    	cf = false;
	    	Errors.__VERIFIER_error(46);
	    }
	    if((((a1367961664.equals("i")) && (a1304806974.equals("e"))) && (a1537379265 == 15))){
	    	cf = false;
	    	Errors.__VERIFIER_error(47);
	    }
	    if((((a399501280 == 9) && (a1304806974.equals("h"))) && (a1537379265 == 15))){
	    	cf = false;
	    	Errors.__VERIFIER_error(48);
	    }
	    if((((a278675587.equals("e")) && (a1360225377.equals("h"))) && (a1537379265 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(49);
	    }
	    if((((a1283870923.equals("h")) && (a894128990.equals("f"))) && (a1537379265 == 12))){
	    	cf = false;
	    	Errors.__VERIFIER_error(50);
	    }
	    if((((a729595174.equals("i")) && (a168638684 == 14)) && (a1537379265 == 14))){
	    	cf = false;
	    	Errors.__VERIFIER_error(51);
	    }
	    if((((a512217640.equals("f")) && (a1735071167 == 12)) && (a1537379265 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(52);
	    }
	    if((((a399501280 == 12) && (a1304806974.equals("h"))) && (a1537379265 == 15))){
	    	cf = false;
	    	Errors.__VERIFIER_error(53);
	    }
	    if((((a1353794423.equals("i")) && (a919251806 == 6)) && (a1537379265 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(54);
	    }
	    if((((a547511656 == 11) && (a919251806 == 10)) && (a1537379265 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(55);
	    }
	    if((((a399501280 == 8) && (a1304806974.equals("h"))) && (a1537379265 == 15))){
	    	cf = false;
	    	Errors.__VERIFIER_error(56);
	    }
	    if((((a553986020 == 10) && (a1360225377.equals("f"))) && (a1537379265 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(57);
	    }
	    if((((a1367961664.equals("h")) && (a1304806974.equals("e"))) && (a1537379265 == 15))){
	    	cf = false;
	    	Errors.__VERIFIER_error(58);
	    }
	    if((((a1209890889 == 6) && (a1735071167 == 13)) && (a1537379265 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(59);
	    }
	    if((((a823314445 == 12) && (a1735071167 == 9)) && (a1537379265 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(60);
	    }
	    if((((a419289115 == 12) && (a168638684 == 10)) && (a1537379265 == 14))){
	    	cf = false;
	    	Errors.__VERIFIER_error(61);
	    }
	    if((((a1643269988.equals("g")) && (a71487061 == 13)) && (a1537379265 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(62);
	    }
	    if((((a1353794423.equals("g")) && (a168638684 == 12)) && (a1537379265 == 14))){
	    	cf = false;
	    	Errors.__VERIFIER_error(63);
	    }
	    if((((a894128990.equals("g")) && (a1304806974.equals("g"))) && (a1537379265 == 15))){
	    	cf = false;
	    	Errors.__VERIFIER_error(64);
	    }
	    if((((a1575755525 == 8) && (a894128990.equals("h"))) && (a1537379265 == 12))){
	    	cf = false;
	    	Errors.__VERIFIER_error(65);
	    }
	    if((((a572079232.equals("f")) && (a919251806 == 4)) && (a1537379265 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(66);
	    }
	    if((((a399501280 == 13) && (a1304806974.equals("h"))) && (a1537379265 == 15))){
	    	cf = false;
	    	Errors.__VERIFIER_error(67);
	    }
	    if((((a419289115 == 13) && (a168638684 == 10)) && (a1537379265 == 14))){
	    	cf = false;
	    	Errors.__VERIFIER_error(68);
	    }
	    if((((a547511656 == 12) && (a168638684 == 8)) && (a1537379265 == 14))){
	    	cf = false;
	    	Errors.__VERIFIER_error(69);
	    }
	    if((((a1392217129 == 15) && (a1304806974.equals("i"))) && (a1537379265 == 15))){
	    	cf = false;
	    	Errors.__VERIFIER_error(70);
	    }
	    if((((a1370900715 == 9) && (a780728121.equals("e"))) && (a1537379265 == 13))){
	    	cf = false;
	    	Errors.__VERIFIER_error(71);
	    }
	    if((((a1392217129 == 17) && (a1360225377.equals("e"))) && (a1537379265 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(72);
	    }
	    if((((a1575755525 == 9) && (a894128990.equals("h"))) && (a1537379265 == 12))){
	    	cf = false;
	    	Errors.__VERIFIER_error(73);
	    }
	    if((((a76449788.equals("g")) && (a71487061 == 12)) && (a1537379265 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(74);
	    }
	    if((((a553209804 == 6) && (a919251806 == 8)) && (a1537379265 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(75);
	    }
	    if((((a1643269988.equals("i")) && (a919251806 == 5)) && (a1537379265 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(76);
	    }
	    if((((a823314445 == 11) && (a1735071167 == 9)) && (a1537379265 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(77);
	    }
	    if((((a1023470345 == 11) && (a1735071167 == 15)) && (a1537379265 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(78);
	    }
	    if((((a894128990.equals("g")) && (a780728121.equals("h"))) && (a1537379265 == 13))){
	    	cf = false;
	    	Errors.__VERIFIER_error(79);
	    }
	    if((((a1643269988.equals("h")) && (a71487061 == 13)) && (a1537379265 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(80);
	    }
	    if((((a1367961664.equals("e")) && (a1304806974.equals("e"))) && (a1537379265 == 15))){
	    	cf = false;
	    	Errors.__VERIFIER_error(81);
	    }
	    if((((a1283870923.equals("g")) && (a894128990.equals("f"))) && (a1537379265 == 12))){
	    	cf = false;
	    	Errors.__VERIFIER_error(82);
	    }
	    if((((a2021551447 == 7) && (a71487061 == 15)) && (a1537379265 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(83);
	    }
	    if((((a894128990.equals("f")) && (a1735071167 == 14)) && (a1537379265 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(84);
	    }
	    if((((a1565409750 == 9) && (a168638684 == 9)) && (a1537379265 == 14))){
	    	cf = false;
	    	Errors.__VERIFIER_error(85);
	    }
	    if((((a1283870923.equals("e")) && (a894128990.equals("f"))) && (a1537379265 == 12))){
	    	cf = false;
	    	Errors.__VERIFIER_error(86);
	    }
	    if((((a990334020.equals("e")) && (a71487061 == 17)) && (a1537379265 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(87);
	    }
	    if((((a512217640.equals("h")) && (a1735071167 == 12)) && (a1537379265 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(88);
	    }
	    if((((a1367961664.equals("f")) && (a168638684 == 13)) && (a1537379265 == 14))){
	    	cf = false;
	    	Errors.__VERIFIER_error(89);
	    }
	    if((((a894128990.equals("i")) && (a780728121.equals("h"))) && (a1537379265 == 13))){
	    	cf = false;
	    	Errors.__VERIFIER_error(90);
	    }
	    if((((a1643269988.equals("i")) && (a71487061 == 14)) && (a1537379265 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(91);
	    }
	    if((((a1643269988.equals("e")) && (a71487061 == 13)) && (a1537379265 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(92);
	    }
	    if((((a894128990.equals("h")) && (a780728121.equals("i"))) && (a1537379265 == 13))){
	    	cf = false;
	    	Errors.__VERIFIER_error(93);
	    }
	    if((((a1023470345 == 12) && (a1735071167 == 10)) && (a1537379265 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(94);
	    }
	    if((((a1370900715 == 13) && (a780728121.equals("e"))) && (a1537379265 == 13))){
	    	cf = false;
	    	Errors.__VERIFIER_error(95);
	    }
	    if((((a1353794423.equals("h")) && (a168638684 == 12)) && (a1537379265 == 14))){
	    	cf = false;
	    	Errors.__VERIFIER_error(96);
	    }
	    if((((a1370900715 == 10) && (a780728121.equals("e"))) && (a1537379265 == 13))){
	    	cf = false;
	    	Errors.__VERIFIER_error(97);
	    }
	    if((((a553986020 == 8) && (a1360225377.equals("f"))) && (a1537379265 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(98);
	    }
	    if((((a547511656 == 8) && (a919251806 == 10)) && (a1537379265 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(99);
	    }
	}private  void calculateOutputm46(String input) {
    if(((((a1360225377.equals("e")) && ((a1537379265 == 8) && cf)) && (a1392217129 == 14)) && (input.equals("J")))) {
    	cf = false;
    	a780728121 = "i";
    	a894128990 = "e";
    	a1537379265 = 13; 
    	System.out.println("Y");
    } if(((((cf && (a1360225377.equals("e"))) && (input.equals("A"))) && (a1537379265 == 8)) && (a1392217129 == 14))) {
    	cf = false;
    	a1537379265 = 10;
    	a1643269988 = "g";
    	a71487061 = 13; 
    	System.out.println("R");
    } 
}
private  void calculateOutputm1(String input) {
    if((cf && (a1392217129 == 14))) {
    	calculateOutputm46(input);
    } 
}
private  void calculateOutputm51(String input) {
    if(((((input.equals("B")) && ((a1360225377.equals("g")) && cf)) && (a61085062.equals("f"))) && (a1537379265 == 8))) {
    	cf = false;
    	a1367961664 = "g";
    	a1304806974 = "e";
    	a1537379265 = 15; 
    	System.out.println("W");
    } if(((input.equals("F")) && ((a1360225377.equals("g")) && ((a61085062.equals("f")) && ((a1537379265 == 8) && cf))))) {
    	cf = false;
    	a894128990 = "h";
    	a1537379265 = 11;
    	a1735071167 = 14; 
    	System.out.println("Q");
    } if(((input.equals("H")) && (((a1537379265 == 8) && ((a61085062.equals("f")) && cf)) && (a1360225377.equals("g"))))) {
    	cf = false;
    	a1367961664 = "g";
    	a1304806974 = "e";
    	a1537379265 = 15; 
    	System.out.println("W");
    } if(((((cf && (a1537379265 == 8)) && (a1360225377.equals("g"))) && (a61085062.equals("f"))) && (input.equals("E")))) {
    	cf = false;
    	a1537379265 = 11;
    	a1735071167 = 11;
    	a521273111 = 2; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm3(String input) {
    if((cf && (a61085062.equals("f")))) {
    	calculateOutputm51(input);
    } 
}
private  void calculateOutputm54(String input) {
    if(((a278675587.equals("f")) && ((input.equals("D")) && ((a1537379265 == 8) && ((a1360225377.equals("h")) && cf))))) {
    	cf = false;
    	a780728121 = "i";
    	a894128990 = "e";
    	a1537379265 = 13; 
    	System.out.println("Y");
    } if(((a1360225377.equals("h")) && (((a278675587.equals("f")) && (cf && (input.equals("A")))) && (a1537379265 == 8)))) {
    	cf = false;
    	a71487061 = 15;
    	a1537379265 = 10;
    	a2021551447 = 5; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm55(String input) {
    if((((a278675587.equals("h")) && (((a1537379265 == 8) && cf) && (input.equals("F")))) && (a1360225377.equals("h")))) {
    	cf = false;
    	a1537379265 = 14;
    	a1353794423 = "i";
    	a168638684 = 12; 
    	System.out.println("R");
    } if((((input.equals("B")) && ((a1360225377.equals("h")) && ((a1537379265 == 8) && cf))) && (a278675587.equals("h")))) {
    	cf = false;
    	a894128990 = "f";
    	a780728121 = "h";
    	a1537379265 = 13; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm4(String input) {
    if((cf && (a278675587.equals("f")))) {
    	calculateOutputm54(input);
    } 
    if((cf && (a278675587.equals("h")))) {
    	calculateOutputm55(input);
    } 
}
private  void calculateOutputm62(String input) {
    if(((a553209804 == 9) && ((input.equals("D")) && ((a919251806 == 8) && ((a1537379265 == 9) && cf))))) {
    	cf = false;
    	a894128990 = "e";
    	a780728121 = "i";
    	a1537379265 = 13; 
    	System.out.println("Y");
    } if(((((a553209804 == 9) && ((a919251806 == 8) && cf)) && (a1537379265 == 9)) && (input.equals("J")))) {
    	cf = false;
    	a1367961664 = "g";
    	a1304806974 = "e";
    	a1537379265 = 15; 
    	System.out.println("W");
    } if(((a919251806 == 8) && (((cf && (input.equals("H"))) && (a1537379265 == 9)) && (a553209804 == 9)))) {
    	cf = false;
    	a512217640 = "f";
    	a1537379265 = 11;
    	a1735071167 = 12; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm8(String input) {
    if(((a553209804 == 9) && cf)) {
    	calculateOutputm62(input);
    } 
}
private  void calculateOutputm65(String input) {
    if(((((cf && (a2007907442.equals("g"))) && (input.equals("I"))) && (a919251806 == 11)) && (a1537379265 == 9))) {
    	cf = false;
    	a1304806974 = "e";
    	a1367961664 = "g";
    	a1537379265 = 15; 
    	System.out.println("Q");
    } if(((a1537379265 == 9) && (((cf && (a2007907442.equals("g"))) && (input.equals("C"))) && (a919251806 == 11)))) {
    	cf = false;
    	a1537379265 = 13;
    	a780728121 = "e";
    	a1370900715 = 13; 
    	System.out.println("X");
    } 
}
private  void calculateOutputm10(String input) {
    if(((a2007907442.equals("g")) && cf)) {
    	calculateOutputm65(input);
    } 
}
private  void calculateOutputm85(String input) {
    if(((a71487061 == 17) && (((a990334020.equals("h")) && ((a1537379265 == 10) && cf)) && (input.equals("F"))))) {
    	cf = false;
    	a1353794423 = "i";
    	a1537379265 = 14;
    	a168638684 = 12; 
    	System.out.println("R");
    } if(((a1537379265 == 10) && ((a990334020.equals("h")) && ((input.equals("J")) && (cf && (a71487061 == 17)))))) {
    	cf = false;
    	a1304806974 = "h";
    	a894128990 = "e";
    	a1537379265 = 12; 
    	System.out.println("Z");
    } if(((((cf && (a1537379265 == 10)) && (a990334020.equals("h"))) && (a71487061 == 17)) && (input.equals("A")))) {
    	cf = false;
    	a1537379265 = 9;
    	a919251806 = 8;
    	a553209804 = 6; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm17(String input) {
    if(((a990334020.equals("h")) && cf)) {
    	calculateOutputm85(input);
    } 
}
private  void calculateOutputm88(String input) {
    if((((a1537379265 == 11) && ((cf && (a823314445 == 15)) && (a1735071167 == 9))) && (input.equals("A")))) {
    	cf = false;
    	a1735071167 = 11;
    	a521273111 = 4; 
    	System.out.println("Z");
    } if(((a1735071167 == 9) && (((cf && (a823314445 == 15)) && (input.equals("B"))) && (a1537379265 == 11)))) {
    	cf = false;
    	a1304806974 = "g";
    	a894128990 = "i";
    	a1537379265 = 15; 
    	System.out.println("X");
    } if(((input.equals("H")) && ((((a1735071167 == 9) && cf) && (a823314445 == 15)) && (a1537379265 == 11)))) {
    	cf = false;
    	a1643269988 = "i";
    	a1537379265 = 10;
    	a71487061 = 14; 
    	System.out.println("R");
    } 
}
private  void calculateOutputm18(String input) {
    if(((a823314445 == 15) && cf)) {
    	calculateOutputm88(input);
    } 
}
private  void calculateOutputm94(String input) {
    if(((input.equals("A")) && ((a521273111 == 4) && ((a1537379265 == 11) && (cf && (a1735071167 == 11)))))) {
    	cf = false;
    	a1537379265 = 14;
    	a168638684 = 15;
    	a1824730115 = 12; 
    	System.out.println("X");
    } if(((a521273111 == 4) && ((input.equals("G")) && ((cf && (a1537379265 == 11)) && (a1735071167 == 11))))) {
    	cf = false;
    	a1735071167 = 9;
    	a823314445 = 15; 
    	System.out.println("Q");
    } if((((a1537379265 == 11) && (((a1735071167 == 11) && cf) && (input.equals("J")))) && (a521273111 == 4))) {
    	cf = false;
    	a1537379265 = 10;
    	a990334020 = "h";
    	a71487061 = 17; 
    	System.out.println("Z");
    } if(((a1537379265 == 11) && (((a1735071167 == 11) && ((a521273111 == 4) && cf)) && (input.equals("D"))))) {
    	cf = false;
    	a1537379265 = 15;
    	a1304806974 = "i";
    	a1392217129 = 10; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm95(String input) {
    if(((a1735071167 == 11) && ((a1537379265 == 11) && ((a521273111 == 8) && (cf && (input.equals("J"))))))) {
    	cf = false;
    	a168638684 = 15;
    	a1537379265 = 14;
    	a1824730115 = 12; 
    	System.out.println("X");
    } if((((input.equals("C")) && (((a1537379265 == 11) && cf) && (a1735071167 == 11))) && (a521273111 == 8))) {
    	cf = false;
    	a1283870923 = "g";
    	a894128990 = "f";
    	a1537379265 = 12; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm20(String input) {
    if(((a521273111 == 4) && cf)) {
    	calculateOutputm94(input);
    } 
    if(((a521273111 == 8) && cf)) {
    	calculateOutputm95(input);
    } 
}
private  void calculateOutputm104(String input) {
    if(((input.equals("A")) && ((a894128990.equals("h")) && (((a1735071167 == 14) && cf) && (a1537379265 == 11))))) {
    	cf = false;
    	a1360225377 = "g";
    	a61085062 = "f";
    	a1537379265 = 8; 
    	System.out.println("Q");
    } if(((a894128990.equals("h")) && (((a1735071167 == 14) && ((input.equals("I")) && cf)) && (a1537379265 == 11)))) {
    	cf = false;
    	a278675587 = "f";
    	a1360225377 = "h";
    	a1537379265 = 8; 
    	System.out.println("R");
    } if(((a1537379265 == 11) && (((a894128990.equals("h")) && ((input.equals("J")) && cf)) && (a1735071167 == 14)))) {
    	cf = false;
    	a894128990 = "e";
    	a780728121 = "i";
    	a1537379265 = 13; 
    	System.out.println("Y");
    } if(((((cf && (a894128990.equals("h"))) && (input.equals("B"))) && (a1537379265 == 11)) && (a1735071167 == 14))) {
    	cf = false;
    	a780728121 = "i";
    	a894128990 = "f";
    	a1537379265 = 13; 
    	System.out.println("R");
    } 
}
private  void calculateOutputm23(String input) {
    if(((a894128990.equals("h")) && cf)) {
    	calculateOutputm104(input);
    } 
}
private  void calculateOutputm107(String input) {
    if(((a1537379265 == 12) && ((((a1304806974.equals("h")) && cf) && (input.equals("F"))) && (a894128990.equals("e"))))) {
    	cf = false;
    	 
    	System.out.println("Z");
    } if(((input.equals("H")) && ((a1537379265 == 12) && ((a894128990.equals("e")) && ((a1304806974.equals("h")) && cf))))) {
    	cf = false;
    	a990334020 = "h";
    	a1537379265 = 10;
    	a71487061 = 17; 
    	System.out.println("S");
    } if(((a894128990.equals("e")) && (((a1537379265 == 12) && ((a1304806974.equals("h")) && cf)) && (input.equals("G"))))) {
    	cf = false;
    	a1537379265 = 14;
    	a729595174 = "e";
    	a168638684 = 14; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm25(String input) {
    if(((a1304806974.equals("h")) && cf)) {
    	calculateOutputm107(input);
    } 
}
private  void calculateOutputm126(String input) {
    if((((a780728121.equals("i")) && ((input.equals("E")) && (cf && (a894128990.equals("e"))))) && (a1537379265 == 13))) {
    	cf = false;
    	a1537379265 = 14;
    	a168638684 = 10;
    	a419289115 = 7; 
    	System.out.println("X");
    } if((((((input.equals("F")) && cf) && (a894128990.equals("e"))) && (a1537379265 == 13)) && (a780728121.equals("i")))) {
    	cf = false;
    	a61085062 = "f";
    	a1360225377 = "g";
    	a1537379265 = 8; 
    	System.out.println("Q");
    } if(((a894128990.equals("e")) && ((a780728121.equals("i")) && ((input.equals("I")) && (cf && (a1537379265 == 13)))))) {
    	cf = false;
    	a278675587 = "h";
    	a1360225377 = "h";
    	a1537379265 = 8; 
    	System.out.println("S");
    } if(((a780728121.equals("i")) && ((input.equals("H")) && (((a1537379265 == 13) && cf) && (a894128990.equals("e")))))) {
    	cf = false;
    	a76449788 = "e";
    	a1537379265 = 10;
    	a71487061 = 12; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm32(String input) {
    if(((a894128990.equals("e")) && cf)) {
    	calculateOutputm126(input);
    } 
}
private  void calculateOutputm134(String input) {
    if(((a168638684 == 10) && (((cf && (input.equals("B"))) && (a419289115 == 7)) && (a1537379265 == 14)))) {
    	cf = false;
    	a168638684 = 15;
    	a1824730115 = 12; 
    	System.out.println("X");
    } if((((a168638684 == 10) && (((a1537379265 == 14) && cf) && (a419289115 == 7))) && (input.equals("H")))) {
    	cf = false;
    	a919251806 = 8;
    	a1537379265 = 9;
    	a553209804 = 9; 
    	System.out.println("O");
    } if(((a419289115 == 7) && ((a168638684 == 10) && (((input.equals("D")) && cf) && (a1537379265 == 14))))) {
    	cf = false;
    	a1537379265 = 11;
    	a1735071167 = 10;
    	a1023470345 = 12; 
    	System.out.println("X");
    } 
}
private  void calculateOutputm35(String input) {
    if((cf && (a419289115 == 7))) {
    	calculateOutputm134(input);
    } 
}
private  void calculateOutputm142(String input) {
    if(((input.equals("G")) && ((a1537379265 == 14) && ((a168638684 == 12) && ((a1353794423.equals("i")) && cf))))) {
    	cf = false;
    	 
    	System.out.println("R");
    } if(((a168638684 == 12) && (((input.equals("F")) && (cf && (a1537379265 == 14))) && (a1353794423.equals("i"))))) {
    	cf = false;
    	a780728121 = "i";
    	a894128990 = "h";
    	a1537379265 = 13; 
    	System.out.println("R");
    } 
}
private  void calculateOutputm37(String input) {
    if((cf && (a1353794423.equals("i")))) {
    	calculateOutputm142(input);
    } 
}
private  void calculateOutputm147(String input) {
    if(((a1824730115 == 12) && (((a168638684 == 15) && ((input.equals("F")) && cf)) && (a1537379265 == 14)))) {
    	cf = false;
    	a1537379265 = 11;
    	a1735071167 = 11;
    	a521273111 = 4; 
    	System.out.println("Z");
    } if(((a168638684 == 15) && ((a1537379265 == 14) && ((a1824730115 == 12) && (cf && (input.equals("I"))))))) {
    	cf = false;
    	a894128990 = "i";
    	a1304806974 = "g";
    	a1537379265 = 15; 
    	System.out.println("W");
    } if((((((a1537379265 == 14) && cf) && (input.equals("J"))) && (a168638684 == 15)) && (a1824730115 == 12))) {
    	cf = false;
    	a1353794423 = "i";
    	a168638684 = 12; 
    	System.out.println("U");
    } if(((((a1537379265 == 14) && ((a1824730115 == 12) && cf)) && (input.equals("H"))) && (a168638684 == 15))) {
    	cf = false;
    	a1537379265 = 11;
    	a1735071167 = 9;
    	a823314445 = 12; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm148(String input) {
    if((((a168638684 == 15) && ((cf && (input.equals("B"))) && (a1824730115 == 13))) && (a1537379265 == 14))) {
    	cf = false;
    	a1824730115 = 12; 
    	System.out.println("V");
    } if(((input.equals("E")) && (((cf && (a1537379265 == 14)) && (a1824730115 == 13)) && (a168638684 == 15)))) {
    	cf = false;
    	a1537379265 = 9;
    	a2007907442 = "g";
    	a919251806 = 11; 
    	System.out.println("V");
    } if(((a1537379265 == 14) && ((((a168638684 == 15) && cf) && (a1824730115 == 13)) && (input.equals("F"))))) {
    	cf = false;
    	a1360225377 = "e";
    	a1537379265 = 8;
    	a1392217129 = 14; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm40(String input) {
    if(((a1824730115 == 12) && cf)) {
    	calculateOutputm147(input);
    } 
    if(((a1824730115 == 13) && cf)) {
    	calculateOutputm148(input);
    } 
}
private  void calculateOutputm151(String input) {
    if((((((a1537379265 == 15) && cf) && (input.equals("D"))) && (a1304806974.equals("e"))) && (a1367961664.equals("g")))) {
    	cf = false;
    	 
    	System.out.println("W");
    } if(((a1537379265 == 15) && ((input.equals("F")) && ((a1304806974.equals("e")) && (cf && (a1367961664.equals("g"))))))) {
    	cf = false;
    	a1304806974 = "h";
    	a399501280 = 9; 
    	System.out.println("X");
    } 
}
private  void calculateOutputm41(String input) {
    if(((a1367961664.equals("g")) && cf)) {
    	calculateOutputm151(input);
    } 
}
private  void calculateOutputm155(String input) {
    if((((a894128990.equals("i")) && ((input.equals("B")) && ((a1304806974.equals("g")) && cf))) && (a1537379265 == 15))) {
    	cf = false;
    	a1735071167 = 11;
    	a1537379265 = 11;
    	a521273111 = 8; 
    	System.out.println("R");
    } if(((((cf && (a1537379265 == 15)) && (a894128990.equals("i"))) && (input.equals("D"))) && (a1304806974.equals("g")))) {
    	cf = false;
    	 
    	System.out.println("X");
    } if(((input.equals("E")) && ((a894128990.equals("i")) && ((a1537379265 == 15) && (cf && (a1304806974.equals("g"))))))) {
    	cf = false;
    	a76449788 = "g";
    	a1537379265 = 10;
    	a71487061 = 12; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm42(String input) {
    if((cf && (a894128990.equals("i")))) {
    	calculateOutputm155(input);
    } 
}



public  void calculateOutput(String input) {
 	cf = true;
    if(((a1537379265 == 8) && cf)) {
    	if((cf && (a1360225377.equals("e")))) {
    		calculateOutputm1(input);
    	} 
    	if((cf && (a1360225377.equals("g")))) {
    		calculateOutputm3(input);
    	} 
    	if(((a1360225377.equals("h")) && cf)) {
    		calculateOutputm4(input);
    	} 
    } 
    if(((a1537379265 == 9) && cf)) {
    	if(((a919251806 == 8) && cf)) {
    		calculateOutputm8(input);
    	} 
    	if(((a919251806 == 11) && cf)) {
    		calculateOutputm10(input);
    	} 
    } 
    if(((a1537379265 == 10) && cf)) {
    	if(((a71487061 == 17) && cf)) {
    		calculateOutputm17(input);
    	} 
    } 
    if((cf && (a1537379265 == 11))) {
    	if((cf && (a1735071167 == 9))) {
    		calculateOutputm18(input);
    	} 
    	if(((a1735071167 == 11) && cf)) {
    		calculateOutputm20(input);
    	} 
    	if(((a1735071167 == 14) && cf)) {
    		calculateOutputm23(input);
    	} 
    } 
    if(((a1537379265 == 12) && cf)) {
    	if(((a894128990.equals("e")) && cf)) {
    		calculateOutputm25(input);
    	} 
    } 
    if(((a1537379265 == 13) && cf)) {
    	if(((a780728121.equals("i")) && cf)) {
    		calculateOutputm32(input);
    	} 
    } 
    if(((a1537379265 == 14) && cf)) {
    	if(((a168638684 == 10) && cf)) {
    		calculateOutputm35(input);
    	} 
    	if(((a168638684 == 12) && cf)) {
    		calculateOutputm37(input);
    	} 
    	if(((a168638684 == 15) && cf)) {
    		calculateOutputm40(input);
    	} 
    } 
    if(((a1537379265 == 15) && cf)) {
    	if(((a1304806974.equals("e")) && cf)) {
    		calculateOutputm41(input);
    	} 
    	if((cf && (a1304806974.equals("g")))) {
    		calculateOutputm42(input);
    	} 
    } 

    errorCheck();
    if(cf)
    	throw new IllegalArgumentException("Current state has no transition for this input!");
}


public static void main(String[] args) throws Exception {
	// init system and input reader
	Problem11 eca = new Problem11();

	// main i/o-loop
	while(true) {
		//read input
		String input = stdin.readLine();

		 if((input.equals("D")) && (input.equals("C")) && (input.equals("J")) && (input.equals("B")) && (input.equals("I")) && (input.equals("F")) && (input.equals("A")) && (input.equals("H")) && (input.equals("G")) && (input.equals("E")))
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