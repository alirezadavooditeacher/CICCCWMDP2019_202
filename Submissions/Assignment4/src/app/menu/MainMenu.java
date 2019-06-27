package app.menu;

import app.Util;
import app.menu.command.*;

import java.util.ArrayList;
import java.util.List;

/**
 * MainMenu
 *
 * This class communicates with the user through CLI prompt
 */
public class MainMenu {
    private List<Interface> commands;

    /**
     * Constructor
     */
    public MainMenu() {
        // Setup menu
        commands = new ArrayList<>();
        // commands.add(new Login());
        commands.add(new PrintCertificate());
        commands.add(new PrintCourses());
        commands.add(new PrintTranscript());
        commands.add(new PrintGPA());
        commands.add(new PrintRanking());
        commands.add(new ListAvailableCourses());
        commands.add(new ListStudents());
        commands.add(new ShowProfile());
        commands.add(new Logout());
        commands.add(new Exit());
    }

    /**
     * Ask the user to chose the menu
     */
    public void printToChose() {
        int m = commands.size();
        for (int i = 0; i < m; i++) {
            System.out.format("—-[%d] %s\n", i + 1, commands.get(i).getMenuTitle());
        }

        int input;
        while (true) {
            input = Util.askInteger("Enter the number corresponding to each item to proceed") - 1;
            if (input >= 0 && input < m) {
                break;
            }
        }
        commands.get(input).execute();
    }
}
