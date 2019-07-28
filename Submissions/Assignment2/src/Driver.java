import java.util.ArrayList;
import problem0.*;
import problem1.*;
import problem2.*;
import problem3.*;
import problem4.*;
import problem5.*;
import problem6.*;
import problem7.*;
import problem8.*;

public class Driver {
    public static void main(String[] args) {
        problem0();
        problem1();
        problem2();
        problem3();
        problem4();
        problem5();
        problem6();
        problem7();
        problem8();
    }

    private static void problem8() {
        System.out.println( "\n-------- problem 7 --------" );
        Integer[] listOfNumbers = {1, 10, 15, -4, 109, 52, 43, 10, 10};
        Problem8.runProblem8( listOfNumbers, 10 );
    }

    private static void problem7() {
        System.out.println( "\n-------- problem 7 --------" );
        Integer[] listOfNumbers = {1, 10, 15, -4, 109, 52, 43, 10, 10};
        Integer[] numbersToSearch = {10, 109, 43, 12};
        Problem7.runProblem7(listOfNumbers, numbersToSearch );
    }

    private static void problem6() {
        System.out.println( "\n-------- problem 6 --------" );
        Problem6.runProblem6();
    }

    private static void problem5() {
        System.out.println( "\n-------- problem 5 --------" );
        Problem5.runProblem5();
    }

    private static void problem4() {
        System.out.println( "\n-------- problem 4 --------" );

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
