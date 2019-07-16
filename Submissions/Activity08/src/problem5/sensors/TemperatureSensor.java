package src.problem5.sensors;

import src.problem4.MyObservable;
import src.problem4.MyObserver;

import java.util.ArrayList;
import java.util.Iterator;

public class TemperatureSensor implements MyObservable {

    private int temperature;
    private ArrayList<MyObserver> observers = new ArrayList<>();

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
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
