package src.problem1;

import java.util.function.ObjIntConsumer;

public class ObjIntConsumerExample {

    public static void main(String[] args) {
        ObjIntConsumer<String> i  = (s, d)->System.out.println(s+d);

        i.accept("java2s.com ",234);
    }

}
