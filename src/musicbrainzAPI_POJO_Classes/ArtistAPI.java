package musicbrainzAPI_POJO_Classes;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArtistAPI {
	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("type")
	@Expose
	private String type;
	@SerializedName("type-id")
	@Expose
	private String typeId;
	@SerializedName("score")
	@Expose
	private Integer score;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("sort-name")
	@Expose
	private String sortName;
	@SerializedName("gender")
	@Expose
	private String gender;
	@SerializedName("country")
	@Expose
	private String country;
	@SerializedName("area")
	@Expose
	private AreaAPI area;
	@SerializedName("begin-area")
	@Expose
	private BeginAreaAPI beginArea;
	@SerializedName("end-area")
	@Expose
	private EndAreaAPI endArea;
	@SerializedName("life-span")
	@Expose
	private LifeSpan___API lifeSpan;
	@SerializedName("aliases")
	@Expose
	private List<AlliasAPI> alliases = null;
	@SerializedName("ipis")
	@Expose
	private List<String> ipis = null;
	@SerializedName("tags")
	@Expose
	private List<TagAPI> tags = null;
	@SerializedName("disambiguation")
	@Expose
	private String disambiguation;

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

	public Integer getScore() {
	return score;
	}

	public void setScore(Integer score) {
	this.score = score;
	}

	public String getName() {
	return name;
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

	public String getGender() {
	return gender;
	}

	public void setGender(String gender) {
	this.gender = gender;
	}

	public String getCountry() {
	return country;
	}

	public void setCountry(String country) {
	this.country = country;
	}

	public AreaAPI getArea() {
	return area;
	}

	public void setArea(AreaAPI area) {
	this.area = area;
	}

	public BeginAreaAPI getBeginArea() {
		
		if(beginArea == null) {
			BeginAreaAPI rt = new BeginAreaAPI();
			rt.setName("none");
			return rt;
		}else {
			return beginArea;
		}
	}

	public void setBeginArea(BeginAreaAPI beginArea) {
	this.beginArea = beginArea;
	}

	public EndAreaAPI getEndArea() {
		return endArea;
	}

	public void setEndArea(EndAreaAPI endArea) {
	this.endArea = endArea;
	}

	public LifeSpan___API getLifeSpan() {
	return lifeSpan;
	}

	public void setLifeSpan(LifeSpan___API lifeSpan) {
	this.lifeSpan = lifeSpan;
	}

	public List<AlliasAPI> getAliases() {
		if(alliases == null) {
			ArrayList<AlliasAPI> al = new ArrayList<AlliasAPI>();
			return al;
		}else {
			return alliases;
		}
	}

	public void setAliases(List<AlliasAPI> aliases) {
	this.alliases = aliases;
	}

	public List<String> getIpis() {
	return ipis;
	}

	public void setIpis(List<String> ipis) {
	this.ipis = ipis;
	}

	public List<TagAPI> getTags() {
		if(tags == null) {
			ArrayList<TagAPI> t = new ArrayList<TagAPI>();
			return t;
		}else {
			return tags;
		}
	}

	public void setTags(List<TagAPI> tags) {
	this.tags = tags;
	}

	public String getDisambiguation() {
	return disambiguation;
	}

	public void setDisambiguation(String disambiguation) {
	this.disambiguation = disambiguation;
	}

	@Override
	public String toString() {
		return "ArtistAPI [id=" + id + ", type=" + type + ", name=" + name + ", gender=" + gender + ", country="
				+ country + ", area=" + area + ", lifeSpan=" + lifeSpan + ", alliases=" + alliases + ", tags=" + tags
				+ "]";
	}
	
	
}
