package pl.coderslab.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;


import pl.coderslab.entity.Tweeter_tweet;
import pl.coderslab.entity.Tweeter_user;

@Component
@Transactional
public class UserDao {
	
	 @PersistenceContext
	    EntityManager entityManager;
	 
	 public void saveUser(Tweeter_tweet entity) {
	        entityManager.persist(entity);
	    }
	 
	 public List<Tweeter_user> getList(){
	    	Query query = entityManager.createQuery("SELECT t FROM Tweeter_user t");
	    	List<Tweeter_user> users = query.getResultList();
	    	return users;
	    }
	 public Tweeter_user findById(long id) {
		    return entityManager.find(Tweeter_user.class, id);
		}
	 public void delete(Tweeter_user entity) {
			entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
		}
		
}
