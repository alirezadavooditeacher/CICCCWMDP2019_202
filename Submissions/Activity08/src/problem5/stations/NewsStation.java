package src.problem5.stations;

import src.problem4.MyObservable;
import src.problem4.MyObserver;

public class NewsStation implements MyObserver {
    public void update(MyObservable mo) {
        System.out.println("Average of temperature is " + ((WeatherStation) mo).getAverageTemperature());
        System.out.println("Average of pressure is " + ((WeatherStation) mo).getAveragePressure());
        System.out.println("Average of humidity is " + ((WeatherStation) mo).getAverageHumidity() + "\n");
    }
}
