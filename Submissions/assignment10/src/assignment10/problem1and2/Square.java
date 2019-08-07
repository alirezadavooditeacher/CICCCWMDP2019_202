package assignment10.problem1and2;

public class Square implements ShapeInterface{

	@Override
	public float perimeter(int[] s1Sides) {
		return 4 * s1Sides[0];
	}

	@Override
	public float area(int[] s1Sides) {
		return s1Sides[0] * s1Sides[0];
	}

}
