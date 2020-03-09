package HW6;

import java.util.Arrays;

public class Human {

    private String name="";
    private String surname="";
    private int year=0;
    private int iq=0;
    private String [][]schedule= new String[6][2];
    private Family family;
    Pet pet = new Pet();



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

    public Human(String name, String surname, int year,int iq,String [][]schedule)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
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
