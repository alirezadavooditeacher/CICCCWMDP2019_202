package app;


import java.util.ArrayList;

import Criteria.Criteria;

public class Collection<T> {
	
	// this is a part of problem 4 implemetation
	
    private ArrayList<T> list = new ArrayList<>();

    public ArrayList<T> getInternalValue() {
        return list;
    }

    public void addItemToList(T item) {
        list.add(item);
    }

    public void removeItemFromTheList(T item) {
        list.remove(item);
    }

    public ArrayList<T> performOperation(Criteria criteria) {
        ArrayList<T> matched = new ArrayList<>();

        for (T el : list) {
            if (criteria.satisfied(el, list)) {
                matched.add(el);
            }
        }

        return matched.size() > 0 ? matched : null;
    }
}
