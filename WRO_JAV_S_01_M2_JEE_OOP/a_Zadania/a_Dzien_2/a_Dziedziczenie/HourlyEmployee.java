package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class HourlyEmployee extends Employee{
	public HourlyEmployee(int id,String firstName,String lastName, double salary){
		super(id,firstName,lastName,salary);
	}
	public double computePayment(int hours){
		
		return hours * this.salary;
		
	}
}
