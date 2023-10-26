package repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	List<Book> getBooks();

	List<Book> getBook(Integer id);

	void addBook(Book book);

	void updateBook(Integer ISBN);

	void deleteBook(Integer ISBN);
}
