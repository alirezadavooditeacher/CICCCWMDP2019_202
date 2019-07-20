package problem6;

public class Problem6 {
    public static int findPrimeNumber(int num) {
        while(true){
            boolean isprime = true;
            num ++;
            int sqt = (int)Math.sqrt(num);
            for(int i=2; i<=sqt; i++){
                if(num%i==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime)
                return num;
        }
    }
}

