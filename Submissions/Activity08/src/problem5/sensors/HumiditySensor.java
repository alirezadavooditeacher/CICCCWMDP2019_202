package src.problem5.sensors;

import src.problem4.MyObservable;
import src.problem4.MyObserver;

import java.util.ArrayList;
import java.util.Iterator;

public class HumiditySensor implements MyObservable {

    private int humidity;
    private ArrayList<MyObserver> observers = new ArrayList<>();

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        this.myNotifyAll();
    }

    public void addObserver(MyObserver mo) {
        this.observers.add(mo);
    }

    public void removeObserver(MyObserver mo) {
        this.observers.remove(mo);
    }

    public void myNotifyAll() {

        Iterator<MyObserver> iterator = this.observers.iterator();

        while(iterator.hasNext()) {
            iterator.next().update(this);
        }
    }
}
