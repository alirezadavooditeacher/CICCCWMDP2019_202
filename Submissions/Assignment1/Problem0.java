package Problem;

import java.util.*;

public class Problem0{
	public static List<Integer> MakeArrayOfList() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1 ; i <= 5 ; i++ ) {
			list.add(i);
			int h =(int) Math.pow(i,i);
			int n = i;
			if (n < h) {
				while(n < h) {
					list.add(i);
					n=n*i;
				}
			}
		}
	return list;	
    }	
	
	public static int TheMostRepeatedNum(List<Integer> list) {
		int counter=0,MostRepeatedNum=0,MostNum=0;
		for (int i=0;i<list.size();i++) {
		    int a=(int) list.get(i);
			for (int j=0;j<list.size();j++) {
				if(a==j) {
					counter+=1;
				}
			if (MostRepeatedNum<counter) {
				MostRepeatedNum=counter;
				MostNum=(int) list.get(i);
			}
		}
	}
	return MostNum;	
    }
}	