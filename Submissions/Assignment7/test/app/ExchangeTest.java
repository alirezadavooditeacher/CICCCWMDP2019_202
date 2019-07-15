package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExchangeTest {
    @Test
    void exchangeElementsSwapTheElements() {
        Integer[] numbers = {1, 2};
        Exchange.exchangeElements(numbers);

        assertEquals(2, numbers[0]);
        assertEquals(1, numbers[1]);
    }
}