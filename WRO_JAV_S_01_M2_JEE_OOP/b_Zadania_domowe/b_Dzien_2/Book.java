package b_Zadania_domowe.b_Dzien_2;

import java.util.Arrays;

public class Book {
	private int nextId=0;
	private int id;
	private String title;
	private boolean available=true;
	private Author author;
	public Author additionalAuthors[];
	private User user;
	private int popularity=0;
	public User currentUser;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Author[] getAdditionalAuthors() {
		return additionalAuthors;
	}
	public void setAdditionalAuthors(Author[] additionalAuthors) {
		this.additionalAuthors = additionalAuthors;
	}
	public int getId() {
		return id;
	}	
	
	Book (int id, String title) {
		this.id= nextId;
		nextId++;
		this.title="xxx";
		}
	Book(int id,String title,Author author){
		this.id= nextId;
		nextId++;
		this.title=title;
		this.author=author;
		}
	Book(int id,String title,Author author,Author additionalAuthors[]){
		this.id= nextId;
		nextId++;
		this.title=title;
	}

	public void borrowTo(User user){
		this.available = false;
		this.currentUser = user;
		user.books= Arrays.copyOf(user.books, user.books.length+1);
		user.books[user.books.length-1]=this;
		popularity++;
	}
	public boolean equals(Book book) {
		if(this.id==book.id) return true; 
		else
		return false; 
	}
//	public returnBook(){
//		currentUser.returnBook();
	}

		