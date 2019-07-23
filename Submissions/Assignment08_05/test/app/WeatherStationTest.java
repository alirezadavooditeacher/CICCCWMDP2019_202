package app;

import app.event.EventType;
import app.event.Observer;
import app.event.SensorEvent;
import app.sensor.HumiditySensor;
import app.sensor.PressureSensor;
import app.sensor.TemperatureSensor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherStationTest {
    private WeatherStation ws;
    private HumiditySensor hs;
    private PressureSensor ps;
    private TemperatureSensor ts;

    @BeforeEach
    void setUp() {
        ws = new WeatherStation();
        hs = new HumiditySensor(0);
        ps = new PressureSensor(0);
        ts = new TemperatureSensor(0);

        ws.subscribeToHumiditySensor(hs);
        ws.subscribeToPressureSensor(ps);
        ws.subscribeToTemperatureSensor(ts);
    }

    @Test
    void itNotifiesWhenHumidityAverageHasChanged() {
        MyObserver observer = new MyObserver();
        ws.subscribe(SensorEvent.Type.HumidityAvarageChanged, observer);

        hs.setHumidity(100);
        assertTrue(observer.called);
        assertEquals(SensorEvent.Type.HumidityAvarageChanged, observer.event);
        assertEquals(ws, observer.attribute);
    }

    @Test
    void itNotifiesWhenPressureAverageHasChanged() {
        MyObserver observer = new MyObserver();
        ws.subscribe(SensorEvent.Type.PressureAverageChanged, observer);

        ps.setPressure(100);
        assertTrue(observer.called);
        assertEquals(SensorEvent.Type.PressureAverageChanged, observer.event);
        assertEquals(ws, observer.attribute);
    }

    @Test
    void itNotifiesWhenTemperatureAverageHasChanged() {
        MyObserver observer = new MyObserver();
        ws.subscribe(SensorEvent.Type.TemperatureAverageChanged, observer);

        ts.setTemperature(100);
        assertTrue(observer.called);
        assertEquals(SensorEvent.Type.TemperatureAverageChanged, observer.event);
        assertEquals(ws, observer.attribute);
    }

    class MyObserver implements Observer {
        private boolean called = false;
        private EventType event;
        private Object attribute;

        @Override
        public void notify(EventType type, Object attribute) {
            this.called = true;
            this.event = type;
            this.attribute = attribute;
        }
    }
}