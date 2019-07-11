package services;

public class CleaningProvider {

	public CleaningServiceProtocolInterface delegate; //delegate
	
	public void receiveService() {
		CleaningService cs = this.delegate.cleaningService();
		String description = cs.getDescription();

		System.out.println("description"+description);
	}
}
