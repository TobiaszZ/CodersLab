package a_Zadania.a_Dzien_1.d_Konstruktor;

public class Person {
	private String name;
	private String surname;
	private int age;
	private String gender;
	
	public Person(String name, String surname){
		this.name="Mateusz";
		this.surname="Cisz";
	}
	public Person(String name, String surname, int age, String gender){
		this.name="Szymon";
		this.surname="Michalak";
		this.age=18;
		this.gender="Laseczka";
	}
	public Person(String name, int age){
		this.name="Ala";
		this.age=100;
	}
}
	
	
	
	

