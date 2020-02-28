package files;

import java.io.BufferedReader;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import basics.Album;
import basics.Compilation;
import basics.Group;
import basics.Person;
import basics.Release;
import db.Database;
import java.sql.SQLException;
import musicbrainzAPI_POJO_Classes.AlliasAPI;
import musicbrainzAPI_POJO_Classes.ArtistAPI;
import musicbrainzAPI_POJO_Classes.ArtistAPIB;
import musicbrainzAPI_POJO_Classes.ExampleAPI;
import musicbrainzAPI_POJO_Classes.ExampleAPIB;
import musicbrainzAPI_POJO_Classes.RecordingAPIB;
import musicbrainzAPI_POJO_Classes.TagAPI;


public class CreateJavaObject {
	public static ArrayList<Person> createArtistsFromJSON(String apiResponse) throws IOException, SQLException{
		ArrayList<Person> artistsToReturn = new ArrayList<Person>();
		ArrayList<String> alList = new ArrayList<String>();
		ArrayList<String> tagList = new ArrayList<String>();
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonObject artistsJSONObject = parser.parse(apiResponse.trim()).getAsJsonObject();
		
		ExampleAPI test = gson.fromJson(apiResponse, musicbrainzAPI_POJO_Classes.ExampleAPI.class);
		ArrayList<ArtistAPI> allArtists = new ArrayList<ArtistAPI>();
		allArtists = (ArrayList<ArtistAPI>) test.getArtists();
		for(ArtistAPI a : allArtists) {
			Person temp = new Person(null, null, null, null, null, null, null, null, null);
			temp.setId(a.getId());
			temp.setName(a.getName());
			temp.setGender(a.getGender());
			temp.setCountry(a.getCountry());
			temp.setCities(a.getBeginArea().getName());
			temp.setBirthDate(a.getLifeSpan().getBegin());
			temp.setDeathDate(a.getLifeSpan().getEnd());
			for(AlliasAPI al : a.getAliases()) {
				alList.add(al.getName());
			}
			for(TagAPI tg : a.getTags()) {
				tagList.add(tg.getName());
			}
			temp.setAliases(alList);
			temp.setTags(tagList);
			artistsToReturn.add(temp);
                        Database.AddPersonToDB(temp);
		}
		return artistsToReturn;
	}

	public static ArrayList<Group> createGroupsFromJSON(String apiResponse) throws SQLException{
		ArrayList<Group> groupsToReturn = new ArrayList<Group>();
		ArrayList<String> alList = new ArrayList<String>();
		ArrayList<String> tagList = new ArrayList<String>();
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonObject groupsJSONObject = parser.parse(apiResponse.trim()).getAsJsonObject();
		
		ExampleAPI test = gson.fromJson(apiResponse, musicbrainzAPI_POJO_Classes.ExampleAPI.class);
		ArrayList<ArtistAPI> allGroups = new ArrayList<ArtistAPI>();
		allGroups = (ArrayList<ArtistAPI>) test.getArtists();
		
		for(ArtistAPI a : allGroups) {
			Group temp = new Group(null, null, null, null, null, null, null, null, null);
			temp.setId(a.getId());
			temp.setName(a.getName());
			temp.setCountry(a.getCountry());
			temp.setCities(a.getBeginArea().getName());
			temp.setBeginDate(a.getLifeSpan().getBegin());
			temp.setEndDate(a.getLifeSpan().getEnd());
			for(AlliasAPI al : a.getAliases()) {
				alList.add(al.getName());
			}
			for(TagAPI tg : a.getTags()) {
				tagList.add(tg.getName());
			}
			temp.setAliases(alList);
			temp.setTags(tagList);
			groupsToReturn.add(temp);
                        Database.addGroupToDB(temp);
                        
		}
		
		return groupsToReturn;
	}
	
	public static ArrayList<Release> createReleasesFromJSON(String apiResponse){
		ArrayList<Release> releasesToReturn = new ArrayList<Release>();
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonObject releasesJSONObject = parser.parse(apiResponse.trim()).getAsJsonObject();
		
		ExampleAPIB test = gson.fromJson(apiResponse, musicbrainzAPI_POJO_Classes.ExampleAPIB.class);
		ArrayList<RecordingAPIB> allReleases = new ArrayList<RecordingAPIB>();
		allReleases = (ArrayList<RecordingAPIB>) test.getRecordings();
		for(RecordingAPIB r : allReleases) {
			Release temp = new Release(null, null, null, null, null, 0);
			temp.setId(r.getId());
			temp.setTitle(r.getTitle());
			temp.setStatus(r.getStatus());
			temp.setReleaseDate(r.getDate());
			temp.setFormat(r.getFormat());
			temp.setTrackCount(r.getTracks());
			releasesToReturn.add(temp);
		}
		return releasesToReturn;
		
	}
	
	public static ArrayList<Album> createAlbumsFromJSON(String apiResponse){
		ArrayList<Album> albumsToReturn = new ArrayList<Album>();
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonObject albumsJSONObject = parser.parse(apiResponse.trim()).getAsJsonObject();
		
		ExampleAPIB test = gson.fromJson(apiResponse, musicbrainzAPI_POJO_Classes.ExampleAPIB.class);
		ArrayList<RecordingAPIB> allAlbums = new ArrayList<RecordingAPIB>();
		allAlbums = (ArrayList<RecordingAPIB>) test.getRecordings();
		for(RecordingAPIB r : allAlbums) {
			Album temp = new Album(null, null, null, null, null, 0, null);
			temp.setId(r.getId());
			temp.setTitle(r.getTitle());
			temp.setStatus(r.getStatus());
			temp.setReleaseDate(r.getDate());
			temp.setFormat(r.getFormat());
			temp.setTrackCount(r.getTracks());
			temp.setArtist(r.getType());
			albumsToReturn.add(temp);
		}
		return albumsToReturn;
		
	}
	
	public static ArrayList<Compilation> createCompilationsFromJSON(String apiResponse){
		ArrayList<Compilation> compilationsToReturn = new ArrayList<Compilation>();
		ArrayList<Object> aList = new ArrayList<Object>();
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonObject compilationJSONObject = parser.parse(apiResponse.trim()).getAsJsonObject();
		
		ExampleAPIB test = gson.fromJson(apiResponse, musicbrainzAPI_POJO_Classes.ExampleAPIB.class);
		ArrayList<RecordingAPIB> allCompilations = new ArrayList<RecordingAPIB>();
		allCompilations = (ArrayList<RecordingAPIB>) test.getRecordings();
		for(RecordingAPIB r : allCompilations) {
			Compilation temp = new Compilation(null, null, null, null, null, 0, null);
			temp.setId(r.getId());
			temp.setTitle(r.getTitle());
			temp.setStatus(r.getStatus());
			temp.setReleaseDate(r.getDate());
			temp.setFormat(r.getFormat());
			temp.setTrackCount(r.getTracks());
			aList.add(r.getArtist());
			temp.setArists(aList);
					
			
			compilationsToReturn.add(temp);
		}
		return compilationsToReturn;
	}
	
}
