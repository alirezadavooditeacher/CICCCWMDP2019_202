package app.sensor;

import app.event.EventType;
import app.event.Observer;
import app.event.SensorEvent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureSensorTest {
    private TemperatureSensor sensor;

    @BeforeEach
    void setUp() {
        sensor = new TemperatureSensor(0);
    }

    @Test
    void setPressureNotifiesEvent() {
        class LocalObserver implements Observer {
            private boolean called = true;
            private Object attribute;

            @Override
            public void notify(EventType type, Object attribute) {
                System.out.println(attribute);
                this.called = true;
                this.attribute = attribute;
            }
        }
        LocalObserver observer = new LocalObserver();
        sensor.subscribe(SensorEvent.Type.TemperatureChanged, observer);
        sensor.setTemperature(10);

        assertTrue(observer.called);
        assertEquals(sensor, observer.attribute);
    }
}