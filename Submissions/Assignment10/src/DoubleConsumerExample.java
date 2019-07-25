import java.util.function.DoubleConsumer;

// prints out GPA in a appealing format
public class DoubleConsumerExample {
    public static void main(String[] args){
        DoubleConsumer consumer =
                (value) -> {
                    System.out.println("The GPA of the student is: " + value);
                };
        consumer.accept(3.14);
    }

}
