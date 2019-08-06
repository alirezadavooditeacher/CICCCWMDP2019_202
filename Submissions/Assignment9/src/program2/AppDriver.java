package program2;

public class AppDriver {
	enum ShapeType {
		Rectangle,
		Triangle,
		Circle
	}
	public static void main(String[] args) {
		int[] s1Sides = {10,20};
		Shape oneRectangle = new Shape(ShapeType.Rectangle,s1Sides){
			int[] sides = s1Sides;
					 
			@Override
			float perimeter() {
				float perimeter = (sides[0]*2) + (sides[1]*2);
				return perimeter;
			}

			@Override
			float area() {
				float area = sides[0] * sides[1];
				return area;
			}
			
		};
		System.out.println("oneRectangle permiter is: " + oneRectangle.perimeter());
		System.out.println("oneRectangle area is: " + oneRectangle.area());
		int[] s2Sides = {8, 12, 12};
		Shape oneTriangle = new Shape(ShapeType.Triangle, s2Sides ) {

			@Override
			float perimeter() {
				float perim = s2Sides[0] + s2Sides[1]+ s2Sides[2];
				return perim;
			}

			@Override
			float area() {
				//Herons formulas is used to calculate area out of the sides lenghs.https://es.wikipedia.org/wiki/Fórmula_de_Herón 
				float perim = s2Sides[0] + s2Sides[1]+ s2Sides[2];
				float sp = perim/2;
				float sqrInsideExpresion = 
						sp*(sp-s2Sides[0]) + 
						sp*(sp-s2Sides[1]) + 
						sp*(sp-s2Sides[2]);
				float triangleArea = (float)Math.sqrt(sqrInsideExpresion);
				return triangleArea;
			}
			
		};
		System.out.println("oneTriangle perimeter is: " + oneTriangle.perimeter());
		System.out.println("oneTriangle area is: " + oneTriangle.area());
		
		int[] s3Sides = {12}; //read circle radius = 12
		
		Shape oneCircle = new Shape(ShapeType.Circle,s3Sides) {
			final double pi = 3.1416;
			@Override
			float perimeter() {
				float perim = (float)(2*pi*s3Sides[0]); // read circle Perimeter is two times multiplication pi*radius
				return perim;
			}

			@Override
			float area() {
				// TODO Auto-generated method stub
				double rr = Math.pow(s3Sides[0], 2);
				float aarea = (float)(pi*rr);
				return aarea;
			}
			
		};
		System.out.println("oneCircle perimeter is: " + oneCircle.perimeter());
		System.out.println("oneCircle area is: " + oneCircle.area());
		
		
	}
}
