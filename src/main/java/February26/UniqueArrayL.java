package February26;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueArrayL implements NoDublicate {


        @Override
    public ArrayList<Integer> dublicateDel(ArrayList<Integer>arr2, ArrayList<Integer> arr1) {



//            for (int j = 0; j <arr1.size() ; j++) {
//                for (int i = j; i < arr1.size(); i++) {
//                    if (arr1.get(j).equals(arr1.get(i))) {
//                        arr1.remove(i);
//
//                    }
//                }
//            }

            ArrayList<Integer> arr3 = new ArrayList<>();

            arr1.addAll(arr2);
            for (int el: arr1) {

                if (!(arr3.contains(arr1))) {
                        arr3.add(el);
                }
            }
        return arr3;
    }

}
