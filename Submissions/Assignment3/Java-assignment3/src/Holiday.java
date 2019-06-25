import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Holiday {
	private String name;
	private int day; 
	private String month;
	
	public Holiday(String name, int day, String month) {
		this.name = name;
		this.day = day;
		this.month = month;
	}
	
	public static boolean inSameMonth(Holiday h1, Holiday h2) {
		if (h1.month == h2.month) {
			return true;
		} else {
			return false;

		}
	}
	
	public static double avgDate(ArrayList<Holiday> hList) {
		int count = 0;
		int sumDate = 0;
		Iterator<Holiday> it = hList.iterator();
		
		while (it.hasNext()) {
			Holiday hx = it.next();
			sumDate = sumDate + hx.day;
			count++;
		}
		
		return sumDate / count;
		
	}
}
