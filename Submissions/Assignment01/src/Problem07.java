/**
 * Problem7
 * Design a function which receives two numbers A and B from the input and calculate the
 * quotient (not using the floor division). Look at here: https://simple.wikipedia.org/wiki/Division_(mathematics)
 */
public class Problem07 {
    /**
     * Return Quotient
     */
    public static int calculateQuotient(int dividend, int divisor) {
        int quotient = 0;
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            quotient = quotient + 1;
        }
        return quotient;
    }
}
