package app;

public class Event {
    public enum Type {
        LOCKED,
        UNLOCKED,
        ALL_UNLOCKED
    }

    private Type type;
    private Object attributes;

    public Event(Type type, Object attributes) {
        this.type = type;
        this.attributes = attributes;
    }

    public Type getType() {
        return type;
    }

    public Object getAttributes() {
        return attributes;
    }
}
