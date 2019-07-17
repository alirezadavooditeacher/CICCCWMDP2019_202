package Problem0.services;

public class HomeServiceProvider {
	public HomeServiceProtocolInterface delegate; // delegate

	public void receiveCookingService() {
		CookingService cs = this.delegate.cookingService();
		System.out.println(cs.getDescription());
	}

	public void receiveWashingService() {
		WashingService cs = this.delegate.washingService();
		System.out.println(cs.getDescription());
	}

	public void receiveBabySittingService() {
		BabySittingService cs = this.delegate.babySittingService();
		System.out.println(cs.getDescription());
	}
}
