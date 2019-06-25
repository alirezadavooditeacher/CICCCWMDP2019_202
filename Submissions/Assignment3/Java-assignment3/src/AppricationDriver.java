import java.util.ArrayList;

public class AppricationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Problem0
		Holiday h1 = new Holiday("Independence Day", 4, "July");
		Holiday h2 = new Holiday("Chrismas", 24, "December");
		Holiday h3 = new Holiday("Ney year's day", 1, "January");

		boolean sameDate = Holiday.inSameMonth(h1, h2);
		System.out.println(sameDate);
		
		ArrayList<Holiday> hList = new ArrayList<Holiday>();
		hList.add(h1);
		hList.add(h2);
		hList.add(h3);
		double avgDate = Holiday.avgDate(hList);
		System.out.println(avgDate);
		
		
		//Problem1
		Movie m1 = new Movie("Casino Royale", "Eon Productions", "RG-13");
		Movie m2 = new Movie("Jurasic Parak", "Universal", "RG-10");
		Movie m3 = new Movie("Ghost Busters", "Warner");
		Movie m4 = new Movie("Toy Story", "Disney");

		ArrayList<Movie> mList = new ArrayList<Movie>();
		mList.add(m1);
		mList.add(m2);
		mList.add(m3);
		mList.add(m4);
		ArrayList<Movie> mListWPG = new ArrayList<Movie>();
		mListWPG = Movie.getPG(mList);
	}

}
