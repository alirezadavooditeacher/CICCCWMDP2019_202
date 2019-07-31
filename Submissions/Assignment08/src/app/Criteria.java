package app;

public interface Criteria<T> {
    public abstract boolean satisfied(T el);
}
