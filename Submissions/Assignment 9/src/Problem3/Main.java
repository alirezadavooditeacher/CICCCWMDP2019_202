package Problem3;

public class Main {

    static class myGeometry {
        public static void calculateAreaAndPerimeter(Shape shape){
            float perimeter = shape.perimeter();
            System.out.println("S1's perimeter is: " + perimeter);
            float area = shape.area();
            System.out.println("S1's area is: " + area);
        }
    }

    enum ShapeType {
        RECTANGLE, TRIANGLE, CIRCLE, SQUARE, CUSTOM
    }

    public static void main(String[] args){
        int[] s1Sides = {10, 20};
        ShapeType s1Type = ShapeType.RECTANGLE;
        myGeometry.calculateAreaAndPerimeter(new Shape(s1Type,s1Sides) {
            @Override
            float perimeter() {
                return 2 *(this.getSides()[0] + this.getSides()[1]);
            }

            @Override
            float area() {
                return this.getSides()[0] * this.getSides()[1];
            }
        });
    }
}
