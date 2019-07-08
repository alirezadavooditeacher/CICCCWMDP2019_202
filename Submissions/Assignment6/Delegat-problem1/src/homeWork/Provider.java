package homeWork;

public class Provider {

	protected String name;
	protected String address;
	protected String company;
	public ServiceProtocolInterface delegate;
	
	
	public void receiveService() {
		Service service = this.delegate.orderService();
		System.out.println("ServiceRecieved");
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

	
}

