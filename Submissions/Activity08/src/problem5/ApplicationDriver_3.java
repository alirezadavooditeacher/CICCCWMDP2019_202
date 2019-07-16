package src.problem5;

import src.problem1.Iterator;
import src.problem5.databases.DataBase;
import src.problem5.databases.DataPoint;
import src.problem5.sensors.HumiditySensor;
import src.problem5.sensors.PressureSensor;
import src.problem5.sensors.Sensors;
import src.problem5.sensors.TemperatureSensor;
import src.problem5.stations.NewsStation;
import src.problem5.stations.WeatherStation;

public class ApplicationDriver_3 {
    public static void main(String[] args) {
        NewsStation newsStation = new NewsStation();
        WeatherStation weatherStation = new WeatherStation();
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        HumiditySensor humiditySensor = new HumiditySensor();
        PressureSensor pressureSensor = new PressureSensor();

        temperatureSensor.addObserver(weatherStation);
        humiditySensor.addObserver(weatherStation);
        pressureSensor.addObserver(weatherStation);

        weatherStation.addObserver(newsStation);

        DataBase dataBase = new DataBase();

        dataBase.addDataPoint(new DataPoint(Sensors.Temperature, 20));
        dataBase.addDataPoint(new DataPoint(Sensors.Temperature, 21));
        dataBase.addDataPoint(new DataPoint(Sensors.Temperature, 22));
        dataBase.addDataPoint(new DataPoint(Sensors.Temperature, 23));
        dataBase.addDataPoint(new DataPoint(Sensors.Humidity, 69));
        dataBase.addDataPoint(new DataPoint(Sensors.Humidity, 70));
        dataBase.addDataPoint(new DataPoint(Sensors.Humidity, 71));
        dataBase.addDataPoint(new DataPoint(Sensors.Pressure, 1900));
        dataBase.addDataPoint(new DataPoint(Sensors.Pressure, 2000));
        dataBase.addDataPoint(new DataPoint(Sensors.Pressure, 2100));

        Iterator iterator = dataBase.iterator();
        while (iterator.hasNext()) {
            DataPoint dataPoint = (DataPoint)iterator.next();
            if (dataPoint.getDataCategory().equals(Sensors.Temperature)) {
                temperatureSensor.setTemperature(dataPoint.getNewValue());

            } else if (dataPoint.getDataCategory().equals(Sensors.Pressure)) {
                pressureSensor.setPressure(dataPoint.getNewValue());

            } else if (dataPoint.getDataCategory().equals(Sensors.Humidity)) {
                humiditySensor.setHumidity(dataPoint.getNewValue());
            }
        }
    }
}
