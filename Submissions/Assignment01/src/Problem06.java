/**
 * Problem6
 * Design a function which receives a number from input and find the next prime number
 * which is bigger than the input number. Reuse the function you have defined for Problem 3.
 */
public class Problem06 {
    /**
     * Return the next prime number
     */
    public static int findNextPrimeNumber(int number) {
        while (true) {
            if (Problem03.isPrime(++number)) {
                return number;
            }
        }
    }
}
