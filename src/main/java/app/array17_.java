package app;

public class array17_ {
    public static void main(String[] args) {
        int start ='a';
        String alf="";

        for (int i = 0; i <26 ; i++) {
            alf=alf+(char)start;
            start++;
        }
        System.out.println(alf);
    }
}
