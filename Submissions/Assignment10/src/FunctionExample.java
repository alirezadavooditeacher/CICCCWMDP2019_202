import java.util.function.Function;

// return an error message
public class FunctionExample {
    public static void main(String[] args){
        Function<Integer, String> error =
                errorCode -> "Error number: " + errorCode;
        System.out.println(error.apply(404));
    }
}
