/**
 * Problem2
 *
 * Design a function for an application which receive a number and a shape format (which is
 * either SHAPE1 or SHAPE2 or SHAPE3) from the input and prints a shape like this: (if the
 * input is 5)
 */

public class Problem02 {
    public enum Shape {
        SHAPE1,
        SHAPE2,
        SHAPE3,
    }

    /**
     * Call specific method depending on the shape
     */
    public static void draw(Shape shape, int size) {
        switch (shape) {
            case SHAPE1:
                drawShape1(size);
                break;
            case SHAPE2:
                drawShape2(size);
                break;
            case SHAPE3:
                drawShape3(size);
                break;
        }
    }

    /**
     * Draw shape 1
     */
    private static void drawShape1(int size) {
        for (int i = size; i > 0; i -= 2) {
            String prefix = Util.repeatString(" ", (size - i) / 2);
            System.out.print(prefix);
            String star = Util.repeatString("*", i);
            System.out.println(star);
        }
    }

    /**
     * Draw shape 2
     */
    private static void drawShape2(int size) {
        for (int i = size; i > 0; i -= 1) {
            String star = Util.repeatString("*", i);
            System.out.println(star);
        }
    }

    /**
     * Draw shape 3
     */
    private static void drawShape3(int size) {
        for (int i = 1; i <= size; i += 1) {
            String star = Util.repeatString("*", i);
            System.out.println(star);
        }
    }
}
