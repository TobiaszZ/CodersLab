package a_Zadania.a_Dzien_1.a_kolekcje_1;

public class City {
public int population;
public String name;
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPopulation() {
	return population;
}

public void setPopulation(int population) {
	this.population = population;
}

public City(String name,int population){
	this.name = name;
	this.population = population;
}
}