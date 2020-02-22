package HW4;

public class Pet {

    /***
     - In class `Pet` create constructors:
     - constructor which describes the pet's species an nickname
     - constructor which describes all the fields for the pet
     - empty constructor
     */
    String species;
    String nickname;
    int age;
    int tricklevel;
    String habits;

    public Pet(String species, String nickname, int age, int tricklevel, String habits){
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.tricklevel=tricklevel;
        this.habits =habits;
    }
    public Pet(String species, String nickname)
    {
        this.species=species;
        this.nickname=nickname;
    }
    public Pet(){

    }


    public void eat(){
        System.out.println("I am eating");
    }

    public void respond()
    {
        System.out.println("Hello, owner. I am "+nickname+" . I miss you!");
    }

    public void foul()
    {
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return  String.format("%s {nickname=%s, age=%d, trickLevel=%d, habits=%s", species, nickname,age,tricklevel,habits);
    }
}
