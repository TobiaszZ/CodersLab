package a_Zadania.a_Dzien_1.c_Metody;

public class Person {
	private String Name ;
	private String Surname;
	private int Age;
	private String Gender;
	
	
	public String getName() {
		return Name;
	}
	public String getSurname() {
		return Surname;
	}
	public int getAge() {
		return Age;
	}
	public String getGender() {
		return Gender;
	}
	
	public void setName(String name) {
		this.Name = name;
	}
	public void setSurname(String surname) {
		this.Surname = surname;
	}
	public void setAge(int age) {
		this.Age = age;
	}
	public void setGender(String gender) {
		this.Gender = gender;
	}
	
	String result = this.Name + " " + this.Surname;
	
	return result;
	
}