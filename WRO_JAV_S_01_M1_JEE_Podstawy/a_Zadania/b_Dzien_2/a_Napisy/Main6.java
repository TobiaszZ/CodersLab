package a_Zadania.b_Dzien_2.a_Napisy;

public class Main6 {

    public static void main(String[] args) {
    	String str="Coderslab";
    	System.out.println(firstHalf(str));

    }
    static String firstHalf(String str){
        String str2=str.substring(0, (str.length()/2));
    	return str2;
    }
}
