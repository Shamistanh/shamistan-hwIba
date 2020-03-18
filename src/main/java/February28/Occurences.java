package February28;

import java.util.*;
import java.util.function.BiConsumer;

public class Occurences {
    public static void main(String[] args) {
        String origin = "Hello World";
        HashMap<Character, Integer> map = new HashMap<>();

        //List<Character> chr = new ArrayList<>();
        char [] chr =new char[50];
        origin.chars().mapToObj(n -> (char)n)

                .forEach(c -> {

                    if (!map.containsKey(c)) {
                        map.put(c, 1);
                    } else {
                        int count = map.get(c);
                        map.put(c, count + 1);
                    }
                }

               );


        map.forEach(new BiConsumer<Character, Integer>() {

            @Override
            public void accept(Character c, Integer n) {


                System.out.printf("Letter: '%c', count:%d\n", c, n);


            }
        });
    }
}
