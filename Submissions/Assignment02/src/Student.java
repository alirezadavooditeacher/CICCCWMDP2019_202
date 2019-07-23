public class Student {
    private String firstName;
    private String lastName;
    private String address;
    private int birthYear;
    private int average;

    public Student(String firstName, String lastName, String address, int birthYear, int average) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birthYear = birthYear;
        this.average = average;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average= average;
    }

}
