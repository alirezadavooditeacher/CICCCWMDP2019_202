package shapes;

public class Rectangle extends Shape{
	
	private int width;
	
	Rectangle(int length, int width){
		super(length);
		this.width = width;
	}
	
	@Override
	float area() {
		int length = this.side;
		return length*this.width;
	}
	
	@Override
	float perimeter() {
		int length = this.side;
		return (length+this.width)*2;
	}
	
	@Override
	public String toString() {
		int length = this.side;
		String message = "Rectangle["+length+","+this.width+"]: Area:"+this.area()+" Perimeter:"+this.perimeter();
		return message;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	

}
