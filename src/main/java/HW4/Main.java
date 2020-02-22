package HW4;

public class Main {

    public static void main(String[] args) {


            Human hmn2= new Human("Ali","Valiyev",33,new Father("Vito","Karleone"),new Mother("Meolina","Karleone"),115,new Pet("blue","blick",23,56,"Play"));
       Mother mthr = new Mother("Meolina","Karleone");
       Father fthr= new Father("Vito","Karleone");
       Pet pt =new Pet("Blue","Pluck",30,75,"Eat Play");
        System.out.println(hmn2);
        System.out.println(mthr);
        System.out.println(fthr);
        System.out.println(pt);
    }
}
