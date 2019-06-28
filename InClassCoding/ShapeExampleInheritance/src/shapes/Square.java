package shapes;

public class Square extends Shape{
	
	Square(int side){
		super(side);
	}
	
	@Override
	float area() {
		return this.side*this.side;
	}
	
	@Override
	float perimeter() {
		return this.side*4;
	}
	
	@Override
	public String toString() {
		String message = "Square["+this.side+"]: Area:"+this.area()+" Perimeter:"+this.perimeter();
		return message;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	public Circle giveInscribedCircle() {
		int radius = this.side;
		Circle c = new Circle(radius);
		return c;
	}
}
