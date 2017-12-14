package b_Zadania_domowe.a_Dzien_1;

import java.util.Arrays;

public class Book {
	private int id;
	private String title;
	private boolean available=true;
	private Author author;
	public Author additionalAuthors[];
	private User user;
	
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
		this.id=id;
		this.title=title;
		}
	Book(int id,String title,Author author){
		this.id=id;
		this.title=title;
		this.author=author;
		}
	Book(int id,String title,Author author,Author additionalAuthors[]){
		this.id=id;
		this.title= title;
		this.additionalAuthors=additionalAuthors;
	}
	public void borrowTo(User user){
	this.available=false;
	user.books = Arrays.copyOf(user.books, user.books.length+1);
    user.books[user.books.length-1]=this;

}
}