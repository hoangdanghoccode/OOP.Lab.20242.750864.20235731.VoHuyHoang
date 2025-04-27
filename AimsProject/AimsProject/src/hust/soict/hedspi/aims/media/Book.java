package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book {

	public Book() {
		// TODO Auto-generated constructor stub
	}
    
	private int id;
	private String title;
	private String category;
	private float cost;
	private List<String> authors = new ArrayList<String>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
	    if (!authors.contains(authorName)) {
	        authors.add(authorName);
	    } else {
	        System.out.println("Author already exists.");
	    }
	}

	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) {
			authors.remove(authorName);
		}
		else {
			System.out.println("Author not found.");
		}
	}
}
