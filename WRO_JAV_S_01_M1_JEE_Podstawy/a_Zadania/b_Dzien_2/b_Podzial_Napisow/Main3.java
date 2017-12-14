package a_Zadania.b_Dzien_2.b_Podzial_Napisow;
import java.util.StringTokenizer;

public class Main3 {
	
	static int countTokent(String str) {
		StringTokenizer	strTok = new StringTokenizer(str);			
		return strTok.countTokens();
	}
	
    public static void main(String[] args) {
    	String str="llll lllllll";
    	System.out.println(countTokent(str));
    }

}