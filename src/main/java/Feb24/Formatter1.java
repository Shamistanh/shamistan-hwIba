package Feb24;

public class Formatter1 extends Formatter {
    String s;
    public Formatter1(String s){
        this.s=s;

    }
    public Formatter1(){


    }
    @Override
    public void print(String s){
        s=s.toLowerCase();
        this.s=s;
        System.out.println(this.s);
    }

    @Override
    public String toString() {
        return this.s;
    }
}
