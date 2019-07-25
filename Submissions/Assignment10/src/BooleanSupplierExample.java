import java.util.function.BooleanSupplier;
// check if 5 is bigger than 10
public class BooleanSupplierExample {
    public static void main(String[] args){
        BooleanSupplier supply =
                () -> 5 > 10;
        System.out.println(supply.getAsBoolean());
    }
}
