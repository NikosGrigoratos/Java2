package basics;

public class Album extends Release {
	private String artist;

	public Album(String title, String status, String language, String releaseDate, String format, int trackCount,
			String artist) {
		super(title, status, language, releaseDate, format, trackCount);
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Album [artist=" + artist + "]";
	}

	
	
	
}
