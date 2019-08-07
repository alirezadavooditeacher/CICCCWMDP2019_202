package assignment8.problem5;

import java.util.Observable;
import java.util.Observer;

public class PressureSensor extends Observable implements WeatherInterface{
	private int pressure;

	@Override
	public void change(int value) {
		this.pressure = value;
		setChanged();
        notifyObservers(value);
		
	}

	public PressureSensor(Observer o) {
		super.addObserver(o);
	}
}
