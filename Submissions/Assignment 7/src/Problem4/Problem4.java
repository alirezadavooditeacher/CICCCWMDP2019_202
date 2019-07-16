package Problem4;

import java.util.ArrayList;

public class Problem4<S extends Operatble, T> {
    private ArrayList<T> list;
    private S searchQuery;

    public Problem4(ArrayList<T> itemList, S searchQuery){
        this.list = itemList;
        this.searchQuery = searchQuery;
    }

    public void addItemToList(T item){
        list.add(item);
    }

    public void removeItemFromList(T item){
        list.remove(item);
    }

    public ArrayList<T> performOperation(){
        ArrayList<T> newList = searchQuery.operation(list);
        return newList;
    }
}
