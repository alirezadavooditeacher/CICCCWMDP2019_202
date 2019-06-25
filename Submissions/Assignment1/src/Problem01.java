/**
 * Problem1
 *
 * Design for an function which takes 2 operands (number) and one operator (plus, minus,
 * multiplication and division) and apply the operator on the operands and print the result.
 * Note: If operand1 is a non-zero number and the operand2 is zero, then the program should
 * not perform the division operand and should print the operation is not possible because one
 * number if zero (this is only for division operator).
 */


public class Problem01 {
    /**
     * Apply the operator on the operands and print the result.
     */
    public static void calculate(int operand1, int operand2, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand1 != 0 && operand2 == 0) {
                    System.out.println("this operation cannot be operated");
                    return;
                }
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Unknown operator");
                return;
        }
        System.out.println(result);
    }
}
