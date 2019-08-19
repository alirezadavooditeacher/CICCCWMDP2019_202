package assignment10.problem2;

public class Main{

    public static void main(String[] args){

        FunctionalInterfaceExample fi1 = (num1, num2) -> System.out.println(num1 * num2);
        fi1.multiply(214, 14);

    }
}
