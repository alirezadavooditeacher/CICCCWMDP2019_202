public class Problem9 {
    public static void findDiv(int A, int B, int divNum){
        if(divNum == 1){
            System.out.print("Divisible by both 3 and 5: ");
            Problem9.div1(A + 1, B);
            System.out.println();
        } else if(divNum == 2){
            System.out.print("Divisible by 7 or 6: ");
            Problem9.div2(A, B);
            System.out.println();
        } else if(divNum == 3){
            System.out.print("Not divisible by 3: ");
            Problem9.div3(A, B);
            System.out.println();
        } else {
            System.out.println("Invalid Input");
        }
    }

    private static void div1(int count, int limit){
        while(count < limit){
            if(count % 3 == 0 && count % 5 == 0){
                System.out.print(count + " ");
            }
            count ++;
        }
    }

    private static void div2(int count, int limit){
        while(count < limit){
            if(count % 6 == 0 || count % 7 == 0){
                System.out.print(count + " ");
            }
            count ++;
        }
    }

    private static void div3(int count, int limit){
        while(count < limit){
            if(!(count % 3 == 0)){
                System.out.print(count + " ");
            }
            count ++;
        }
    }
}
