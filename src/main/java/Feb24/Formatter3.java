package Feb24;

public class Formatter3 extends Formatter {
    public Formatter3(){


    }

    public Formatter3(String s){
        this.s=s;

    }
    @Override
    public void print(String s){
            this.s=s;
StringBuilder str=new StringBuilder();
        str.append(ulduz(6));
        str.append(ulduz2(6));
        str.append(ulduz(6));
String sr[]= new String[30];



//        System.out.print("***********");
//        System.out.println();
//        System.out.print("*  "+s.toUpperCase()+"  *");
//        System.out.println();
//        System.out.print("***********");
    }


    public String ulduz(int n) {
        String ul="";
        for (int i = 0; i < n; i++) {
            ul=ul+"*";

        }
        return ul;
    }


    public String ulduz2(int n) {
        String ul="";
        for (int i = 0; i < n; i++) {
            if(i==0)
            {
                ul=ul+"*  ";
            }
            else if(i==n-3){
               ul=ul+"  *" ;
            }
            else{
               ul=ul+" ";
            }

        }
        return ul;
    }

    @Override
    public String toString() {
        return this.s;
    }
}