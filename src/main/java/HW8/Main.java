package HW8;


import java.util.Arrays;

public class Main {
    enum DayOfWeek {
        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
    }

    public String name(Main.DayOfWeek day) {
        String name;
        switch (day) {
            case Sunday:
                return "Sunday";
            case Monday:
                return "Monday";
            case Tuesday:
                return "Tuesday";
            case Wednesday:
                return "Wednesday";
            case Thursday:
                return "Thursday";
            case Friday:
                return "Friday";
            case Saturday:
                return "Saturday";

            default:
                throw new IllegalArgumentException("No day is found");

        }

    }

    public static void main(String[] args) {
        Human hmn2 = new Human();
        Family fmly = new Family();
        Human fthr = new Human();
        fthr.setName("Vito");
        fthr.setSurname("Karleone");
        Human mthr = new Human();
        mthr.setName("Jane");
        mthr.setSurname("Karleone");

        // for (int i = 0; i <1000000 ; i++) {  use this for checking finalize method
        hmn2.setName("Michael");
        hmn2.setSurname("Karloene");
        hmn2.setYear(72);
        hmn2.setFather(fthr);
        hmn2.setMother(mthr);
        hmn2.setIq(80);

        hmn2.setSchedule(new String[][]{{"Monday"}, {"To go university"}});
        //  System.out.println(hmn2);

        //}
        fmly.setMother(mthr);
        fmly.setFather(fthr);
        Human as2 = new Human("Saam", "stfghasas", 70);
        Human as3 = new Human("lfdfdaam", "stfgdfdfdhasas", 70);
        // DomesticCat dc = new DomesticCat(Species.ROCK,"rocky",5,23,new String[]{"eat", "play"});
        fmly.addChild(as2);
        fmly.addChild(as3);
        System.out.printf("Number of family members: %d\n", fmly.countFamily());
        fmly.deleteChild(as2);
        fmly.deleteChild(1);
        System.out.printf("Number of family members: %d\n", fmly.countFamily());
//            pt.eat();
//            pt.foul();
//            pt.respond();

    }
}
