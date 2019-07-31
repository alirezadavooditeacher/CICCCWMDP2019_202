package Problem1;

import java.util.function.BinaryOperator;

// return average of two percentile values
public class BinaryOperatorExample {

    public static void main(String[] args) {
        BinaryOperator<Double> average =
                (value1, value2) -> {
                    double averagePercent = (value1 + value2) / 2;
                    return averagePercent;
                };
        System.out.println(average.apply(44.5, 56.2));
    }

}
