package problem3;

import java.util.ArrayList;

public class SwapItem <T>{

    public void exchangeElements(ArrayList<T> list) {
        if (list.size() <= 1) {
            System.out.println(list);
        }
        T tempObj = list.get(0);
        list.set(0, list.get(1));
        list.set(1, tempObj);

        System.out.println(list);
    }
}
