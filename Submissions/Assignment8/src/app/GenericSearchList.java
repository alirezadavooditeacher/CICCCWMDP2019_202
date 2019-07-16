package app;

import java.util.ArrayList;
import java.util.List;

public class GenericSearchList<T extends Iterable<V>, V> {
    public List<V> search(T something, Criteria criteria) {
        List<V> matched = new ArrayList<>();

        for (V el : something) {
            if (criteria.satisfied(el)) {
                matched.add(el);
            }
        }

        return matched;
    }
}
