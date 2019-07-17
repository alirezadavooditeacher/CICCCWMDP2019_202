package Problem1.service;

public class CarRepairServiceProvider {
	public CarRepairServiceProtocalInterface delegate; // delegate

	public void receiveService() {
		CarRepairService cs = this.delegate.carRepairService();
		System.out.println(cs.getDescription());
	}
}
