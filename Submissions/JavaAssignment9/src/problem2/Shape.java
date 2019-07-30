package problem2;

import java.lang.reflect.Type;

abstract class Shape {
    public enum ShapeType{
        Rectangle,
        Triangle,
        Circle,
        Square,
        Custom
    }
    ShapeType shapeType;
    int[] sides;

    public Shape(ShapeType shapeType, int[] sides) {
        this.shapeType = shapeType;
        this.sides = sides;
    }

    abstract float perimeter();
        abstract float area();
}

class AplicationDriver {
    public static void main(String[]args){
        int[] s1Sides = {10,20};
        Shape s1 = new Shape (Shape.ShapeType.Rectangle, s1Sides){

            @Override
            float perimeter() {
                return 2 * (sides[0] + sides[1]);
            }

            @Override
            float area() {
                return sides[0] * sides[1];
            }
        };
        System.out.println("S1's perimeter is: " +s1.perimeter());
        System.out.println("S1's area is: " + s1.area());

        int [] s2Sides = {10};
        Shape s2 = new Shape(Shape.ShapeType.Square, s2Sides){

            @Override
            float perimeter() {
                return sides[0] * 4;
            }

            @Override
            float area() {
                return sides[0] * sides[0];
            }
        };
        System.out.println("S2's perimeter is:" + s2.perimeter());
        System.out.println("S2's area is:" + s2.area());

        int[] sides3 = {12};
        Shape s3 = new Shape(Shape.ShapeType.Circle, sides3){

            @Override
            float perimeter() {
                return sides[0] * 2 * 3.14f;
            }

            @Override
            float area() {
                return sides[0] * sides[0] * 3.14f;
            }
        };
        System.out.println("S3's perimeter is:" + s3.perimeter());
        System.out.println("S3's area is: " + s3.area());

        int[] sides4 = {8, 12, 12};
        Shape s4 = new Shape(Shape.ShapeType.Triangle, sides4){

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
        System.out.println("S4's perimeter is: " + s4.perimeter());
        System.out.println("S4's area is: " + s4.area());

    }

}
