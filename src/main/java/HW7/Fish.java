package HW7;

abstract  class Fish extends Pet {
    Species species;

    public Fish(Species species, String nickname, int age, int tricklevel, String[] habits) {
        super(species, nickname, age, tricklevel, habits);
        this.species=species;
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
