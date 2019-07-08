package homeWork;
import services.*;
public class CarRepairService extends Service{

	
	
	public CarRepairService(String description, String startDate, String expectedEndDate, String carModel) {
		super();
		this.description = description;
		this.startDate = startDate;
		this.expectedEndDate = expectedEndDate;
		this.carModel = carModel;
	}
		
}
