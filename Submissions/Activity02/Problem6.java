package Activity02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java class with an instance method which has no input parameter. The method
 * ask the user to enter numbers. The user can enter repeated numbers but if the user entered
 * a number which was already entered, the method will provide an error message to the
 * user and ask the user to enter another one. The user can enter numbers as long as it has
 * not entered 0. Once a 0 is entered, the method return the sum of all distinct numbers the
 * user had entered.
 */

public class Problem6 {

    public int sumEnteredNumber() {

        ArrayList<Integer> numArray = new ArrayList<>();
        while (true) {
            System.out.print("input number: ");
            Scanner reader = new Scanner(System.in);
            String stringNumber = reader.nextLine();
            if (stringNumber.equals("0")) {
                break;
            }

            int num = Integer.parseInt(stringNumber);
            if (numArray.contains(num)) {
                System.out.println("It's already entered. Enter other number");
                continue;
            }

            numArray.add(num);
        }

        int sum = 0;
        for (int num: numArray) {
            sum += num;
        }

        return sum;
    }

}
