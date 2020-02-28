package files;

import java.io.BufferedReader;
import java.io.InputStream;
import java.util.ArrayList;

import basics.Album;
import basics.Compilation;
import basics.Group;
import basics.Person;
import basics.Release;

public class APIWrapper {
	
	static APICaller http = new APICaller();
	
	public static ArrayList<Person> getArtistsByName(String artistname) throws Exception{
		String url = "http://musicbrainz.org/ws/2/artist/?query=artist:" + artistname + "%20AND%20type:person" + "&fmt=json";
		String json = http.getJSON(url);
		ArrayList<Person> artistsReturned = new ArrayList<Person>();
		artistsReturned = CreateJavaObject.createArtistsFromJSON(json);
		return artistsReturned;
	}
	
	public static ArrayList<Person> getArtistsFromCountry(String artistname, String country) throws Exception{
		String url = "http://musicbrainz.org/ws/2/artist/?query=artist:" + artistname + "%20AND%20type:person%20AND%20country:" + country + "&fmt=json";
		String json = http.getJSON(url);
		ArrayList<Person> artistsReturned = new ArrayList<Person>();
		artistsReturned = CreateJavaObject.createArtistsFromJSON(json);
		return artistsReturned;
	}
	
	public static ArrayList<Person> getArtistsByAlias(String artistname, String alias) throws Exception{
		String url = "http://musicbrainz.org/ws/2/artist/?query=artist:" + artistname + "%20AND%20type:person%20AND%20alias:" + alias + "&fmt=json";
		String json = http.getJSON(url);
		ArrayList<Person> artistsReturned = new ArrayList<Person>();
		artistsReturned = CreateJavaObject.createArtistsFromJSON(json);
		return artistsReturned;
	}
	
	public static ArrayList<Group> getGroupsByName(String groupname) throws Exception{
		String url = "http://musicbrainz.org/ws/2/artist/?query=artist:" + groupname + "%20AND%20type:group" + "&fmt=json";
		String json = http.getJSON(url);
		ArrayList<Group> groupsReturned = new ArrayList<Group>();
		groupsReturned = CreateJavaObject.createGroupsFromJSON(json);
		return groupsReturned;
	}
	
	public static ArrayList<Group> getGroupsFromCountry(String groupname, String country) throws Exception{
		String url = "http://musicbrainz.org/ws/2/artist/?query=artist:" + groupname + "%20AND%20type:group%20AND%20country:" + country + "&fmt=json";
		String json = http.getJSON(url);
		ArrayList<Group> groupsReturned = new ArrayList<Group>();
		groupsReturned = CreateJavaObject.createGroupsFromJSON(json);
		return groupsReturned;
	}
	
	public static ArrayList<Group> getGroupsByAlias(String groupname, String alias) throws Exception{
		String url = "http://musicbrainz.org/ws/2/artist/?query=artist:" + groupname + "%20AND%20type:group%20AND%20alias:" + alias + "&fmt=json";
		String json = http.getJSON(url);
		ArrayList<Group> groupsReturned = new ArrayList<Group>();
		groupsReturned = CreateJavaObject.createGroupsFromJSON(json);
		return groupsReturned;
	}
	
	public static ArrayList<Release> getReleasesByTitle(String title) throws Exception{
		String url = "http://musicbrainz.org/ws/2/recording/?query=title:" + title + "&fmt=json";
		String json = http.getJSON(url);
		ArrayList<Release> releasesReturned = new ArrayList<Release>();
		releasesReturned = CreateJavaObject.createReleasesFromJSON(json);
		return releasesReturned;
	}
	
	public static ArrayList<Album> getAlbumsByTitle(String title) throws Exception{
		String url = "http://musicbrainz.org/ws/2/recording/?query=title:" + title + "&fmt=json";
		String json = http.getJSON(url);
		ArrayList<Album> albumsReturned = new ArrayList<Album>();
		albumsReturned = CreateJavaObject.createAlbumsFromJSON(json);
		return albumsReturned;
	}
	
	public static ArrayList<Compilation> getCompialtionsByTitle(String title) throws Exception{
		String url = "http://musicbrainz.org/ws/2/recording/?query=title:" + title + "&fmt=json";
		String json = http.getJSON(url);
		ArrayList<Compilation> compilationsReturned = new ArrayList<Compilation>();
		compilationsReturned = CreateJavaObject.createCompilationsFromJSON(json);
		return compilationsReturned;
	}
	
}
