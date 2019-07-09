import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function;
import java.util.stream.Collectors;

public class Problem0 {
	public int findMaxDuplicates(List<Integer> list) {
        Map<Integer, Long> result = list.Stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        Integer max = result
	        		.entrySet()
	        		.stream()
	        		.max(Map.Entry.comparingByValue())
	        		.get()
	        		.getKey();

		return max;
	}
	
	public static void main(String[] args) {
		Problem0 p1 = new Problem0();
		List<Integer> items = Arrays.asList(1, 1, 2, 2, 2, 2, 3, 3 , 3, 3, 3);
		System.out.println("Max repeated is : " + p1.findMaxDuplicates(items));
	}
}
