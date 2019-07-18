package program1;
import program4.*;

public class StudentPojo {
	private int gpa;
	private String name;
	private String semester;
	
	public StudentPojo(int gpa, String name, String semester) {
		super();
		this.gpa = gpa;
		this.name = name;
		this.semester = semester;
	}

	public int getGpa() {
		return gpa;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	
	public String toString() {
		return this.name;
	}

//	public boolean check(StudentPojo sp) {
//		// TODO Auto-generated method stub
//		if(sp.gpa<=20) {
//			return false;
//		} else {
//			return true;
//		}
//		
//	}
	
	

}
