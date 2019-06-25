package Activity01;

public class Problem03 {

    /**
     * check a number from parameter is prime number or not
     *
     * @param number int
     * @return boolean prime number or not
     */
    public static boolean isPrime(int number) {

        if (number <= 1) {
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
