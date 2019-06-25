package problem7;
import java.util.Scanner;

public class Problem7 {
    public static void divide(int A, int B){
        if(A<0){
            A = A *-1;
        }
        if(B <0){
            B = B * -1;
        }
        int qoutient = 0;
        while(A>=B){
            A = A - B;
            qoutient++;
        }
        System.out.println("The quotient is: " + qoutient);
    }
}
