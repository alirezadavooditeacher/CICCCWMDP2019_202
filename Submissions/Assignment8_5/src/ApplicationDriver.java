import app.DataPoint;
import app.Database;
import app.NewsStation;
import app.WeatherStation;
import app.sensor.HumiditySensor;
import app.sensor.PressureSensor;
import app.sensor.TemperatureSensor;

import static app.DataPoint.Category.*;

public class ApplicationDriver {

    public static void main(String[] args) {
        TemperatureSensor ts = new TemperatureSensor(0);
        HumiditySensor hs = new HumiditySensor(0);
        PressureSensor ps = new PressureSensor(0);

        WeatherStation ws = new WeatherStation();
        ws.subscribeToHumiditySensor(hs);
        ws.subscribeToPressureSensor(ps);
        ws.subscribeToTemperatureSensor(ts);

        NewsStation ns = new NewsStation();
        ns.subscribeWeatherStation(ws);

        Database db = new Database();
        db.add(new DataPoint(Humidity, 13));
        db.add(new DataPoint(Pressure, 12));
        db.add(new DataPoint(Temperature, 23));
        db.add(new DataPoint(Humidity, 13));
        db.add(new DataPoint(Humidity, 11));
        db.add(new DataPoint(Temperature, 24));
        db.add(new DataPoint(Pressure, 12));
        db.add(new DataPoint(Temperature, 11));
        db.add(new DataPoint(Pressure, 10));
        db.add(new DataPoint(Temperature, 22));
        for (DataPoint el: db) {
            switch (el.getDataCategory()){
                case Humidity:
                    hs.setHumidity(el.getNewValue());
                    break;
                case Temperature:
                    ts.setTemperature(el.getNewValue());
                    break;
                case Pressure:
                    ps.setPressure(el.getNewValue());
                    break;
            }
        }
    }
}
