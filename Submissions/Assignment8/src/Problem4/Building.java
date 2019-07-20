package Problem4;

import java.util.ArrayList;
import java.util.Iterator;

public class Building implements MyObservable{
    private String name;
    private int yearBuilt;
    private int roomsLocked;
    private ArrayList<Room> roomList;
    private ArrayList<MyObserver> observers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getRoomsLocked() {
        return roomsLocked;
    }

    public void setRoomsLocked(int roomsLocked) {
        this.roomsLocked = roomsLocked;
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }

    public ArrayList<MyObserver> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<MyObserver> observers) {
        this.observers = observers;
    }


    public Building(String name, int yearBuilt, ArrayList<Room> roomList) {
        this.name = name;
        this.yearBuilt = yearBuilt;
        this.roomList = roomList;
        this.roomsLocked = roomList.size();
        this.observers = new ArrayList<>();
    }

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
            roomsLocked --;
            System.out.println("Room number " + roomNumber + " is unlocked");
            this.myNotifyAll();
        }
    }

    public void close(int roomNumber){
        Room room = this.findRoom(roomNumber);
        if(room != null){
            room.setLocked(true);
            roomsLocked ++;
            System.out.println("Room number " + roomNumber + " is locked");
            this.myNotifyAll();
        }
    }

    @Override
    public void addObserver(MyObserver mo) {
        observers.add(mo);
    }

    @Override
    public void removeObserver(MyObserver mo) {
        observers.remove(mo);
    }

    @Override
    public void myNotifyAll() {
        Iterator<MyObserver> observerIterator = observers.iterator();
        while(observerIterator.hasNext()){
            observerIterator.next().update(this);
        }
    }
}
