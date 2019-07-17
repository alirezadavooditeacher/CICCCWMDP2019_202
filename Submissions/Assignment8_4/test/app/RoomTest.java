package app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    Room room;
    @BeforeEach
    void setUp() {
        room = new Room("101", 100);
    }

    @Test
    void lock() {
        room.lock();
        assertTrue(room.isLocked());
    }

    @Test
    void unlock() {
        room.unlock();
        assertFalse(room.isLocked());
    }
}