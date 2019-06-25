package Activity01;

public class Problem10 {

    /**
     * convert base 10 number into base 2 number
     *
     * @param base10Num a base 10 number
     * @return String base 2 number
     */
    public static String convertToBase2(int base10Num) {
        String base2NumStr = "";
        while (base10Num > 0) {
            int remainder = base10Num % 2;
            base2NumStr = Integer.toString(remainder) + base2NumStr;
            base10Num = base10Num / 2;
        }

        System.out.println(base2NumStr);
        return base2NumStr;

    }

}
