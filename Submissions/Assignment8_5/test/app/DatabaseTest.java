package app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    private ArrayList<DataPoint> list;
    private Database db;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>();
        db = new Database(list);
    }

    @Test
    void addAddsItemToTheList() {
        DataPoint item = new DataPoint(DataPoint.Category.Humidity, 0);
        db.add(item);

        assertEquals(1, list.size());
        assertEquals(item, list.get(0));
    }
}