package musicbrainzAPI_POJO_Classes;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MediumAPIB {

	@SerializedName("position")
	@Expose
	private Integer position;
	@SerializedName("track")
	@Expose
	private List<TrackAPIB> track = null;
	@SerializedName("track-count")
	@Expose
	private Integer trackCount;
	@SerializedName("track-offset")
	@Expose
	private Integer trackOffset;
	@SerializedName("format")
	@Expose
	private String format;

	public Integer getPosition() {
	return position;
	}

	public void setPosition(Integer position) {
	this.position = position;
	}

	public List<TrackAPIB> getTrack() {
	return track;
	}

	public void setTrack(List<TrackAPIB> track) {
	this.track = track;
	}

	public Integer getTrackCount() {
	return trackCount;
	}

	public void setTrackCount(Integer trackCount) {
	this.trackCount = trackCount;
	}

	public Integer getTrackOffset() {
	return trackOffset;
	}

	public void setTrackOffset(Integer trackOffset) {
	this.trackOffset = trackOffset;
	}

	public String getFormat() {
	return format;
	}

	public void setFormat(String format) {
	this.format = format;
	}
}
