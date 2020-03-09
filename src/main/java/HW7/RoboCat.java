package HW7;

public class RoboCat extends Pet {
    Species species;

    public RoboCat(Species species, String nickname, int age, int tricklevel, String[] habits) {
        super(species, nickname, age, tricklevel, habits);
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
