package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;


public class Product {
	static private int nextId=0;
	private final int id;
	public String name;
	public String description;
	public double price;
	public int quantity; 	

	public Product (String description, double price, int quality){
		this.id= nextId;
		nextId++;
		this.description=description;
		this.price=price;
		this.quantity = quantity;
		
	}
	public double getTotalSum(){
		
		return this.quantity * this.price;
		
	}
}
