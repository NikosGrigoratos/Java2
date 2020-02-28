package files;

public class Tools {
	public static String makeItJSONArrayString(String stringGiven) {
		String jsonArrayToBe = stringGiven.substring(stringGiven.indexOf("["));
		String str = jsonArrayToBe.substring(0, jsonArrayToBe.length() - 1);
		return str;
	}
}
