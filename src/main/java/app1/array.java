package app1;
import java.util.ArrayList;

public class array {
    public static boolean vowelChecker(char ch){
        if(ch=='a' || ch=='o'  || ch=='u' || ch=='e' || ch=='i' || ch=='A' || ch=='O'  || ch=='U' || ch=='E' || ch=='I'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {



            String origin="Hello";

            ArrayList<Character> arr = new ArrayList<>();
            String newWord="";
            for (int i = 0; i <origin.length() ; i++) {
                if(vowelChecker(origin.charAt(i))==false){
                    arr.add(origin.charAt(i));
                }
            }

            for (int i = 0; i < arr.size() ; i++) {
                newWord=newWord+arr.get(i);
            }
        System.out.println(newWord);


    }
}
