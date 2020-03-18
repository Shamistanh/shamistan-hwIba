package app1;

import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {
        int N=30;
        int t=0;
        int j=1;
        int arr[]=new int[N];

        for (int i = 0; i <N; i++) {
            arr[i]=(int)(Math.random()*10);
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            if(i!=N-1){
                arr[i+1]=arr[i];
            }
            else if(i==N-1){
                arr[0]=arr[N-1];
                //arr[N-1]=arr[N-2];
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
