package src.problem4;

import java.util.ArrayList;
import java.util.Iterator;

public class Room implements MyObservable{
    private Integer roomNumber;
    private boolean locked;
    private ArrayList<MyObserver> observers = new ArrayList<>();

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.locked = true;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
        this.myNotifyAll();
    }

    public void addObserver(MyObserver mo) {
        this.observers.add(mo);
    }

    public void removeObserver(MyObserver mo) {
        this.observers.remove(mo);
    }

    public void myNotifyAll() {

        Iterator<MyObserver> iterator = this.observers.iterator();

        while(iterator.hasNext()) {
            iterator.next().update(this);
        }
    }
}
