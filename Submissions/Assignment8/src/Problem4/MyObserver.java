package Problem4;

public interface MyObserver<T extends MyObservable> {
    public void update(T mo);
}
