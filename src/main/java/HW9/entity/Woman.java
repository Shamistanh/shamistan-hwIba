package HW9.entity;


public final class Woman extends Human {
    @Override
    public String greetPet() {
        return "Woman greets " + getPet();
    }

    public String makeup() {
        return "Woman makes up";
    }
}
