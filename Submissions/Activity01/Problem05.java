package Activity01;

public class Problem05 {

    /**
     * print the sum of the number’s digits
     *
     * @param numStr string of number
     * @return sum number
     */
    public static int printSumNumbersDigits(String numStr) {

        int num = 0;
        int length = numStr.length();
        for (int i = 0; i < length; i++) {
            num += Character.getNumericValue(numStr.charAt(i));
        }
        System.out.println(num);

        return num;
    }

}
