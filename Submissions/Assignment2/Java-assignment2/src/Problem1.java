import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Problem1 {
	public static void showMap(HashMap<Integer, Integer> map) {
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		int keyNum = 0;
		while(it.hasNext()) {
			keyNum = it.next();
			System.out.println(keyNum + ": " + map.get(keyNum));
		}
	}
}
