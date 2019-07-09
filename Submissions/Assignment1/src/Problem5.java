public class Problem5 {
    // Problem5
    /**
     * Sum of number
     *
     * @param number
     */
    public void sumOfNumber(int number) {
        int sum = 0;

        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        System.out.println("Sum is " + sum);
    }
    public static void main(String[] args) {
        Problem5 p5 = new Problem5();

        // Test Problem5
        p5.sumOfNumber(234);

    }
}
