public class Problem2 {
    public static void shape1(int num){
        for(int i = num; i > 0; i -= 2) {
            int spaceNum = (num - i) / 2;
            for(int x = 0 ; x < spaceNum; x++){
                System.out.print(" ");
            }
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void shape2(int num) {
        for(int i = num; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void shape3(int num) {
        for(int i = 1; i <= num; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}