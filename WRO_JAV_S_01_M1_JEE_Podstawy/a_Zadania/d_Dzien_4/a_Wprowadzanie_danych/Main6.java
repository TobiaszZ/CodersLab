package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;

import java.util.Scanner;
public class Main6 {

    public static void main(String[] args) {
    	equation();
    }
    
    static void equation() {
    	Scanner input = new Scanner (System.in);
    	int a, b, c;
    	
    	System.out.println("Podaj pierwszą liczbę: ");
    	a=input.nextInt();
    	System.out.println("Podaj drugą liczbę: ");
    	b=input.nextInt();
    	System.out.println("Podaj trzecą liczbę: ");
    	c=input.nextInt();
    	System.out.println();
    	int delta=b*b-4*a*c;
    	if (delta<0)
    		System.out.println("Równanie nie ma rozwiązań rzeczywitych");
    	else if (delta==0)
    		System.out.println("Równanie ma jedno rozwiązanie: " + (-b/2*a));
    	else {
    		double x1=-b-Math.sqrt(delta)/2*a;
    		double x2=-b+Math.sqrt(delta)/2*a;;
    		System.out.println("Równanie ma dwa rozwiązania: " + x1 + " i " + x2);
   
    		}
    		input.close();
    }
}
