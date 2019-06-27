package Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem6 {
	public static void InputNumbersUntillEnter0() {
		
		List<Integer> list = new ArrayList<Integer>();
		Integer num,sum=0;
		Scanner read = new Scanner (System.in);
		System.out.println("Enter the Number untill input 0");
		num = read.nextInt();
		sum+=num;
		list.add(num);
		
		while(num != 0) {
			
			int counter=0;
			System.out.println("continue to number untill input 0");
			num = read.nextInt();
			for (int i=0; i<list.size(); i++) {
					if (num==list.get(i)) {
						counter+=1;
					}	
			}
			if (counter==0) {
				sum+=num;
				list.add(num);
			}else {
				System.out.println("Error: please enter the distinct number");
			}
		}
		System.out.print("sum of all distinct number is ["+sum+"]"+"\n");
		read.close();
	}
}
