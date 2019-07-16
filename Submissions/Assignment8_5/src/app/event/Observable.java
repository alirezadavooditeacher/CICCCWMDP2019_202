package app.event;

public interface Observable {
    public void subscribe(EventType type, Observer observer);
    public void unsubscribe(EventType type, Observer observer);
}
