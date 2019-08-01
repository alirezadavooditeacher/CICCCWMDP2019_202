import Problem1.CastleChecker;

public class Main {

    public static void main(String[] args){
        int[] arr = {1,1,3,5,2,3,5};
        System.out.println("Number of castle spots found: " + CastleChecker.checkAvailability(arr));
    }
}
