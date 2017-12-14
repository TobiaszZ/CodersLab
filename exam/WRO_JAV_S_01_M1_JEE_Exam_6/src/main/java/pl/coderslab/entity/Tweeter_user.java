package pl.coderslab.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

@Entity
public class Tweeter_user {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	@NotNull
	private String fristName;
	@NotNull
	private String lastName;
	@Email
	private String email;
	@ManyToOne
	Tweeter_tweet tweets;
	
	
	public Tweeter_tweet getTweeter_tweet() {
		return tweets;
	}
	public void setTweeter_tweet(Tweeter_tweet tweeter_tweet) {
		this.tweets = tweeter_tweet;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Tweeter_user [id=" + id + ", fristName=" + fristName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}
	
	
}
