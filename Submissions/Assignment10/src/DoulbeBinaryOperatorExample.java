import java.util.function.DoubleBinaryOperator;

// return average of two percentile values
public class DoulbeBinaryOperatorExample {
    public static void main(String[] args) {
        DoubleBinaryOperator operator =
                (value1, value2) -> {
                    double averagePercent = (value1 + value2) / 2;
                    return averagePercent;
                };
        System.out.println(operator.applyAsDouble(5, 2));
    }
}
