package services;

public class PaintingProvider extends Provider {

	public PaintingServiceProtocolInterface delegate; //delegate
	
	public PaintingProvider(String name, String address, String company) {
		super(name, address, company);
	}
	
	public void receiveService() {
		
		PaintingService ps = this.delegate.paintService();
		System.out.println(ps.getExpectedEndDate());
		System.out.println(ps.getStartDate());
		System.out.println(ps.getDescription());
	}
	
}
