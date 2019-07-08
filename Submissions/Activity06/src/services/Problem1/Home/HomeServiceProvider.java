package services.Problem1.Home;

import services.Problem1.Provider;

public class HomeServiceProvider extends Provider {

	public HomeServiceProtocolInterface delegate; //delegate

	public HomeServiceProvider() {
		super();
	}

	public void receiveService() {
		System.out.println("Home Service Receives Service");
	}

}
