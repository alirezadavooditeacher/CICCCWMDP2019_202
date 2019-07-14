package assignment8;

import java.util.ArrayList;

public class GenericSearchList {
    public <T extends Iterator, condition> ArrayList search(T iterable, condition condition) {

        ArrayList<Object> list = new ArrayList<>();
        while(iterable.hasNext()) {
            Object ite = iterable.next();
            if (ite.equals(condition)) {
                list.add(ite);
            }

        }
        return list;
    }

}
