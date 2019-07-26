package Problem1;

import java.time.LocalDateTime;
import java.util.function.Supplier;

// return the current date
public class SupplierExample {
    public static void main(String[] args){
        Supplier<LocalDateTime> supplier =
                () -> LocalDateTime.now();
        System.out.println(supplier.get());
    }
}
