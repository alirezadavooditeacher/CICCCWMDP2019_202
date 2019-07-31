package problem02;

abstract class Shape {
    public enum Type {
        Rectangle,
        Triangle,
        Circle,
        Square,
        Custom
    }

    Type type;
    int[] sides;

    public Shape(Type type, int[] sides) {
        this.type = type;
        this.sides = sides;
    }

    abstract float perimeter();

    abstract float area();
}

class ApplicationDriver {

    public static void main(String args[]) {

        int[] s1Sides = {10, 20};
        Shape s1 = new Shape(Shape.Type.Rectangle, s1Sides) {
            @Override
            float perimeter() {
                return 2 * (sides[0] + sides[1]);
            }

            @Override
            float area() {
                return sides[0] * sides[1];
            }
        };

        System.out.format("S1's perimeter is: %s", s1.perimeter());
        System.out.println();
        System.out.format("S1's area is: %s", s1.area());
        System.out.println();


        int[] s2Sides = {10};
        Shape s2 = new Shape(Shape.Type.Square, s2Sides) {
            @Override
            float perimeter() {
                return sides[0] * 4;
            }

            @Override
            float area() {
                return sides[0] * sides[0];
            }
        };

        System.out.format("S2's perimeter is: %s", s2.perimeter());
        System.out.println();
        System.out.format("S2's area is: %s", s2.area());
        System.out.println();


        int[] s3Sides = {12}; // assume this is the radius
        Shape s3 = new Shape(Shape.Type.Circle, s3Sides) {
            @Override
            float perimeter() {
                return sides[0] * 2 * 3.14f;
            }

            @Override
            float area() {
                return sides[0] * sides[0] * 3.14f;
            }
        };

        System.out.format("S3's perimeter is: %s", s3.perimeter());
        System.out.println();
        System.out.format("S3's area is: %s", s3.area());
        System.out.println();


        int[] s4Sides = {8, 12, 12};
        Shape s4 = new Shape(Shape.Type.Triangle, s4Sides) {
            @Override
            float perimeter() {
                return sides[0] + sides[1] + sides[2];
            }

            @Override
            float area() {
                float s = perimeter();
                return (float)Math.sqrt(s * ((s - sides[0]) * (s - sides[1]) * (s - sides[2])));
            }
        };

        System.out.format("S4's perimeter is: %s", s4.perimeter());
        System.out.println();
        System.out.format("S4's area is: %s", s4.area());
        System.out.println();
    }
}

