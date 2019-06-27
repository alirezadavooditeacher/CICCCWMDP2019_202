package Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {
	public static List<Integer> MakeListOfRepeatedNumber(){
		
		List<Integer> list = Arrays.asList(2,7,9,4,11,5,2,8,2,9,4,4,7,7,7,25,25,14);
		return list;
	}
	
	public static List<Integer> MakeNoneRepeatedNumList(List<Integer> list){
		
		List<Integer> newlist = new ArrayList<Integer>();
	
		for (int i=0 ; i<list.size() ;i++) {
			int a=list.get(i), counter=0;
			for (int j=0;j<list.size();j++) {
				int b=(int) list.get(j);
				if(a==b) {
					counter+=1;
				}	
			}
			if (counter<=1) {
				newlist.add(a);
			}
		}
		return newlist;
	}

}

