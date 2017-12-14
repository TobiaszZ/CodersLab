package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;
import	java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
    	getInfo();
    }
    
    static void getInfo() {
    	Scanner input = new Scanner (System.in);
    	String name;
    	int age;
    	System.out.println("Podaj imię: ");
    	name = input.next();
    	System.out.println("Podaj wiek: ");
    	while(!input.hasNextInt()){
    		input.next();
    		System.out.println("Wiek ma być liczbą!");
    	
    	}
    	
    	age = input.nextInt();
    	System.out.println(name + " ma " + age + " lat.");
    	input.close();
    }
    
}
