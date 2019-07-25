package Problem1.service;

public class CarRepairService extends Service {
	private String carModel;

	public CarRepairService(String description, String carModel) {
		super(description);
		this.carModel = carModel;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
}
