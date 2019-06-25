import java.util.Scanner;

public class Problem8 {

    public static int reverse(){
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Please enter a positive integer not divisible by 10");
            num = scanner.nextInt();
        } while(num < 0 || (num % 10 == 0));
        int result = Problem8.reverseNum(num);
        return  result;
    }

    private static int reverseNum(int num){
        int reverse = 0;
        while(!(num < 1)){
            int lastDigit = num % 10;
            num = num / 10;
            reverse += lastDigit;
            if(num > 1){
                reverse *= 10;
            }
        }
        return reverse;
    }
}
