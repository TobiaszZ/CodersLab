package b_Zadania_Domowe.a_Dzien_4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main3 {
	static int count()throws IOException {
		Scanner scan = new Scanner(System.in);
		String file = input.next();
		input.close();
	}
	//ArrayList <String> list = new ArrayList<String>();
	//while (scann.hasNext()){
	  //  list.add(scann.next());
	//static String[] retirement(){
   
	public static void main(String[] args) throws IOExpection {
    	try{
		System.out.println(count());
    	}
    	catch (IOException e) {
	    	System.out.println("Plik nie istnieje!");
	   
    }


}
}
