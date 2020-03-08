package HW6;

import java.util.Arrays;

    enum Species{
     BLUE, BLACK, ROCK, TOPLAN, OVITI
    }
public class Pet {

    /***
     - In class `Pet` create constructors:
     - constructor which describes the pet's species an nickname
     - constructor which describes all the fields for the pet
     - empty constructor
     */
    private Species species;
    private String nickname;
    private int age;
    private int tricklevel;
    private String habits[];

    public Pet(Species species, String nickname, int age, int tricklevel, String habits[]){
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.tricklevel=tricklevel;
        this.habits =habits;
    }
    public Pet(Species species, String nickname)
    {
        this.species=species;
        this.nickname=nickname;
    }
    public Pet(){

    }


    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTricklevel() {
        return tricklevel;
    }

    public void setTricklevel(int tricklevel) {
        this.tricklevel = tricklevel;
    }


    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public int hashCode() {
        return (int)(Math.random()*age+tricklevel);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
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
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", tricklevel=" + tricklevel +
                ", habits=" + Arrays.deepToString(habits) +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method worked in Pet class");
    }
}
