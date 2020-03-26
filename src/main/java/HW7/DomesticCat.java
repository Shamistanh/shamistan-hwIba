package HW7;

public class DomesticCat extends Pet {
    Species species;

    public DomesticCat(Species rock, String nickname, int age, int tricklevel, String[] habits) {
        super(nickname, age, tricklevel, habits);
        this.species=species;
    }

    @Override
    public String eat() {
        return "Domestic cat eats";
    }

    @Override
    public String respond() {
        return "Domestic cat responds";
    }

    @Override
    public String foul() {
        return "Domestic cat fouls";
    }
}
