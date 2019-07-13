package src.problem4;

import java.util.ArrayList;

public class Intruder {
    public static void unauthorizedAccess(Building building, int roomNumber) {
        ArrayList<Room> rooms = building.getRooms();
        for (Room room: rooms) {
            if (room.getRoomNumber().equals(roomNumber) && room.isLocked()) {
                room.setLocked(false);
            }
        }
    }
}
