package musicbrainzAPI_POJO_Classes;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LifeSpan___API {
	@SerializedName("begin")
	@Expose
	private String begin;
	@SerializedName("end")
	@Expose
	private String end;
	@SerializedName("ended")
	@Expose
	private Object ended;

	public String getBegin() {
	return begin;
	}

	public void setBegin(String begin) {
	this.begin = begin;
	}

	public String getEnd() {
	return end;
	}

	public void setEnd(String end) {
	this.end = end;
	}

	public Object getEnded() {
	return ended;
	}

	public void setEnded(Object ended) {
	this.ended = ended;
	}
}
