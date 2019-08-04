package assignment10.problem1;


// Return a double random number with DoubleSupplier

import java.util.function.DoubleSupplier;

public class DoubleSupplierExample {

    public static void main(String[] args){

        DoubleSupplier ds = () -> Math.random();

        System.out.println(ds.getAsDouble());

    }

}
