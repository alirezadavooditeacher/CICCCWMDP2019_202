package problem5;

import java.util.Scanner;

public class Problem5 {

    public static void calculateSumOfString(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String number = s.nextLine();
        int sum = 0;
        for (char c : number.toCharArray()){
            sum += c - '0';
        }
        System.out.println("The sum of input digits is: " + sum);
    }
}
