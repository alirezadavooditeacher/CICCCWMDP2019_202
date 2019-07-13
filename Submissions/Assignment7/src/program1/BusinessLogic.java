package program1;


import java.util.ArrayList;
import java.util.Iterator;

public class BusinessLogic {
		
	public static <E extends Comparable<E>> int 
	countNumberOfElementsWithSpecificProperty(ArrayList<E> list, E element){
		Iterator<E> it = list.iterator();
		int count=0;
		while(it.hasNext()) {
			E property=it.next();
			if(property.compareTo(element)>0) {
				count++;
			}
		}
		return count;
	}

}
