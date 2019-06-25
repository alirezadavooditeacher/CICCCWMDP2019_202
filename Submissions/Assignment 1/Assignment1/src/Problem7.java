public class Problem7 {
    public static int findQuotient(int dividend, int divisor){
        int quotient = 0;
        int temp = divisor;
        while(temp <= dividend){
            quotient ++;
            temp += divisor;
        }
        return  quotient;
    }
}
