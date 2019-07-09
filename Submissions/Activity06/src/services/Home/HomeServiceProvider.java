package services.Home;

public class HomeServiceProvider {

	public HomeServiceProtocolInterface delegate; //delegate

	public void receiveService() {
		System.out.println("Home Service Receives Service");
	}

}
