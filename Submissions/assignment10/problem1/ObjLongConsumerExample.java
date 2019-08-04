package assignment10.problem1;

import java.util.Arrays;
import java.util.List;
import java.util.function.ObjLongConsumer;

public class ObjLongConsumerExample {

    public static void main(String[] args){
        List<Integer> numList = Arrays.asList(1,2,3,4,5);
        ObjLongConsumer<List<Integer>> oic = (list, num) -> {
            list.stream().forEach(x -> System.out.println(x * num));
        };
        oic.accept(numList, 1000000000);

    }

}
