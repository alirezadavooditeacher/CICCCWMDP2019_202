package src.problem3;

abstract class Shape {

    enum ShapeType {
        Rectangle,
        Triangle,
        Circle,
        Square,
        Custom
    }

    ShapeType shapeType;
    int[] sides;

    Shape(Shape.ShapeType shapeType, int[] sides) {
        this.shapeType = shapeType;
        this.sides = sides;
    }

    ShapeType getShapeType() {
        return this.shapeType;
    }

    int[] getSides() {
        return this.sides;
    }

    abstract float perimeter();
    abstract float area();
}
