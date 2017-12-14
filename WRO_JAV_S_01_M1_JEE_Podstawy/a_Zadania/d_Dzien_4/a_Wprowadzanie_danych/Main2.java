package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
    	operations();

    }
    static void operations() {
    	Scanner input = new Scanner (System.in);
    	int a;
    	int b;
    	System.out.println("Podaj pierwszą liczbę: ");
    	a = input.nextInt();
    	System.out.println("Podaj drugą liczbę: ");
    	b = input.nextInt();
    	int suma=a+b;
    	int iloczyn=a*b;
    	int iloraz=a/b;
    	System.out.println("Wynik dodawania " + a + " + " + b + " = " + suma);
    	System.out.println("Wynik mnożenia " + a + " * " + b + " = " + iloczyn);
    	System.out.println("Wynik dzielenia " + a + " / " + b + " = " + iloraz);
    	input.close();
    }
}
