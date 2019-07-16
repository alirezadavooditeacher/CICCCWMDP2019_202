package app.event;

public class SensorEvent extends Event {
    public enum Type implements EventType {
        HumidityChanged,
        PressureChanged,
        TemperatureChanged,
        HumidityAvarageChanged,
        PressureAverageChanged,
        TemperatureAverageChanged
    }
}
