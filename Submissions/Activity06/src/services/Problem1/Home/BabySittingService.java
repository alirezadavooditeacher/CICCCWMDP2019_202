package services.Problem1.Home;

public class BabySittingService extends HomeService {

	public HomeServiceProtocolInterface delegate;
	private int ageOfChild;
	private int numberOfHour;
	private String description;

	public BabySittingService(int ageOfChild, int numberOfHour, String description) {
		super();
		this.ageOfChild = ageOfChild;
		this.numberOfHour = numberOfHour;
		this.description = description;
	}
	
}
