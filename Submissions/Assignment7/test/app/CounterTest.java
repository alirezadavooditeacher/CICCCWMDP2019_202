package app;

import app.criteria.EvenNumber;
import org.junit.jupiter.api.Test;
import app.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    @Test
    void countNumberOfElementsWithSpecificPropertyCountsNumberOfElementsBasedOnCriteria() {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

        Counter<Integer> counter = new Counter<>(integers);
        EvenNumber criteria = new EvenNumber();
        int count = counter.countNumberOfElementsWithSpecificProperty(criteria);

        assertEquals(5, count);
    }
}
