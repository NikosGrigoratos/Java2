package musicbrainzAPI_POJO_Classes;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class RecordingAPIB {

	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("score")
	@Expose
	private Integer score;
	@SerializedName("status")
	@Expose
	private String status;
	@SerializedName("title")
	@Expose
	private String title;
	@SerializedName("tracks")
	@Expose
	private int tracks;
	@SerializedName("length")
	@Expose
	private Integer length;
	@SerializedName("date")
	@Expose
	private String date;
	@SerializedName("type")
	@Expose
	private String type;
	@SerializedName("format")
	@Expose
	private String format;
	@SerializedName("video")
	@Expose
	private Object video;
	@SerializedName("releases")
	@Expose
	private List<ReleaseAPIB> releases = null;
	@SerializedName("isrcs")
	@Expose
	private List<String> isrcs = null;
	private ArtistAPIB artist;
	
	
	
	public ArtistAPIB getArtist() {
		return artist;
	}

	public void setArtist(ArtistAPIB artist) {
		this.artist = artist;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTracks() {
		return tracks;
	}

	public void setTracks(int tracks) {
		this.tracks = tracks;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getId() {
	return id;
	}

	public void setId(String id) {
	this.id = id;
	}

	public Integer getScore() {
	return score;
	}

	public void setScore(Integer score) {
	this.score = score;
	}

	public String getTitle() {
	return title;
	}

	public void setTitle(String title) {
	this.title = title;
	}

	public Integer getLength() {
	return length;
	}

	public void setLength(Integer length) {
	this.length = length;
	}

	public Object getVideo() {
	return video;
	}

	public void setVideo(Object video) {
	this.video = video;
	}

	public List<ReleaseAPIB> getReleases() {
	return releases;
	}

	public void setReleases(List<ReleaseAPIB> releases) {
	this.releases = releases;
	}

	public List<String> getIsrcs() {
	return isrcs;
	}

	public void setIsrcs(List<String> isrcs) {
	this.isrcs = isrcs;
	}
}
