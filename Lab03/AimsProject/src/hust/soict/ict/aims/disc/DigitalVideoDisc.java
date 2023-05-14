package hust.soict.ict.aims.disc;

public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs;
	
	private int id;
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	@Override
	//DEBUG FEATURE: to print out the items in the cart
	public String toString() {
		return id + ". DVD - " + title + " - " + category + " - " + director + " - " + length
				+ ": " + cost + "$";
	}
	
	public DigitalVideoDisc(String title) {
		this.id = ++nbDigitalVideoDiscs;
		this.title = title;
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		this(title);
		this.category = category;
		this.cost = cost;
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this(title, category, cost);
		this.director = director;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this(title, category, director, cost);
		this.length = length;
	}
		
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getCategories() {
		return category;
	}
	
	public String getDirector() {
		return director;
	}
	
	public int getLength() {
		return length;
	}
	
	public float getCost() {
		return cost;
	}

	public boolean isMatch(String searchTitle) {
		if(title.equals(searchTitle)) return true;
		return false;
	}
}
