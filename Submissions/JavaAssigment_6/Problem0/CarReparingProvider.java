package Services;

public class CarReparingProvider {
	
	public CarReparingServiceProtocolInterface delegate; //delegate
	
	public void receiveService() {
		CarReparingService cs = this.delegate.CarReparingService();
		System.out.println(cs.getDescription());
	}

}
