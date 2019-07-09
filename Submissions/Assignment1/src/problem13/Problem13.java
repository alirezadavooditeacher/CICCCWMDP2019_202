package problem13;

import java.util.Scanner;

public class Problem13 {
    private static int inputNumber(){
        Scanner scannerThirteen = new Scanner( System.in );
        System.out.print( "Please enter a number: " );
        int inputNumber = scannerThirteen.nextInt();

        while (inputNumber <= 0){
            System.out.print( "The input is not valid, please try again.\nPlease enter a number:" );
            inputNumber = scannerThirteen.nextInt();
        }
        return inputNumber;
    }

    public static void printTable() {
        int NMAX = inputNumber();
        int XMAX = NMAX;
        int n = 1;
        int x = 1;

        System.out.print("x");
        while(n <= NMAX){
            System.out.print( "\t" + n);
            n ++;
        }

        while(x <= XMAX){
            System.out.println();
            System.out.print(x);
            n = 1;
            while(n <= NMAX){
                System.out.print( "\t" + (x * n));
                n++;
            }
            x++;
        }
    }
}
