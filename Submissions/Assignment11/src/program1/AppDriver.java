package program1;

import java.util.ArrayList;
import java.util.function.Function;

public class AppDriver {
	
	public static void main(String[] args) {
		
		int[] land1 = {1,1,1,2,1,1,1}; //land with one peak, count would be 1 + initial spot = 2:
		
		Function<int[],Integer> p1Solution = (e) -> {
			Integer answer = 0;
			int lSize = e.length;
			if(e[0]>=1) {
				answer++;
			}
			for(int i = 1; i<=(lSize-1); i++) {
				//case of 1 integer peak/valley
				if(
						(e[i] > e[i-1] && e[i] > e[i+1])
						||
						(e[i] < e[i-1] && e[i] < e[i+1])
					) {
							answer++;
						}
				//TODO case of +1 integer peak/valley
				
			}
			return answer;
		};
	}

}
