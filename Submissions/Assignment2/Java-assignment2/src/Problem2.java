import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Problem2 {
	public ArrayList<Integer> findDistictNums(HashMap<Integer, Integer> map) {
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		ArrayList<Integer> distinctNum = new ArrayList<Integer>();
		int keyNum = 0;
		while (it.hasNext()) {
			keyNum = it.next();
			if (map.get(keyNum) == 1) {
				distinctNum.add(keyNum);
			}
		}
		return distinctNum;
	}	

}
