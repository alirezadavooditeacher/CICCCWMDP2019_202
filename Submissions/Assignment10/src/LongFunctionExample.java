import java.util.function.LongFunction;

// returns an integer version of a long value if the long value is small enough
public class LongFunctionExample {
    public static int INTMAX = 2147483647;

    public static void main(String[] args){
        LongFunction<Integer> check =
                num -> {
                    if(num >= INTMAX * (-1) && num <= INTMAX){
                        return (int)num;
                    } else {
                        return null;
                    }
                };
        long number1 = 21474836L;
        System.out.println(check.apply(number1) != null);
        long number2 = 243098210938L;
        System.out.println(check.apply(number2) != null);
    }
}
