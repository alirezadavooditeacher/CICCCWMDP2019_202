package boundedype;

import java.util.ArrayList;
import java.util.Iterator;


public class Utility {
	
	public static <E extends Comparable<E>> int countBiggerThan(ArrayList<E> list, E element) {
		
		Iterator<E> iterator = list.iterator();
		
		int count = 0;
		
		while(iterator.hasNext()) {
			E e = iterator.next();
			if(e.compareTo(element)>0) {
				count++;
			}
		}
		return count;
	}

}
