package HW4;

public class Mother {
    String name;
    String surname;
    public Mother(String name, String surname)
    {
        this.name=name;
        this.surname=surname;
    }

    public Mother(){

    }

    @Override
    public String toString() {
        return String.format("name of mother: %s, surname of mother: %s ", name,surname);
    }
}
