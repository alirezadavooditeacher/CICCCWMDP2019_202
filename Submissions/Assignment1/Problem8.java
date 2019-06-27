package Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem8 {
	public static List<Integer> TheListOfInteger(){
		
		List<Integer> list = new ArrayList<>(Arrays.asList(9,12,43,4,25,68,10,32,26));		
		return list;
	}
	public static  List<Integer> ReturnIndexnumOfList(List<Integer>list,int num) {
		
		for (int i=0; i<list.size(); i++) {
			if (list.get(i)==num) {
				list.remove(list.indexOf(num));
				break;
			}	
		}
		return list;
	}

}
