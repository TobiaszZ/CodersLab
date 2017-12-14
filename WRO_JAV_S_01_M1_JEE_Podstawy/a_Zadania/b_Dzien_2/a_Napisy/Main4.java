package a_Zadania.b_Dzien_2.a_Napisy;
import java.lang.String;

public class Main4 {

    public static void main(String[] args) {
    	String str="asAS";
    	System.out.println(toogleChar(str));
    }

    static String toogleChar(String str) {
    	String result="";
    	for(int i=0; i<str.length(); i++) {
    		char c = str.charAt(i);
    		if (Character.isLowerCase(c))
    			result += Character.toUpperCase(c);
   			if (Character.isUpperCase(c))
        		result += Character.toLowerCase(c);
    	}
    	
    	return result;
    }
}
