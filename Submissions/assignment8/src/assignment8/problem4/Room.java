package assignment8.problem4;

public class Room {
	private int size;
	private Boolean locked;
	
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Boolean getLocked() {
		return locked;
	}
	public void setLocked(Boolean locked) {
		this.locked = locked;
	}
	public Room() {
		
	}
	public Room(int size, Boolean locked) {
		super();
		this.size = size;
		this.locked = locked;
	}
	
}
