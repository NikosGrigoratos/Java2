package musicbrainzAPI_POJO_Classes;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArtistAPIB {

	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("sort-name")
	@Expose
	private String sortName;
	@SerializedName("disambiguation")
	@Expose
	private String disambiguation;
	@SerializedName("aliases")
	@Expose
	private List<AliasAPIB> aliases = null;

	public String getId() {
	return id;
	}

	public void setId(String id) {
	this.id = id;
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

	public String getDisambiguation() {
	return disambiguation;
	}

	public void setDisambiguation(String disambiguation) {
	this.disambiguation = disambiguation;
	}

	public List<AliasAPIB> getAliases() {
	return aliases;
	}

	public void setAliases(List<AliasAPIB> aliases) {
	this.aliases = aliases;
	}
}
