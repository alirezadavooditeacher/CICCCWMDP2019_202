package assignment7;

import java.util.ArrayList;

public class Generic<T extends POJO> {

    public void countNumberOfElementsWithSpecificProperty(ArrayList<T> list) {
        int count = 0;
        for (T item : list) {
            if (item.getCategory() == "action") {
                count ++;
            }
        }
        System.out.println(count);

    }

    public void exchangeElements(ArrayList<T> list) {
        System.out.println(list);
        System.out.println("------------------------------");
        T temp = list.get(0);
        list.set(0, list.get(1));
        list.set(1, temp);

        System.out.println(list);
    }
}
