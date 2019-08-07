package assignment7.problem1.model;

public class StudentDto {
	private String name;
	private String className;
	private String PGA;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getPGA() {
		return PGA;
	}
	public void setPGA(String pGA) {
		PGA = pGA;
	}
	public StudentDto(String name, String className, String pGA) {
		
		this.name = name;
		this.className = className;
		PGA = pGA;
	}
	
	
	
	
}
