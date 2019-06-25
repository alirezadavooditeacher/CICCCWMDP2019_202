/**
 *
 */
package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author miyamotoatsushi
 * implement problem6
 */
public class Problem6 {
    /**
     * sum enter number
     * @return sum of enter number
     */
    public static Integer returnSumNumber() {
        Scanner reader = new Scanner(System.in);
        List<Integer> keepNumber = new ArrayList<Integer>();
        int sumNumber = 0;
        while (true) {
            System.out.println("Enter Number");
            int inputNumber = reader.nextInt();
            if (inputNumber == 0) {
                break;
            } else if(!keepNumber.contains(inputNumber)) {
                sumNumber += inputNumber;
                keepNumber.add(inputNumber);
            } else {
                System.out.println("you already enter same number try again");
            }
        }

        return sumNumber;

    }
}
