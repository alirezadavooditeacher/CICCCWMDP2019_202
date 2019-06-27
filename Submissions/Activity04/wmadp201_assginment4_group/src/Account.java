package wmadp201_assginment4_group.src;

/**
 * Account
 */
public class Account {
    private String userName;
    // password should be hashed but it's too bothering for me
    private String password;
    private Student student;

    public Account(String userName, String password, Student student) {
        this.userName = userName;
        this.password = password;
        this.student = student;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Student getStudent() {
        return this.student;
    }

}
