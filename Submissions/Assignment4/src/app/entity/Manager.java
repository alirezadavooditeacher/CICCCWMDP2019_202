package app.entity;

/**
 * Manager
 *
 * this class represents a manager of a school
 */
public class Manager {
    private String firstName;
    private String lastname;
    private String title;

    /**
     * Construcot
     *
     * @param firstName manager's first name
     * @param lastname manager's last name
     * @param title manager's title (Mr, Ms, Mrs, ...)
     */
    public Manager(String firstName, String lastname, String title) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.title = title;
    }

    /**
     * Getter for firstName
     *
     * @return the value
     */
    public String getFirstName() {
        return firstName;
    }
}
