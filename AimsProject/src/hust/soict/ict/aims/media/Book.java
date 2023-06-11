package hust.soict.ict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();

	public Book(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}

	public Book(int id, String title, String category, float cost, ArrayList<String> authors) {
		super(id, title, category, cost);
		this.authors = authors;
	}

	public void addAuthor(String name) {
		if (!authors.contains(name)) {
			authors.add(name);
			System.out.println("Author added");
		} else {
			System.out.println("Author exists, cannot add");
		}
	}

	public void removeAuthor(String name) {
		if (authors.contains(name)) {
			authors.remove(name);
			System.out.println("Author removed!");
		} else {
			System.out.println("Author not found");
		}
	}

	public String toString() {
		return "Book: id: " + this.getId() + " - " + this.getTitle() + " - " + this.getCategory() + " - $"
				+ this.getCost();
	}

}
