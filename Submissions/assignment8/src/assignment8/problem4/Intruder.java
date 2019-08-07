package assignment8.problem4;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Intruder extends Observable {
	public void accept(Building building, int roomNumber) {
		List<Room> rooms = building.getRooms();
			
			if(roomNumber <  rooms.size() &&  rooms.get(roomNumber).getLocked()) {
				building.open(roomNumber);
				
				change("Lock room number "+ roomNumber);
				
			}
			else if(roomNumber <  rooms.size() &&  !rooms.get(roomNumber).getLocked()) {
				building.close(roomNumber);
				change("Lock room number "+ roomNumber);
			}
				
		
		
	}
	public void change(String messate) {
		setChanged();
        notifyObservers(messate);
	}


}
