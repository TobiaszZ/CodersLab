package a_Zadania.a_Dzien_1.b_kolekcje_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String text;
		int count=0;
		int counter;
		Set<String> secik = new HashSet<>();
	//	Map<String, Integer> mapka = new HashMap<>();
		while(true){
			text = scan.next();
			if(text.equals("exit")){
				break;
			}
			// if(mapka.containsKey(text)){
			// counter = mapka.get(text) +1;
			// } else{
			// counter = 1;
			
			// mapka.put(text, counter);
			//count ++;
			secik.add(text);
			count++;
		}
		scan.close();
		System.out.println("Podanych napisów:" + count + " Rozmiar kolekcji:" + secik.size());
		
	}
}
