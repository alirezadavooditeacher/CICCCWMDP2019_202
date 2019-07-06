public class Student {
    private String firstName;
    private String lastName;
    private int gpa;

    public Student(String firstName, String lastName, int gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGpa() {
        return gpa;
    }
}
