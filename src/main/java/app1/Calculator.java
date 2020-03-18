package app1;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int a;
        int b;
        int sum;
        InputStream in=System.in;
        PrintStream output = System.out;
        Scanner sc= new Scanner(in);
        output.print("Please enter the first number: ");
        a=sc.nextInt();
        output.print("Please enter the second number: ");
        b=sc.nextInt();
        sum=a+b;
        output.println("it is your sum: "+sum);




    }
}
