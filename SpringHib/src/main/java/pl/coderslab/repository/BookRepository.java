package pl.coderslab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.coderslab.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	List<Book> findBooksByTitle(String title);

	List<Book> findByTitleIgnoreCaseContaining(String title);
	
	List<Book> findByTitleStartingWith(String place);
	
	List<Book> findById(long Id);
	
	List<Book> findByAuthor(String author);
	
	List<Book> findByPubliher(String publisher);
	
	List<Book> findByRating(int rating );
	
	List<Book> findTopTitle
}
