package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
    	textLines();

    }
    static void textLines() {
    	Scanner input = new Scanner (System.in);
    	String str = "";
    	System.out.println("Podaj pierwszą linię: ");
    	do {
    		str=input.nextLine();
    		System.out.println(str);
    	} while(!str.equals("quit"));
    	input.close();    	
    }

}
