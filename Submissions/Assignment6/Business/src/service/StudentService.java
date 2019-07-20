package service;

public class StudentService extends Service {
	private String name;
	private int age;
	
	public StudentService(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
}
