package March2;

import java.util.Scanner;

public class WarmUp {
    /*
    *
    *
    *Console calculator

1. expect string from user
2. user enters 2+1
3. print 3
4. user can type `quit` to quit from application
5. operations supported +,-,*,/
*/
public static boolean isSign(char x){
    return "+-8/".contains(String.valueOf(x));
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String txt="";
        String eded1="";
        char isare='.';
        String eded2="";
        int result=0;
        int pos=0;
        txt=sc.next();

        if (txt.toLowerCase().equals("quit")){

            System.out.println("good bye");


        }
        for (int i = 0; i <txt.length() ; i++) {
        if(!isSign(txt.charAt(i)) && pos==0){
            eded1=eded1+txt.charAt(i);
        }
        else if(isSign(txt.charAt(i))){
            isare=txt.charAt(i);
            pos=i;
        }
        else if(i>pos && !isSign(txt.charAt(i)) ){
            eded2 =eded2+txt.charAt(i);
        }
        }
        if(isare=='+'){
            result = Integer.parseInt(eded1)+Integer.parseInt(eded2);
            System.out.println(result);

      }
        else if(isare=='-'){
            result = Integer.parseInt(eded1)-Integer.parseInt(eded2);
            System.out.println(result);

        }
        else if(isare=='*'){
            result = Integer.parseInt(eded1)*Integer.parseInt(eded2);
            System.out.println(result);

        }
        else if(isare=='/' && Integer.parseInt(eded2)!=0){
            result = Integer.parseInt(eded1)/Integer.parseInt(eded2);
            System.out.println(result);

        }
        else if(isare=='/' && Integer.parseInt(eded2)==0){

            System.out.println("Division by zero!");

        }


    }
}
