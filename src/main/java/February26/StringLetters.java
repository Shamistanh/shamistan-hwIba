package February26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StringLetters {


    public static void main(String[] args) {
//        System.out.println(letterC("Hello world"));
//        System.out.println(setMethod("Hello world"));
        ArrayList<Character> sd= new ArrayList<>();
        String s="Hello world";
        sd.addAll(setMethod("Hello world"));

        for (int i = 0; i < letterC(s).size() ; i++) {
            System.out.print(letterC(s).get(i)+":"+sd.get(i)+", ");
        }

    }

    public static Set<Character> setMethod( String soz){
        Set<Character> hs = new TreeSet<Character>();
        for (int i = 0; i <soz.length() ; i++) {
            hs.add(soz.charAt(i));

        }
        return hs;
    }


    public static  ArrayList<Integer> letterC(String s){
        ArrayList<Integer> arr=new ArrayList<>();
        int cnt=0;
        for (char ch : setMethod(s)) {
            for (int i = 0; i <s.length() ; i++) {
                if(ch==s.charAt(i)){
                    cnt++;
                }

            }
            arr.add(cnt);
            cnt=0;
        }
        return arr;
    }

}
