package com.tcs.libraryManagement.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.libraryManagement.model.Book;
import com.tcs.libraryManagement.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {
	@Autowired
	public BookService bookService;

	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks() throws SQLException {
		try {
//			List<Book> book = new ArrayList<>();
			List<Book> allBooks = bookService.getBooks();

			return allBooks.isEmpty() ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
					: new ResponseEntity<>(allBooks, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
//		System.out.println("It's called");
//		return bookService.getBooks();
	}

}
