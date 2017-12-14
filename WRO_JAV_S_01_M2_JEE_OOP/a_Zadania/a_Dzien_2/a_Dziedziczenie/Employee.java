package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Employee {
	public int id ;
	public String firstName;
	public String lastName;
	public double salary;
	
	public Employee(int id,String firstName,String lastName, double salary){
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary= salary;
	}
	public void raiseSalary(double percent){
		double result;
		if(percent>=0){
		result = this.salary * percent;
		this.salary = result;
		}
	}
	
	}
