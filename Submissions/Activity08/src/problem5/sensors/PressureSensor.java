package src.problem5.sensors;

import src.problem4.MyObservable;
import src.problem4.MyObserver;

import java.util.ArrayList;
import java.util.Iterator;

public class PressureSensor implements MyObservable {

    private int pressure;
    private ArrayList<MyObserver> observers = new ArrayList<>();

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
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
