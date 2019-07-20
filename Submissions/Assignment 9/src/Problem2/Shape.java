package Problem2;

abstract class Shape {
    private int[] sides;

    public Shape(Main.ShapeType type, int[] sides){
        this.sides = sides;
    }

    public int[] getSides() {
        return sides;
    }

    public void setSides(int[] sides) {
        this.sides = sides;
    }

    abstract float perimeter();
    abstract float area();
}
