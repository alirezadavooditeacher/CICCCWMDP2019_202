package program1;

import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class AppDriver {
	
	public static void main(String[] args) {
		
		int[] land1 = {1,1,1,2,1,2,1}; //land with 2 peaks and 1 valley , count would be 3 + initial spot = 4:
		
		Function<int[],Integer> p1Solution = (e) -> {
			Integer answer = 0;
			int lSize = e.length;
			if(e[0]>=1) {
				answer++;
			}
			//Predicates to build if statements
//			BiPredicate<Integer, Integer> bpj = (e1,e2) -> e1 > e2 ; // read: bp1 MEANS bigger than plus j
//			
//			
//			BiPredicate<Integer, Integer> bm1 = (e1,e0) -> e1 > e0 ; // read: bm1 MEANS bigger than minus 1
			
			BiPredicate<Integer, Integer> sm1 = (e1,e0) -> e1 == e0 ; //read: sm1 MEANS same as minus 1
			
			BiPredicate<Integer, Integer> spj = (e2,e1) -> e2 == e1 ; //read: sm1 MEANS same as plus j
			
			
			//My own version of Predicate that has an array as input.
			
			MyBiPredicate<Integer> mvp = (e0,e1,e2) -> 
				(e1>e0 && e1>e2) || (e1<e0 && e1<e2)
			;
			
// trigger of process: e0 != e1
//						//then if e2 ==e1 , check if e3==e1 and so on...when e(i+j) != e1 , check if (bpj AND bm1)			
			int i = 1;
			int j = 2;
			while (i<lSize-1 && j<=lSize-1) {
				if(sm1.test(e[i], e[i-1])){
					i++;
					j++;
				}
				else if(mvp.test(e[i-1], e[i], e[j])) {
					answer++;
					i=j;
					j++;
				}
				else if (spj.test(e[j], e[i])) {
					j++;
				}
				else if(mvp.test(e[i-1],e[i], e[j])) {
					answer++;
					i=j;
					j++;
				}
				else {
					i=j;
					j=i+1;
					
				}
			}
			return answer;
		};
		System.out.println("Expected: 4  Actual: "+p1Solution.apply(land1));
	}

}
