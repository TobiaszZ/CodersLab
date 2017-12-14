package a_Zadania.b_Dzien_2.a_Napisy;

public class Main2 {

	static boolean palindrom(String str) {
		
		String	text = str.replaceAll(" ", "").toLowerCase();
		for(int i=0; i<=text.length()/2; i++) {
	    	if ( text.charAt(i)!=text.charAt(text.length()-(i+1)))
	    		return false;
	    }
	    	return true;	
	 
	}

	public static void main(String[] args) {

    String str = "Kobyła ma mały bok";
    System.out.println(palindrom(str));
    }

}
