package basics;
import java.util.*;

public class Compilation extends Release {
	private List<Object> arists = new ArrayList<Object>();

	public Compilation(String title, String status, String language, String releaseDate, String format, int trackCount,
			List<Object> arists) {
		super(title, status, language, releaseDate, format, trackCount);
		this.arists = arists;
	}

	public List<Object> getArists() {
		return arists;
	}

	public void setArists(List<Object> arists) {
		this.arists = arists;
	}

	@Override
	public String toString() {
		return "Compilation [arists=" + arists + "]";
	}
	
	
	
}
