package b_Zadania_Domowe.a_Dzien_4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main6 {
	public static boolean checkFileExist(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Istnieje: ");
    	Path istnieje = Paths.get(scan.next());
    	scan.close();
    	return Files.exists(istnieje);
	}
    public static void main(String[] args) {
    	checkFileExist();

    }


}
