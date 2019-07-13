package src.problem3;

import src.problem1.Iterator;

import java.util.ArrayList;

public class GenericSearchList {

    public <T extends Iterator, Y> ArrayList search(T iterator, Y compare) {

        ArrayList<Object> newList = new ArrayList<>();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if (obj.equals(compare)) {
                newList.add(obj);
            }
        }

        return newList;
    }
}
