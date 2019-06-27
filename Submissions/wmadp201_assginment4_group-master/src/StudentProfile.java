package wmadp201_assginment4_group.src;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

public class StudentProfile {

    private String studentId;
    private String firstName;
    private String lastName;
    private char gender;
    private String country;
    private String address;
    private int age;
    private int admissionYear;
    private float gpa;

    public StudentProfile (String firstName, String lastName, char gender, String country, String address, int age, int admissionYear, String studentId) {
        this.firstName= firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.country = country;
        this.address = address;
        this.age = age;
        this.admissionYear = admissionYear;
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return getFirstName() + " " + getLastName();
    }

    public char getGender() {
        return this.gender;
    }

    public String getCountry() {
        return this.country;
    }

    public String getAddress() {
        return this.address;
    }

    public int getAge() {
        return this.age;
    }

    public int getYearOfAdmission() {
        return this.admissionYear;
    }

    public float getGpa() {
        return this.gpa;
    }

    /**
     * Ali said to me that I can define what is semester
     * So I decided semester takes 6 month and be counted up over years.
     *
     * @return int number of semester
     */
    public int getStudentsSemester() {
        // get today's year and month
        Calendar cl = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM");

        int monthGone = Util.getDifferenceBetween2Date(getYearOfAdmission() + "/01", sdf.format(cl.getTime()));
        return (monthGone + 6) / 6;
    }
}
