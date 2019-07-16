package src.problem2;

import src.problem1.Iterator;

public class GenericSearch {

    public <T extends Iterator, Y> int search(T iterator, Y compare) {

        int count = 0;
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if (obj.equals(compare)) {
                count++;
            }
        }

        return count;
    }
}
