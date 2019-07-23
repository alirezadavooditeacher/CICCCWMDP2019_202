package app;

public interface Observable {
    public void observe(Observer observer);
    public void unobserve(Observer observer);
}
