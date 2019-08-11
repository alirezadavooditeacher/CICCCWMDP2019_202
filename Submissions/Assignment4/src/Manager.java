public class Manager {
    private static String firstName;
    private static String lastName;
    private static String title;

    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static String getTitle() {
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
