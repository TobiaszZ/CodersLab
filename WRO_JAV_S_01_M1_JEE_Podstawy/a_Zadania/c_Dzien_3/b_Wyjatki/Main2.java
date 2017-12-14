package a_Zadania.c_Dzien_3.b_Wyjatki;

public class Main2 {

    public static void main(String[] args) {
    	try	{
    		System.out.println(divide(4,0));
    	}	
    	catch	(ArithmeticException e) {
    		System.out.println("Dzielenie przez 0");
    	}


    }

    static int divide (int a, int b) throws NumberFormatException {
    	return a/b;
    }
}
