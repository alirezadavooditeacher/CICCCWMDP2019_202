package app;

import Criteria.Criteria;

import java.util.List;

public class Counter<T> {
    private List<T> data;

    public Counter(List<T> data) {
        this.data = data;
    }

    public int countNumberOfElementsWithSpecificProperty(Criteria criteria) {
        int count = 0;
        for (T el: data) {
            if (criteria.satisfied(el, data)) {
                count += 1;
            }
        }
        return count;
    }
}
