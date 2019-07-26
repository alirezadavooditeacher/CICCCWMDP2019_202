
public class Student implements SearchObject{
	private String name;
	private int age;
	private int gpa;
	
	public Student(String name, int age, int gpa) {
		super();
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getGpa() {
		return gpa;
	}
	
	public String toString() {	//System.out.prinln(student)としたときの表示のカスタマイズ
		return this.name+" "+String.valueOf(this.age)+" "+String.valueOf(this.gpa);
	}

	@Override
	public Object searchByValue() {
		// TODO Auto-generated method stub
		return this.gpa;
	}

	
	
}
