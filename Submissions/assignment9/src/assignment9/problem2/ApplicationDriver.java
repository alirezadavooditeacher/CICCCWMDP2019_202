package assignment9.problem2;

public class ApplicationDriver {
	enum ShapeType {
		Rectangle, Triangle, Circle, Square, Custom
	}

	public static void main(String[] args) {
		int[] s1Sides = { 10, 20 };
		Shape s1 = new Shape(ShapeType.Rectangle, s1Sides) {
			@Override
			public float perimeter() {
				return (s1Sides[0] + s1Sides[1]) * 2;

			}
			@Override
			public float area() {

				return s1Sides[0] * s1Sides[1];
			}

		};

		int[] s2Sides = { 10 };

		Shape s2 = new Shape(ShapeType.Square, s2Sides) {

			@Override
			public float perimeter() {
				return 4 * s1Sides[0];
			}

			@Override
			public float area() {
				return s1Sides[0] * s1Sides[0];
			}

		};
		int[] s3Sides = { 12 };

		Shape s3 = new Shape(ShapeType.Circle, s3Sides) {

			@Override
			public float perimeter() {
				return (float) ((s3Sides[0] * s3Sides[0]) * 3.14);
			}

			@Override
			public float area() {
				return (float) (s3Sides[0] * 2 * 3.14);
			}

		};

		System.out.println("S1's permiter is: " + s1.perimeter());
		System.out.println("S1's area is: " + s1.area());
		System.out.println("S1's permiter is: " + s2.perimeter());
		System.out.println("S1's area is: " + s2.area());
		System.out.println("S1's permiter is: " + s3.perimeter());
		System.out.println("S1's area is: " + s3.area());

	}

}
