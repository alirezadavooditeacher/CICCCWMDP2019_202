package app.menu.command;

import app.Session;
import app.Util;
import app.entity.Account;
import app.entity.School;
import app.entity.Student;

/**
 * Log in to the application
 */
public class Login implements Interface {
    @Override
    public String getMenuTitle() {
        return "Login";
    }

    @Override
    public void execute() {
        Session session = Session.getInstance();
        Util.printHeading("Please enter your account to login");

        while (true) {
            System.out.println("Not registered yet? Type “Register” and press enter to start the registration process!");
            String username = Util.askString("Username");
            if (username.toLowerCase().equals("register")) {
                Register register = new Register();
                register.execute();
                return;
            }

            String password = Util.askString("Password");
            Student student = authenticate(username, password);
            if (student != null) {
                session.set("student", student);
                break;
            }
            Util.printHeading("Your account does not exist. Please try again!");
        }
    }

    /**
     * Authenticate by the username and password
     *
     * @param username the username
     * @param password the password
     * @return Student if successfully logged in, otherwise null
     */
    private Student authenticate(String username, String password) {
        Session session = Session.getInstance();
        School school = (School) session.get("school");
        for (Student student : school.getStudents()) {
            Account account = student.getAccount();
            if (account.auth(username, password)) {
                return student;
            }
        }
        return null;
    }
}
