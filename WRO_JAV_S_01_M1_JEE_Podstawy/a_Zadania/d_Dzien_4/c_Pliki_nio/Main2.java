package a_Zadania.d_Dzien_4.c_Pliki_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main2 {

    public static void main(String[] args) {
    	createFile("ddd.txt");
    }
    
    static void createFile (String fileName) {
    	Path path = Paths.get(fileName);
    	if(!Files.exists(path))  {
    	try {	
    		Files.createFile(path);
    		System.out.println("Stworzyliśmy : " + path.getParent() + " : " + path.getFileName());
    	}
    	catch (IOException e) {
    	}
    	}
    	else System.out.println("Plik istnieje");
    	
    }

}
