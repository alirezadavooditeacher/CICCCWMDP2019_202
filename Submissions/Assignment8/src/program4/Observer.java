package program4;

public interface Observer<E extends Subject> {
	public void update(E subject);

}
