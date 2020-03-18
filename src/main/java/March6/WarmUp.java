package March6;

import java.util.ArrayList;

public class WarmUp {


    public int calc(String origin){
        char c;
        int j=1;
        int depth=0;
        int max=0;
        ArrayList<Integer> arr =new ArrayList<>();
        for (int i = 0; i < origin.length(); i++,j++) {
        switch (origin.charAt(i)){
            case '(': depth++; break;
            case ')': depth--; break;
        }
        max = Math.max(depth,max);
        }

  return max;

    }

}
