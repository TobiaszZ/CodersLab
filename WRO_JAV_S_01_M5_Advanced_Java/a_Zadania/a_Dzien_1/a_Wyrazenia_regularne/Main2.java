package a_Zadania.a_Dzien_1.a_Wyrazenia_regularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
	private static final Pattern Password_Pattern=
			Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?!.*[A-Z][A-Z])(?!.*[a-z][a-z]).{10,15}$");

	public static void main(String[] args){
		System.out.println(verifyPassword("12345678Ab"));
	}
	
	static boolean verifyPassword(String password){
	final Matcher matcher = Password_Pattern.matcher(password);
	return matcher.matches();
	}
	
}
