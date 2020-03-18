package app1;

public class array17 {

    public static void main(String[] args) {
        final String VOW = "AEOIU";
        final String VOW2 = "aeoiu";
        int range = 'Z'-'A' + 1;
        int range2 = 'z'-'a' + 1;
        int start = 'A';
        int start2= 'a';

        StringBuilder rand_s = new StringBuilder();
        for (int i = 0; i < 30; i++) {
            int oneOrZero= (int)(Math.random()*2);
            char letter = (char) (Math.random() * range + start+32*oneOrZero);

            rand_s.append(letter);

        }
        String random = rand_s.toString();
        StringBuilder vowels = new StringBuilder();
        StringBuilder vowels2 = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        StringBuilder consonants2 = new StringBuilder();
        for (int i = 0; i < random.length(); i++) {
            char c = random.charAt(i);
            if(VOW.contains(String.valueOf(c)))
                vowels.append(c);
            else if(VOW2.contains(String.valueOf(c))){
                vowels2.append(c);
            }
            else if(!(VOW.contains(String.valueOf(c)) || VOW2.contains(String.valueOf(c))) && (int)c>96 ){
                consonants2.append(c);
            }
            else
                consonants.append(c);
        }

        System.out.println(random);
        System.out.println(vowels.toString());
        System.out.println(vowels2.toString());
        System.out.println(consonants.toString());
        System.out.println(consonants2.toString());
    }
}
