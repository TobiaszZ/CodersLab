package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
    	String line; 
    	try {
    		PrintWriter	out	=	new	PrintWriter("a_Zadania/d_Dzien_4/b_Pliki/Main1.txt");
    		Scanner input = new Scanner (System.in);
    		while(input.hasNext()) {
    				line = input.next();
    				if(line.equals("quit")) {
    					break;
    				}
    				out.println(line);
    					}
    		input.close();
    		out.close();
    	}
    	catch (FileNotFoundException e) {
    		System.out.println("Brak pliku");
    	
    	}
    	
    	
    }
}
