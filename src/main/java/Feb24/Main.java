package Feb24;

public class Main {
    public static void print(String s, Formatter f) {
        Formatter fmt1 = new Formatter1();
        fmt1.print(s);
        Formatter fmt2 = new Formatter2();
        fmt2.print(s);
        Formatter fmt3 = new Formatter3();
        fmt3.print(s);
        System.out.println();
    }

    public static void main(String[] args) {
        Formatter fmt1 = new Formatter1();
        Formatter fmt2 = new Formatter2();
        Formatter fmt3 = new Formatter3();
//        print("hello", fmt1); // hello
//        print("hello", fmt2); // HELLO
//        print("hello", fmt3); // ***********
//        // *  HELLO  *
        // ***********

        fmt1.print("hello");  //hello
        fmt2.print("hello"); //HELLO
        fmt3.print("hello"); // *************
                                //*  HELLO   *


        print("Hello",fmt1);
        print("Hello",fmt2);
        print("Hello",fmt3);

        System.out.println(new Formatter1("hello"));
        System.out.println(new Formatter2("hello"));
        System.out.println(new Formatter3("hello"));

    }
}
