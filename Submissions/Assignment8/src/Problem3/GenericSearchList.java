package Problem3;

import Problem2.SearchQuery;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericSearchList<T extends Iterable, S extends SearchQuery, E> {
    public ArrayList<E> search(T obj, S searchQuery){
        Iterator<E> iterator = obj.iterator();
        ArrayList<E> newList = new ArrayList<>();
        while(iterator.hasNext()){
            E item = iterator.next();
            if(searchQuery.searchCondition(item)){
                newList.add(item);
            }
        }
        return newList;
    }
}
