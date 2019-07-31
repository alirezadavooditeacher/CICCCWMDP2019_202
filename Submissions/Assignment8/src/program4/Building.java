package program4;

import java.util.ArrayList;
import java.util.Iterator;

public class Building implements Subject {
	private String Name;
	private Integer yearBuild;
	private ArrayList<Room> rooms;
	private int lockedRooms;
	private ArrayList<Observer> observers;
	
	public Building(String name, Integer yearBuild, ArrayList<Room> rooms) {
		super();
		Name = name;
		this.yearBuild = yearBuild;
		this.rooms = rooms;
		this.lockedRooms = this.rooms.size();
		this.observers = new ArrayList<Observer>();
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getYearBuild() {
		return yearBuild;
	}

	public void setYearBuild(Integer yearBuild) {
		this.yearBuild = yearBuild;
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}
	
	
	public int getLockedRooms() {
		return lockedRooms;
	}

	public boolean open(Room room) {
		if (room.isLocked() && this.rooms.contains(room)) {
			room.setLocked(false);
			System.out.println("The room "+room.getId()+" is unlocked");
			this.lockedRooms--;
			return true;
		}else {
			return false;
		}
		
	}
	public boolean close(Room room) {
		if(!(room.isLocked()) && this.rooms.contains(room)) {
			room.setLocked(true);
			System.out.println("The room "+room.getId()+" is locked");
			this.lockedRooms++;
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);
		
		
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
		
	}

	@Override
	public void notifyAllObservers() {
		Iterator<Observer> it = this.observers.iterator();
		while(it.hasNext()) {
			Observer obser = it.next();
			obser.update(this);
		}
	}

}
