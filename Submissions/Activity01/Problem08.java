package Activity01;

import java.util.Scanner;

public class Problem08 {

    /**
     * print reverse number
     * some number which is divisible by 10 or has floating point are not valid
     *
     * @return reverse number
     */
    public static String printReverseNumber() {

        Scanner reader = new Scanner(System.in);

        String numStr;
        while (true) {
            System.out.println("input number: ");
            numStr = reader.nextLine();
            int num = Integer.parseInt(numStr);
            if (num % 10 != 0) {
                break;
            }
        }

        String result = "";
        int length = numStr.length();
        for (int i = 0; i < length; i++) {
            result = numStr.substring(i, i + 1) + result;
        }

        System.out.println(result);
        return result;
    }

}
