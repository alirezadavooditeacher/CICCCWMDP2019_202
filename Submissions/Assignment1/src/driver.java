import problem1.*;
import problem10.*;
import problem11.*;
import problem12.*;
import problem13.*;
import problem14.*;
import problem15.*;
import problem2.*;
import problem3.*;
import problem4.*;
import problem5.*;
import problem6.*;
import problem7.*;
import problem8.*;
import problem9.*;

public class driver {
    public static void main(String[] args) {
//        problem1();
//        problem2();
//        problem3();
//        problem4();
//        problem5();
//        problem6();
//        problem7();
//        problem8();
//        problem9();
//        problem10();
        problem11();
//        problem12();
//        problem13();
//        problem14();
//        problem15();
    }

    public static void problem1(){
        System.out.println( "-------- problem 1 --------" );
        Problem1.inputOperatorAndCalculator();
    }

    public static void problem2(){
        System.out.println( "\n\n-------- problem 2 --------" );
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

    private static void problem8() {
        System.out.println( "\n-------- problem 8 --------" );
        Problem8.reverseOfNumber();
    }

    private static void problem9() {
        System.out.println( "\n-------- problem 9 --------" );
        Problem9.runProblem9();
    }

    private static void problem10() {
        System.out.println( "\n-------- problem 10 --------" );
        Problem10.runProblem10(13);
        Problem10.runProblem10(16);
    }

    private static void problem11() {
        System.out.println( "\n-------- problem 11 --------" );
        Problem11.runProblem11();
    }

    private static void problem12() {
        System.out.println( "\n-------- problem 12 --------" );
        Problem12.runProblem12( 2,5 );
    }

    private static void problem13() {
        System.out.println( "\n-------- problem 13 --------" );
        Problem13.printTable();
    }

    private static void problem14() {
        System.out.println( "\n-------- problem 14 --------" );
        Problem14.reverseWord();
    }

    private static void problem15() {
        System.out.println( "\n-------- problem 15 --------" );
        Problem15.runProblem15();
    }
}