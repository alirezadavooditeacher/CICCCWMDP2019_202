package Problem1;

import java.util.function.ToIntFunction;
// return total number of characters in an array of strings
public class ToIntFunctionExample {

    public static void main(String[] args){
        ToIntFunction<String[]> countCharacters =
                list -> {
                    int chars = 0;
                    for(int i = 0; i < list.length; i++){
                        chars += list[i].length();
                    }
                    return chars;
                };
        String[] words = {"Anna", "Hi", "Gey"};
        System.out.println(countCharacters.applyAsInt(words));
    }
}
