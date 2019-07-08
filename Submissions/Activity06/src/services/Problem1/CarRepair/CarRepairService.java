package services.Problem1.CarRepair;

import services.Problem1.Service;

public class CarRepairService extends Service {

	public CarRepairServiceProtocolInterface delegate;
	private String carModel;
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CarRepairService(String description) {
		super();
		this.description = description;
	}
	
}
