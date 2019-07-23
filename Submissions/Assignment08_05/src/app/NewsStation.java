package app;

import app.event.EventType;
import app.event.Observer;
import app.event.SensorEvent;

public class NewsStation implements Observer {
    public void subscribeWeatherStation(WeatherStation station) {
        station.subscribe(SensorEvent.Type.HumidityAvarageChanged, this);
        station.subscribe(SensorEvent.Type.PressureAverageChanged, this);
        station.subscribe(SensorEvent.Type.TemperatureAverageChanged, this);
    }

    @Override
    public void notify(EventType type, Object attribute) {
        WeatherStation ws = (WeatherStation) attribute;

        if (SensorEvent.Type.HumidityAvarageChanged== type) {
            System.out.format("[NS] Humidity has changed   : %.2f", ws.getAverageHumidity());
        } else if (SensorEvent.Type.PressureAverageChanged == type) {
            System.out.format("[NS] Pressure has changed   : %.2f", ws.getAveragePressure());
        } else if (SensorEvent.Type.TemperatureAverageChanged == type) {
            System.out.format("[NS] Temperature has changed: %.2f", ws.getAverageTemperature());
        }
        System.out.println();
    }
}
