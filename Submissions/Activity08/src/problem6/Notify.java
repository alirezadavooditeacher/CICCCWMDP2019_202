package src.problem6;

import src.problem4.MyObservable;
import src.problem4.MyObserver;

import java.util.ArrayList;
import java.util.Iterator;

public class Notify<T> implements MyObservable {

    private ArrayList<MyObserver> observers = new ArrayList<>();
    private ArrayList<T> objects = new ArrayList<>();

    public void addObject(T obj) {
        this.objects.add(obj);
        this.myNotify();
    }

    public void removeObject(int index) {
        this.objects.remove(index);
        this.myNotify();
    }

    public void addObserver(MyObserver mo) {
        this.observers.add(mo);
    }

    public void removeObserver(MyObserver mo) {
        this.observers.remove(mo);
    }

    public void myNotify() {
        System.out.println("Length has been changed. " + this.objects.size());
        Iterator<MyObserver> iterator = this.observers.iterator();
        while (iterator.hasNext()) {
            iterator.next().update(this);
        }
    }

}
