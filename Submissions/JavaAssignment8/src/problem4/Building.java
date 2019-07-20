package problem4;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private String Name;
    private int yearBuild;
    private List<Room> rooms = new ArrayList<>();

    public Building(String name, int yearBuild, List<Room> rooms) {
        this.Name = name;
        this.yearBuild = yearBuild;
        this.rooms = rooms;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getYearBuild() {
        return yearBuild;
    }

    public void setYearBuild(int yearBuild) {
        this.yearBuild = yearBuild;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
