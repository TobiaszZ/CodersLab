package a_Zadania.d_Dzien_4.b_Pliki;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
    	try {
    	File file = new File("a_Zadania/d_Dzien_4/b_Pliki/text2.txt");
    	FileWriter out = new FileWriter("a_Zadania/d_Dzien_4/b_Pliki/Main5.txt");
//    	Path path = Paths.get("text2.txt");
    		Scanner input = new Scanner (file);
    		int counter=0;
    		while(input.hasNextLine()) {
    			counter++;
    			input.nextLine();
    		}
    		input.close();
    		input = new Scanner (file);
   			String [] tab = new String [counter];
   			int i=0;
   			while (input.hasNextLine()) {
   				tab[i]=input.nextLine();
   				i++;
   				}
   			input.close();
   			Arrays.sort(tab);
   			for(String arr: tab) {
   				out.append(arr);
   				out.append(", \n");
   			}
   			out.close();
    	}
    	catch (FileNotFoundException e) {
    		System.out.println("Brak pliku");
    	}
    	catch (IOException e) {
    		System.out.println("błąd zapisu");
    	}
    }
}
