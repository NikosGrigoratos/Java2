package musicbrainzAPI_POJO_Classes;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class ReleaseEventAPIB {

	@SerializedName("date")
	@Expose
	private String date;
	@SerializedName("area")
	@Expose
	private AreaAPIB area;

	public String getDate() {
	return date;
	}

	public void setDate(String date) {
	this.date = date;
	}

	public AreaAPIB getArea() {
	return area;
	}

	public void setArea(AreaAPIB area) {
	this.area = area;
	}
}
