package program1;

public class StudentPojo{
	private int gpa;
	private String Name;
	private String semester;
	
	public StudentPojo(int gpa, String name, String semester) {
		super();
		this.gpa = gpa;
		Name = name;
		this.semester = semester;
	}

	public int getGpa() {
		return gpa;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	
	
	
	
	

}
