package musicbrainzAPI_POJO_Classes;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArtistCredit_APIB {

	@SerializedName("artist")
	@Expose
	private Artist_APIB artist;

	public Artist_APIB getArtist() {
	return artist;
	}

	public void setArtist(Artist_APIB artist) {
	this.artist = artist;
	}
}
