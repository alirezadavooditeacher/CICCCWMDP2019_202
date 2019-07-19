package problem1;

import java.util.ArrayList;
import java.util.List;

public class GenericSearchList<T extends Iterable<V>,V> {
    public List<V> search(T a, Genericsearch genericsearch){
        List<V> matched = new ArrayList<>();

        for(V pa : a){
            if (Genericsearch.field(pa)) {
                matched.add(pa);
            }
        }
        return matched;
    }

}
