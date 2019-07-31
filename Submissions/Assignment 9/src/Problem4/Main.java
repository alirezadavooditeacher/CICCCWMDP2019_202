package Problem4;

public class Main {

    public static void main(String[] args){
        int [] arr= {5,6,2,3};
        int [] newArr = Solution.solution(arr, 2);
        for (int i = 0; i < newArr.length; i ++){
            System.out.print(newArr[i] + ",");
        }
    }
    static class Solution{
        public static int[] solution(int[] A, int K){
            int[] newArray = new int[A.length];
            for (int i = 0; i < K; i++){
                for (int j = A.length - 1; j > 0 ; j--){
                    if(j == A.length - 1){
                        newArray[0] = A[j];
                    }
                    newArray[j] = A[j - 1];
                }
                System.arraycopy(newArray, 0, A, 0, newArray.length);
            }
            return newArray;
        }
    }
}
