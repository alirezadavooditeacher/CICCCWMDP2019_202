package service;

public class CarRepairService extends Service  {

	private String description;
	private String model;
	
	public CarRepairService(String description, String model) {
		super();
		this.description = description;
		this.model = model;
	}

	public String getDescription() {
		return description;
	}

	public String getModel() {
		return model;
	}
	
	

}
