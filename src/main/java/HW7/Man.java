package HW7;

public final class Man extends Human {
    @Override
    public String greetPet() {
        return "Man greets "+getPet();
    }

    public String repairCar(){
        return "Man repairs the car";
    }
}
