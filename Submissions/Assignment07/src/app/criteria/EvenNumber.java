package app.criteria;

import java.util.List;

public class EvenNumber extends Criteria<Integer> {
    @Override
    public boolean satisfied(Integer el, List<Integer> data) {
        return el % 2 == 0;
    }
}