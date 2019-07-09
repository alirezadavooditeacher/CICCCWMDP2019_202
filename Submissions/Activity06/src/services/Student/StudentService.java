package services.Student;

public class StudentService {
    private String name;
    private int grade;
    private int experience = 0;
    private int strength = 0;

    public StudentService(String name, int grade) {
        this.setName(name);
        this.setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void study() {
        this.setExperience(this.getExperience() + 1);
    }

    public void play() {
        this.setStrength(this.getStrength() + 1);
    }
}
