package src.problem2;

abstract class Shape {

    Shape.ShapeType shapeType;

    Shape(Shape.ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    enum ShapeType {
        Rectangle,
        Triangle,
        Circle,
        Square,
        Custom
    }

    abstract float perimeter();
    abstract float area();
}
