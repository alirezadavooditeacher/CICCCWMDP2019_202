package Problem4;

import java.util.ArrayList;

public interface MyObservable {
    public void addObserver(MyObserver mo);
    public void removeObserver(MyObserver mo);
    public void myNotifyAll();
}
