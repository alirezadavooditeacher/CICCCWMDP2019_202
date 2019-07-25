package Problem1;

import java.util.function.DoubleSupplier;

public class DoubleSupplierExample {

    public static void main(String[] args){
        DoubleSupplier averageGPA =
                () -> 3.1;
        System.out.println(averageGPA.getAsDouble());
    }
}
