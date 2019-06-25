import java.util.Scanner;

public class Problem4 {
    public static int[] sumAndAvg(){
        int num = 1;
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;
        do {
            System.out.println("Enter a number ");
            num = scanner.nextInt();
            total += num;
            count++;
        } while(num != 0);
        int average = total / (count - 1);
        int[] results = {total, average};
        return results;
    }
}
