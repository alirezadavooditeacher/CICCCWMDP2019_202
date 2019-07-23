public class MyObserver implements Observer {
    @Override
    public void notify(String event, Observable source) {
        System.out.println(event);
    }
}
