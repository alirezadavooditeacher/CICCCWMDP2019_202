import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenericListTest {
    GenericList<Integer> genericList;
    ArrayList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>();
        genericList = new GenericList<>(list);
    }

    @Test
    void addAddsItemToTheLIst() {
        genericList.add(1);
        genericList.add(2);

        assertEquals(2, list.size());
        assertEquals(2, list.get(1));
    }

    @Test
    void addNotifies() {
        MyObserver observer = new MyObserver();
        genericList.observe(observer);
        genericList.add(1);

        assertEquals("added", observer.event);
        assertEquals(genericList, observer.source);
    }

    @Test
    void removeRemovesItemFromTheList() {
        genericList.add(1);
        int n = 2;
        genericList.add(n);
        genericList.remove(n);

        assertEquals(1, list.size());
    }

    @Test
    void removeNotifies() {
        MyObserver observer = new MyObserver();
        genericList.observe(observer);
        int n = 1;
        genericList.add(n);
        genericList.remove(n);

        assertEquals("removed", observer.event);
        assertEquals(genericList, observer.source);
    }

    class MyObserver implements Observer {
        String event;
        Object source;

        @Override
        public void notify(String event, Observable source) {
            this.event = event;
            this.source = source;
        }
    }
}