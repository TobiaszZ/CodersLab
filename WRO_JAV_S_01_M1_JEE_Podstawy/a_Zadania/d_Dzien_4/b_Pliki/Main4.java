package a_Zadania.d_Dzien_4.b_Pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
    	File file = new File("a_Zadania/d_Dzien_4/b_Pliki/text1.txt");
    	try {
    		Scanner input = new Scanner (file);
    		String str = "";		
    		while(input.hasNextLine()) {
    					str=input.nextLine();
    					if(str.toLowerCase().contains("javy"))
    						System.out.println(str);
    				}
    		input.close();
    	}
    	catch (FileNotFoundException e) {
    		System.out.println("Brak pliku");
    	}

    }
}
