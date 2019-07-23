package app;

import app.criteria.Criteria;
import app.criteria.EvenNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CollectionTest {
    Collection<Integer> collection;

    @BeforeEach
    void setUp() {
        collection = new Collection<>();
    }

    @Test
    void addItemToList() {
        collection.addItemToList(1);
        collection.addItemToList(2);

        ArrayList<Integer> list = collection.getInternalValue();
        assertEquals(2, list.size());
    }

    @Test
    void removeItemFromTheList() {
        collection.addItemToList(1);
        collection.addItemToList(2);
        Integer x = 3;
        collection.addItemToList(x);
        collection.removeItemFromTheList(x);

        ArrayList<Integer> list = collection.getInternalValue();
        assertEquals(2, list.size());
    }

    @Test
    void performOperation() {
        collection.addItemToList(1);
        collection.addItemToList(2);
        collection.addItemToList(3);

        Criteria criteria = new EvenNumber();
        ArrayList<Integer> evenNumbers = collection.performOperation(criteria);
        assertEquals(1, evenNumbers.size());
        assertEquals(2, evenNumbers.get(0));
    }
}
