package Problem;

import java.util.Arrays;
import java.util.List;

public class Problem7 {
	public static List<Integer> TheListOfInteger(){
		
		List<Integer> list = Arrays.asList(9,12,43,4,25,68,10,32,26);		
		return list;
	}
	public static  int ReturnIndexnumOfList(List<Integer>list,int num) {
		
		int IndexNum = 0, counter = 0;
		for (int i=0; i<list.size(); i++) {
			if (list.get(i)==num) {
				IndexNum = i;
				counter+=1;
				break;
			}	
		}
		if (counter==0) {
			IndexNum = -1;
		}
		return IndexNum;
	}
}
