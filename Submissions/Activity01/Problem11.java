package Activity01;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem11 {

    /**
     * get max, min and distance
     *
     * @return ArrayList max, min, distance
     */
    public static ArrayList printDistanceBetweenTwoNumbers() {
        int A = 0;
        int B = 0;
        boolean numAHasNum = false;
        boolean numBHasNum = false;

        boolean containString = false;
        Scanner reader = new Scanner(System.in);
        int count;
        while (!containString) {
            containString = false;
            System.out.println("input number: ");
            String numStr = reader.nextLine();
            int length = numStr.length();
            if (length == 0) {
                throw new IllegalArgumentException("input a number");
            }

            count = 0;
            for (int i = 0; i < length; i++) {
                boolean isNum = false;
                if (numStr.charAt(i) == '-') {
                    isNum = count == 0;

                } else {
                    switch (numStr.charAt(i)) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            isNum = true;
                    }
                }

                if (!isNum) {
                    containString = true;
                }
                count++;
            }

            if (!containString) {
                if (!numBHasNum) {
                    B = Integer.parseInt(numStr);
                    numBHasNum = true;

                } else {
                    if (numAHasNum) {
                        if (B <= Integer.parseInt(numStr)) {
                            B = Integer.parseInt(numStr);

                        } else if (A > Integer.parseInt(numStr)) {
                            A = Integer.parseInt(numStr);
                        }

                    } else {
                        if (B < Integer.parseInt(numStr)) {
                            A = B;
                            numAHasNum = true;
                            B = Integer.parseInt(numStr);
                        } else {
                            A = Integer.parseInt(numStr);
                            numAHasNum = true;
                        }
                    }
                }
            }
        }

        if (!numAHasNum || !numBHasNum) {
            throw new IllegalArgumentException("input at least two numbers");
        }

        int absoluteNum = Math.abs(B - A);

        System.out.print("Max num is ");
        System.out.println(B);
        System.out.print("Min num is ");
        System.out.println(A);
        System.out.print("Distance is ");
        System.out.println(absoluteNum);

        ArrayList<Integer> results = new ArrayList<>();
        results.add(B);
        results.add(A);
        results.add(absoluteNum);
        return results;

    }

}
