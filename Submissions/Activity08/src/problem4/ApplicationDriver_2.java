package src.problem4;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationDriver_2 {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        // Observable
        Room room1 = new Room(1101);
        Room room2 = new Room(1102);
        Room room3 = new Room(1103);
        Room room4 = new Room(1104);
        Room room5 = new Room(1105);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);

        // Observer
        Building building = new Building("VancouverHotel", 1991, rooms);
        Manager manager = new Manager();

        room1.addObserver(building);
        room1.addObserver(manager);
        room2.addObserver(building);
        room2.addObserver(manager);
        room3.addObserver(building);
        room3.addObserver(manager);
        room4.addObserver(building);
        room4.addObserver(manager);
        room5.addObserver(building);
        room5.addObserver(manager);

        Scanner reader = new Scanner(System.in);

        boolean isAllRoomsUnlocked = false;
        while(!isAllRoomsUnlocked) {
            System.out.print("enter a room number: ");
            String numStr = reader.nextLine();
            Integer roomNumber = Integer.parseInt(numStr);
            ArrayList<Room> roomsInBuilding = building.getRooms();
            isAllRoomsUnlocked = true;
            for (Room room: roomsInBuilding) {
                if (room.getRoomNumber().equals(roomNumber)) {

                    if (room.isLocked()) {
                        Intruder.unauthorizedAccess(building, roomNumber);
                    }
                }

                if (room.isLocked()) {
                    isAllRoomsUnlocked = false;
                }
            }
        }

        System.out.println("All rooms are unlocked. Not safe anymore");
    }
}
