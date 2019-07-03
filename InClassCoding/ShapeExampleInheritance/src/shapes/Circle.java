package shapes;
 
public class Circle extends Shape{

	public static final float PI = (float) 3.14;
	
	Circle(int radius){
		super(radius);
	}
	
	@Override
	float area() {
		int radius = this.side;
		return radius*radius*PI;
	}
	
	@Override
	float perimeter() {
		int radius = this.side;
		return radius*2*PI;
	}
	
	@Override
	public String toString() {
		int radius = this.side;
		String message = "Circle["+radius+"]: Area:"+this.area()+" Perimeter:"+this.perimeter();
		return message;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
}
