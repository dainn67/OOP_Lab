package hust.soict.ict.aims.media;

public class Track implements Playable{
	private String title;
	private int length;
	
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}

	@Override
	public void play() {
		System.out.println("Now playing track: " + this.getTitle());
		System.out.println("Length: " + this.getLength());			
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

		//if not an instance of Track
        if (o == null || !(o instanceof Track)) {
            return false;
        }
		
        Track track = (Track) o;
        return title.equals(track.title) && (length == track.length);
    }
}
