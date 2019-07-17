package app.entity;

public class Building {
    private String address;
    private int numFloors;
    private int builtYear;

    public Building(String address, int numFloors, int builtYear) {
        this.address = address;
        this.numFloors = numFloors;
        this.builtYear = builtYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    public int getBuiltYear() {
        return builtYear;
    }

    public void setBuiltYear(int builtYear) {
        this.builtYear = builtYear;
    }
}
