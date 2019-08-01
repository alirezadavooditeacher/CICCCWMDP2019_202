package Problem01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Problem01 {
    public static int countCastle(List<Integer> land) {
        // Assumptions
        // - PEAK  : if the number surrounded by the numbers which less then the number is self
        // - VALLEY: if the number surrounded by the numbers which grater then the number is self
        Predicate<List<Integer>> isPeak = (numbers) -> numbers.get(0) < numbers.get(1) && numbers.get(1) > numbers.get(2);
        Predicate<List<Integer>> isValley = (numbers) -> numbers.get(0) > numbers.get(1) && numbers.get(1) < numbers.get(2);

        int castles = 1;
        SkipConsecutiveItems itr = new SkipConsecutiveItems(land);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (itr.hasNext()) {
            Integer item = itr.next();
            numbers.add(item);

            if (numbers.size() > 3) {
                numbers.remove(0);
            }
            if (numbers.size() < 3) {
                continue;
            }
            if (isPeak.test(numbers) || isValley.test(numbers)) {
                castles++;
            }
        }

        return castles;
    }
}
