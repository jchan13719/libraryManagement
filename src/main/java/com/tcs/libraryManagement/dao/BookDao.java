package com.tcs.libraryManagement.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.tcs.libraryManagement.model.Book;

public interface BookDao {
	List<Map<String, Object>> getBooks() throws SQLException;

	List<Book> getBook(Integer id) throws SQLException;

	Integer addBook(Book book) throws SQLException;

	Integer updateBook(Integer ISBN) throws SQLException;

	Integer deleteBook(Integer ISBN) throws SQLException;

	String testBook() throws SQLException;
}
