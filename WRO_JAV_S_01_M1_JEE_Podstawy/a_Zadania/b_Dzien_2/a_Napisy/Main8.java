package a_Zadania.b_Dzien_2.a_Napisy;

public class Main8 {

    public static void main(String[] args) {
    	String [] str = {"ala", "ma", "kota"};
    	System.out.println(stringFromArray(str));
    }

    static String stringFromArray(String[] str){
        String result=str[0];
    	for(int i=1; i<str.length; i++)
    		result=result.concat(str[i]);
    	return result;
    }
}
