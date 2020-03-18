package March6;

import java.util.ArrayList;

public class WarmUp2 {
    public static void main(String[] args) {
        String origin = "()(()()()(()))";
        int j=1;
        int cnt=0;
        for (int i = 0; i <origin.length() ; i=i+2,j=j+2) {
            if(origin.charAt(i)=='('){
                cnt++;

            }
            System.out.println(cnt);
        }

    }

}
