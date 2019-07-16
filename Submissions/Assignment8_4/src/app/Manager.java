package app;

public class Manager implements Observer {
    @Override
    public void notify(Event event) {
        if (event.getType() == Event.Type.LOCKED) {
            Room target = (Room) event.getAttributes();

            System.out.format("The room %s is locked", target.getUnit());
            System.out.println();
        } else if (event.getType() == Event.Type.UNLOCKED) {
            Room target = (Room) event.getAttributes();

            System.out.format("The room %s is unlocked", target.getUnit());
            System.out.println();
        }
    }
}
