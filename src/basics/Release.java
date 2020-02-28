package basics;

public class Release {
	private String id;
	private String title;
	private String status;
	private String language;
	private String releaseDate;
	private String format;
	private int trackCount;	
	
	public Release(String title, String status, String language, String releaseDate, String format, int trackCount) {
		this.title = title;
		this.status = status;
		this.language = language;
		this.releaseDate = releaseDate;
		this.format = format;
		this.trackCount = trackCount;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public int getTrackCount() {
		return trackCount;
	}
	public void setTrackCount(int trackCount) {
		this.trackCount = trackCount;
	}

	@Override
	public String toString() {
		return "Release [title=" + title + ", status=" + status + ", language=" + language + ", releaseDate="
				+ releaseDate + ", format=" + format + ", trackCount=" + trackCount + "]";
	}
	
	
	
	
}
