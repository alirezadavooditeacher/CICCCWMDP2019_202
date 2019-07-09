package services.Problem1.CarRepair;

import services.Problem1.Provider;

public class CarRepairServiceProvider extends Provider {

	public CarRepairServiceProtocolInterface delegate; //delegate

	public void receiveService() {
		CarRepairService cs = this.delegate.carRepairService();
		System.out.println(cs.getDescription());
	}
	
}
