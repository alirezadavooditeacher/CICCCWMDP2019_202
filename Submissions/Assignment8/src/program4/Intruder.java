package program4;

public class Intruder {
	public static void unauthorizedAccess
	(Building building, Room room) {
		if(room.isLocked()) {
			System.out.println("open "+building.open(room));
		}
		else {
			System.out.println("close "+building.close(room));
			}
	}
}
