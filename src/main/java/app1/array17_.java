package app1;

public class array17_ {
    public static void main(String[] args) {
//        int start ='a';
//        char alf []=new char[30];
//
//        for (int i = 0; i <26 ; i++) {
//            alf[i]=(char)start;
//            start++;
//        }
//        System.out.println(alf);

    String fn="ismayilismayil";
    fn=fn.toUpperCase();
    while(fn.length()>2)
    {



        fn = fn.replace("fn.charAt(0)", "" );
        fn = fn.replace("fn.charAt(3)", "");
        System.out.println(fn);
    }
    }
}
