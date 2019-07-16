package src.problem1andproblem3;

import java.util.ArrayList;

public class GenericClass<T extends Countable> {

    public int countNumberOfElementsWithSpecificProperty(ArrayList<T> list) {
        int count = 0;
        for (T obj: list) {
            if (obj.getCountOfLegs() > 2) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<T> exchangeElements(ArrayList<T> list) {
        if (list.size() <= 1) {
            return list;
        }
        T tempObj = list.get(0);
        list.set(0, list.get(1));
        list.set(1, tempObj);

        return list;
    }

}
