package Problem2;

public class Student {
	private String firstName;
	private String lastName;
	private int GPA;

	public Student() {
	}

	public Student(String firstName, String lastName, int gPA) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		GPA = gPA;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getGPA() {
		return GPA;
	}

	public void setGPA(int gPA) {
		GPA = gPA;
	}
}
