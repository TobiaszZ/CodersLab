package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
	public static List<Integer> removeDivider(List<Integer> list, int divider){
		
		for (int i=0; i < list.size(); i++){
			Integer val = list.get(i);
			if(val % divider == 0){
				list.remove(i);
			}
		}
		return list;
	}
}
//removeDivider(lista , 3) gdy wiecej dzielników removeDivider(removeDivider(lista ,2),2)