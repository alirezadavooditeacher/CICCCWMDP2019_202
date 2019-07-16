package Problem3;

import java.util.ArrayList;

public class Swapper<T> {
    private ArrayList<T> list;

    public ArrayList<T> getList() {
        return list;
    }

    public Swapper(ArrayList<T> list) {
        this.list = list;
    }

    public ArrayList<T> swap(T element1, T element2){
        ArrayList<T> newList = list;
        T temp = element2;
        int index1 = newList.indexOf(element2);
        int index2 = newList.indexOf(element1);
        newList.set(index1, element1);
        newList.set(index2, temp);
        return newList;
    }

    public void printList(){
        for (int i = 0; i < list.size() ; i++){
            System.out.println(list.get(i)+ ", ");
        }
        System.out.println();
    }
}
