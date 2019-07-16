import app.Building;
import app.Intruder;
import app.Manager;
import app.Room;

import java.util.Scanner;

public class ApplicationDriver {

    public static void main(String[] args) {
        int numberOfRoom = 10;
        Building building = new Building("Expo", 2017);
        for (int i = 0; i < numberOfRoom; i++) {
            building.addRoom(new Room(String.format("1%02d", i), 20));
        }

        Intruder intruder = new Intruder();
        Manager manager = new Manager();
        building.observe(intruder);
        building.observe(manager);

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Which room do you want to open [0-9]?");
            int room = scanner.nextInt();
            if (room < 0 || room > numberOfRoom -1) {
                continue;
            }
            intruder.unauthorizedAccess(building, room);
        }
    }
}
