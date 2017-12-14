package a_Zadania.d_Dzien_4.b_Pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main2 {

        public static void main(String[] args) {
        	File file = new File("a_Zadania/d_Dzien_4/b_Pliki/Main1.txt");
        	StringBuilder write = new StringBuilder();
        	try {
        		Scanner input = new Scanner (file);
        				while(input.hasNextLine()) 
        					System.out.println(input.nextLine());
        		input.close();
        	}
        	catch (FileNotFoundException e) {
        		System.out.println("Brak pliku");
        	}
        	System.out.println(write);
        }
    }

