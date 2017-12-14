package a_Zadania.a_Dzien_1.a_Wyrazenia_regularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
	public static void main(String[] args){
		System.out.println(verifyEmail("nie_rozumiem@hotkicia.com"));
	}
	
	private static final Pattern Email_Pattern = 
		Pattern.compile("^[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]{1,})*\\.([a-zA-Z]{2,}){1}$");
	
	
	static boolean verifyEmail(String email){
		final Matcher matcher = Email_Pattern.matcher(email);
		return matcher.matches();
		 
	}

}
