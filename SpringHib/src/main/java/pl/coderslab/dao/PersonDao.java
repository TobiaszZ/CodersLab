package pl.coderslab.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import pl.coderslab.entity.Person;

@Component
@Transactional
public class PersonDao {
    @PersistenceContext
    EntityManager entityManager;
    
    public Person savePerson(Person entity) {
        entityManager.persist(entity);
        return entity;
    }
    
    public List<Person> getList(){
    	Query query = entityManager.createQuery("SELECT p FROM Person p");
    	List<Person> books = query.getResultList();
    	return books;
    }
}