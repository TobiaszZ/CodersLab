package a_Zadania.d_Dzien_4.c_Pliki_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
    	writeToFile("ddd.txt");
    }
    
    static void writeToFile(String fileName) {
    	Path path1 = Paths.get(fileName);
    	Scanner input = new Scanner (System.in);
    	ArrayList<String> out =	new	ArrayList<>();
    	out.add(input.nextLine());
    	input.close();
    	try	{
    		Files.write(path1,	out);	
    	}	
    	catch (IOException ex) {
    		System.out.println("Nie	mogę zapisać pliku!");
    	}
    	
    }

}
