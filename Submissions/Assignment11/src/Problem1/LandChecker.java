package Problem1;

import java.util.ArrayList;

public abstract class LandChecker {

    public abstract boolean check(int[] arr);

    public static int[] removeDuplicates(int[] arr){
        ArrayList<Integer> newArr = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i + 1] != arr[i]) {
                newArr.add(arr[i]);
            } else if (i == arr.length - 1 ){
                newArr.add(arr[i]);
            }
        }
        System.out.println(newArr);
        int[] convertedArr = LandChecker.convertIntegers(newArr);
        return convertedArr;
    }

    public static int[] convertIntegers(ArrayList<Integer> arr){
        int[] newArr = new int[arr.size()];
        for(int i = 0; i < newArr.length; i ++){
            newArr[i] = arr.get(i);
        }
        return newArr;
    }
}
