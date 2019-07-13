package src.problem5.stations;

import src.problem4.MyObservable;
import src.problem4.MyObserver;
import src.problem5.sensors.HumiditySensor;
import src.problem5.sensors.PressureSensor;
import src.problem5.sensors.TemperatureSensor;

import java.util.ArrayList;
import java.util.Iterator;

public class WeatherStation implements MyObserver, MyObservable {
    private int countOfTemperature;
    private double averageTemperature;
    private int countOfHumidity;
    private double averageHumidity;
    private int countOfPressure;
    private double averagePressure;
    private ArrayList<MyObserver> observers = new ArrayList<>();

    public int getCountOfTemperature() {
        return countOfTemperature;
    }

    public void setCountOfTemperature(int countOfTemperature) {
        this.countOfTemperature = countOfTemperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getCountOfHumidity() {
        return countOfHumidity;
    }

    public void setCountOfHumidity(int countOfHumidity) {
        this.countOfHumidity = countOfHumidity;
    }

    public double getAverageHumidity() {
        return averageHumidity;
    }

    public void setAverageHumidity(double averageHumidity) {
        this.averageHumidity = averageHumidity;
    }

    public int getCountOfPressure() {
        return countOfPressure;
    }

    public void setCountOfPressure(int countOfPressure) {
        this.countOfPressure = countOfPressure;
    }

    public double getAveragePressure() {
        return averagePressure;
    }

    public void setAveragePressure(double averagePressure) {
        this.averagePressure = averagePressure;
    }

    public void update(MyObservable mo) {
        if (mo instanceof TemperatureSensor) {
            int countOfTemperature = getCountOfTemperature();
            double averageTemperature = ((getAverageTemperature() * countOfTemperature) + ((TemperatureSensor) mo).getTemperature()) / (countOfTemperature + 1);
            this.setAverageTemperature(averageTemperature);
            this.countOfTemperature++;

        } else if (mo instanceof PressureSensor) {
            int countOfPressure = getCountOfPressure();
            double averagePressure = ((getAveragePressure() * countOfPressure) + ((PressureSensor) mo).getPressure()) / (countOfPressure + 1);
            this.setAveragePressure(averagePressure);
            this.countOfPressure++;

        } else if (mo instanceof HumiditySensor) {
            int countOfHumidity = getCountOfHumidity();
            double averageHumidity = ((getAverageHumidity() * countOfHumidity) + ((HumiditySensor) mo).getHumidity()) / (countOfHumidity + 1);
            this.setAverageHumidity(averageHumidity);
            this.countOfHumidity++;
        }

        myNotifyAll();
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
