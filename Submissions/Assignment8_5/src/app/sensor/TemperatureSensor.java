package app.sensor;

import app.event.EventType;
import app.event.Observable;
import app.event.Observer;
import app.event.SensorEvent;

import java.util.ArrayList;
import java.util.HashMap;

public class TemperatureSensor implements Observable {
    int temperature;
    private HashMap<EventType, ArrayList<Observer>> observers = new HashMap<>();

    public TemperatureSensor(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyEvent(SensorEvent.Type.TemperatureChanged, this);
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
        System.out.println(attr);
        for(Observer el: list) {
            el.notify(type, attr);
        }
    }
}
