package studentView;

public class Student {
    private String firstname;
    private String lastname;
    private double GPA;

    public Student(String firstname, String lastname, double GPA) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.GPA = GPA;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public double getGPA() {
        return GPA;
    }
}
