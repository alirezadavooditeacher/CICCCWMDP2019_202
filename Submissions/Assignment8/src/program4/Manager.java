package program4;

public class Manager implements Observer<Building>{

	@Override
	public void update(Building subject) {
		if(subject.getLockedRooms() == 0) {
			System.out.println("All rooms are unlocked. Not safe anymore");
		}
		
	}

}
