package program1;


import java.util.ArrayList;
import java.util.Iterator;

import program4.CheckElement;

public class BusinessLogic {
		
	public static <E> int 
	countNumberOfElementsWithSpecificProperty(ArrayList<E> listOfElements ,CheckElement<E> methodsEnabler ){
		ArrayList<E> list = listOfElements;
		Iterator<E> it = list.iterator();
		int count=0;		
		while(it.hasNext()) {
			E elem=it.next();
			if( methodsEnabler.check(elem)) {
				count++;
			}
		}
		return count;
	}

}
