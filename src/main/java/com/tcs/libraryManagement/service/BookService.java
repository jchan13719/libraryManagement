package com.tcs.libraryManagement.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.libraryManagement.model.Book;
import com.tcs.libraryManagement.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;

	public List<Book> getBooks() throws SQLException {
		return bookRepository.findAll();

	}
}
