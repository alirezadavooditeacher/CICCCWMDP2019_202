package assignment8.problem4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationDriver {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Room> rooms = new ArrayList<Room>();
		for (int i = 0; i < 100; i++) {
			rooms.add(new Room(i, i%2 == 0? true:false));
		}
		Building building = new Building("a", 2019, rooms);
		Building backup = building;
		System.out.println("input number room:");
		int numberRoom  = scanner.nextInt();
		Intruder intruder = new Intruder();
		

		Manager manager = new Manager();
		intruder.addObserver(manager);
		intruder.accept(building, numberRoom);
	}
}
