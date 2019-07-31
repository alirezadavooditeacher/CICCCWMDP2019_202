/**
 * Problem13
 * Write a function which receives a number A (which is between 1 and 10) and prints the
 * multiplication table for 1 to A.
 */
public class Problem13 {
    /**
     * Draw multiplication table
     */
    public static void drawMultiplicationTable(int max){
        // Header line
        System.out.format("%4s", "x");
        for (int i = 1; i <= max; i++) {
            System.out.format("%4s", i);
        }
        System.out.println();

        // Draw each line
        for (int horizontal = 1; horizontal <= max; horizontal++) {
            // column header
            System.out.format("%4s", horizontal);
            for (int vertical = 1; vertical <= max; vertical++) {
                System.out.format("%4s", horizontal * vertical);
            }
            System.out.println();
        }
    }
}
