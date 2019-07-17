package services;

public class StudentService {
	private String name;
	private int age;
	
	public StudentService(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}
	
	
}
