
public class Student {
	private String firstName;
	private String lastName;
	private String address;
	private String yearOfBird;
	private double average;
	
	public Student(String firstName, String lastName, String address, String yearOfBird, double average) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.yearOfBird = yearOfBird;
		this.average = average;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getYearOfBird() {
		return yearOfBird;
	}

	public void setYearOfBird(String yearOfBird) {
		this.yearOfBird = yearOfBird;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}
	
	@Override
	public String toString() {
		return "FirstName : " + firstName + ", LastName: " + lastName + ", Address: " + address + ", YearOfBird :" + yearOfBird + ", Average : " + average;
	}

}
