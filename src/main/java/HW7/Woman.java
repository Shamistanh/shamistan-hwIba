package HW7;

public final class Woman extends Human {
    @Override
    public String greetPet() {
        return "Woman greets "+getPet();
    }

    public String makeup(){
        return "Woman makes up";
    }
}
