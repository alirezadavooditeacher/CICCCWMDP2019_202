package program4;

public class Room {
	private String id;
	private Integer size;
	private boolean locked;
	
		
	public Room(String id, Integer size) {
		super();
		this.id = id;
		this.size = size;
		this.locked = true;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	
	
}
