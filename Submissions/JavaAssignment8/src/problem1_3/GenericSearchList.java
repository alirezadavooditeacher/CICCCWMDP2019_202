package problem1_3;

import java.util.ArrayList;
import java.util.List;

public class GenericSearchList<T extends Iterable<V>,V> {
    public List<V> search(T Item, Property property){
        List<V> matched = new ArrayList<>();

        for(V pa : Item){
            if (property.search(pa)) {
                matched.add(pa);
            }
        }
        return matched;
    }

}
