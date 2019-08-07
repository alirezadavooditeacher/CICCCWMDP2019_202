package assignment9.problem3;

import assignment9.problem2.Shape;

public class ApplicationDriver {
	class MyGeometry {
		public void calculateAreaAndPerimeter(Shape shape) {
			if (!ShapeType.class.isInstance(shape)) {
				shape.perimeter();
				shape.area();
			} else {
				shape.perimeter();
			}
		}
	}

	public enum ShapeType {
		Rectangle, Triangle, Circle, Square, Custom
	}
	
	public static void main(String[] args) {
		
		int[] s1Sides = {10,20}; //10 is width and 20 is length
		ShapeType s1Type = ShapeType.Rectangle;
		Shape s1 = new Shape(ShapeType.Rectangle, s1Sides) {
			@Override
			public float perimeter() {
				System.out.println("S1's permiter is: " + (s1Sides[0] + s1Sides[1]) * 2);
				return (s1Sides[0] + s1Sides[1]) * 2;

			}
			@Override
			public float area() {
				System.out.println("S1's area is: " + s1Sides[0] * s1Sides[1]);
				return s1Sides[0] * s1Sides[1];
			}

		};

		int[] s2Sides = { 10 };

		Shape s2 = new Shape(ShapeType.Square, s2Sides) {

			@Override
			public float perimeter() {
				System.out.println("S1's permiter is: " + 4 * s1Sides[0]);
				return 4 * s1Sides[0];
			}

			@Override
			public float area() {
				System.out.println("S1's area is: " + s1Sides[0] * s1Sides[0]);
				return s1Sides[0] * s1Sides[0];
			}

		};
		int[] s3Sides = { 12 };

		Shape s3 = new Shape(ShapeType.Circle, s3Sides) {

			@Override
			public float perimeter() {
				System.out.println("S1's permiter is: " + (float) ((s3Sides[0] * s3Sides[0]) * 3.14));
				return (float) ((s3Sides[0] * s3Sides[0]) * 3.14);
			}

			@Override
			public float area() {
				System.out.println("S1's area is: " + (float) (s3Sides[0] * 2 * 3.14));
				return (float) (s3Sides[0] * 2 * 3.14);
			}

		};
		
		ApplicationDriver applicationDriver = new ApplicationDriver();
		MyGeometry mg = applicationDriver.new MyGeometry();
		mg.calculateAreaAndPerimeter(s1);
		mg.calculateAreaAndPerimeter(s2);
		mg.calculateAreaAndPerimeter(s3);
	}

}
