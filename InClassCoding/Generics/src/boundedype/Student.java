package boundedype;

public class Student implements Comparable<Student>{

	private int age;
	
	public Student(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return (this.age-o.getAge());
	}

}
