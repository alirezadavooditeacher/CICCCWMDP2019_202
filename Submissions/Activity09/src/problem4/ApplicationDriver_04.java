package src.problem4;

public class ApplicationDriver_04 {
    public static void main(String[] args) {
        class Solution {
            int[] solution(int[] A, int K) {
                int[] newInts = new int[A.length];
                for (int i = 0; i < A.length; i++) {
                    if (i + K >= A.length) {
                        newInts[Math.abs(A.length - i - K)] = A[i];
                    } else {
                        newInts[i + K] = A[i];
                    }
                }

                return newInts;
            }
        }

        int[] aa = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int K = 2;
        int[] result = (new Solution()).solution(aa, K);
        for (int a: result) {
            System.out.println(a);
        }

        System.out.println();

        K = 5;
        result = (new Solution()).solution(aa, K);
        for (int a: result) {
            System.out.println(a);
        }

        System.out.println();

        K = 9;
        result = (new Solution()).solution(aa, K);
        for (int a: result) {
            System.out.println(a);
        }

    }
}
