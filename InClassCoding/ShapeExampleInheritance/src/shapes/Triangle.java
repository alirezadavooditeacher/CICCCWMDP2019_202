package shapes;

public class Triangle extends Shape{

	int height;
	
	Triangle(int height, int base) {
		super(base);
		this.height = height;
	}
	@Override
	float area() {
		return this.side*this.height/2;
	}

	@Override
	float perimeter() {
		return (float)(this.side+this.height + Math.sqrt(Math.pow(this.side, 2)+Math.pow(this.side, 2)));
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

}
