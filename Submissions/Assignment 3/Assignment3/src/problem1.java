public class problem1 {
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
}
