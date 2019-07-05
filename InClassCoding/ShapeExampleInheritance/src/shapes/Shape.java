package shapes;

public abstract class Shape implements Movable{

	protected int side;
	
	Shape(int side) {
		this.side = side;
	}
	
	abstract float area();
	abstract float perimeter();
	public abstract String toString();

}
