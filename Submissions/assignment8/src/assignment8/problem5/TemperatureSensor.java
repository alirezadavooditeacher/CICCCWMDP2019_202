package assignment8.problem5;

import java.util.Observable;
import java.util.Observer;

public class TemperatureSensor extends Observable implements WeatherInterface{
	 private int temperature;

	@Override
	public void change(int value) {
		this.temperature = value;
		setChanged();
        notifyObservers(value);
		
	}

	public TemperatureSensor(Observer o) {
		super.addObserver(o);
	}
	
	
	 
}
