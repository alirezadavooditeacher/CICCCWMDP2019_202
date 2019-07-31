package src.problem1;

import java.util.function.ObjLongConsumer;

public class ObjLongConsumerExample {

    public static void main(String[] args) {
        ObjLongConsumer<String> i  = (s, d)->System.out.println(s+d);

        i.accept("java2s.com ",Long.MAX_VALUE);
    }

}
