package HW4;

public class Human {

    /***
     In class`Human` create constructors:
     - constructor which describes the name, surname and the date of birth
     - constructor which describes the name, surname, date of birth, father and mother
     - constructor which describes all the fields
     - empty constructor
     * */


    String name="dfdfdfdf";
    String surname="wfdfd";
    int year=1999;
    int iq=60;
    Pet pet;
    Mother mother=new Mother("Jane","Karleone");
    Father father=new Father("Vito", "Karleone");
    String [][]schedule= new String[6][2];


    Pet pt = new Pet("blue", "micky");
    public Human(String name, String surname, int year)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
    }
    public Human(String name, String surname, int year, Father father, Mother mother)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.father=father;
        this.mother=mother;
    }
    public Human(String name, String surname, int year, Father father, Mother mother,int iq, Pet pet)
    {
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.father=father;
        this.mother=mother;
        this.mother=mother;
        this.iq=iq;
        this.pet=pet;
    }
    public Human(){

    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname=%s, year=%d, iq=%d, mother=%s %s, father=%s %s, pet=dog{nickname=%s, age=%d, trickLevel=%d, habits=%s}",name,surname,year,iq, mother.name, mother.surname,father.name, father.surname,pet.nickname,pet.age,pet.tricklevel,pet.habits);
    }

    public void greetPet() {
        System.out.println("Hello, " + pt.nickname);
    }

    public void describePet() {

        if(pt.tricklevel>50)
        {
            System.out.println("I have a " + pt.species + ", he is " + pt.age + " years old, he is very sly");
        }
        else
        {
            System.out.println("I have a " + pt.species + ", he is " + pt.age + " years old, he is almost not sly");
        }

    }

}
