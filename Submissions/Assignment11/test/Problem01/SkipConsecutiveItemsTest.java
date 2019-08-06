package Problem01;

import Problem01.SkipConsecutiveItems;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SkipConsecutiveItemsTest {

    @Test
    void iterator() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 3, 3, 4, 5, 3);
        SkipConsecutiveItems itr = new SkipConsecutiveItems(numbers);

        int count = 0;
        while(itr.hasNext()) {
            count++;
            itr.next();
        }
        assertEquals(6, count);
    }
}