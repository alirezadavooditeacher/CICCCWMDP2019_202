package app;

public class Exchange {
    public static <T> void exchangeElements(T[] elements) {
        // assume the array has exactly two elements
        T tmp = elements[0];
        elements[0] = elements[1];
        elements[1] = tmp;
    }
}
