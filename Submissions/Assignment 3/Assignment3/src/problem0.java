public class problem0 {
    public static int makeOperation(int num1, int num2, char operator){
        if(operator == '+'){
            return num1 + num2;
        } else if(operator == '-'){
            return num1 - num2;
        } else if(operator == '/'){
            return num1 / num2;
        } else if(operator == '*'){
            return num1 * num2;
        }
        return 0;
    }

    public static boolean isValid(char operator, int num2){
        if (operator == '/' && num2 == 0){
            return false;
        } else {
            return true;
        }
    }
}
