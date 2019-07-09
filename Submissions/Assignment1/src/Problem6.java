public class Problem6 {
    // Problem6
    /**
     * Find next prime number
     *
     * @param number
     * @return
     */
    public boolean findNextPrimeNumber(int number) {
        int nextNumber = number + 1;
        return isPrimeNumber(nextNumber);
    }

}
