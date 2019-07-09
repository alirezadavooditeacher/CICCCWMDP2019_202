import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem3 {
	public int findDuplicatesOneTime(List<Integer> list) {
		Map<Integer, Long> result = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        List<Entry<Integer, Long>> duplicatesOneTime = result
	        		.entrySet()
	        		.stream()
	        		.filter(x -> x.getValue() == 1)
	        		.collect(Collectors.toList());
        
        return duplicatesOneTime.get(0).getKey();
	}
	
	public static void main(String[] args) {
		Problem3 p3 = new Problem3();
		List<Integer> items = Arrays.asList(1, 1, 2, 2, 3, 3, 7);
		System.out.println("Number duplicates one time is : " + p3.findDuplicatesOneTime(items));
	}
}
