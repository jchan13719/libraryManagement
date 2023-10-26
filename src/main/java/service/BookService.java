package service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.BookRepository;

@Service
public class BookService {
	private BookRepository bookRepository;

	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public List<Map<String, Object>> getBooks() throws SQLException {
		return bookRepository.getBooks();
	}

	public String testBooks() throws SQLException {
		return bookRepository.testBook();
	}
}
