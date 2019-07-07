package homeWork;

public class StudentServiceProvider {
	private String name;
	private String adress;
	private String company;
	public ServiceProtocolInterface delegate;
	
	public StudentServiceProvider(String name, String adress, String company) {
		super();
		this.name = name;
		this.adress = adress;
		this.company = company;
	}
	
	public void recieveStudentService() {
		
	}
	
	public void notificationService(boolean orderedNotification, String serviceTopic, String serviceLevel ) {
		boolean notificationOrder=orderedNotification;
		if(notificationOrder) {
			System.out.println("Your StudenService on topic"+ serviceTopic);
			
		}
	}
}
