package Problem4;

public class Manager implements MyObserver<Building>{

    @Override
    public void update(Building building) {
        if(building.getRoomsLocked() == 0){
            System.out.println("All rooms are unlocked, not safe anymore");
        }
    }
}
