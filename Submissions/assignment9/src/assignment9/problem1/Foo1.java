package assignment9.problem1;

public class Foo1 {

	private int bar1;

	public Foo1(int x) {
		bar1 = x;

	}
/*
 * not compile because not use super in inner class 
 */
	public class Foo2 {
		public Foo2(int x) {
			//super(x * 10);
		}

		public void show() {
			System.out.println("bar1 = " + bar1);
			//System.out.println("((Foo1)this).bar1 = " + ((Foo1) this).bar1);
			System.out.println("Foo1.this.bar1 = " + Foo1.this.bar1);
		}
	}
	/** 
	 *move Test64 class to inner class of Food1
	 */
	
	public class Test64 {
		
		 public void main() {
		 Foo1 f1 = new Foo1(5);
		 Foo1.Foo2 f2 = f1.new Foo2(6);
		 f2.show();
		 }
		
		 }
	
	
	public static void main(String[] args) {
		Foo1 foo1 = new Foo1(5);
		Foo1.Test64 test64 = foo1.new Test64();
		test64.main();
	}
	
	
	
	
	
}
