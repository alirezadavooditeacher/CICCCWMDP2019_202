package program1;

public class AppDriver {
	public static void main(String[] args) {
		Foo1 f3 = new Foo1(0);
		Foo1.Test64 t1 = f3.new Test64();
		t1.main(args);
	}

}
