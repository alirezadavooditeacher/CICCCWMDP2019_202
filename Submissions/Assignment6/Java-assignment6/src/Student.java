public class Student {
	private String firstName;
	private String lastName;
	private int gpa;
	
	public Student(String firstName, String lastName, int gpa) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
	}

	String getFirstName() {
		return firstName;
	}

	String getLastName() {
		return lastName;
	}

	int getGpa() {
		return gpa;
	}
	
	
}
