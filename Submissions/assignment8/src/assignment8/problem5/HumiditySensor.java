package assignment8.problem5;

import java.util.Observable;
import java.util.Observer;

public class HumiditySensor extends Observable implements WeatherInterface{
	private int humidity;

	@Override
	public void change(int value) {
		this.humidity = value;
		setChanged();
        notifyObservers(value);
		
	}

	public HumiditySensor(Observer o) {
		super.addObserver(o);
	}
	
}
