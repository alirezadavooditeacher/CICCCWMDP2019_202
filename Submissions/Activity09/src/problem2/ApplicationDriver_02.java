package src.problem2;

public class ApplicationDriver_02 {

    public static void main(String[] args) {

        int[] s1Sides = {10,20};
        Shape s1 = new Shape(Shape.ShapeType.Rectangle) {

            float perimeter() {
                return (s1Sides[0] + s1Sides[1]) * 2;
            }

            float area() {
                return s1Sides[0] * s1Sides[1];
            }

        };

        System.out.println("S1's perimeter is: " +  s1.perimeter());
        System.out.println("S1's area is: " +  s1.area());

        int[] s2Sides = {10};
        Shape s2 = new Shape(Shape.ShapeType.Square) {

            float perimeter() {
                return s2Sides[0] * 4;
            }

            float area() {
                return (float)Math.pow(s2Sides[0], 2);
            }

        };

        System.out.println("S2's perimeter is: " +  s2.perimeter());
        System.out.println("S2's area is: " +  s2.area());

        int[] s3Sides = {12};
        Shape s3 = new Shape(Shape.ShapeType.Circle) {
            int radius = s3Sides[0];

            float perimeter() {
                return (float)(radius * 2 * Math.PI);
            }

            float area() {
                return (float)(Math.pow(radius, 2) * Math.PI);
            }

        };

        System.out.println("S3's perimeter is: " +  s3.perimeter());
        System.out.println("S3's area is: " +  s3.area());

        int[] s4Sides = {8, 12, 12};
        Shape s4 = new Shape(Shape.ShapeType.Triangle) {

            float perimeter() {
                return s4Sides[0] + s4Sides[1] + s4Sides[2];
            }

            float area() {
                // use Heron's formula
                float s = (s4Sides[0] + s4Sides[1] + s4Sides[2]) / 2;
                return (float)Math.sqrt(s * (s - s4Sides[0]) * (s - s4Sides[1]) * (s - s4Sides[2]));
            }

        };

        System.out.println("S4's perimeter is: " +  s4.perimeter());
        System.out.println("S4's area is: " +  s4.area());

    }
}
