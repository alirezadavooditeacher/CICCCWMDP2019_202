package problem1_1;

import java.util.Collection;

public final class Algorithm {
    public static <T> int countNumberOfElementsWithSpecificProperty (Collection<T> c, Countable<T> p){
        int count = 0;
        for (T elem : c)
            if (p.test(elem))
                ++count;
            return count;
    }
}
