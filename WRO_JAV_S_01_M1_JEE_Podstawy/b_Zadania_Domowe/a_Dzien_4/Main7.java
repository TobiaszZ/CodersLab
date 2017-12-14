package b_Zadania_Domowe.a_Dzien_4;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main7 {
	public static boolean rewrite(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Plik do kopii: ");
		String fileName = scan.next();
			Path istnieje = Paths.get(fileName);
			scan.close();
	}
    public static void main(String[] args) {


    }


}
