package Problem2;

public class Main {
    enum ShapeType {
        RECTANGLE, TRIANGLE, CIRCLE, SQUARE, CUSTOM
    }

    public static void main(String[] args){
        int[] s1Sides = {10, 20};
        Shape s1 = new Shape(ShapeType.RECTANGLE, s1Sides){

            @Override
            float perimeter() {
                return 2 *(this.getSides()[0] + this.getSides()[1]);
            }

            @Override
            float area() {
                return this.getSides()[0] * this.getSides()[1];
            }
        };

        System.out.println("S1's perimeter is: " + s1.perimeter());
        System.out.println("S1's area is: " + s1.area());

        int[] s2Sides = {10};
        Shape s2 = new Shape(ShapeType.SQUARE, s2Sides) {
            @Override
            float perimeter() {
                return this.getSides()[0] * 4;
            }

            @Override
            float area() {
                return this.getSides()[0] * this.getSides()[0];
            }
        };

        System.out.println("S1's perimeter is: " + s2.perimeter());
        System.out.println("S1's area is: " + s2.area());
    }
}
