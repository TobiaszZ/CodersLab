package pl.coderslab.dao;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import pl.coderslab.entity.Tweeter_tweet;


@Component
@Transactional
public class TweetDao {
	
	 @PersistenceContext
	    EntityManager entityManager;
	 
	 public void saveTweet(Tweeter_tweet entity) {
	        entityManager.persist(entity);
	    }
	 public void saveTweetData(Tweeter_tweet tweeter_tweet) { tweeter_tweet.setCreated(LocalDateTime.now());
	   entityManager.persist(tweeter_tweet);
	   }
	 
	 public List<Tweeter_tweet> getList(){
	    	Query query = entityManager.createQuery("SELECT t FROM Tweeter_tweet t");
	    	List<Tweeter_tweet> tweets = query.getResultList();
	    	return tweets;
	    }
	 
	 public List<Tweeter_tweet> getListStart(){
	    	Query query = entityManager.createQuery("SELECT t FROM Tweeter_tweet t ORDER BY t.created DESC ");
	    	List<Tweeter_tweet> articles2 = query.getResultList();
	    	return articles2;
	    }
	 public Tweeter_tweet findById(long id) {
		    return entityManager.find(Tweeter_tweet.class, id);
		}
}
