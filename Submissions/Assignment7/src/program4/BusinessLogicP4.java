package program4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BusinessLogicP4<E> {
	private List<E> list = new ArrayList<E>();
	
	public void addItemToList(E oobject) {
		this.list.add(oobject);
	}
	public void removeItemFromList(E oobject) {
		this.list.remove(oobject);
	}
	public ArrayList<E> 
	countNumberOfElementsWithSpecificProperty(CheckElement<E> condition ){
		ArrayList<E> list=(ArrayList<E>) this.list;
		Iterator<E> it = list.iterator();		
		ArrayList<E> satisfactionElements = new ArrayList<E>();
		while(it.hasNext()) {
			E elem=it.next();
			if( condition.check(elem)) {
				satisfactionElements.add(elem);
			}
		}
		return satisfactionElements;
	}
	
}
