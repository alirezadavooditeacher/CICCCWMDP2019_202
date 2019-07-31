package program3;

import java.util.ArrayList;
import java.util.Iterator;

import program2.Query;

public class GenericSearchList<E extends Iterable, U extends Query, V > {
	public ArrayList<V> search(E obj, U search){
		ArrayList<V> answer = new ArrayList<V>();
		Iterator<V> it = obj.iterator();
		int ocurrences = 0;
		while(it.hasNext()) {
			V thing = it.next();
			if(search.predicate(thing)) {
				answer.add(thing);
			}
		}
		
		return answer;
	}

}
