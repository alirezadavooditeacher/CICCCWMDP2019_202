package problems;
import java.util.Scanner;

public class Problem_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;
        String operator;

        System.out.println("num1:");
        num1 = scanner.nextInt();

        System.out.println("num2:");
        num2 = scanner.nextInt();

        System.out.println("operator:");
        operator = scanner.next();
        double cauResult = 0.0;

        if (operator.equals("/") && num2 == 0) {
            System.out.println("the operation is not possible");
        } else if (operator.equals("/")) {
            cauResult = num1 / num2;
        } else if (operator.equals("*")) {
            cauResult = num1 * num2;
        } else if (operator.equals("+")) {
            cauResult = num1 + num2;
        } else if (operator.equals("-")) {
            cauResult = num1 - num2;
        }

        System.out.println(cauResult);


    }

}