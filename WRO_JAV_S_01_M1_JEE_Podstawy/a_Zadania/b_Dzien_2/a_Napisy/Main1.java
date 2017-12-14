package a_Zadania.b_Dzien_2.a_Napisy;

public class Main1 {

    public static void main(String[] args) {

    String str = "CodersLab jak dobrze zacząć programować";
    System.out.println(str.charAt(str.length()-2));	
    int licznik=0;
    for(int i=0; i<str.length(); i++)
    		if(str.charAt(i)==str.charAt(str.length()-2)) licznik+=1;
     System.out.println(licznik);	
    }
}
