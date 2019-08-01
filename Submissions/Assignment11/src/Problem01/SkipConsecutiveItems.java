package Problem01;

import java.util.Iterator;
import java.util.List;

public class SkipConsecutiveItems implements Iterator<Integer> {
    private int cursor = 0;
    private List<Integer> numbers;

    public SkipConsecutiveItems(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean hasNext() {
        return numbers.size() > cursor;
    }

    @Override
    public Integer next() {
        Integer item = numbers.get(cursor);

        while (numbers.size() > cursor + 1 && numbers.get(cursor + 1).equals(item)) {
            cursor++;
        }
        cursor++;

        return item;
    }
}

