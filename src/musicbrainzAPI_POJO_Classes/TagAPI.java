package musicbrainzAPI_POJO_Classes;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class TagAPI {
	@SerializedName("count")
	@Expose
	private Integer count;
	@SerializedName("name")
	@Expose
	private String name;

	public Integer getCount() {
	return count;
	}

	public void setCount(Integer count) {
	this.count = count;
	}

	public String getName() {
		if(name==null) {
			return "none";
		}else {
			return name;
		}
	}

	public void setName(String name) {
	this.name = name;
	}
}
