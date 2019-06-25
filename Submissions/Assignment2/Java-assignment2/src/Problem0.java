import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Problem0 {
	
	public int findMostRepeatedNumber(ArrayList<Integer> nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map = mkNumAndRepeated(nums);
		
		int repeatedNum = findNum(map);
		
		return repeatedNum;
	}
		
		
	public int findNum(HashMap<Integer, Integer> map) {
		// TODO Auto-generated method stub
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		int maxRepeated = 0;
		int keyNum = 0;
		while (it.hasNext()) {
			int number = it.next();
			if (map.get(number) > maxRepeated) {
				maxRepeated = map.get(number);
				keyNum = number;
			} 
		}
		return keyNum;
	}


	public HashMap<Integer, Integer> mkNumAndRepeated(ArrayList<Integer> nums) {
		HashMap<Integer, Integer> numAndRepeated = new HashMap<Integer, Integer>();
			Iterator<Integer> it = nums.iterator();
		
		while (it.hasNext()) {
			int keyNum = it.next();
			if (numAndRepeated.containsKey(keyNum)) {
				numAndRepeated.put(keyNum, numAndRepeated.get(keyNum) + 1);
			} else {
				numAndRepeated.put(keyNum, 1);
			}
		}
			return numAndRepeated;
	}

}
