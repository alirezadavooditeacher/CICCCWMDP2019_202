package assignment7.Problem4;

import java.util.ArrayList;

public class Generic<T extends Book> {
    private ArrayList<T> list;

    public Generic(ArrayList<T> list) {
        this.list = list;
    }

    public ArrayList<T> getList() {
        return list;
    }

    public void setList(ArrayList<T> list) {
        this.list = list;
    }

    public void addItemToList(T obj) {
        this.list.add(obj);
    }

    public void removeItemFromTheList(int index) {
        this.list.remove(index);
    }

    public ArrayList<T> performOperation(ArrayList<T> list) {
        int count = 0;

        ArrayList<T> newlist = new ArrayList<T>();

        for (T obj : list) {
            if (obj.getGenre() == "suspense") {
                count++;
                newlist.add(obj);
            }
        }
        if (count == 0) {
            return null;
        } else {
            return newlist;
        }
    }

}


