import java.util.ArrayList;
import java.util.List;

public class Problem9 {
    // Problem9
    /**
     * Print number between A And B
     *
     * @param A
     * @param B
     */
    public void printNumberBetweenAAndB(int A, int B) {
        // Print Number Divisible Three And Five
        printNumberDivisibleThreeAndFive(A, B);

        // Print Number Divisible Six Or Seven
        printNumberDivisibleSixOrSeven(A, B);

        // Print Number Not Divisible three
        printNumberNotDivisibleThree(A, B);
    }

    /**
     * Print Number Divisible Three And Five
     *
     * @param A
     * @param B
     */
    public void printNumberDivisibleThreeAndFive(int A, int B) {
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = A + 1; i < B; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                arr.add(i);
            }
        }

        System.out.println("All numbers between A and B (A and B not included), which are divisible to both 3 and 5 : "
                + arr.toString());
    }

    /**
     * Print Number Divisible Six Or Seven
     *
     * @param A
     * @param B
     */
    public void printNumberDivisibleSixOrSeven(int A, int B) {
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = A; i < B; i++) {
            if ((i % 6 == 0) && (i % 7 == 0)) {
                arr.add(i);
            }
        }

        System.out.println(
                "All numbers between A and B (A included by B not included), which are divisible by either 6 or 7 : "
                        + arr.toString());
    }

    /**
     * Print Number Not Divisible three
     *
     * @param A
     * @param B
     */
    public void printNumberNotDivisibleThree(int A, int B) {
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = A; i <= B; i++) {
            if (i % 3 != 0) {
                arr.add(i);
            }
        }

        System.out.println("All numbers between A and B (A and B both included), which are not divisible by 3 : "
                + arr.toString());
    }
    public static void main(String[] args) {
        Problem9 p9 = new Problem9();

        // Test Problem9
        p9.printNumberBetweenAAndB(1, 43);

    }
}
