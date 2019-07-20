package services;

public class PaintingProvider {

	public PrintingServiceProtocolInterface delegate; //delegate
	
	public PaintingProvider(PrintingServiceProtocolInterface delegate) {
		super();
		this.delegate = delegate;
	}

	public void receiveService() {
		PaintingService ps = this.delegate.paintingService();
		
		System.out.println(ps.getAddress());
		System.out.println(ps.getExpectedEndDate());
		System.out.println(ps.getStartDate());
		System.out.println(ps.getDescription());
		System.out.println(ps.getSize());
		System.out.println(ps.getPainingColor());
	}
	
}