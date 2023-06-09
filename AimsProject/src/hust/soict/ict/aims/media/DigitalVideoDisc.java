package hust.soict.ict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	private static int nbDigitalVideoDiscs = 0;

	public DigitalVideoDisc(String title) {
		super(nbDigitalVideoDiscs++, title);
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super(nbDigitalVideoDiscs++, title, category, cost);
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(nbDigitalVideoDiscs++, title, category, cost, director);
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(nbDigitalVideoDiscs++, title, category, cost, director, length);
	}

	public String toString() {
		return "Dvd: id: " + this.getId() + " - " + this.getTitle() + " - " + this.getCategory() + " - "
				+ this.getDirector() + " - " + this.getLength() + " - $" + this.getCost();
	}

	@Override
	public void play() {
		System.out.println("Now playing dvd: " + this.getTitle());
		System.out.println("Length: " + this.getLength());
	}
}
