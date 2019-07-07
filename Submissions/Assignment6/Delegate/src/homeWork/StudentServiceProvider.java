package homeWork;

import java.util.Scanner;

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
		StudentService ss = delegate.studentService();
		System.out.println(ss.getLevel());
		System.out.println(ss.getTopic());
		Scanner s= new Scanner(System.in);
		System.out.println("Does the client need notification? Write true/false");
		boolean needOptionalNotification=s.nextBoolean();
		notificationService(needOptionalNotification,ss.getTopic() ,ss.getLevel());
	}
	
	public void notificationService(boolean orderedNotification, String serviceTopic, String serviceLevel ) {
		boolean notificationOrder=orderedNotification;
		if(notificationOrder) {
			System.out.println("Your StudenService on topic "+ serviceTopic+" and level "+ serviceLevel + " has been delivered");
			
		}
	}
}
