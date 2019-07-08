package services.Problem1.Home;

public class WashingService extends HomeService {

	public HomeServiceProtocolInterface delegate;
	private int numberOfRoom;
	private int squareFeet;
	private String description;

	public WashingService(int numberOfRoom, int squareFeet, String description) {
		super();
		this.numberOfRoom = numberOfRoom;
		this.squareFeet = squareFeet;
		this.description = description;
	}
	
}
