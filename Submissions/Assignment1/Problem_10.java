package problems;

import java.util.Scanner;

public class Problem_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input:");
        int input = scanner.nextInt();

        System.out.println("the binary is:" + convertToBinary(input));


    }

    public static String convertToBinary(int number) {

        int dev = number;
        String binaryString="";
        if(number==0) {
            binaryString = "0";
        } else {
            while(dev>0)
            {
                int rem = dev % 2;
                dev = dev / 2;
                binaryString = String.valueOf(rem) + binaryString;
            }
        }

        return binaryString;
    }
}
