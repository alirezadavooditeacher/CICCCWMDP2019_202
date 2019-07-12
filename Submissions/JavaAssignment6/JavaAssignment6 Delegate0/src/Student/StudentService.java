package Student;

public class StudentService {
    private String name;
    private int semester;

    public StudentService(String name, int semester) {
        super();
        this.name = name;
        this.semester = semester;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

}
