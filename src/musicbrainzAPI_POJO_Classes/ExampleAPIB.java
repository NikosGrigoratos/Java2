package musicbrainzAPI_POJO_Classes;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class ExampleAPIB {
	
	@SerializedName("created")
	@Expose
	private String created;
	@SerializedName("count")
	@Expose
	private Integer count;
	@SerializedName("offset")
	@Expose
	private Integer offset;
	@SerializedName("recordings")
	@Expose
	private List<RecordingAPIB> recordings = null;

	public String getCreated() {
	return created;
	}

	public void setCreated(String created) {
	this.created = created;
	}

	public Integer getCount() {
	return count;
	}

	public void setCount(Integer count) {
	this.count = count;
	}

	public Integer getOffset() {
	return offset;
	}

	public void setOffset(Integer offset) {
	this.offset = offset;
	}

	public List<RecordingAPIB> getRecordings() {
		if(recordings==null) {
			ArrayList<RecordingAPIB> empty = new ArrayList<RecordingAPIB>();
			return empty;
		}else {
			return recordings;
		}	
	}

	public void setRecordings(List<RecordingAPIB> recordings) {
	this.recordings = recordings;
	}
}
