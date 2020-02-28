package musicbrainzAPI_POJO_Classes;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class ReleaseAPIB {

	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("count")
	@Expose
	private Integer count;
	@SerializedName("title")
	@Expose
	private String title;
	@SerializedName("status")
	@Expose
	private String status;
	@SerializedName("artist-credit")
	@Expose
	private List<ArtistCredit_APIB> artistCredit = null;
	@SerializedName("release-group")
	@Expose
	private ReleaseGroupAPIB releaseGroup;
	@SerializedName("track-count")
	@Expose
	private Integer trackCount;
	@SerializedName("media")
	@Expose
	private List<MediumAPIB> media = null;
	@SerializedName("date")
	@Expose
	private String date;
	@SerializedName("country")
	@Expose
	private String country;
	@SerializedName("release-events")
	@Expose
	private List<ReleaseEventAPIB> releaseEvents = null;

	public String getId() {
	return id;
	}

	public void setId(String id) {
	this.id = id;
	}

	public Integer getCount() {
	return count;
	}

	public void setCount(Integer count) {
	this.count = count;
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

	public List<ArtistCredit_APIB> getArtistCredit() {
	return artistCredit;
	}

	public void setArtistCredit(List<ArtistCredit_APIB> artistCredit) {
	this.artistCredit = artistCredit;
	}

	public ReleaseGroupAPIB getReleaseGroup() {
	return releaseGroup;
	}

	public void setReleaseGroup(ReleaseGroupAPIB releaseGroup) {
	this.releaseGroup = releaseGroup;
	}

	public Integer getTrackCount() {
	return trackCount;
	}

	public void setTrackCount(Integer trackCount) {
	this.trackCount = trackCount;
	}

	public List<MediumAPIB> getMedia() {
	return media;
	}

	public void setMedia(List<MediumAPIB> media) {
	this.media = media;
	}

	public String getDate() {
	return date;
	}

	public void setDate(String date) {
	this.date = date;
	}

	public String getCountry() {
	return country;
	}

	public void setCountry(String country) {
	this.country = country;
	}

	public List<ReleaseEventAPIB> getReleaseEvents() {
	return releaseEvents;
	}

	public void setReleaseEvents(List<ReleaseEventAPIB> releaseEvents) {
	this.releaseEvents = releaseEvents;
	}
}
