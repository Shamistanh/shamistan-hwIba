package app1;

import java.util.Arrays;

public class arryaNext {
    public static void main(String[] args) {
             int j=0;
             int k=0;
             int arr[] =new int [30];
             int negative[]=  new int[30];
             int positive []=new int[30];

        for (int i = 0; i <arr.length; i++) {

            int rd =(int)(Math.random()*(200+2)-100);

            arr[i]=rd;

        }

        System.out.println();

        for (int el:arr) {

            if(el>=0)
            {
                positive[j]=el;
                j++;
            }
            else{
                negative[k]=el;
                k++;
            }



        }

        int [] pos1 =Arrays.copyOf(positive,j);

        int [] neg1 =Arrays.copyOf(negative,k);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(pos1));
        System.out.println(Arrays.toString(neg1));





        }

    }

