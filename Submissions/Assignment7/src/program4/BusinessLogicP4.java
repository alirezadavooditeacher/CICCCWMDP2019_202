package program4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BusinessLogicP4<E extends Comparable<E>> {
	private List<E> list;
	
	public void addItemToList(E oobject) {
		this.list.add(oobject);
	}
	public void removeItemFromList(E oobject) {
		this.list.remove(oobject);
	}
	public int 
	countNumberOfElementsWithSpecificProperty(E element){
		ArrayList<E> list=(ArrayList<E>) this.list;
		Iterator<E> it = list.iterator();
		int count=0;
		ArrayList<E> satisfactionElements = new ArrayList<E>();
		while(it.hasNext()) {
			E property=it.next();
			if(property.compareTo(element)>0) {
				count++;
			}
		}
		return count;
	}
}
