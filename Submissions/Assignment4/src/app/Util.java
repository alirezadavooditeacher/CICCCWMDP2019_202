package app;

import app.entity.StudentProfile;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {
    /**
     * Ask the user to input a Integer
     */
    public static int askInteger(String message) {
        System.out.format("%s: \n", message);

        try {
            Scanner in = new Scanner(System.in);
            return in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("This is not a number :(");
            return askInteger(message);
        }
    }

    public static int askRange(String message, int min, int max, String errorMessage) {
        int input = askInteger(message);
        if (input < min || input > max) {
            System.out.println(errorMessage);
            return askRange(message, min, max, errorMessage);
        }
        return input;
    }

    /**
     * Ask the user to input a String
     */
    public static String askString(String message) {
        System.out.format("%s: \n", message);
        try {
            Scanner in = new Scanner(System.in);
            return in.next();
        } catch (InputMismatchException e) {
            System.out.println("This is not a number :(");
            return askString(message);
        }
    }

    public static String askToChose(String message, String[] options) {
        String input = askString(message);
        for (String option : options) {
            if (option.equals(input)) {
                return input;
            }
        }
        return askToChose(message, options);
    }

    /**
     * Repeat `original` `count` times
     */
    public static String repeatString(String original, int count) {
        StringBuffer repeated = new StringBuffer();
        for (int i = 0; i < count; i++) {
            repeated.append(original);
        }
        return repeated.toString();
    }

    public static void printHeading(String message) {
        String star = repeatString("*", 60);
        System.out.println(star);
        System.out.println(message);
        System.out.println(star);
    }

    public static void greet(StudentProfile profile) {
        System.out.format("Hi %s,\n", profile.getFullName());
    }
}
