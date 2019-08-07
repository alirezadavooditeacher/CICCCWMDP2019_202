package assignment8.problem5;

import java.lang.reflect.Field;
import java.util.Observable;
import java.util.Observer;

public class WeatherStation implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		try {
			Field field = o.getClass().getDeclaredFields()[0];
			field.setAccessible(true);
			System.out.println(field.getName() +" change is "+ arg);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
