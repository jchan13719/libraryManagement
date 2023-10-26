package repository;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.BookDao;
import model.Book;

@Repository
public class BookRepository implements BookDao {
	private final Connection connection;

	@Autowired
	public BookRepository(DatabaseConnection connection) {
		this.connection = connection.getConnection();
	}

	public List<Book> getBooks() {
		return null;
	}

	@Override
	public List<Book> getBook(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer addBook(Book book) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateBook(Integer ISBN) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteBook(Integer ISBN) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
