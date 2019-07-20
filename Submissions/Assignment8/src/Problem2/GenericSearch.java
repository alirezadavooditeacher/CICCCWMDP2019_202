package Problem2;

import java.util.Iterator;

public class GenericSearch<T extends Iterable, S extends SearchQuery, E>{
    public int search(T obj, S searchQuery){
        Iterator<E> iterator = obj.iterator();
        int count = 0;
        while(iterator.hasNext()){
            E item = iterator.next();
            if(searchQuery.searchCondition(item)){
                count++;
            }
        }
        return count;
    }
}
