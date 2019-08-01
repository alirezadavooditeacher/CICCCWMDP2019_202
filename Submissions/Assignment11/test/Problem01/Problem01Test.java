package Problem01;

import Problem01.Problem01;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01Test {

    @Test
    void problem1() {
        List<Integer> land = Arrays.asList(2,6,6,6,3);
        assertEquals(2, Problem01.countCastle(land));

        List<Integer> land2 = Arrays.asList(6, 1, 4);
        assertEquals(2, Problem01.countCastle(land2));

        List<Integer> land3 = Arrays.asList(1, 6, 7, 6, 7);
        assertEquals(3, Problem01.countCastle(land3));
    }
}