package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class SalariedEmployee extends Employee{
	public SalariedEmployee(int id,String firstName,String lastName, double salary){
		super(id,firstName,lastName,salary);
	}
	public double computePayment(){
		 return this.salary*190;
}
}

