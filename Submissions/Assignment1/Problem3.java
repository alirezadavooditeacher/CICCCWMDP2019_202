package Problem;

import java.util.Arrays;
import java.util.List;

public class Problem3 {
	public static List<Integer> MakeListOfRepeatedNumber(){
		
		List<Integer> list = Arrays.asList(2,11,7,9,4,11,5,2,8,2,9,4,14,7,7,7,2,5,14);
		return list;
	}
	
	public static int NoneRepeatedNum(List<Integer> list){
		
		int repeatedNum = 0;
		for (int i=0 ; i<list.size() ;i++) {
			int a=list.get(i), counter=0;
			for (int j=0;j<list.size();j++) {
				int b=(int) list.get(j);
				if(a==b) {
					counter+=1;
				}	
			}
			if (counter<=1) {
				repeatedNum = a;
			}
		}
		return repeatedNum;
		
	}
	

}
