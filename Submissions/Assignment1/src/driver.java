import problem1.*;
import problem2.*;
import problem3.*;
import problem4.*;
import problem5.*;
import problem6.*;
import problem7.*;

public class driver {
    public static void main(String[] args) {
//        problem1();
        problem2();
        problem3();
        problem4();
        problem5();
        problem6();
        problem7();
    }

//    public static void problem1() throws Problem1.InputException {
//        Problem1.inputOperatorAndCalculator();
//    }

    public static void problem2(){
        System.out.println( "\n-------- problem 2 --------" );
        Problem2.printStars();
    }

    private static void problem3() {
        System.out.println( "\n-------- problem 3 --------" );
        Problem3.checkPrime();
    }

    private static void problem4() {
        System.out.println( "\n-------- problem 4 --------" );
        Problem4.sum();
    }

    private static void problem5() {
        System.out.println( "\n-------- problem 5 --------" );
        Problem5.sumOfDigits();
    }

    private static void problem6() {
        System.out.println( "\n-------- problem 6 --------" );
        Problem6.checkNextPrime();
    }

    private static void problem7() {
        System.out.println( "\n-------- problem 7 --------" );
        Problem7.calculateQuotient();
    }
}