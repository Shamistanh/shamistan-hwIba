package app;

import java.util.Arrays;
        import java.util.InputMismatchException;
        import java.util.Random;
        import java.util.Scanner;

public class hw1 {

    public static void main(String[] args) {

        Random rand =new Random();
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name= sc.next();
        int ch=0;
        int a=rand.nextInt(60);
        int arr []=new int[100];
        int i=0;

        System.out.println("Hello "+name + ". Let the game begin");
        System.out.println("I will pick a number and you will try to guess");
        int b=0;
        try {
            b = sc.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Please enter valid input");
            b = sc.nextInt();

        }

        while (ch==0) {

            if (b > a) {
                System.out.println("Your number is too big. Please, try again.");
                try {
                    b = sc.nextInt();

                }
                catch (InputMismatchException e){
                    System.out.println("Please enter valid input");
                    b = sc.nextInt();
                }
                arr[i]=b;
                i++;

            } else if (b < a) {
                System.out.println("Your number is too small. Please, try again.");
                try {
                    b = sc.nextInt();
                }
                catch (InputMismatchException e){
                    System.out.println("Please enter valid input");
                    b = sc.nextInt();
                }
                arr[i]=b;
                i++;

            }
            else{
                System.out.println("Congratulations, " + name + "!");
                ch=1;
            }
        }

        System.out.println("Here is your numbers: ");
        Arrays.sort(arr);
        for(int j=arr.length-1;j>=0;j--){
            if(arr[j]!=0) {
                System.out.print(arr[j] + " ");
            }
        }

    }
}
