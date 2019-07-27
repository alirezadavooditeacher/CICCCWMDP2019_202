package src.problem1;

import java.util.function.ObjDoubleConsumer;

public class ObjDoubleConsumerExample {

    public static void main(String[] args) {
        ObjDoubleConsumer<String> i  = (s, d)->System.out.println(s+d);

        i.accept("java2s.com ",0.1234);
    }

}
