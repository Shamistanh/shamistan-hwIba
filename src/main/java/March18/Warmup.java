package March18;

public class Warmup {
    public static void main(String[] args) {
        System.out.println(calc("RLRRLLRLRRLL"));
    }



    static int calc(String origin){
        int interval=0;
        int cnt=0;
        for (int i = 0; i <origin.length() ; i++) {
            switch (origin.charAt(i)){
                case 'L': interval++; break;
                case 'R': interval--; break;
            }
            if(interval==0 && i>0){
                cnt++;
            }
        }
        return cnt;
    }
}
