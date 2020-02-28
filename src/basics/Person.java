package basics;
import java.util.*;

public class Person {
	private String id;
	private String name;
	private String gender;
	private String country;
	private String cities;
	private String birthDate;
	private String deathDate;
	private List<String> aliases = new ArrayList<String>();
	private List<String> tags = new ArrayList<String>();
	
	public Person(String id, String name, String gender, String country, String cities, String birthDate,
			String deathDate, List<String> aliases, List<String> tags) {
		
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.country = country;
		this.cities = cities;
		this.birthDate = birthDate;
		this.deathDate = deathDate;
		this.aliases = aliases;
		this.tags = tags;
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
	public String getCities() {
		return cities;
	}
	public void setCities(String cities) {
		this.cities = cities;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getDeathDate() {
		return deathDate;
	}
	public void setDeathDate(String deathDate) {
		this.deathDate = deathDate;
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
	
	public void setAllNull() {
		this.id = null;
		this.name = null;
		this.gender = null;
		this.country = null;
		this.cities = null;
		this.birthDate = null;
		this.deathDate = null;
		this.aliases = null;
		this.tags = null;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", country=" + country + ", cities="
				+ cities + ", birthDate=" + birthDate + ", deathDate=" + deathDate + ", aliases=" + aliases + ", tags="
				+ tags + "]";
	}
	
	
	
}
