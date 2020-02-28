package musicbrainzAPI_POJO_Classes;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class LifeSpanAPI {
	@SerializedName("ended")
	@Expose
	private Object ended;

	public Object getEnded() {
	return ended;
	}

	public void setEnded(Object ended) {
	this.ended = ended;
	}
}
