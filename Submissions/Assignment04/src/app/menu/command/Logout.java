package app.menu.command;

import app.Session;

/**
 * Log out form the application
 */
public class Logout implements Interface {
    @Override
    public String getMenuTitle() {
        return "Logout";
    }

    @Override
    public void execute() {
        Session session = Session.getInstance();
        session.remove("student");

        System.out.println("You are successfully logged out.");
    }
}
