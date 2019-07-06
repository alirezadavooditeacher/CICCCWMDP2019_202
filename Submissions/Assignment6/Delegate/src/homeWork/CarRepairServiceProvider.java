package homeWork;

import services.*;

public class CarRepairServiceProvider {
	private String name;
	private String address;
	private String company;
	public ServiceProtocolInterface delegate;
	
	public CarRepairServiceProvider(String name, String address, String company) {
		super();
		this.name = name;
		this.address = address;
		this.company = company;
	}
	
	public void recieveService() {
		CarRepairService repairService=this.delegate.carRepairService();
		System.out.println(repairService.getDescription());
		System.out.println(repairService.getCarModel());
		System.out.println(repairService.getStartDate());
		System.out.println(repairService.getExpectedEndDate());
	}
}
