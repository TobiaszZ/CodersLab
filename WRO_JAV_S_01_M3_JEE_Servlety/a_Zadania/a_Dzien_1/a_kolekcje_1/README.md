<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java - kolekcje

#### Zadanie 1 - rozwiązywane z wykładowcą.

W pliku `Main1.java`

1. W metodzie `main` utwórz listę o nazwie `elements` przechowującą elementy typy Integer.
2. Dodaj do kolekcji 50 elementów od 0 do 50.
3. Wypisz elementy na konsoli używając pętli for.
4. Wypisz elementy na konsoli używając iteratora i pętli while.
5. Wypisz na konsoli elementy używając iteratora i pętli for.
6. Wypisz na konsoli elementy używając konstrukcji for-each.

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


#### Zadanie 2 - rozwiązywane z wykładowcą.

W pliku `Main2.java` napisz metodę `public static List<Integer> removeDivider (List<Integer> list, int divider)`,
która usunie z listy wszystkie elementy podzielne przez `divider` a następnie zwróci tak przetworzoną listę.





-----------------------------------------------------------------------------

#### Zadanie 3

Utwórz klasę `City`,  dodaj w niej atrybuty:
* name (String)
* population (int)  

Klasa powinna a mieć też konstruktor przyjmujący wszystkie 3 parametry

Następnie w pliku `Main3.java`:
1. Napisz metodę `public static List<City> initialize()`, która utworzy 5 obiektów klasy `City`, doda je do listy, którą następnie zwróci.
2. Napisz metodę `public static List<City> sublist(List<City> list, int start, int end )`, która zwróci sublistę elementów listy `list` o początku `start` i końcu `end`.

class City{
	String name;
	int population;
	City(String name, int population){
		this.name=name;
		this.population=population;
	}
	
	@Override
	public String toString(){
		return name;
	}
}


public class Main3 {

	public static List<City> initialize(){
		List <City> lista = new ArrayList<>();
		lista.add(new City("Radom", 12345));
		lista.add(new City("Warszawa", 123456));
		lista.add(new City("Wrocław", 1234567));
		lista.add(new City("Kraków", 12345678));
		lista.add(new City("Wrocław", 123456789));
		return lista;
	}
	
	public static void main(String[] args) {
		List <City> lista = new initialize();
		
		for(int i=0; i<lista.size(); i++){
			City city = lista.get(i);
			System.out.println(i);
			System.out.println(city);
		}
	}
	
	public static List<City> sublist(List<City> list, int start, int end ){
		List<City> sublistaVariable = new ArrayList<>();
		
		for(int i=start; i<end; i++){
			sublistaVariable.add(list.get(i));
		}
	return sublistaVariable;
	}

#### Zadanie 4

W pliku `Main4.java`:
1. Napisz metodę `public static List<City> reverse (List<City> list )`, która zwróci listę elementów w odwrotnej od otrzymanej kolejności.
2. Zapoznaj się z możliwościami klasy [ListIterator][list-iterator].

public class Main4 {
	public static List<City> reverse (List<City> list ){
		Iterator<City> it = lista.listIterator;
		while(it.hasNext()){
			int i = it.nextIndex();
			City city = it.next();
		}
		
		for(it=lista.listIterator(lista.size()); it.hasPrevious();){
			System.out.println(it.previous());
		}
	}
}


<!-- Links -->
[list-iterator]:https://docs.oracle.com/javase/8/docs/api/java/util/ListIterator.html
