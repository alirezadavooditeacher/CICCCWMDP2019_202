package program1;

import program1.Foo1.Foo2;

public class Foo1 {
	private int bar1;
	
	public Foo1(int x) {
		bar1 = x;
	}
	public class Foo2 extends Foo1{
		
		public Foo2(int x) {
			super(x*10);
		}
		public void show() {
			System.out.println
			("bar1 = " + bar1);
			System.out.println
			("((Foo1)this).bar1 = " + ((Foo1)this).bar1);
			System.out.println("Foo1.this.bar1 = " + Foo1.this.bar1);
		}
	}
	public class Test64 {
		public void main(String[] args) {
			Foo1 f1 = new Foo1(5);
			Foo1.Foo2 f2 = f1.new Foo2(6);
			f2.show();
			System.out.println("main method in inner class works too");
		}
	}
}
