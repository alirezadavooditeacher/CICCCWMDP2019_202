package Problem1;

public class PeakChecker extends LandChecker {

    public boolean check(int[] arr){
        if(arr[1] > arr[0] && arr[1] > arr[2]){
            return true;
        } else {
            return false;
        }
    }
}
