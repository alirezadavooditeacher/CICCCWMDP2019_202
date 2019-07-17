package app.event;

public interface Observer {
    public void notify(EventType type, Object attribute);
}
