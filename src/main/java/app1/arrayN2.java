package app1;

import java.util.Arrays;

public class arrayN2 {
    public static void main(String[] args) {
        final int N=10;
        int a1[]=new int[N];
        int a2[]=new int[N];
        int a3[]=new int[N];
        int j=0;
       final int a4[]=new int[3*N];
        for (int i = 0; i <N ; i++) {
            a1[i]=(int)(Math.random()*10)*2;
            a2[i]=(int)(Math.random()*10)*7;
            a3[i]=(int)(Math.random()*10)*11;
        }
        for (int i = 0; i <N ; i++) {
            a4[j]=a1[i];
            a4[j+1]=a2[i];
            a4[j+2]=a3[i];
            j=j+3;

        }

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));
        System.out.println(Arrays.toString(a4));
    }
}
