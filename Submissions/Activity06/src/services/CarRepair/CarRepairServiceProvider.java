package services.CarRepair;

public class CarRepairServiceProvider {

	public CarRepairServiceProtocolInterface delegate; //delegate

	public void receiveService() {
		CarRepairService cs = this.delegate.carRepairService();
		System.out.println(cs.getDescription());
	}
	
}
