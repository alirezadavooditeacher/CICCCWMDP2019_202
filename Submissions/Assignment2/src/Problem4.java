import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Problem4 {
	public static Student findMaxScoreStudent(List<Student> lstStudent) {
		Student maxAverage = lstStudent
	      .stream()
	      .max(Comparator.comparing(Student::getAverage))
	      .orElseThrow(NoSuchElementException::new);
		return maxAverage;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("Nguyen", "Van A", "Viet Nam", "01/01/1990", 5);
		Student s2 = new Student("Nguyen", "Van A", "Viet Nam", "01/01/1990", 6);
		Student s3 = new Student("Nguyen", "Van A", "Viet Nam", "01/01/1990", 7);
		Student s4 = new Student("Nguyen", "Van A", "Viet Nam", "01/01/1990", 8);
	    List<Student> lstStudent = Arrays.asList(s1, s2, s3, s4);
	    
	    System.out.println(Problem4.findMaxScoreStudent(lstStudent).toString());
	}
	
}
