package March19;

/**
 * http://www.asciitable.com/index/asciifull.gif
 * https://cdn.cs50.net/2016/x/psets/0/pset0/bulbs.html
 * http://sticksandstones.kstrom.com/appen.html
 */
public class WarmUp {
    public static void main(String[] args) {
        System.out.println(toUpperCase("sdsdsd"));
        System.out.println(toLowerCase("ABCD"));
        System.out.println(invertCase("ABaDc"));
    }

    // abc -> ABC
    // aBc -> AbC
    // Abc -> aBC
   static String invertCase(String origin) {

        String nyu="";
        for (int i = 0; i <origin.length() ; i++) {
            char x=origin.charAt(i);
            if(x>64 && x<91){
                x = (char) (origin.charAt(i)+32);
                nyu+=x;
            }else if(x>96 && x<123){
                    x = (char) (origin.charAt(i)-32);
                    nyu+=x;

            }

        }
        return nyu;
    }

    // abc -> ABC
    // aBc -> ABC
    // Abc -> ABC
    static String toUpperCase(String origin) { // a -> A A -> A
        String nyu="";
        for (int i = 0; i <origin.length() ; i++) {
            char x=origin.charAt(i);
            if(x>96 && x<123) {
                x = (char) (origin.charAt(i) - 32);
                nyu += x;
            }
        }
        return nyu;
    }

    // abc -> abc
    // aBc -> abc
    // Abc -> abc
    static String toLowerCase(String origin) { // A -> a a -> a
        String nyu="";
        for (int i = 0; i <origin.length() ; i++) {
            char x=origin.charAt(i);
            if(x>64 && x<91) {
                x = (char) (origin.charAt(i) + 32);
                nyu += x;
            }
        }
        return nyu;
    }

}