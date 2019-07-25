import java.util.function.BiFunction;

// Return the result of a division of two numbers
public class BiFunctionExample {
    public static void main(String[] args){
        BiFunction<Integer, Integer, Float> addition =
                (num1, num2) -> {

                    float result = num1.floatValue() / num2.floatValue();
                    return result;

                };
        System.out.println(addition.apply(10, 3));
    }
}
