public class ApplicationDriver {

    public static void main(String[] args) {
        GenericList<Integer> gl = new GenericList<>();
        MyObserver observer = new MyObserver();
        gl.observe(observer);

        gl.add(10);
        gl.add(11);
        gl.add(12);
        Integer n = 100;
        gl.add(n);
        gl.remove(n);
    }
}
