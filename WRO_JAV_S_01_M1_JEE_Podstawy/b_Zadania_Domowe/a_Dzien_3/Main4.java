package b_Zadania_Domowe.a_Dzien_3;


public class Main4 {
	static int tripple(String str){
	int i = 0;
	char slowo;
	for (int i = 0 ; i < str.length() ; i++){
    
        slowo = slowo.charAt(i); 
        slowo = String.valueOf(slowo).toUpperCase().charAt(0);
        if(slowo == i) 
        {                           
           slowo++; 
        }
    }   
    return slowo;
	}
	
    public static void main(String[] args) {
    	String str = "Aaaabbb";
    	System.out.println(str);

    }
    }
}


