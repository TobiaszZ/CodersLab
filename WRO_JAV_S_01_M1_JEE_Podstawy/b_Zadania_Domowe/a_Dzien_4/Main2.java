package b_Zadania_Domowe.a_Dzien_4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main2 {
	
	static int count(String fileName)throws FileNotFoundException {
		File file = new File(fileName);
		int ile = 0;
		try{
			Scanner scan = new Scanner(fileName);
			while (scan.hasNextLine()) {
				ile++;
				scan.next();
		    	}
		    	scan.close();
		    	return ile;
		}
		   catch (FileNotFoundException e) {
		    	System.out.println("Plik nie istnieje!");
		    	return 0;
		   }
	}

    public static void main(String[] args) {
    	String fileName = "xxx.txt";
    	System.out.println(count(fileName));
    }
}
