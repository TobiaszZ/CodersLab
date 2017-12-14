package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.List;

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
}
