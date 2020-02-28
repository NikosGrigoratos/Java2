package musicbrainzAPI_POJO_Classes;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BeginAreaAPI {
	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("type")
	@Expose
	private String type;
	@SerializedName("type-id")
	@Expose
	private String typeId;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("sort-name")
	@Expose
	private String sortName;
	@SerializedName("life-span")
	@Expose
	private LifeSpan_API lifeSpan;

	public String getId() {
	return id;
	}

	public void setId(String id) {
	this.id = id;
	}

	public String getType() {
	return type;
	}

	public void setType(String type) {
	this.type = type;
	}

	public String getTypeId() {
	return typeId;
	}

	public void setTypeId(String typeId) {
	this.typeId = typeId;
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

	public String getSortName() {
	return sortName;
	}

	public void setSortName(String sortName) {
	this.sortName = sortName;
	}

	public LifeSpan_API getLifeSpan() {
	return lifeSpan;
	}

	public void setLifeSpan(LifeSpan_API lifeSpan) {
	this.lifeSpan = lifeSpan;
	}
}
