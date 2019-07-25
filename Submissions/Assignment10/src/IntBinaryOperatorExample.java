import java.util.function.IntBinaryOperator;

// return the bigger integer
public class IntBinaryOperatorExample {
    public static void main(String[] args){
        IntBinaryOperator operator =
                (num1, num2) -> {
                    if (num1 > num2){
                        return num1;
                    } else {
                        return num2;
                    }
                };
        System.out.println(operator.applyAsInt(5, 10));
    }
}
