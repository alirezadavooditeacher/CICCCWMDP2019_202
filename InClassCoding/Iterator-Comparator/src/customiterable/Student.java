package customiterable;

public class Student{

	private String name;
	private double gpa;
	private int age;
	
	
	
	public Student(String name, double gpa, int i) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.age = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//	@Override
//	public int compareTo(Student s) {
//		// TODO Auto-generated method stub
//		return (int)(this.gpa-s.getGpa());
//	}	
	
	public String toString() {
		return this.name+" "+String.valueOf(this.age)+" "+String.valueOf(this.gpa);
	}
}
