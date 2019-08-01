package Problem1;

public class ValleyChecker implements  LandChecker{

    public boolean check(int[] arr){
        if(arr[1] < arr[0] && arr[1] < arr[2]){
            System.out.println("Valley found");
            return true;
        } else {
            return false;
        }
    }

    public boolean checkStart(int[] arr){
        if(arr[0] < arr[1]){
            System.out.println("Start valley found");
            return true;
        } else {
            return false;
        }
    }
}
