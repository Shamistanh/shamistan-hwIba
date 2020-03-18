package Feb24;

public class Formatter2 extends Formatter {
    public Formatter2(String s){
        this.s=s;

    }
    public Formatter2(){


    }
    @Override
    public void print(String s){
        s=s.toUpperCase();
        this.s=s;
        //System.out.println(this.s);
    }

    @Override
    public String toString() {
        return this.s;
    }
}