package a_Zadania.d_Dzien_4.c_Pliki_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main3 {

    public static void main(String[] args) {
    	copyFile(".", "ddd.txt", "aaa.txt");

    }
    static void copyFile(String directory, String fileName, String secondFileName) {
    	Path path1 = Paths.get("Directory/" + fileName);
    	Path path2 = Paths.get(secondFileName);
    	try	{
    		Files.copy(path1, path2);
    	}	
    	catch (IOException e) {
    		e.printStackTrace();
    	}
    }
}
