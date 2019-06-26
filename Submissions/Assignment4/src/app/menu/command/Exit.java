package app.menu.command;

/**
 * Terminate the application
 */
public class Exit implements Interface {
    @Override
    public String getMenuTitle() {
        return "Exit";
    }

    @Override
    public void execute() {
        System.out.println("Bye~ ;)");
        System.exit(0);
    }
}
