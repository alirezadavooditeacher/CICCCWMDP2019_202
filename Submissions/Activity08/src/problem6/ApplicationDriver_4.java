package src.problem6;

import src.problem5.stations.WeatherStation;

public class ApplicationDriver_4 {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Notify<String> notify = new Notify<>();
        notify.addObserver(weatherStation);

        notify.addObject("first index");
        notify.addObject("second index");
        notify.removeObject(0);
    }
}
