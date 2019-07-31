package program4;

import java.util.ArrayList;

public class Building {
	String Name;
	Integer yearBuild;
	ArrayList<Room> rooms;
	
	public Building(String name, Integer yearBuild, ArrayList<Room> rooms) {
		super();
		Name = name;
		this.yearBuild = yearBuild;
		this.rooms = rooms;
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
	
	
	

}
