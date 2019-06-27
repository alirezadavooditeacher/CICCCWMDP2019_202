package wmadp201_assginment4_group.src;

public class TakenCourse {
    private Course course;
    private int grade = -1;
    private int semester = 0;

    public TakenCourse(Course course, int grade, int semester) {
        this.course = course;
        this.grade = grade;
        this.semester = semester;
    }

    public Course getCourse() {
        return course;
    }

    public String getName() {
        return getCourse().getName();
    }

    public String getCode() {
        return getCourse().getCode();
    }

    public int getUnits() {
        return getCourse().getUnits();
    }

    public int getGrade() {
        return this.grade;
    }

    public int getSemester() {
        return this.semester;
    }

}
