package repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.BookDao;
import model.Book;

@Repository
public class BookRepository implements BookDao {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public BookRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Map<String, Object>> getBooks() throws SQLException {
		String sql = "SELECT * from Book";
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public List<Book> getBook(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer addBook(Book book) throws SQLException {
//		String sql = "";
//		return jdbcTemplate.queryForList(sql);
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

	@Override
	public String testBook() throws SQLException {

		return "Hello world";
	}

}
