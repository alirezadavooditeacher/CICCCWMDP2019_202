public class Problem3 {
    public static boolean isPrime(int num){
        int i = 2;
        while(i <= (num - 1)){
            if((num % i) != 0){
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
}
