package files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.google.gson.Gson;

import basics.Album;
import basics.Compilation;
import basics.Group;
import basics.Person;
import basics.Release;

public class FileWrapper {
	public static void makeItJSONFromPerson(ArrayList<Person> arrayList) throws FileNotFoundException {
		String json = new Gson().toJson(arrayList);
		PrintWriter out = new PrintWriter("newFile.txt");
		out.println(json);
	}
	public static void makeItJSONFromGroup(ArrayList<Group> arrayList) throws FileNotFoundException {
		String json = new Gson().toJson(arrayList);
		PrintWriter out = new PrintWriter("newFile.txt");
		out.println(json);
	}
	public static void makeItJSONFromRelease(ArrayList<Release> arrayList) throws FileNotFoundException {
		String json = new Gson().toJson(arrayList);
		PrintWriter out = new PrintWriter("newFile.txt");
		out.println(json);
	}
	public static void makeItJSONFromCompilation(ArrayList<Compilation> arrayList) throws FileNotFoundException {
		String json = new Gson().toJson(arrayList);
		PrintWriter out = new PrintWriter("newFile.txt");
		out.println(json);
	}
	public static void makeItJSONFromAlbum(ArrayList<Album> arrayList) throws FileNotFoundException {
		String json = new Gson().toJson(arrayList);
		PrintWriter out = new PrintWriter("newFile.txt");
		out.println(json);
	}
}
