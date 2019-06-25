package Activity01;

public class Problem06 {

    /**
     * get next prime number from a number
     *
     * @param num a number
     * @return int next prime number
     */
    public static int getNextPrimeNumber(int num) {
        while (true) {
            num += 1;
            if (isPrime(num)) {
                System.out.print("The next prime number is ");
                System.out.println(num);
                return num;
            }
        }
    }

    /**
     * check a number from parameter is prime number or not (this function is from problem3)
     *
     * @param num a number
     * @return boolean the number is prime number or not
     */
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

}
