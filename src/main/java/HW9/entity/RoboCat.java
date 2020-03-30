package HW9.entity;


import HW8.Pet;

import java.util.Arrays;
import java.util.Set;

public class RoboCat extends Pet {
    Species species;

    public RoboCat(String nickname, int age, int tricklevel, Set<String> habits) {
        super(nickname, age, tricklevel, habits);
        this.species = species;
    }


    @Override
    public String eat() {
        return "RoboCat eats";
    }

    @Override
    public String respond() {
        return "RoboCat responds";
    }

    @Override
    public String foul() {
        return "RoboCat fouls";
    }
}
