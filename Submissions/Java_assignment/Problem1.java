package problem1;

/**
 * @author miyamotoatsushi
 * implement problem1
 */
public class Problem1 {

    /**
     * @param args
     */
    public static String ComputeNumber(int firstNumber, int secondNumber, String operator) {

        if (firstNumber > 0 && secondNumber == 0) {
            return ("peration is not possible because one number if zero");
        } else if (operator == "+") {
            return Integer.toString(firstNumber + secondNumber);
        } else if (operator == "-") {
            return Integer.toString(firstNumber - secondNumber);
        } else if (operator == "%") {
            return Integer.toString(firstNumber % secondNumber);
        } else {
            return Integer.toString(firstNumber / secondNumber);
        }

    }

}



