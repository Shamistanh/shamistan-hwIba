package HW8;


import java.util.Arrays;
import java.util.Set;

public class Dog extends Pet {
    Species species;

    public Dog(String nickname, int age, int tricklevel, Set<String> habits) {
        super(nickname, age, tricklevel, habits);
        this.species=species;
    }

    @Override
    public String eat() {
        return null;
    }

    @Override
    public String respond() {
        return null;
    }

    @Override
    public String foul() {
        return null;
    }
}

