package Activity01;

public class Problem07 {

    public static int divide(int numA, int numB) {
        int count = 0;
        while (numA - numB >= 0) {
            numA = numA - numB;
            count += 1;
        }
        System.out.println(count);
        return count;
    }

}
