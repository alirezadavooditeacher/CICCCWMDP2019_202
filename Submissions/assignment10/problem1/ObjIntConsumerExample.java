package assignment10.problem1;

import java.util.Arrays;
import java.util.List;
import java.util.function.ObjIntConsumer;

public class ObjIntConsumerExample {

    public static void main(String[] args){
        List<Integer> numList = Arrays.asList(1,2,3,4,5);
        ObjIntConsumer<List<Integer>> oic = (list, num) -> {
            list.stream().forEach(x -> System.out.println(x * num));
        };
        oic.accept(numList, 2);

    }

}
