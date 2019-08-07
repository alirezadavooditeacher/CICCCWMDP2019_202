package assignment8.problem4;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Manager implements Observer{
	public static List<String> check(Building building1, Building building2) {
		List<String> messages = new ArrayList<>();
		for (int i = 0; i < building1.getRooms().size(); i++) {
			if(building1.getRooms().get(i).getLocked() && !building2.getRooms().get(i).getLocked()) {
				messages.add("Room "+ i + " unlocked");
			}
			else 
				messages.add("Room "+ i + " locked");
		}
		return messages;
		
	}

	@Override
	public void update(Observable  o, Object arg) {
		System.out.println(arg.toString());
		
	}
}
