import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem6 {
	public int sumNumber() {
		List<Integer> listNumber = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter number : ");
			int number = scanner.nextInt();

			if (number == 0) {
				break;
			}

			if (listNumber.contains(number)) {
				System.out.println("Number entered already exists.");
				continue;
			}
			
			listNumber.add(number);
		}

		Integer sum = listNumber.stream().reduce(0, (a, b) -> a + b);

		return sum;
	}

	public static void main(String[] args) {
		Problem6 p6 = new Problem6();
		System.out.println(p6.sumNumber());
	}
}
