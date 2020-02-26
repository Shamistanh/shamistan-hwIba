package February26;

import java.util.ArrayList;

/**
 1. write class with function
 String filter(String origin)
 the responsibility of that function is:
 - get rid of vowels
 - make all rest character lowercase

 2. write test to show/prove that function works

 */
public class StringFilter implements Filterable {



    public boolean vowelChecker(char ch){
        if(ch=='a' || ch=='o'  || ch=='u' || ch=='e' || ch=='i' || ch=='A' || ch=='O'  || ch=='U' || ch=='E' || ch=='I'){
            return true;
        }
    return false;
    }


    @Override
    public String filter(String origin) {
        ArrayList<Character> arr = new ArrayList<>();
        String newWord="";
            if(origin==null){
                newWord=null;

            }
            else {
                for (int i = 0; i < origin.length(); i++) {
                    if (vowelChecker(origin.charAt(i)) == false) {
                        arr.add(origin.charAt(i));
                    }
                }

                for (Character el : arr) {
                    newWord = newWord + el;
                }

            }
        return newWord;
    }
}
