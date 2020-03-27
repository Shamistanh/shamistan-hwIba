package HW7;



import java.util.Arrays;
import java.util.Objects;

public class Human {

    private String name="";
    private String surname="";
    private int year=0;
    private int iq=0;
    private Human mother;
    private Human father;
    private String [][]schedule= new String[6][2];
    private Family family;


    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Human(String name, String surname, int year)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
    }
    public Human(String name, String surname)
    {
        this.name=name;
        this.surname=surname;
    }
    public Human(String name, String surname, int year, Human father, Human mother)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.father=father;
        this.mother=mother;
    }
    public Human(String name, String surname, int year, Human father, Human mother, int iq, String [][]schedule)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.father=father;
        this.mother=mother;
        this.mother=mother;
        this.iq=iq;
        this.schedule=schedule;
    }


    public Human(){

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

    public Human getMother() {
        return mother;
    }


    public void setMother(Human mother) {
        this.mother = mother;
    }


    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
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
                Objects.equals(mother, human.mother) &&
                Objects.equals(father, human.father) &&
                Arrays.equals(schedule, human.schedule) &&
                Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq, mother, father, family);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.toString(schedule) +
                ", family=" + family +
                '}';
    }




    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method worked in Human class");
    }

}
