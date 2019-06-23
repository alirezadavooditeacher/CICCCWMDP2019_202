import java.util.ArrayList;
import java.util.HashSet;

import sets.MapExample1;
import sets.SetExample1;
import sets.SetExample2;

public class ApplicationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		SetExample1 setE1 = new SetExample1();
//		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		
//		list.add(10);
//		list.add(10);
//		list.add(10);
//		list.add(4);
//		list.add(-4);
//		list.add(34);
//		list.add(45);
//		list.add(2);
//		list.add(130);
//		list.add(12);
//		list.add(2);
//		list.add(56);
//		
//		
//		int totalNumber = setE1.getNumberOfUniqueNumbersInList(list);
//		
//		HashSet<Integer> set = setE1.getSetOfUniqueNumbersInList(list);
//		
//		setE1.printSet(set);
//		
//		System.out.printf("The total unique number is %d", totalNumber );
//		
		
		//========================================
		
//		Example: MyPassword123: invalid
//		 * Example: Abcde: valid
//		 * Example: Aadf: valid
//		 
//		SetExample2 setE2 = new SetExample2();
//		boolean isValid = setE2.isPasswordValid("Aadf");
//		System.out.println("\nThe password is valid? "+isValid);
//		
		//int[] array = {2,3,4,5,5,6,2,4,3};
		int[] array = {2,3};
		
		int number = MapExample1.findSingleNumber(array);
		System.out.println("The number that is not repeated is "+number);
	}

}
