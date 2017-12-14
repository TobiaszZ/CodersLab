package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;

import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
    		nettoBrutto();
    }
    
    static void nettoBrutto() {
    	Scanner input = new Scanner (System.in);
    	System.out.println("Wpisz, co chcesz zrobić: **bn** - dla zamiany kwoty brutto na netto, **nb** - dla zamiany kwoty netto na brutto");
    	String str = input.nextLine();
    	while (!(str.equals("**bn**") || str.equals("**nb**")))	{
    		System.out.println ("Podaj właściwą wartość:  **bn** - dla zamiany kwoty brutto na netto, **nb** - dla zamiany kwoty netto na brutto");
    		str=input.nextLine();
    		}
    	System.out.println("Podaj wartość: ");
    	double number=input.nextDouble();
    	if(str.equals("**bn**")) {
    		System.out.println("Wartość netto kwoty " + number + " wynosi: " + 1/(1+0.23)*number);
    	}
    	
    	else {
    		System.out.println("Wartość brutto kwoty " + number + " wynosi: " + (1+0.23)*number);
    	}
    	
    	input.close();
    }
}
