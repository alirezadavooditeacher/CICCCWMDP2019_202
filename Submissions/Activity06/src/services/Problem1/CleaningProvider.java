package services.Problem1;

public class CleaningProvider extends Provider {

	public CleaningServiceProtocolInterface delegate; //delegate

	public CleaningProvider() {
		super();
	}
	
	public void receiveService() {
		CleaningService cs = this.delegate.cleaningService();
		System.out.println(cs.getDescription());
	}
}
