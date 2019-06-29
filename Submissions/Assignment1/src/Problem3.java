public class Problem3 {
    // Problem3
    /**
     * Check is prime number
     *
     * @param number interger number
     * @return true/false
     */
    public boolean isPrimeNumber(int number) {
        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Problem3 p3 = new Problem3();

        // Test Problem3
        System.out.println(p3.isPrimeNumber(5));

    }
}
