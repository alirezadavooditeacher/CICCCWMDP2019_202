package problems;

import java.util.Scanner;

public class Problem_8 {

    public static void main(String[] args) {

        String word = readFromInput();
        int reverseNumber = reverseIt(word);
        System.out.println("the reverse is: " + reverseNumber);
    }


    public static String readFromInput() {

        System.out.println("Please enter a number: ");
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();

        boolean isValid = Problem_8.isInputValid(word);

        if(!isValid) {
            while(!isValid) {
                System.out.println("Please enter another number: ");
                word = reader.nextLine();
                isValid = Problem_8.isInputValid(word);
            }
        }


        return word;
    }

    public static boolean isInputValid(String word) {

        int number = Integer.parseInt(word);

        if (number%10==0) {
            return false;
        } else {
            return true;
        }
    }

    public static int reverseIt(String number) {

        int len = number.length();
        int dev = Integer.parseInt(number);
        int rem = 0;
        int sum = 0;

        while(dev>0) {

            rem = dev % 10;
            dev = dev / 10;
            sum = sum + rem * (int)(Math.pow(10,len-1));
            len = len -1;
        }

        return sum;
    }

}



