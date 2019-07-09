import java.util.ArrayList;
import java.util.Iterator;

public class Weather implements MyObservable{

	private ArrayList<MyObserver> observers = new ArrayList<MyObserver>();
	private int temprature = 0;
	
	@Override
	public void addObserver(MyObserver mo) {
		// TODO Auto-generated method stub
		this.observers.add(mo);
	}

	@Override
	public void removeObserver(MyObserver mo) {
		// TODO Auto-generated method stub
		this.observers.remove(mo);
	}

	public void setTemprature(int temprature) {
		this.temprature = temprature;
		this.myNotifyAll();
	}
	
	public int getTemprature() {
		return this.temprature;
	}
	
	public void myNotifyAll() {
		
		Iterator<MyObserver> iterator = this.observers.iterator();
		
		while(iterator.hasNext()) {
			iterator.next().update(this, null);
		}
	}
}
