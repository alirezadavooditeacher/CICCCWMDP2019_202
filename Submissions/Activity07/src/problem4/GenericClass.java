package src.problem4;

import java.util.ArrayList;

public class GenericClass<T extends Countable> {

    private ArrayList<T> list;

    public GenericClass() {
        this.list = new ArrayList<>();
    }

    public ArrayList<T> getList() {
        return this.list;
    }

    public void addItemToList(T obj) {
        this.list.add(obj);
    }

    public void removeItemFromTheList(int index) {
        try {
            this.list.remove(index);
        } catch (IndexOutOfBoundsException e) {
            // do nothing
        }
    }

    public ArrayList<T> performOperation() {
        ArrayList<T> newList = new ArrayList<>();
        for (T obj: this.list) {
            if (obj.getCountOfLegs() > 2) {
                newList.add(obj);
            }
        }

        return newList;
    }

}
