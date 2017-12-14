package a_Zadania.a_Dzien_1.b_kolekcje_2;

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

