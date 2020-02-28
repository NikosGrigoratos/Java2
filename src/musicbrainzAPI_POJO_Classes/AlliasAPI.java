package musicbrainzAPI_POJO_Classes;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AlliasAPI {

	@SerializedName("sort-name")
	@Expose
	private String sortName;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("locale")
	@Expose
	private Object locale;
	@SerializedName("type")
	@Expose
	private Object type;
	@SerializedName("primary")
	@Expose
	private Object primary;
	@SerializedName("begin-date")
	@Expose
	private Object beginDate;
	@SerializedName("end-date")
	@Expose
	private Object endDate;
	@SerializedName("type-id")
	@Expose
	private String typeId;

	public String getSortName() {
	return sortName;
	}

	public void setSortName(String sortName) {
	this.sortName = sortName;
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

	public Object getLocale() {
	return locale;
	}

	public void setLocale(Object locale) {
	this.locale = locale;
	}

	public Object getType() {
	return type;
	}

	public void setType(Object type) {
	this.type = type;
	}

	public Object getPrimary() {
	return primary;
	}

	public void setPrimary(Object primary) {
	this.primary = primary;
	}

	public Object getBeginDate() {
	return beginDate;
	}

	public void setBeginDate(Object beginDate) {
	this.beginDate = beginDate;
	}

	public Object getEndDate() {
	return endDate;
	}

	public void setEndDate(Object endDate) {
	this.endDate = endDate;
	}

	public String getTypeId() {
	return typeId;
	}

	public void setTypeId(String typeId) {
	this.typeId = typeId;
	}

}

