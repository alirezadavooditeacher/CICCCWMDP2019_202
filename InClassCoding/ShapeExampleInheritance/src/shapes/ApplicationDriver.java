package shapes;

import java.util.ArrayList;
import java.util.Iterator;

public class ApplicationDriver {

	public static void main(String[] args) {
		
//		Rectangle r = new Shape(10,20);
//		Movable m2 = new Movable();
//		Shape s = new Shape();
		
		Movable m1 = new Square(10);
		Shape r1 = new Rectangle(10,20);
		Shape s1 = new Square(10);
		Shape c1 = new Circle(6);
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(r1);
		shapes.add(s1);
		shapes.add(c1);
		
		Iterator<Shape> it = shapes.iterator();
		while(it.hasNext()) {
			Shape s = it.next();
			System.out.println(s);
			
			if(s instanceof Square) {
				Circle c = ((Square)s).giveInscribedCircle();
				System.out.println(c);
			}
		}
	}
}
