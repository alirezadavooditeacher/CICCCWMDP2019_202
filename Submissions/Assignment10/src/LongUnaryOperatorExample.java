import java.util.function.LongUnaryOperator;

// Replace all 0's in a long with 1
public class LongUnaryOperatorExample {
    public static void main(String[] args){
        LongUnaryOperator operator =
                num -> {
                    String temp = Long.toString(num);
                    StringBuilder stringBuilder = new StringBuilder(temp);
                    for (int i = 0; i < temp.length(); i ++){
                        if(temp.charAt(i) == '0'){
                            stringBuilder.setCharAt(i, '1');
                        }
                    }
                    return Long.parseLong(stringBuilder.toString());
                };
        System.out.println(operator.applyAsLong(1000324552032L));
    }
}
