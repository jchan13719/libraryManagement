package dao;

import java.sql.SQLException;
import java.util.List;

import model.Book;

public interface BookDao {
	List<Book> getBooks() throws SQLException;

	List<Book> getBook(Integer id) throws SQLException;

	Integer addBook(Book book) throws SQLException;

	Integer updateBook(Integer ISBN) throws SQLException;

	Integer deleteBook(Integer ISBN) throws SQLException;
}
