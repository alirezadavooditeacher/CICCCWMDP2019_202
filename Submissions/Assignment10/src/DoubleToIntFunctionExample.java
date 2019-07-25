import java.util.function.DoubleToIntFunction;

// round up a double and return as an int
public class DoubleToIntFunctionExample {
    public static void main(String[] args){
        DoubleToIntFunction roundUp =
                num -> (int)Math.ceil(num);
        System.out.println(roundUp.applyAsInt(4.3));
    }
}
