package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

	public Book(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}
    
	private List<String> authors = new ArrayList<String>();
	public List<String> getAuthors() {
		return authors;
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
	
	public String toString() {
		return "Book - " + getTitle() + " - " + getCategory() + " - " + getAuthors() + " - " + ": " + getCost() + "$";
	}
}
