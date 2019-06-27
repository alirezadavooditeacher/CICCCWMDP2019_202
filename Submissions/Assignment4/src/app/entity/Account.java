package app.entity;

/**
 * Account
 *
 * this class represents login information which is maintain by Student
 */
public class Account {
    /**
     * Validate the username
     * - should have 6 characters least
     *
     * @param username the value to be validated
     * @return true if it's valid
     */
    public static boolean isValidUserName(String username) {
        return username.length() > 5;
    }

    /**
     * Validate the password
     * - should have 6 characters least
     * - should have 1 digits least
     *
     * @param password the value to be validated
     * @return true if it's valid
     */
    public static boolean isValidPassword(String password) {
        return password.matches("[\\w]*\\d[\\w]*") && password.length() > 5;
    }

    private String username;
    private String password;

    /**
     * Constructor
     */
    public Account() {
        this.username = null;
        this.password = null;
    }

    /**
     * Constructor with initial values
     *
     * @param username the username
     * @param password the password
     */
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Setter for username
     *
     * @param username the value
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Setter for password
     *
     * @param password  the value
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Authenticate to log in
     *
     * @param username the username
     * @param password the password
     * @return true if the username and password are correct
     */
    public boolean auth(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}
