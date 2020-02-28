package musicbrainzAPI_POJO_Classes;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TrackAPIB {

	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("number")
	@Expose
	private String number;
	@SerializedName("title")
	@Expose
	private String title;
	@SerializedName("length")
	@Expose
	private Integer length;

	public String getId() {
	return id;
	}

	public void setId(String id) {
	this.id = id;
	}

	public String getNumber() {
	return number;
	}

	public void setNumber(String number) {
	this.number = number;
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

}
