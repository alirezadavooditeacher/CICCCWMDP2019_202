package services;

import homeWork.*;

public class PaintingProvider extends Provider{

	
	public ServiceProtocolInterface delegate; //delegate
	
	public PaintingProvider(String name, String address, String company) {
		super();
		this.name = name;
		this.address = address;
		this.company = company;
	}
	
	@Override
	public void receiveService() {
		
		Service ps = this.delegate.paintingService();
		
		System.out.println(ps.getAddress());
		System.out.println(ps.getExpectedEndDate());
		System.out.println(ps.getStartDate());
		System.out.println(ps.getDescription());
		System.out.println(ps.getSize());
		System.out.println(ps.getPainingColor());
	}
	
}
