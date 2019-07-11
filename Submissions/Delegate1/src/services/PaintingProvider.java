package services;

public class PaintingProvider {

	private String name;
	private String address;
	private String company;
	public ServiceProtocolInterface delegate; //delegate
	
	public PaintingProvider(String name, String address, String company) {
		super();
		this.name = name;
		this.address = address;
		this.company = company;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
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
