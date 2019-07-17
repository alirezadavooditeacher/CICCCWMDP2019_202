package app;

import app.event.EventType;
import app.event.Observable;
import app.event.Observer;
import app.event.SensorEvent;
import app.sensor.HumiditySensor;
import app.sensor.PressureSensor;
import app.sensor.TemperatureSensor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WeatherStation implements Observable, Observer {
    private HashMap<EventType, ArrayList<Observer>> observers = new HashMap<>();
    private List<Integer> humidities = new ArrayList<>();
    private double averageTemperature;

    private List<Integer> temperatures = new ArrayList<>();
    private double averageHumidity;

    private List<Integer> pressures = new ArrayList<>();
    private double averagePressure;

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public double getAverageHumidity() {
        return averageHumidity;
    }

    public double getAveragePressure() {
        return averagePressure;
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

    @Override
    public void notify(EventType type, Object attribute) {
        if (SensorEvent.Type.HumidityChanged == type) {
            updateHumidity((HumiditySensor) attribute);
        } else if (SensorEvent.Type.PressureChanged == type) {
            updatePressure((PressureSensor) attribute);
        } else if (SensorEvent.Type.TemperatureChanged == type) {
            updateTemperature((TemperatureSensor) attribute);
        }
    }

    public void subscribeToHumiditySensor(HumiditySensor sensor) {
        sensor.subscribe(SensorEvent.Type.HumidityChanged, this);
    }

    public void subscribeToPressureSensor(PressureSensor sensor) {
        sensor.subscribe(SensorEvent.Type.PressureChanged, this);
    }

    public void subscribeToTemperatureSensor(TemperatureSensor sensor) {
        sensor.subscribe(SensorEvent.Type.TemperatureChanged, this);
    }

    private double average(List<Integer> list) {
        Integer total = 0;
        for(Integer el: list) {
            total += el;
        }
        return total.doubleValue() / list.size();
    }

    private void updateTemperature(TemperatureSensor sensor) {
        temperatures.add(sensor.getTemperature());

        double avg = average(temperatures);

        if (averageTemperature != avg) {
            averageTemperature = avg;
            notifyEvent(SensorEvent.Type.TemperatureAverageChanged, this);
        }
    }

    private void updatePressure(PressureSensor sensor) {
        pressures.add(sensor.getPressure());

        double avg = average(temperatures);
        if (averagePressure != avg) {
            averagePressure = avg;
            notifyEvent(SensorEvent.Type.PressureAverageChanged, this);
        }
    }

    private void updateHumidity(HumiditySensor sensor) {
        humidities.add(sensor.getHumidity());

        double avg = average(humidities);
        if (averageHumidity!= avg) {
            averageHumidity = avg;
            notifyEvent(SensorEvent.Type.HumidityAvarageChanged, this);
        }
    }
}
