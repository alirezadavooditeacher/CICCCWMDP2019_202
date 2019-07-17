package Problem0.services;

public class CarRepairService {
	private String description;
	private String carModel;

	public CarRepairService(String description, String carModel) {
		super();
		this.description = description;
		this.carModel = carModel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
}
