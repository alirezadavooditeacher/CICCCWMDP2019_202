package Activity01;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationDriver {

    public static void main(String[] args) {
//        testProblem01();
//        testProblem02();
//        testProblem03();
//        testProblem04();
//        testProblem05();
//        testProblem06();
//        testProblem07();
//        testProblem08();
//        testProblem09();
//        testProblem10();
        testProblem11();
//        testProblem01();
//        testProblem01();
//        testProblem01();
//        testProblem01();
//        testProblem01();
    }

    private static void testProblem01() {
        // case + should print 3
        int result = Problem01.calculator(1, 2, "+");
        System.out.println(result);

        // case - should print -1
        result = Problem01.calculator(1, 2, "-");
        System.out.println(result);

        // case / should print 5
        result = Problem01.calculator(10, 2, "/");
        System.out.println(result);

        // case * should print 12
        result = Problem01.calculator(6, 2, "*");
        System.out.println(result);

        // case * should print error messages
        try{
            result = Problem01.calculator(6, 0, "/");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // case * should print error messages
        try{
            result = Problem01.calculator(6, 2, "%");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void testProblem02() {
        // case SHAPE1 odd number
        System.out.println("SHAPE1, 5");
        Problem02.drawer(5, "SHAPE1");

        // case SHAPE1 even number
        System.out.println("SHAPE1, 6");
        Problem02.drawer(6, "SHAPE1");
        System.out.println("");

        // case SHAPE2 odd number
        System.out.println("SHAPE2, 5");
        Problem02.drawer(5, "SHAPE2");

        // case SHAPE2 even number
        System.out.println("SHAPE2, 6");
        Problem02.drawer(6, "SHAPE2");
        System.out.println("");

        // case SHAPE3 odd number
        System.out.println("SHAPE3, 5");
        Problem02.drawer(5, "SHAPE3");
        System.out.println("");

        // case SHAPE3 odd number
        System.out.println("SHAPE3, 6");
        Problem02.drawer(6, "SHAPE3");
        System.out.println("");

        // case other shape
        try {
            Problem02.drawer(5, "SHAPE4");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void testProblem03() {
        System.out.println("1 is prime number?");
        System.out.println(Problem03.isPrime(1));
        System.out.println("2 is prime number?");
        System.out.println(Problem03.isPrime(2));
        System.out.println("3 is prime number?");
        System.out.println(Problem03.isPrime(3));
        System.out.println("9 is prime number?");
        System.out.println(Problem03.isPrime(9));
        System.out.println("13 is prime number?");
        System.out.println(Problem03.isPrime(13));
    }

    private static void testProblem04() {
        ArrayList<Double> numbers = Problem04.stdevCalculator();
        System.out.println("total is");
        System.out.println(numbers.get(0));
        System.out.println("average is");
        System.out.println(numbers.get(1));
        System.out.println("stdev is");
        System.out.println(numbers.get(2));
    }

    private static void testProblem05() {
        System.out.println("input number: ");
        Scanner reader = new Scanner(System.in);
        String numStr = reader.nextLine();
        Problem05.printSumNumbersDigits(numStr);
    }

    private static void testProblem06() {
        System.out.println("input number: ");
        Scanner reader = new Scanner(System.in);
        String numStr = reader.nextLine();
        Problem06.getNextPrimeNumber(Integer.parseInt(numStr));
    }

    private static void testProblem07() {
        Problem07.divide(4, 2);
        Problem07.divide(1, 5);
        Problem07.divide(6, 5);
    }

    private static void testProblem08() {
        Problem08.printReverseNumber();
    }

    private static void testProblem09() {
        Problem09.printNumbers(1, 10);
        Problem09.printNumbers(10, 20);
    }

    private static void testProblem10() {
        Problem10.convertToBase2(15);
        Problem10.convertToBase2(256);
    }

    private static void testProblem11() {
        Problem11.printDistanceBetweenTwoNumbers();
    }
}
