package Problem4;

public class Room {
    private int size;
    private boolean isLocked;
    private int roomNumber;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Room(int size, int roomNumber) {
        this.size = size;
        this.isLocked = true;
        this.roomNumber = roomNumber;
    }
}
