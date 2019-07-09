package services.CarRepair;

public class CarRepairService {

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
