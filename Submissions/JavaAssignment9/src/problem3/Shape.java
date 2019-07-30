package problem3;

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
        public ShapeType getShapeType() {
            return shapeType;
        }

        public int[] getSides() {
            return sides;
        }
        abstract float perimeter();

        abstract float area();
}

class ApplicationDriver{
    static class MyGeometry{
        public void calculateAreaAndPerimeter(Shape shape){
            if (shape.getShapeType()!= Shape.ShapeType.Custom){
                float perimeter = shape.perimeter();
                float area = shape.area();

                System.out.println("Perimeter is: " + perimeter);
                System.out.println();
                System.out.println("Area is: " + area);
            }else{
                float perimeter = shape.perimeter();
                System.out.println("Perimeter is: " + perimeter);
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        ApplicationDriver.MyGeometry mg = new MyGeometry();

        int[]s1Sides = {10, 20};
        Shape.ShapeType s1Type = Shape.ShapeType.Rectangle;
        Shape s1 = new Shape(s1Type, s1Sides){

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

        int[] s2Sides = {10};
        Shape.ShapeType s2Type = Shape.ShapeType.Square;
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
        Shape.ShapeType s3Type = Shape.ShapeType.Circle;
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
        Shape.ShapeType s4Type = Shape.ShapeType.Custom;
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
