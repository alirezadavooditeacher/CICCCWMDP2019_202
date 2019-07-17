package Problem4;

import java.util.ArrayList;

public class Building {
    private String name;
    private int yearBuilt;
    private ArrayList<Room> roomList;

    public void open(int roomNumber){
        for(int i = 0; i < roomList.size(); i ++){
            if(roomList.get(i).getRoomNumber() == roomNumber){
                roomList.get(i).setLocked(false);
            }
        }
    }

    public void close(int roomNumber){
        for(int i = 0; i < roomList.size(); i ++){
            if(roomList.get(i).getRoomNumber() == roomNumber){
                roomList.get(i).setLocked(true);
            }
        }
    }
}
