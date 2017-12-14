package b_Zadania_Domowe.a_Dzien_3;


public class Main1 {
	static void average(String a, String b)
		throws ArithmeticException{
		 int cos = Integer.parseInt(a)/Integer.parseInt(b);
		 System.out.println(cos);
	}
		public static void main(String[] args) {
			String a = "12";
			String b = "6";
			try{
			average(a,b);}
			
			catch(ArithmeticException e){
		    System.out.println("Dupa");
    }


}
}