package app;

import java.util.HashMap;

public class Session {
    private static Session instance = null;

    private HashMap<String, Object> data;

    public static Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }

    public Session() {
        this.data = new HashMap<>();
    }

    public Session set(String key, Object value) {
        data.put(key, value);
        return this;
    }

    public Object get(String key) {
        return data.get(key);
    }

    public Session remove(String key) {
        data.remove(key);
        return this;
    }
}
