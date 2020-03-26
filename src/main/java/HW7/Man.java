package HW7;

public class Man extends Human {
    @Override
    public String greetPet() {
        return "Man greets "+getPet();
    }

    public String repairCar(){
        return "Man repairs the car";
    }
}
