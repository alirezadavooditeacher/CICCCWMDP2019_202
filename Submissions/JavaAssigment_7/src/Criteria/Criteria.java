package Criteria;

import java.util.List;

public abstract class Criteria<T> {
    public abstract boolean satisfied(T el, List<T> data);
}
