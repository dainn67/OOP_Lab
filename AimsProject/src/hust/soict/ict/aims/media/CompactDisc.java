package hust.soict.ict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private List<Track> tracks = new ArrayList<>();

	public CompactDisc(int id, String title, String category, float cost, String director, String artist) {
		super(id, title, category, cost, director);
		this.artist = artist;
	}

	public CompactDisc(int id, String title, String category, float cost, String director, String artist,
			ArrayList<Track> tracks) {
		super(id, title, category, cost, director);
		this.artist = artist;
		this.tracks = tracks;
	}

	public String getArtist() {
		return artist;
	}

	public void addTrack(Track track) {
		if (!tracks.contains(track)) {
			tracks.add(track);
			System.out.println("Track has been added!");
		} else
			System.out.println("Track exists, cannot add");
	}

	public void removeTrack(Track track) {
		if (tracks.contains(track)) {
			tracks.remove(track);
			System.out.println("Track removed!");
		} else
			System.out.println(track.getTitle() + "Track not found");
	}

	@Override
	public int getLength() {
		int totalLength = 0;
		for (Track track : tracks)
			totalLength += track.getLength();
		return totalLength;
	}

	public String toString() {
		return "CD: id: " + this.getId() + " - " + this.getTitle() + " - " + this.getCategory() + " - "
				+ this.getDirector() + " - " + this.getArtist() + " - " + this.getLength() + " - $" + this.getCost();
	}

	@Override
	public void play() {
		System.out.println("The CD has " + tracks.size() + " tracks");
		for (Track track : tracks)
			track.play();
	}
}
