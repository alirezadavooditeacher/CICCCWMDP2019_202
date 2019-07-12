package main;

import java.util.Scanner;

import problem1.Problem1;
import problem2.Problem2;
import problem3.Problem3;
import problem4.Problem4;
import problem5.Problem5;
import problem6.Problem6;
import problem7.Problem7;

public class Main {

    public static void main(String[] arg) {

//        problem1();
//        problem2();
//        problem3();
        problem4();
//        problem5();
//        problem6();
//        problem7();
    }

    public static void problem7(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        String num1 = s.nextLine();

        System.out.println("Enter the second number");
        String num2 = s.nextLine();

        int A = Integer.parseInt(num1);
        int B = Integer.parseInt(num2);
        Problem7.divide(A,B);
    }
    public static void problem6(){
        Scanner s = new Scanner(System.in);
        int number;
        System.out.println("Enter a number: ");
        number = s.nextInt();


        int result = Problem6.findPrimeNumber(number);
        System.out.println("The next prime number is;" +result );
    }

    public static void problem5(){
        Problem5.calculateSumOfString();
    }

    public static void problem4(){
        Problem4.calculateSum();

    }

    private static void problem3() {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = s.nextInt();
        boolean isPrime = Problem3.findPrimeNumber(num);
        System.out.println(isPrime);
    }

    private static void problem2(){
        Scanner s = new Scanner(System.in);
        int num;
        int shape;
        System.out.println("Enter a number: ");
        num = s.nextInt();

        System.out.println("Choose a shape between 1,2,3: ");
        shape = s.nextInt();

        Problem2.printStars(num, shape);
    }
    public static void problem1() {
        //reads from input
        Scanner s = new Scanner(System.in);
        int A,B;
        char op;
        System.out.println("Enter the first number:");
        A = s.nextInt();

        System.out.println("Enter the second number:");
        B = s.nextInt();

        System.out.println("Enter operator(+,-,/,*):");
        op = s.next().charAt(0);

        if(Problem1.isValid(B, op)){
            int result = Problem1.printSumOfTwoNumbers(A, B, op);
            System.out.println("----------------");
            System.out.println("The result is " +result);
        }

    }

}