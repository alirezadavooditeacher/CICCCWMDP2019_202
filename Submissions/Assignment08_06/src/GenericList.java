import java.util.ArrayList;
import java.util.List;

public class GenericList<T> implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private List<T> list;

    public GenericList(List<T> list) {
        this.list = list;
    }

    public GenericList() {
        this.list = new ArrayList<>();
    }

    @Override
    public void observe(Observer observer) {
        observers.add(observer);
    }

    private void notifyAll(String event) {
        for(Observer el: observers) {
            el.notify(event, this);
        }
    }

    public void add(T item) {
        list.add(item);
        notifyAll("added");
    }

    public void remove(T item) {
        list.remove(item);
        notifyAll("removed");
    }
}
