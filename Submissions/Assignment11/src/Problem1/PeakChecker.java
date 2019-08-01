package Problem1;

public class PeakChecker implements LandChecker {

    public boolean check(int[] arr){
        if(arr.length == 3){
            return this.checkMiddle(arr);
        } else {
            return this.checkStart(arr);
        }
    }

    public boolean checkMiddle(int[] arr){
        if(arr[1] > arr[0] && arr[1] > arr[2]){
            System.out.println("Peak found");
            return true;
        } else {
            return false;
        }
    }

    public boolean checkStart(int[] arr){
        if(arr[0] > arr[1]){
            System.out.println("Start peak found");
            return true;
        } else {
            return false;
        }
    }
}
