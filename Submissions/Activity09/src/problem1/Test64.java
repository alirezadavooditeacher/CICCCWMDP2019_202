package src.problem1;

public class Test64 {

    public static void main(String[] args) {
        Foo1 f1 = new Foo1(5);
        Foo1.Foo2 f2 = f1.new Foo2(6);
        f2.show();
        // compile error will be shown
    }
}
