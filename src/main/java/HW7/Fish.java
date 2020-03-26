package HW7;

class Fish extends Pet {

    public Fish(String nickname, int age, int tricklevel, String[] habits) {
        super(nickname, age, tricklevel, habits);
        setSpecies(Species.FISH);
    }

    @Override
    public String eat() {
        return "Fish eats";
    }

    @Override
    public String respond() {
        return "Fish responds";
    }

    @Override
    public String foul() {
        return "Fish fouls";
    }
}
