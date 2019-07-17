package app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenericSearchTest {
    GenericSearch<List<Integer>, Integer> genericSearch;

    @BeforeEach
    void setUp() {
        genericSearch = new GenericSearch<>();
    }

    @Test
    void search() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        int count = genericSearch.search(list, (Criteria<Integer>) p -> p % 2 == 0);
        assertEquals(5, count);
    }
}