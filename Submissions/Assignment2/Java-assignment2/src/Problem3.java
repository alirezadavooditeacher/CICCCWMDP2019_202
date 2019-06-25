import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Problem3 {
	public static int findSingleNumber(int[] array) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int number: array) {
			if (map.containsKey(number)) {
				map.remove(number);
			} else {
				map.put(number, 0);
			}
		}
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		Integer key = it.next();
		return key;
	}
}
