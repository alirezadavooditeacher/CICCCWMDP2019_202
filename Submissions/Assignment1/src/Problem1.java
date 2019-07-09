public class Problem1 {
    // Problem1
    /**
     * Calculator
     *
     * @param number1  operands1
     * @param number2  operands2
     * @param operator : plus, minus,multiplication and division
     */
    public void calculator(float number1, float number2, String operator) {
        float result = 0;
        switch (operator) {
            case "plus":
                result = number1 + number2;
                break;
            case "minus":
                result = number1 - number2;
                break;
            case "multiplication":
                result = number1 * number2;
                break;
            case "division":
                if (number1 != 0 && number2 == 0) {
                    System.out.println("Can not division because number2 = 0");
                    result = -1;
                } else {
                    result = number1 / number2;
                }
                break;
            default:
                break;
        }

        if (result >= 0) {
            System.out.println("Result of " + operator + " is " + result);
        }
    }
    public static void main(String[] args) {
        Problem1 p1 = new Problem1();
        // Test Problem1
        p1.calculator(5, 7, "plus");
        p1.calculator(5, 7, "minus");
        p1.calculator(5, 7, "multiplication");
        p1.calculator(5, 7, "division");
        p1.calculator(5, 0, "division");

    }
}
