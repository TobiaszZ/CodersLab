package b_Zadania_domowe.b_Dzien_2;


public class Author {
	static private int nextId=0;
	private final int id;
	private String firstName;
	private String lastName;
	
	
	protected Author(int id, String firstName, String lastName){
		this.id=nextId;
		nextId++;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
}
