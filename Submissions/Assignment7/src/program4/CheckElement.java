package program4;

@FunctionalInterface
public interface CheckElement<T> {

	public boolean check(T t);
}
