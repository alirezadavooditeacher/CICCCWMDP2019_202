package problem3;

abstract class Shape {
    public enum Type {
        Rectangle,
        Triangle,
        Circle,
        Square,
        Custom
    }

    protected Type type;
    protected int[] sides;

    public Shape(Type type, int[] sides) {
        this.type = type;
        this.sides = sides;
    }

    public Type getType() {
        return type;
    }

    public int[] getSides() {
        return sides;
    }

    abstract float perimeter();

    abstract float area();
}

class ApplicationDriver {
    static class MyGeometry {
        public void calculateAreaAndPerimeter(Shape shape) {
            // I assume that you want to check if the shape is Custom type or not
            // if(!Custom.class.isInstance(shape))
            if (shape.getType() != Shape.Type.Custom) {
                float perimeter = shape.perimeter();
                float area = shape.area();

                System.out.format("perimeter is: %s", perimeter);
                System.out.println();
                System.out.format("area is: %s", area);
                System.out.println();
            } else {
                float perimeter = shape.perimeter();
                System.out.format("perimeter is: %s", perimeter);
                System.out.println();
            }
        }

    }

    public static void main(String args[]) {
        ApplicationDriver.MyGeometry mg = new MyGeometry();

        int[] s1Sides = {10, 20}; // 10 is width and 20 is length
        Shape.Type s1Type = Shape.Type.Rectangle;
        Shape s1 = new Shape(s1Type, s1Sides) {
            @Override
            float perimeter() {
                return 2 * (sides[0] + sides[1]);
            }

            @Override
            float area() {
                return sides[0] * sides[1];
            }
        };
        mg.calculateAreaAndPerimeter(s1);


        int[] s2Sides = {10}; //10 is the width
        Shape.Type s2Type = Shape.Type.Square;
        Shape s2 = new Shape(s2Type, s2Sides) {
            @Override
            float perimeter() {
                return sides[0] * 4;
            }

            @Override
            float area() {
                return sides[0] * sides[0];
            }
        };
        mg.calculateAreaAndPerimeter(s2);


        int[] s3Sides = {12}; //12 is the radius
        Shape.Type s3Type = Shape.Type.Circle;
        Shape s3 = new Shape(s3Type, s3Sides) {
            @Override
            float perimeter() {
                return sides[0] * 2 * 3.14f;
            }

            @Override
            float area() {
                return sides[0] * sides[0] * 3.14f;
            }
        };
        mg.calculateAreaAndPerimeter(s3);


        int[] s4Sides = {8, 12, 12};
        Shape.Type s4Type = Shape.Type.Custom;
        Shape s4 = new Shape(s4Type, s4Sides) {
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
        mg.calculateAreaAndPerimeter(s4);
    }
} 