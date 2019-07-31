package services;

public class CleaningProvider extends Provider {

	public CleaningServiceProtocolInterface delegate; //delegate
	
	public void receiveService() {
		CleaningService cs = this.delegate.cleaningService();
		System.out.println(cs.getDescription());
	}
}
