package assignment8.problem4;

import java.util.List;

public class Building {
	private String name;
	private int yearBuild;
	private List<Room> rooms;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	public Building() {
		
	}
	
	public Building(String name, int yearBuild, List<Room> rooms) {
		this.name = name;
		this.yearBuild = yearBuild;
		this.rooms = rooms;
	}
	
	public void open(int roomNumber) {
		if(roomNumber < rooms.size()) {
			rooms.get(roomNumber).setLocked(false);
			
		}	
	}
	
	public void close(int roomNumber) {
		if(roomNumber < rooms.size()) {
			rooms.get(roomNumber).setLocked(true);
			
		}	
		
	}
	
	
	
	

}
