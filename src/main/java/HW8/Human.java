package HW8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private int year = 0;
    private int iq = 0;
    private Pet pet;
    private Map<Main.DayOfWeek,String> schedule = new HashMap<>();
    private Family family;


    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public Human(String name, String surname, int year, int iq, Pet pet, Map schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.schedule = schedule;
    }


    public Human() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }


    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Map<Main.DayOfWeek, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<Main.DayOfWeek, String> schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year &&
                iq == human.iq &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(pet, human.pet) &&
                Objects.equals(schedule, human.schedule) &&
                Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq, pet,schedule, family);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", schedule=" + schedule +
                ", family=" + family +
                '}';
    }

    public String greetPet() {

        return "Hello my dear pet";
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method worked in Human class");
    }

}
