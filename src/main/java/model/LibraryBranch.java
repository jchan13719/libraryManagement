package model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libraryBranch")
public class LibraryBranch {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	private String location;
	private ArrayList<Book> allBooks;
	private ArrayList<Borrower> allBorrowers;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public ArrayList<Book> getAllBooks() {
		return allBooks;
	}

	public void setAllBooks(ArrayList<Book> allBooks) {
		this.allBooks = allBooks;
	}

	public ArrayList<Borrower> getAllBorrowers() {
		return allBorrowers;
	}

	public void setAllBorrowers(ArrayList<Borrower> allBorrowers) {
		this.allBorrowers = allBorrowers;
	}

}
