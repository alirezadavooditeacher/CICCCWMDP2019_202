package Activity01;

public class Problem01 {

    /**
     * calculate two numbers using operator got from parameter
     *
     * @param num1 int operand 1
     * @param num2 int operand 2
     * @param operator String only accept +, -, *, /
     * @return int result of the calculation
     */
    public static int calculator(int num1, int num2, String operator) {

        int result = 0;
        if (operator.equals("+")) {
            result = num1 + num2;

        } else if (operator.equals("-")) {
            result = num1 - num2;

        } else if (operator.equals("/")) {
            if (num1 != 0 && num2 == 0) {
                System.out.println("the operation is not possible because one number if zero");
                throw new IllegalArgumentException("error: you tried to divide by 0");
            }
            result = num1 / num2;

        } else if (operator.equals("*")) {
            result = num1 * num2;

        } else {
            throw new IllegalArgumentException("error: unknown operator: " + operator);
        }

        return result;
    }
}
