package app.menu.command;

/**
 * Interface of the command
 */
public interface Interface {
    /**
     * Menu title for the command
     *
     * @return a menu title
     */
    String getMenuTitle();

    /**
     * Execute the command
     */
    void execute();
}
