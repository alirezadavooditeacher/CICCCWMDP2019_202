/**
 * Problem3
 *
 * Design a function which receive a number for the input and check whether the number is a
 * prime number or not. If it is a prime number the algorithm which returns true and if not
 * the algorithm will returns false
 */

public class Problem03 {
    /**
     * Check if the number is prime or not
     */
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
