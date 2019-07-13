package src.problem4;

public class Manager implements MyObserver {
    public void update(MyObservable mo) {
        // call the police
        if (!((Room)mo).isLocked()) {
            System.out.println("Hey police room number " + ((Room)mo).getRoomNumber() + " in our building has been intruded!");
        }
    }
}
