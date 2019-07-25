import java.util.function.IntToLongFunction;

public class IntToLongFunctionExample {
    public static void main(String[] args){
        IntToLongFunction function =
                num -> {
                    long result = (long)Math.pow(num, 20);
                    return result;
                };
        System.out.println(function.applyAsLong(20));
    }
}
