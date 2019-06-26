package app.menu.command;

import app.Session;
import app.Util;
import app.entity.*;

import java.util.List;
import java.util.Random;

/**
 * Register as a new student of the school
 */
public class Register implements Interface {
    @Override
    public String getMenuTitle() {
        return null;
    }

    @Override
    public void execute() {
        Session session = Session.getInstance();
        School school = (School) session.get("school");

        Student student = Student.createStudent();
        school.addStudent(student);
        session.set("student", student);

        Util.printHeading(String.format("Welcome to %s.", school.getName()));
        setupProfile(student.getProfile());
        setupAccount(student.getAccount());
        fillTranscript(student.getTranscripts(), school.getCourses());

        System.out.format(
                "Thanks, your account and profile has been created successfully. Welcome Aboard [%s]\n",
                student.getProfile().getFullName()
        );
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // pass
        }
    }

    /**
     * Setup the transcript for the student
     *
     * @param transcripts student's transcript
     * @param courses available courses
     */
    private void fillTranscript(TranscriptCollection transcripts, List<Course> courses) {
        // Since the application has no way to choose courses to take, choose it randomly
        Random random = new Random();

        for (Course course : courses) {
            int n = random.nextInt(100);
            if (n % 2 == 0) {
                continue;
            }
            int semester = random.nextInt(3) + 1;
            transcripts.addCourse(course, semester);
        }
    }

    /**
     * Ask the user to setup the profile
     *
     * @param profile the student's profile to setup
     */
    private void setupProfile(StudentProfile profile) {
        String firstName = Util.askString("Please enter your first name");
        profile.setFirstName(firstName);

        String lastName = Util.askString("Please enter your last name");
        profile.setLastName(lastName);

        String[] genderOptions = {"M", "F", "O"};
        String gender = Util.askToChose("Please enter your gender [M/F/O]", genderOptions);
        profile.setGender(gender.charAt(0));

        String address = Util.askString("Please enter your address");
        profile.setAddress(address);

        String country = Util.askString("Please enter your country of origin");
        profile.setCountry(country);

        int universityYear = Util.askRange("Please enter year of university [2000~2019]", 2000, 2019, "not a valid year");
        profile.setYearOfUniversity(universityYear);

        int admissionYear = Util.askRange("Please enter the year of admission [2000~2019]", 2000, 2019, "not a valid year");
        profile.setAdmissionYear(admissionYear);

        int age = Util.askRange("Please enter your age [18~99]", 18, 99, "not a valid age");
        profile.setAge(age);
    }

    /**
     * Ask the user to setup the account information
     *
     * @param account the student's account to setup
     */
    private void setupAccount(Account account) {
        while (true) {
            String username = Util.askString("Please enter a username [At least 6 characters]");
            if (Account.isValidUserName(username)) {
                account.setUsername(username);
                break;
            }
        }

        while (true) {
            String password = Util.askString("Please enter a password [At least 6 characters with at least one digit]");
            if (Account.isValidPassword(password)) {
                account.setPassword(password);
                break;
            }
        }
    }
}
