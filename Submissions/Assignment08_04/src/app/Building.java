package app;

import java.util.ArrayList;
import java.util.List;

public class Building implements Observable {
    private String name;
    private int yearBuilt;
    private List<Room> rooms = new ArrayList<>();
    private List<Observer>observers = new ArrayList<>();

    public Building(String name, int yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }


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

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void open(int roomNumber) {
        Room room = rooms.get(roomNumber);
        if (room.isLocked()) {
            room.unlock();
        }
        notify(new Event(Event.Type.UNLOCKED, room));
        if (checkIfAllUnlocked()) {
            notify(new Event(Event.Type.ALL_UNLOCKED, this));
        }
    }

    public void close(int roomNumber) {
        Room room = rooms.get(roomNumber);
        if (!room.isLocked()) {
            room.lock();
        }
        notify(new Event(Event.Type.LOCKED, room));
    }

    private boolean checkIfAllUnlocked() {
        for (Room el: rooms) {
            if (el.isLocked()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void observe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unobserve(Observer observer) {
        this.observers.remove(observer);
    }

    private void notify(Event event) {
        for(Observer o: observers) {
            o.notify(event);
        }
    }
}
