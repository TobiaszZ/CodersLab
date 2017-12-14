package a_Zadania.d_Dzien_4.c_Pliki_nio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;

public class Main1 {

    public static void main(String[] args) {
    		createDirectory("ddd");
    	
    }
    static void createDirectory(String fileName) {
    	Path path = Paths.get(fileName);
    	if(!Files.exists(path))  {
    	try {	
    		Files.createDirectories(path);
    		System.out.println("Stworzyliśmy : " + path.getParent() + " : " + path.getFileName());
    	}
    	catch (IOException e) {
    	}
    	}
    	else System.out.println("Katalog istnieje");
    	

    }
}
