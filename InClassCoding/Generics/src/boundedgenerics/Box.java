package boundedgenerics;

public class Box<T> {

	/**
	 * Generic version of the Box class.
	 * @param <T> the type of the value being boxed
	 */
	 private T t;
	 
	 public void set(T t) {
		 this.t = t; 
	 }
	 
	 public T get() { 
		 return t; 
	 }
	 
	 public <U extends Number> void inspect(U u) {
		 System.out.println("T: " + t.getClass().getName());
	     System.out.println("U: " + u.getClass().getName());
	 }
	 
	 public void add(T t) {
		 this.t= t;
	 }
}
