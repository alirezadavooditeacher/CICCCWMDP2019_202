package services;

public class CarRepairService {

	private String description;
	private String model;
	
	public CarRepairService(String description, String model) {
		super();
		this.description = description;
		this.model = model;
	}

	String getDescription() {
		return description;
	}

	String getModel() {
		return model;
	}
	
	

}
