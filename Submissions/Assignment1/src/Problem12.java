/**
 * Problem12
 * Write a function which receives 2 number A and B as input. Then using A and B, the
 * function considers calculating two mathematical functions:
 */
public class Problem12 {
    /**
     * Find the number
     */
    static public int findTheNumber() {
        int number = 3;
        while (true) {
            if (f1(number - 1) < f2(number - 1) && f1(number) > f2(number)) {
                break;
            }
            number++;
        }
        return number;
    }

    private static int f1(int x) {
        return (int) Math.pow(2, x);
    }

    private static int f2(int x) {
        return (int) Math.pow(x, 5);
    }
}
