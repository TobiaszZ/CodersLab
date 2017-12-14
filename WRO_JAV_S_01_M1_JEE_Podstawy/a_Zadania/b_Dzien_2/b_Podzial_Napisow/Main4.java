package a_Zadania.b_Dzien_2.b_Podzial_Napisow;
import java.util.StringTokenizer;

public class Main4 {
	
	static String[] onlyTwoElements(String str, String separator) {
	
		String [] tab = str.split(separator, 2);
//		
//		String [] tab = {"", ""};
//		String s = "" + separator;
//		StringTokenizer	strTok	=	new	StringTokenizer(str, s);
//		tab[0]=strTok.nextToken();
//		tab[1]=strTok.nextToken();
//		while(strTok.hasMoreElements())
//		tab[1]+=separator + strTok.nextToken();
//	
	return tab;
	}

    
	public static void main(String[] args) {
	String str="Java-zadania-podzial-napisow";
	String separator="-";
	System.out.println(onlyTwoElements(str, separator)[0]);
	System.out.println(onlyTwoElements(str, separator)[1]);
    }

}