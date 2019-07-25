import java.util.function.LongSupplier;

// Give the distance between the earth and Orion Arm
public class LongSupplierExample {
    public static int lightYearKM = 150000000;
    public static int distance = 10000;

    public static void main(String[] args){
        LongSupplier supplier =
                () -> (long)(distance * lightYearKM);
        System.out.println(supplier.getAsLong());
    }
}
