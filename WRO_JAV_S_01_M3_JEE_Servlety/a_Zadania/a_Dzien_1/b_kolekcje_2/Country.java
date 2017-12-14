package a_Zadania.a_Dzien_1.b_kolekcje_2;

public class Country {
	String name;
	String capitol;
	
	@Override
	public String toString() {
		return "Country [name=" + name + "]";
	}

	Country(String name, String capitol){
		this.name=name;
		this.capitol=capitol;
	}
	
}

