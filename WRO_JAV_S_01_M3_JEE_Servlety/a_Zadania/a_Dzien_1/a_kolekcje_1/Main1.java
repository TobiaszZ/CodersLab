package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1 {
	static public void main(String[] args){
	List <Integer> lista = new ArrayList<>();
	for(int i=1; i<=50; i++){
		lista.add(i);
	}
	for(int i=0; i<lista.size(); i++){
		System.out.println(lista.get(i));
	}
	
	Iterator iter = lista.iterator();
	while(iter.hasNext()){
		System.out.println(iter.next());
	}
	for(Iterator iter2 = lista.iterator(); iter2.hasNext();){
		System.out.println(inter2.next());
	}
	
	for(int i : lista){
		System.out.println("forEach" + i);
	}
}
}