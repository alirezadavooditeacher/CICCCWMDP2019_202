package Problem0.services;

public class CarRepairServiceProvider {
	public CarRepairServiceProtocalInterface delegate; // delegate

	public void receiveService() {
		CarRepairService cs = this.delegate.carRepairService();
		System.out.println(cs.getDescription());
	}
}
