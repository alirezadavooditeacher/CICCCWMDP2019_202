import java.util.ArrayList;
import java.util.Iterator;

public class Movie {
	private String title;
	private String studio;
	private String rating;
	
	public Movie(String title, String studio, String rating) {
		this.title = title;
		this.studio = studio;
		this.rating = rating;
	}

	public Movie(String title, String studio) {
		super();
		this.title = title;
		this.studio = studio;
		this.rating = "PG";
	}
	
	public static ArrayList<Movie> getPG(ArrayList<Movie> mList) {
		Iterator<Movie> it = mList.iterator();
		ArrayList<Movie> mListWPG = new ArrayList<Movie>();
		
		while (it.hasNext()) {
			Movie mx = it.next();
			if (mx.rating.equals("PG")) {
				mListWPG.add(mx);
			}
		}
		
		return mListWPG;
		
	}
	
	
	
}
