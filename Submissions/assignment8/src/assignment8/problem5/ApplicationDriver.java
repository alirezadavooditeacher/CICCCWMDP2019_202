package assignment8.problem5;

public class ApplicationDriver {

	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		WeatherInterface weatherInterface = new HumiditySensor(weatherStation);
		weatherInterface.change(4);
		weatherInterface = new TemperatureSensor(weatherStation);
		weatherInterface.change(4);
		weatherInterface = new PressureSensor(weatherStation);
		weatherInterface.change(4);
		
	}

}
