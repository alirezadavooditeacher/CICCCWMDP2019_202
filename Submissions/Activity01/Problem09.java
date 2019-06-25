package Activity01;

public class Problem09 {

    /**
     * print numbers
     *
     * @param A a number
     * @param B a number
     */
    public static void printNumbers(int A, int B) {
        printNumber01(A, B);
        printNumber02(A, B);
        printNumber03(A, B);
    }


    /**
     * print numbers
     * which are between num_a and num_b(num_a and num_b are not included)
     * and which are divisible to both 3 and 5
     *
     * @param A a number
     * @param B a number
     */
    private static void printNumber01(int A, int B) {
        for (int i = A + 1; i < B; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * print numbers
     * which are between num_a and num_b(num_a included by num_b not included)
     * and which are divisible to 6 or 7
     *
     * @param A a number
     * @param B a number
     */
    private static void printNumber02(int A, int B) {
        for (int i = A; i < B; i++) {
            if (i % 6 == 0 || i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * print numbers
     * which are between num_a and num_b(num_a and num_b are included)
     * and which are not divisible by 3
     *
     * @param A a number
     * @param B a number
     */
    private static void printNumber03(int A, int B) {
        for (int i = A; i <= B; i++) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
        }
    }

}
