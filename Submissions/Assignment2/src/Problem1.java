import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem1 {
	public static void findDuplicates(List<Integer> list) {
        Map<Integer, Long> result = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        result.forEach((k, v) -> System.out.println(k + ":" + v));
	}
	
	public static void main(String[] args) {
		List<Integer> items = Arrays.asList(1, 1, 2, 2, 2, 2, 3, 3 , 3, 3, 3);
		Problem1.findDuplicates(items);
	}
}
