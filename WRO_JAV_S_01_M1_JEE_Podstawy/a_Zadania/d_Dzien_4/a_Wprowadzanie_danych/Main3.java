package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
    	getData();
    }
    
    static void getData() {
    	Scanner input = new Scanner (System.in);
    	int sum = 0;
    	int counter = 0;
    	int next;
    	System.out.println("Podaj kolejne liczby całkowite: ");
    	while(true) {
    		counter ++;
    		while(!input.hasNextInt()) {
    			input.next();
    			System.out.println("Podaj liczbe!");	
    		}
    	next = input.nextInt();
    	if(next==0) return;
    	sum+=next;
    	System.out.println(counter +": " + sum);
    	input.close();
    	}
    }
}
