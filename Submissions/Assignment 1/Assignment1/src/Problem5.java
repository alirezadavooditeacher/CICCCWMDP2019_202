public class Problem5 {
    public static int sumDigits(int x){
        int num = x;
        int sum = 0;

        while(num != 0){
            int digit = num % 10;
            num = num / 10;
            sum += digit;
        }
        return sum;
    }
}
