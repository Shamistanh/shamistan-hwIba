package HW4;

public class Father {
    String name;
    String surname;
    public Father(String name, String surname){
        this.name=name;
        this.surname=surname;
    }
    public Father(){

    }

    @Override
    public String toString() {
        return String.format("name of father: %s, surname of father: %s ", name,surname);
    }
}
