package controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {
	public BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping("/books")
	public List<Map<String, Object>> getBooks() throws SQLException {
		System.out.println("It's called");
		return bookService.getBooks();
	}

	@GetMapping("/testBook")
	public String testBook() throws SQLException {
		System.out.println("It's called");
		return bookService.testBooks();
	}

}
