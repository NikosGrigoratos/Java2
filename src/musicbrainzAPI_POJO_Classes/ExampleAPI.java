package musicbrainzAPI_POJO_Classes;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExampleAPI {

		@SerializedName("created")
		@Expose
		private String created;
		@SerializedName("count")
		@Expose
		private Integer count;
		@SerializedName("offset")
		@Expose
		private Integer offset;
		@SerializedName("artists")
		@Expose
		private List<ArtistAPI> artists = null;

		public String getCreated() {
		return created;
		}

		public void setCreated(String created) {
		this.created = created;
		}

		public Integer getCount() {
		return count;
		}

		public void setCount(Integer count) {
		this.count = count;
		}

		public Integer getOffset() {
		return offset;
		}

		public void setOffset(Integer offset) {
		this.offset = offset;
		}

		public List<ArtistAPI> getArtists() {
		return artists;
		}

		public void setArtists(List<ArtistAPI> artists) {
		this.artists = artists;
		}

}
