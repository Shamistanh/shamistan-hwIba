package March2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class WarmUp2  {

    public static void main(String[] args) {
        List<String> subjects = Arrays.asList("Noel", "The cat", "The dog");

        List<String> verbs = Arrays.asList("wrote", "chased", "slept on");
        List<String> objects = Arrays.asList("the book","the ball","the bed");
        ArrayList<String> arr =new ArrayList<>();
//        for (int i = 0; i <subjects.size() ; i++) {
//            for (int j = 0; j <verbs.size() ; j++) {
//                for (int k = 0; k <objects.size() ; k++) {
//                    arr.add(subjects.get(i)+" "+verbs.get(j)+" "+objects.get(k));
//
//                }
//            }
//
//
//        }

        for (int i = 0; i <arr.size() ; i++) {
            System.out.println(arr.get(i));
        }
    }
}
