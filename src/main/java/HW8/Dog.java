package HW8;


import java.util.Arrays;

public class Dog extends Pet {
    Species species;

    public Dog(String nickname, int age, int tricklevel, String[] habits) {
        super(nickname, age, tricklevel, Arrays.asList(habits));
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

