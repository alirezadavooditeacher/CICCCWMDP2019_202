package problems;

import java.util.Scanner;

public class Problem_11 {
    public static void main(String[] args) {
        run();
    }


    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;

    private static boolean isValid(String input) {

        for (int i = 0; i < input.length(); i++) {
            if (!(input.charAt(i) == '0' ||
                    input.charAt(i) == '1' ||
                    input.charAt(i) == '2' ||
                    input.charAt(i) == '3' ||
                    input.charAt(i) == '4' ||
                    input.charAt(i) == '5' ||
                    input.charAt(i) == '6' ||
                    input.charAt(i) == '7' ||
                    input.charAt(i) == '8' ||
                    input.charAt(i) == '9' ||
                    input.charAt(i) == '-')) {
                return false;
            }
        }
        return true;
    }

    private static String readInput() {
        System.out.println("Enter an input: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //scanner.close();

        return input;
    }

    public static void run() {

        String input = Problem_11.readInput();
        int counter = 0;
        while (Problem_11.isValid(input)) {

            int number = Integer.parseInt(input);
            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }


            counter++;

            input = Problem_11.readInput();
        }

        if (counter == 0) {
            System.out.println("No Min and No Max");
        } else {
            System.out.println("Max is: " + max);
            System.out.println("Min is: " + min);
            System.out.println("The distance is: " + Math.abs(max - min));
        }

    }

}



