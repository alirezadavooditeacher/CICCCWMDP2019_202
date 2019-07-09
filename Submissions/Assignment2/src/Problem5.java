import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem5 {
	public Map<String, String> countName() {
		Map<String, String> dictionary = new HashMap<String, String>();
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while (true) {
			System.out.print("Enter name : ");
			String name = scanner.next();

			if (name.equals("0")) {
				break;
			}

			dictionary.put("key" + i, name);
			i++;
		}

		Map<String, Long> countName = dictionary.values().stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(countName);
		System.out.println(dictionary);

		return dictionary;
	}

	public static void main(String[] args) {
		Problem5 p5 = new Problem5();
		p5.countName();
	}
}
