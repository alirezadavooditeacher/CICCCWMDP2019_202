package src.problem4;

public interface MyObservable {
    public void addObserver(MyObserver mo);
    public void removeObserver(MyObserver mo);
}