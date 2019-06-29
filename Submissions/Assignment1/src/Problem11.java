import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem11 {
    // Problem11
    /**
     * Find min max input
     */
    public void findMinMaxInput() {
        List<Integer> arr = new ArrayList<Integer>();
        int n;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter numbers (positive or negative) : ");
            try {
                n = in.nextInt();
            } catch (Exception e) {
                break;
            }

            arr.add(n);
        }

        // Find Max
        int maxNumber = Collections.max(arr);
        // Find Min
        int minNumber = Collections.min(arr);

        System.out.println("Max is : " + maxNumber);
        System.out.println("Min is : " + minNumber);
        System.out.println("Distance between the Max and Min is : " + Math.abs(maxNumber - minNumber));
    }

    public static void main(String[] args) {
        Problem11 p11 = new Problem11();

        // Test Problem11
        p11.findMinMaxInput();
    }
}
