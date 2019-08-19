package Problem1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Movie {
	private String title;
	private String studio;
	private String rating;
	
	public Movie(String title,String studio,String rating){
		this.title=title;
		this.studio=studio;
		this.rating=rating;
	}
	public static List<String> getPG() {
		List<String> movie = null;
		Movie movie1 = new Movie("Casino Royal","Eon Production","PG-13");
		Movie movie2 = new Movie("Casino Hotel","Eyn Production","R-18");
		Movie movie3 = new Movie("Casino BattleRoyal","Elen Production","R-20");
		Movie movie4 = new Movie("Casino Babe","Boss Production","PG-13");
		
		Map<String, List<String>> map1 = new HashMap<>();
		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<String> list3 = new ArrayList<String>();
		    list.add(movie1.title);
		    list.add(movie4.title);                                                                                                  
		    list2.add(movie1.title);                                    
		    list3.add(movie2.title);	
		    
		map1.put(movie2.rating, list2);
		map1.put(movie3.rating, list3);
		map1.put(movie4.rating, list);
		
		for(String key: map1.keySet()) {
			
			if(key.equals("PG-13")) {
				 movie =map1.get(key);	
			}
		}
		return movie;
	}
				
	// your code goes here
}
	
