package src.problem2;

public class ApplicationDriver_x {
    public static void main(String[] args) {
        IntToStringInterface intToStringInterface = (x) -> Integer.toString(x);

        System.out.println(intToStringInterface.intToString(2) + intToStringInterface.intToString(3));
    }
}
