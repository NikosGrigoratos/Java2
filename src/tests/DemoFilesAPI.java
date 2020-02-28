package tests;

import com.google.gson.Gson;
import db.Database;

import files.APIWrapper;
import files.FileWrapper;

public class DemoFilesAPI {
	public static void main(String args[]) throws Exception {
		// creating the db and the tables
                Database.init();
                Database.CreatePersonTable();
                Database.CreateGroupTable();
                /*the objects get added to the db RIGHT AFTER THEY ARE CREATED, so below we create the objects from the
                json and we also add them to the db*/
		System.out.println(APIWrapper.getArtistsByName("Nick"));
		System.out.println(APIWrapper.getArtistsFromCountry("Fred", "US"));
		System.out.println(APIWrapper.getArtistsByAlias("Nick", "Nick"));
		System.out.println(APIWrapper.getGroupsByName("Fred"));
		System.out.println(APIWrapper.getGroupsFromCountry("Metallica", "US"));
		System.out.println(APIWrapper.getGroupsByAlias("Metallica", "Metallica"));
		System.out.println(APIWrapper.getReleasesByTitle("Love"));
		System.out.println(APIWrapper.getAlbumsByTitle("Love"));
		System.out.println(APIWrapper.getCompialtionsByTitle("Love"));
                
                //To create the files
                /*
		FileWrapper.makeItJSONFromPerson(APIWrapper.getArtistsByName("Nick"));
		FileWrapper.makeItJSONFromGroup(APIWrapper.getGroupsByName("Metallica"));
		FileWrapper.makeItJSONFromRelease(APIWrapper.getReleasesByTitle("Love"));
		FileWrapper.makeItJSONFromCompilation(APIWrapper.getCompialtionsByTitle("Love"));
		FileWrapper.makeItJSONFromAlbum(APIWrapper.getAlbumsByTitle("Love"));
		*/
                
                //to search, the results get printed instead of returned.
                Database.getGroupsFromDb("name", "Fred");
                Database.getPersonsFromDb("Name", "Metallica");
                
	}
}
