package HW7;

public class DomesticCat extends Pet {

    public DomesticCat(Species rock, String nickname, int age, int tricklevel, String[] habits) {
        super(nickname, age, tricklevel, habits);
        setSpecies(Species.DOMESTICAT);
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
