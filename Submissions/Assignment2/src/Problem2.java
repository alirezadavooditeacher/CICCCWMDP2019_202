import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem2 {
	public static void removeDuplicates(List<Integer> list) {
		System.out.println(list);
        List<Integer> listWithoutDuplicates = list.stream().distinct().collect(Collectors.toList());
        System.out.println(listWithoutDuplicates);
	}
	
	public static void main(String[] args) {
		List<Integer> items = Arrays.asList(1, 1, 2, 2, 2, 2, 3, 3 , 3, 3, 3);
		Problem2.removeDuplicates(items);
	}
}
