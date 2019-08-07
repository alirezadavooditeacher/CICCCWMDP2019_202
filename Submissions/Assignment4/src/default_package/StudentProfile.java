package default_package;

public class StudentProfile {
	private int studentID;
	private String firstname;
	private String lastname;
	private String gender;
	private String address;
	private String countryofOrigin;
	private int age;
	private int yearofAdmission;
	
	public StudentProfile(String firstname, String lastname, String gender,
			String countryofOrigin, int age, int yearofAdmission, int studentID) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
//		this.address = address;
		this.countryofOrigin = countryofOrigin;
		this.age = age;
		this.yearofAdmission = yearofAdmission;
		this.studentID = studentID;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountryofOrigin() {
		return countryofOrigin;
	}

	public void setCountryofOrigin(String countryofOrigin) {
		this.countryofOrigin = countryofOrigin;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYearofAdmission() {
		return yearofAdmission;
	}

	public void setYearofAdmission(int yearofAdmission) {
		this.yearofAdmission = yearofAdmission;
	}
	
}
