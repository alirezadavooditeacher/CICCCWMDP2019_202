package app.sensor;

import app.event.EventType;
import app.event.Observable;
import app.event.Observer;
import app.event.SensorEvent;

import java.util.ArrayList;
import java.util.HashMap;

public class PressureSensor implements Observable {
    int pressure;
    private HashMap<EventType, ArrayList<Observer>> observers = new HashMap<>();

    public PressureSensor(int pressure) {
        this.pressure = pressure;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyEvent(SensorEvent.Type.PressureChanged, this);
    }

    @Override
    public void subscribe(EventType type, Observer observer) {
        ArrayList<Observer> list = observers.getOrDefault(type, new ArrayList<>());
        list.add(observer);
        observers.put(type, list);
    }

    @Override
    public void unsubscribe(EventType type, Observer observer) {
        ArrayList<Observer> list = observers.get(type);
        if (list == null) {
            return;
        }
        list.remove(observer);
    }

    public void notifyEvent(EventType type, Object attr) {
        ArrayList<Observer> list = observers.get(type);
        if (list == null) {
            return;
        }
        for(Observer el: list) {
            el.notify(type, attr);
        }
    }
}
