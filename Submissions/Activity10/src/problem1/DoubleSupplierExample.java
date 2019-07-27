package src.problem1;

import java.util.function.DoubleSupplier;

public class DoubleSupplierExample {

    public static void main(String[] args) {
        DoubleSupplier pi = () -> 3.14d;

        System.out.println(pi.getAsDouble());
    }

}
