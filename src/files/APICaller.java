package files;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class APICaller {
	private static OkHttpClient client = new OkHttpClient();
	
	public static String getJSON(String url) throws IOException {
		Request request = new Request.Builder()
			.url(url)
			.build();

			  try (Response response = client.newCall(request).execute()) {
				  return response.body().string();
			  }
		}
	
}
