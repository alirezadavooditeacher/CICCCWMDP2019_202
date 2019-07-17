package Problem4;

import java.util.ArrayList;

public class Building {
    private String name;
    private int yearBuilt;
    private ArrayList<Room> roomList;

    public Room findRoom(int roomNumber){
        for(int i = 0; i < roomList.size(); i ++){
            if(roomList.get(i).getRoomNumber() == roomNumber){
                return roomList.get(i);
            }
        }
        return null;
    }

    public void open(int roomNumber){
        Room room = this.findRoom(roomNumber);
        if(room != null){
            room.setLocked(false);
        }
    }

    public void close(int roomNumber){
        Room room = this.findRoom(roomNumber);
        if(room != null){
            room.setLocked(true);
        }
    }

    public Building(String name, int yearBuilt, ArrayList<Room> roomList) {
        this.name = name;
        this.yearBuilt = yearBuilt;
        this.roomList = roomList;
    }
}
