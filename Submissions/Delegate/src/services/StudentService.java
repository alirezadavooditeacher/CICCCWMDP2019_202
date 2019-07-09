package services;

public class StudentService {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentService(String name) {
        this.name = name;
    }
}
