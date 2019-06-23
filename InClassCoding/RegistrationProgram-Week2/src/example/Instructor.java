package example;

public class Instructor {
	String name;
	
	public Instructor(String name) {
		this.name = name;
	}
	
	public Instructor() {
	}
	
	public void print() {
		System.out.println(this.name);
	}
}
