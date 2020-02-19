package Objects;



public class Cat extends Animal {


    Cat(String name){
        this.name=name;
    }



    @Override
    void print() {
        System.out.println("I'm a "+name);
    }
}
