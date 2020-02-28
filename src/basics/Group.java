package basics;
import java.util.*;


public class Group {
	private String id;
	private String name;
	private String country;
	private String cities;
	private String beginDate;
	private String endDate;
	private List<String> aliases = new ArrayList<String>();
	private List<String> tags = new ArrayList<String>();
	private List<Person> members = new ArrayList<Person>();
		
	public Group(String id, String name, String country, String cities, String beginDate, String endDate, List<String> aliases,
			List<String> tags, List<Person> members) {
		this.id = id;
                this.name = name;
		this.country = country;
		this.cities = cities;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.aliases = aliases;
		this.tags = tags;
		this.members = members;
	}

    public Group(Object object, Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCities() {
		return cities;
	}
	public void setCities(String cities) {
		this.cities = cities;
	}
	public String getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public List<String> getAliases() {
		return aliases;
	}
	public void setAliases(List<String> aliases) {
		this.aliases = aliases;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public List<Person> getMembers() {
		return members;
	}
	public void setMembers(List<Person> members) {
		this.members = members;
	}

    @Override
    public String toString() {
        return "Group  [" + "id=" + id + ", name=" + name + ", country=" + country + ", cities=" + cities + ", beginDate=" + beginDate + ", endDate=" + endDate + ", aliases=" + aliases + ", tags=" + tags + ", members=" + members + ']';
    }

	
	
	
}
