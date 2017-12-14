package b_Zadania_domowe.b_Dzien_2;


public class User extends Author{
	private Book[] books;
	private int id;
	private static int nextId=0;
	
	public User(int id,String firstName, String lastName){
		super(id,firstName,lastName);
		this.id = nextId;
			nextId++;
	}
}
//	public void returnBook(Book book){
//		book.setAvailable(true);
//		book.currentUser=null;
//		
//
//	}
//	public returnAllBooks()
//}
//
