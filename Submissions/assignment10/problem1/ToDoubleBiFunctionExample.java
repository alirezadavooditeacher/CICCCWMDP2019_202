package assignment10.problem1;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionExample {

    public static void main(String[] args){

        ToDoubleBiFunction<Integer,String> i = (x, y) -> (x + Integer.parseInt(y)) * 100;
        System.out.println(i.applyAsDouble(5, "215"));
    }

}
