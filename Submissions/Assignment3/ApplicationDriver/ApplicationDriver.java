package ApplicationDriver;

import java.util.List;
import Problem0.Holiday;
import Problem1.Movie;

public class ApplicationDriver {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		problem1();
		problem2();
	}
	public static void problem1() {
		boolean result = Holiday.inSameMonth();
	    double avg=Holiday.avgDate();
	    System.out.println(avg);
		System.out.println(result);
	}
	public static void problem2() {
		List<String> title=Movie.getPG();
		System.out.println(title);
	}
}