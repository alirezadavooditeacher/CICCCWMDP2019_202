package problem2;

import java.sql.SQLOutput;

public class Problem2 {

    public static void printStars(int num, int shape ) {
        if(shape == 1) {
            writeShape1(num);
        }else if (shape == 2) {
            writeShape2(num);
        }else if (shape == 3) {
            writeShape3(num);
        }

    }
    private static void writeShape1(int num) {
        for(int i = 0; i <= num ; i++) {

            for (int j = num - 1; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void writeShape2(int num) {
        for(int i = 0; i <= num; i++) {
            for(int j = num - i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void writeShape3(int num) {
        for(int i = 0; i<=num; i++) {
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}