package HW6;

import java.util.Arrays;

public class Human {

    private String name="";
    private String surname="";
    private int year=0;
    private int iq=0;
    private Pet pet;
    private Human mother;
    private Human father;
    private String [][]schedule= new String[6][2];
    private Family family;



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
    public Human(String name, String surname, int year, Human father, Human mother,int iq, Pet pet, String [][]schedule)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.father=father;
        this.mother=mother;
        this.mother=mother;
        this.iq=iq;
        this.pet=pet;
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


    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
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
    public int hashCode() {
        return (int)(Math.random()*10)+iq;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.toString(schedule) +
                ", family=" + family +
                '}';
    }

    public String greetPet() {
        return "Hello, " + pet.getNickname();
    }

    public String describePet() {

        if(pet.getTricklevel()>50)
        {
            return  "I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is very sly";
        }
        else
        {
            return "I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is almost not sly";
        }

    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method worked in Human class");
    }

}
