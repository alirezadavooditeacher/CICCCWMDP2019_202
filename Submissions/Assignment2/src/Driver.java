import java.util.ArrayList;
import problem0.*;
import problem1.*;
import problem2.*;
import problem3.*;

public class Driver {
    public static void main(String[] args) {
        problem0();
        problem1();
        problem2();
        problem3();
    }

    private static void problem3() {
        System.out.println( "\n-------- problem 3 --------" );
        Problem3.runProblem3();
    }

    private static void problem2() {
        System.out.println( "\n-------- problem 2 --------" );
        Problem2.problem2();
    }

    private static void problem1() {
        System.out.println( "\n-------- problem 1 --------" );
        Problem1.runProblem1();
    }

    public static void problem0(){
        System.out.println( "-------- problem 0 --------" );
        Problem0.runProblem0();
    }
}
