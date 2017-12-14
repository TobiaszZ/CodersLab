package pl.coderslab.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Tweeter_tweet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	@NotNull
	@Size(min =	5,	max	= 50)
	private String title;
	@NotNull
	@Size(max = 16)
	private String tweet_text;
	private LocalDateTime created;
	@ManyToOne
	Tweeter_user users;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTweet_text() {
		return tweet_text;
	}
	public void setTweet_text(String tweet_text) {
		this.tweet_text = tweet_text;
	}
	public LocalDateTime getCreated() {
		return created;
	}
	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
	public Tweeter_user getTweeter_user() {
		return users;
	}
	public void setTweeter_user(Tweeter_user tweeter_user) {
		this.users = tweeter_user;
	}
	@Override
	public String toString() {
		return "Tweeter_tweet [id=" + id + ", title=" + title + ", tweet_text=" + tweet_text + ", created=" + created
				+ "]";
	}
	
	
	
}
