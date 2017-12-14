<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java - kolekcje

#### Zadanie 1 - rozwiązywane z wykładowcą.

W pliku `Main1.java`:
1. Napisz program który w metodzie main będzie w pętli pobierał z konsoli napisy, do momentu podania `exit`.
2. Pobrane o użytkownika napisu dodawaj do kolekcji typy `Set`.
3. Utwórz zmienną typu `int` o nazwie `count` i wartości początkowej 0.
4. Po pobraniu napisu zwiększaj wartość zmiennej `count`.
3. Testując program podaj kilkukrotnie ten sam napis.
4. Po wpisaniu `exit` wypisz na konsoli: `Podanych napisów: [ilość napisów], Rozmiar kolekcji: [ilość elementów w kolekcji]`
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


-----------------------------------------------------------------------------

#### Zadanie 2.

W pliku `Main2.java`:

1. Napisz metodę `public static Map<String, String> getMap()` , utworzy 5 dowolnych zestawów przeciwieństw (ciepło - zimno), doda je do mapy, a następnie zwróci.
2. W metodzie main programu dla każdego klucza mapy, pobieraj z konsoli odpowiedź użytkownika.
3. Program ma zadać 5 pytań.
4. Po udzieleniu ostatniej - wyświetlić wynik w postaci `Poprawnych odpowiedzi: 3`;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

	public static Map<String, String> getMap() {
		Map <String, String> mapa = new HashMap<>();
		mapa.put("ciepło", "zimno");
		mapa.put("jasny", "ciemny");
		mapa.put("gruby", "chudy");
		mapa.put("mały", "duży");
		mapa.put("biały", "czarny");
		return mapa;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("podaj przeciwieństwo:");
		Map <String, String> mapa = getMap();
		int counter=0;
		for(int i=0; i<mapa.size(); i++) {
			mapa.keySet();
		}
			
		
	}
}

#### Zadanie 3

Utwórz klasę `Country`,  dodaj w niej atrybuty:
* name (String)

Następnie w pliku `Main3.java`:
1. Napisz metodę `public static List<Country> initialize ()`, która utworzy 5 obiektów klasy `Country`, doda je do listy, którą następnie zwróci.
2. Napisz metodę `public static Map<String, Country> getMap (List<Country> list )`, która utworzy a następnie zwróci mapę gdzie kluczem będzie nazwa Stolicy, a wartością referencja do obiektu `Country`: 
3. W metodzie `main` wyświetl informacje o filmach w postaci: 
   ```
   Berlin - Niemcy


   Warszawa - Polska
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main3 {
	public static void main(String[] args){
		List<Country> lista = initialize();
		Map<String, Country> maps = getMap (lista);
		System.out.println(maps);
		String capitol="";
		for(Iterator<String> it = maps.keySet().iterator(); it.hasNext(); ){ 
			capitol=it.next();
			System.out.println(capitol + " - " + maps.get(capitol).name);
		}
	}
	public static List<Country> initialize(){
		List <Country> countrys = new ArrayList<>();
			countrys.add(new Country("Polska","Warszawa"));
			countrys.add(new Country("Niemcy","Bonn"));
			countrys.add(new Country("Pepiczki","Ceskie Budzejowice"));
			countrys.add(new Country("Ruscy","Putin"));
			countrys.add(new Country("Milicz","Gadaj!"));
			return countrys;
	}
	public static Map<String, Country> getMap (List<Country> list){
		Map<String, Country> maps = new HashMap<>();
		Country country;
		for(Iterator <Country> it = list.iterator();it.hasNext();){
			country = it.next();
			maps.put(country.capitol, country);
			
		}
		return maps;
	}
}
   ```
<!-- Links -->
[list-iterator]:https://docs.oracle.com/javase/8/docs/api/java/util/ListIterator.html
