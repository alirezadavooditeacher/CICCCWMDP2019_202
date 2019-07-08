package services.Home;

public class CookingService extends HomeService {

	public HomeServiceProtocolInterface delegate;
	private boolean useFire;
	private String typeOfDish;
	private String description;

	public CookingService(boolean useFire, String typeOfDish, String description) {
		super();
		this.useFire = useFire;
		this.typeOfDish = typeOfDish;
		this.description = description;
	}
	
}
