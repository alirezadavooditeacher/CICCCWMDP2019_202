import java.util.Scanner;

public class Problem6 {
    public static int nextPrime(){
        System.out.println("Enter a number ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean foundPrime = false;
        int count = num;
        while(!foundPrime){
            count ++;
            foundPrime = Problem3.isPrime(count);
        }
        return count;
    }
}
