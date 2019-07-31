package Problem1.service;

public class StudentServicesProvider {
	public StudentServiceProtocalInterface delegate; // delegate

	public void receiveService() {
		StudentServices cs = this.delegate.studentServices();
		System.out.println(cs.getDescription());
	}
}
