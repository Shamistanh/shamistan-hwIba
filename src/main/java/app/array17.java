package app;

import java.util.ArrayList;
import java.util.Arrays;

public class array17 {
    public static void main(String[] args) {
        String wov="";
        String sm="";
        String str="";
        for (int i = 0; i <30 ; i++) {
            str=str+(char)((int)(Math.random()*26)+65);

        }
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
            {
                wov=wov+str.charAt(i);
            }
            else{
                sm=sm+str.charAt(i);
            }

        }
        System.out.println(str);
        System.out.println(wov);
        System.out.println(sm);

    }
}
