package app1;

import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
        int [] arr =new int[30];
        int rd=0;
        for (int i = 0; i <30; i++) {
            rd =(int)((Math.random()*(20+1)-10))*2;
            arr[i]=rd;

        }

        System.out.println(Arrays.toString(arr));
    }
}
