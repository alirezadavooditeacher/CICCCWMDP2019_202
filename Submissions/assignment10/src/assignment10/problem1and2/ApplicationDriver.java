package assignment10.problem1and2;

public class ApplicationDriver {

	public static void main(String[] args) {
		int[] s1Sides = { 10, 20 };
		ShapeInterface s1 = new Rectangle();
		System.out.println("S1's permiter is: " + s1.perimeter(s1Sides));
		System.out.println("S1's area is: " + s1.area(s1Sides));
		s1 = new Square();
		System.out.println("S1's permiter is: " + s1.perimeter(s1Sides));
		System.out.println("S1's area is: " + s1.area(s1Sides));
	}

}
