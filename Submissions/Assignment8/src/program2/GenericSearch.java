package program2;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericSearch<E extends Iterable, U extends Query, V > {
	
	public int search(E obj,U search ) {
		Iterator<V> it = obj.iterator();
		int ocurrences = 0;
		while(it.hasNext()) {
			V thing = it.next();
			if(search.predicate(thing)) {
				ocurrences++;
			}
		}
		return ocurrences;
	}

}
