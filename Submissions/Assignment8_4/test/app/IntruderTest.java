package app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntruderTest {
    Building building;
    Room room;
    Intruder intruder;

    @BeforeEach
    void setUp() {
        room = new Room("101", 10);
        building = new Building("Test", 2019);
        building.addRoom(room);

        intruder = new Intruder();
    }

    @Test
    void unauthorizedAccess() {
        intruder.unauthorizedAccess(building, 0);
        assertFalse(room.isLocked());
    }
}