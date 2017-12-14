package a_Zadania.b_Dzien_2.a_Napisy;

public class Main7 {

    public static void main(String[] args) {
    	String str="ala ma kota";
    	String str2="kot";
    	System.out.println(containsStr(str, str2));
    }

    static boolean containsStr(String str, String search){	
    		return (str.contains(search));
    }
}
