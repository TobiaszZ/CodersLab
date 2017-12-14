package a_Zadania.d_Dzien_4.b_Pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        	File file = new File("a_Zadania/d_Dzien_4/b_Pliki/main3.txt");
        	double suma=0;
        	try {
        		Scanner input = new Scanner (file);
        				while(input.hasNext()) {
        					String str=input.next();
        		try {
        			System.out.println(Double.parseDouble(str.replace(",","")));
        			suma+=Double.parseDouble(str.replace(",",""));
        			}
        		catch (NumberFormatException e) {
        		}}
        		input.close();
        		System.out.format("%.2f%n", suma);
        			}
        	catch (FileNotFoundException e) {
        		System.out.println("Brak pliku");
        	}
        	
        		
        	}
        }    

    

