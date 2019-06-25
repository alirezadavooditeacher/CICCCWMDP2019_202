package Problem;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
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
	public static void TheMostRepeatedNum(List<Integer> list) {
		int MostRepeatedNum=0,preNum=0;
		for (int i=0;i<list.size();i++) {
		    int a=(int) list.get(i), counter=0;
		    if (preNum!=a) {
			for (int j=0;j<list.size();j++) {
				int b=(int) list.get(j);
				
				if(a==b) {
					counter+=1;
				}	
				MostRepeatedNum=counter;
			}
			System.out.println(a+":"+MostRepeatedNum);
			preNum=list.get(i);
	        }	

		}
	}
}
