import java.util.ArrayList;
import java.util.List;

public class GeneralTranscript {
	private List<Course> course;

	public GeneralTranscript(List<Course> course) {
		super();
		this.course = course;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
	public String printCourseName() {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < course.size(); i++) {
			list.add(course.get(i).getCourseCode() + " : " +course.get(i).getCourseName());
		}
		
		return String.join(", ", list);
	}
	
	public int overallGPA() {
		int sum = 0;
		for (int i = 0; i < course.size(); i++) {
			sum += course.get(i).getGrade();
		}
		
		return sum/course.size();
	}
}
