import java.util.Scanner;

public class StudentProfile {
    private static String studentID;
    private static String firstName;
    private static String lastName;
    private static String gender;
    private static String address;
    private static String countryOfOrigin;
    private static int age;
    private static int yearOfAdmission;

    public static int getAge() {
        return age;
    }

    public static int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public static String getAddress() {
        return address;
    }

    public static String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getGender() {
        return gender;
    }

    public static String getLastName() {
        return lastName;
    }

    public static String getStudentID() {
        return studentID;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public StudentProfile(String firstName, String lastName, String gender, String address, String countryOfOrigin,
                          int age, int yearOfAdmission){
        super();
        this.studentID = getID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.countryOfOrigin = countryOfOrigin;
        this.age = age;
        this.yearOfAdmission = yearOfAdmission;
    }

    public StudentProfile(){
        this.studentID = getID();
    }

    private String getID(){
        int newNum = (int)((Math.random()*9+1)*10000000);
        return String.valueOf(newNum);
    }

    public void creatStudentProfile(){
        Scanner input = new Scanner( System.in );
        this.studentID = getID();

        System.out.println( "************************************************************\n" +
                "Welcome to Cornerstone International College of Canada.\n" +
                "************************************************************" );

        System.out.println( "Please enter your first name:" );
        this.firstName = input.nextLine();

        System.out.println( "Please enter your last name:" );
        this.lastName = input.nextLine();

        System.out.println( "Please enter your gender [M/F/O]:" );
        this.gender = input.nextLine();
        while(!gender.equals( "M" ) && !gender.equals( "F" ) && !gender.equals( "O" )){
            System.out.println( "Please try again, please enter your gender [M/F/O]" );
            this.gender = input.nextLine();
        }

        System.out.println( "Please enter your country of origin:" );
        this.countryOfOrigin = input.nextLine();

        System.out.println( "Please enter the year of admission:" );
        this.yearOfAdmission = input.nextInt();

        System.out.println( "Please enter your age:" );
        this.age = input.nextInt();
    }
}
