package src.problem4;

import java.util.ArrayList;

public class Building implements MyObserver{
    private String name;
    private Integer yearBuild;
    private ArrayList<Room> rooms;

    public Building(String name, int yearBuild, ArrayList<Room> rooms) {
        this.name = name;
        this.yearBuild = yearBuild;
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYearBuild() {
        return yearBuild;
    }

    public void setYearBuild(Integer yearBuild) {
        this.yearBuild = yearBuild;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void open(int roomNumber) {
        ArrayList<Room> rooms = this.getRooms();
        for (Room room: rooms) {
            if (room.getRoomNumber().equals(roomNumber) && room.isLocked()) {
                room.setLocked(false);
            }
        }
    }

    public void close(int roomNumber) {
        ArrayList<Room> rooms = this.getRooms();
        for (Room room: rooms) {
            if (room.getRoomNumber().equals(roomNumber) && !room.isLocked()) {
                room.setLocked(true);
            }
        }
    }

    public void update(MyObservable mo) {
        if (!((Room)mo).isLocked()) {
            System.out.println("The room " + ((Room)mo).getRoomNumber() + " is unlocked.");
        } else {
            System.out.println("The room " + ((Room)mo).getRoomNumber() + " is unlocked.");
        }
    }
}
