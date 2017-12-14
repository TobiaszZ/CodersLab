package b_Zadania_Domowe.a_Dzien_3;


public class Main3 {

		static int getLength(String str) 
		throws NullPointerException{
		
			return str.length();}
		
		
	    public static void main(String[] args) {
	    	
	    	String str = "mama ma koaata";
	    	
	    	try{
	    	System.out.println(getLength(str));}
	    	
	    	
	    	catch(NumberFormatException e){
	    	System.out.println(e);
	    	}
	    }
}
	


    



