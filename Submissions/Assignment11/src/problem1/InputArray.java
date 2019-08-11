package problem1;

import java.util.Arrays;

public class InputArray {
    int[] problem1;

    InputArray(int[] problem1){
        this.problem1 = problem1;
    }

    public void castles(){
        int count = 1;

        if (problem1.length < 1){
            System.out.println("The array can not be empty.");
        }else if (problem1.length >= 1) {
            for (int i = 1; i < (problem1.length - 1); i++) {
                if ((problem1[i] == problem1[i - 1]) && (problem1[i] == problem1[i + 1])) {
                    count = count + 1;
                } else if ((problem1[i] < problem1[i - 1] && (problem1[i] < problem1[i + 1]))) {
                    count = count + 1;
                }
            }
            System.out.println("Cornerstone has to build " + count + " castles.");
        }
    }
}
