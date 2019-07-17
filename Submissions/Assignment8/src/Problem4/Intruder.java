package Problem4;

public class Intruder {
    public static void unauthorizedAccess(Building building, int roomNumber){
        Room room = building.findRoom(roomNumber);
        if (room != null && room.isLocked()){
            building.open(roomNumber);
        } else if (room != null && !(room.isLocked())){
            building.close(roomNumber);
        }
    }
}
