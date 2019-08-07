package assignment8.problem6;

import java.util.List;
import java.util.Observable;

public class GenericList extends Observable{
	public <T> void change(List<T> list, T o) {
		list.add(o);
		setChanged();
        notifyObservers("list size "+ list.size());
	}

}
