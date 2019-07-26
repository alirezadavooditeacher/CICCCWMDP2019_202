package src.problem3;

public class ApplicationDriver_03 {

    static class MyGeometry
    {
        public void calculateAreaAndPerimeter(Shape shape)
        {
            if(shape.getShapeType() != Shape.ShapeType.Custom) {
                System.out.print("perimeter is ");
                System.out.println(shape.perimeter());
                System.out.print("area is ");
                System.out.println(shape.area());
            } else {
                System.out.print("perimeter is ");
                System.out.println(shape.perimeter());
            }
        }
    }

    public static void main(String[] args) {

        ApplicationDriver_03.MyGeometry mg = new MyGeometry();

        int[] s1Sides = {10,20}; //10 is width and 20 is length
        Shape.ShapeType s1Type = Shape.ShapeType.Rectangle;
        //use mg.calculateAreaAndPerimeter to calculate perimeter and area for the Rectangle above
        mg.calculateAreaAndPerimeter(new Shape(s1Type, s1Sides) {

            float perimeter() {
                return (this.getSides()[0] + this.getSides()[1]) * 2;
            }

            float area() {
                return this.getSides()[0] * this.getSides()[1];
            }

        });

        int[] s2Sides = {10}; //10 is the width
        Shape.ShapeType s2Type = Shape.ShapeType.Square;
        //use mg.calculateAreaAndPerimeter to calculate perimeter and area for the Square above
        mg.calculateAreaAndPerimeter(new Shape(s2Type, s2Sides) {

            float perimeter() {
                return this.getSides()[0] * 4;
            }

            float area() {
                return (float)Math.pow(this.getSides()[0], 2);
            }
        });

        int[] s3Sides = {12}; //12 is the radius
        Shape.ShapeType s3Type = Shape.ShapeType.Circle;
        //use mg.calculateAreaAndPerimeter to calculate perimeter and area for the Circle above
        mg.calculateAreaAndPerimeter(new Shape(s3Type, s3Sides) {

            float perimeter() {
                return (float)(this.getSides()[0] * 2 * Math.PI);
            }

            float area() {
                return (float)(Math.pow(this.getSides()[0], 2) * Math.PI);
            }

        });

        int[] s4Sides = {8, 12, 12};
        Shape.ShapeType s4Type = Shape.ShapeType.Custom;
        //use mg.calculateAreaAndPerimeter to calculate perimeter and area for the Custom above
        mg.calculateAreaAndPerimeter(new Shape(s4Type, s4Sides) {

            float perimeter() {
                return this.getSides()[0] + this.getSides()[1] + this.getSides()[2];
            }

            float area() {
                // use Heron's formula
                float s = (this.getSides()[0] + this.getSides()[1] + this.getSides()[2]) / 2;
                return (float)Math.sqrt(s * (s - this.getSides()[0]) * (s - this.getSides()[1]) * (s - this.getSides()[2]));
            }

        });
    }
}
