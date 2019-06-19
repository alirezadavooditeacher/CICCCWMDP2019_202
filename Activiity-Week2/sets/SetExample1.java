package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/***
 * Write a java program which calculates the number of unique numbers in an array. The array could have 
 * repeated numbers and also the number of items (numbers) in the array is not known in advance.
 * @author i864360
 *
 */
public class SetExample1 {

	public int getNumberOfUniqueNumbersInList(ArrayList<Integer> list) {
		int totalUniqueNumbers = 0;
		
		HashSet<Integer> set = new HashSet<Integer>(); 
		set = this.getSetOfUniqueNumbersInList(list);
	
		totalUniqueNumbers = set.size();
		
		return totalUniqueNumbers;
	}
	
	public void printSet(HashSet<Integer> set) {
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.printf("%4d", i);
		}
		
		System.out.println();
	}
	
	public HashSet<Integer> getSetOfUniqueNumbersInList(ArrayList<Integer> list) {
		
		HashSet<Integer> set = new HashSet<Integer>(); 
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			Integer number = it.next();
			set.add(number);
		}
		
		return set;
	}
}
