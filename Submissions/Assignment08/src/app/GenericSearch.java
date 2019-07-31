package app;

public class GenericSearch<T extends Iterable<V>, V> {
    public int search(T something, Criteria criteria) {
        int matchedCount = 0;
        for (V el : something) {
            if (criteria.satisfied(el)) {
                matchedCount += 1;
            }
        }

        return matchedCount;
    }
}
