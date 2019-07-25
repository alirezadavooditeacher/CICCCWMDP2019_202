// print a string with space padding to the left

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args){
        Consumer<String> padder =
                (sentence) -> {
                    String paddedSentence = "   " + sentence;
                    System.out.println(paddedSentence);
                };
        padder.accept("Hello World");
    }
}
