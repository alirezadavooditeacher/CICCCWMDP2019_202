package app;

public class Intruder implements Observer {
    @Override
    public void notify(Event event) {
        if (event.getType() == Event.Type.ALL_UNLOCKED) {
            System.out.println("All rooms are unlocked. Not safe anymore");
        }
    }

    public void unauthorizedAccess(Building building, int roomNumber) {
        building.open(roomNumber);
    }
}
