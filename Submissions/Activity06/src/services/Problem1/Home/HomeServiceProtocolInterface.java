package services.Problem1.Home;

import services.Problem1.Interface;

public interface HomeServiceProtocolInterface extends Interface {

	public BabySittingService babySittingService();
	public WashingService washingService();
	public CookingService cookingService();
}
