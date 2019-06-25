import java.util.HashMap;
import java.util.Scanner;

public class Problem5 {
	public HashMap<String, Integer> countNameCall() {
		boolean flag = false;
		HashMap<String, Integer> nameCount = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		while (!(flag)) {
			System.out.print("Write your favorite name(0 is quit): ");
			String name = scanner.next();
			String checkInput = (String)name;
			if (checkInput.equals("0")) {
				flag = true;
			} else {
				if (nameCount.containsKey(name)) {
					nameCount.put(name, nameCount.get(name) + 1);
				} else {
					nameCount.put(name, 1);
				}
			}
		}
		return nameCount;
	}
}
