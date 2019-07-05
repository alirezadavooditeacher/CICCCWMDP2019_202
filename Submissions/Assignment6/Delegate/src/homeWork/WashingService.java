package homeWork;

public class WashingService {
	private String date;
	private int hour;
	public WashingService(String date, int hour) {
		super();
		this.date = date;
		this.hour = hour;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	
}
