package assignment4;

public class Manager {

    private String firstName;
    private String lastName;
    private String title;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Manager(String firstName, String lastName, String title){
        super();
        this.firstName = firstName;
        this.lastName =lastName;
        this.title = title;
    }
}
