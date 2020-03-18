package app1;

import java.util.Scanner;

public class envolope {
    public static void main(String[] args) {
        int width=0;
        int height=0;
        Scanner sc= new Scanner(System.in);
        int j=0;
        width =5;
        height=5;
        int in=0;
        String arr[][] =new String[height+1][width+1];
        for (int i = 0; i <width ; i++) {

                arr[i][0]="1";
                arr[i][height-1]="1";


            for (j = 0; j < height ; j++) {


               arr[0][j]="1";
                arr[height-1][j]="1";

                    if(i<=width/2 && j<=height/2 && i==j){
                        arr[i][j]="1";
                    }
                    if(width-i==height-j){
                        arr[width-i][height-1]="1";
                    }



            }



        }


        for (int i = 0; i < width ; i++) {
            for (int k = 0; k <height ; k++) {
                if(arr[i][k]=="1")
                {
                    arr[i][k]="*";
                }
                else {
                    arr[i][k]=" ";
                }
                System.out.print(arr[i][k]+" ");
            }
            System.out.println();
        }
    }
}
