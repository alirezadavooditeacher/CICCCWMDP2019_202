package assignment8.problem6;

import java.util.Observable;
import java.util.Observer;

public class ListManage implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(arg);
		
	}

}
