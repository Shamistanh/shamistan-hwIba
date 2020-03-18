package Objects;

public class Run {

    public static void main(String[] args) {
        Cat cat =new Cat("Tom");
        Cat cat2 =new Cat("Tom");
        Dog dog =new Dog("Jaaack");
        cat.print();
        System.out.println(cat.equals(cat2));

    }

}
