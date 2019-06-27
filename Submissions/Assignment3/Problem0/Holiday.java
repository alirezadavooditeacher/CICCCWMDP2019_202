package Problem0;

public class Holiday {
	private String name;
	private int day;
	private String month;
	
	public Holiday(String name, int day, String month) {
		this.name = name;
		this.day = day;
		this.month = month;
	}
	
	public static boolean inSameMonth() {
		Holiday holiday1 = new Holiday("Canada Day", 1, "June");
		Holiday holiday2 = new Holiday("Special Day", 10, "July");
		
		if(holiday1.month == holiday2.month) {
			return true;
		}else {
			return false;	
		}	
	}
	
	public static double avgDate() {
		Holiday holiday3 = new Holiday("Lazyfellow Day", 13, "June");
		Holiday holiday4 = new Holiday("Victoria Day", 24 ,"June");
		Holiday holiday5 = new Holiday("Independence Day",4, "July");
		
		double avg = (holiday3.day+holiday4.day+holiday5.day)/3;
		return avg;
	}
}