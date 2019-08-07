package assignment10.problem1and2;


public class Rectangle implements ShapeInterface{

	@Override
	public float perimeter(int[] s1Sides) {
		return (s1Sides[0] + s1Sides[1]) * 2;
	}

	@Override
	public float area(int[] s1Sides) {
		return s1Sides[0] * s1Sides[1];
	}

	

}
