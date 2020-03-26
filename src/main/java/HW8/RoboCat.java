package HW8;


import java.util.Arrays;

public class RoboCat extends Pet {
    Species species;

    public RoboCat(String nickname, int age, int tricklevel, String[] habits) {
        super(nickname, age, tricklevel, Arrays.asList(habits));
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
