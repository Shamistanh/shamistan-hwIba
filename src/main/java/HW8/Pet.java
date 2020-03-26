package HW8;


import java.util.Arrays;
import java.util.Collection;

public abstract class Pet {
    int TrickLevel;
    private Species species = Species.UNKNOWN;
    private String nickname="";
    private int age;
    private int tricklevel=0;
    private Collection<String> habits;

    public Pet(Species species, String nickname, int age, int tricklevel, Collection<String> habits){
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

    public Pet(String nickname, int age, int tricklevel, Collection<String> habits) {
        this.nickname=nickname;
        this.age=age;
        this.tricklevel=tricklevel;
        this.habits=habits;
    }
//    public Pet(){
//        this.species=Species.UNKNOWN;
//    }

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


    public Collection<String> getHabits() {
        return habits;
    }

    public void setHabits(Collection<String> habits) {
        this.habits = habits;
    }
    public String describePet() {

        if(TrickLevel>50)
        {
            return  "I have a " + species + ", he is " + age + " years old, he is very sly";
        }
        else
        {
            return "I have a " + species + ", he is " + age + " years old, he is almost not sly";
        }

    }

    public abstract String eat();
    public abstract String respond();
    public abstract String foul();
}
