package HW7;


public class Main {
    enum DayOfWeek {
        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
    }

    //    public String name(DayOfWeek day){
//        String name;
//        switch (day){
//            case Sunday: return "Sunday";
//            case Monday: return "Monday";
//            case Tuesday: return "Tuesday";
//            case Wednesday: return "Wednesday";
//            case Thursday: return "Thursday";
//            case Friday: return "Friday";
//            case Saturday: return "Saturday";
//
//            default: throw new IllegalArgumentException("No day is found");
//
//        }
//
//    }
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
        hmn2.setIq(80);

        hmn2.setSchedule(new String[][]{{"Monday"}, {"To go university"}});
        //  System.out.println(hmn2);


        //}


        //    Human as=new Human("Salam","sasasasas",70,new Human("fdfdf","fdfdfd",52),new Human("weerererf","zxzxzx",45),80, new Pet(Species.ROCK,"rock0",50,120,new String[]{"eat","fdfdfdf"}),new String[][]{{"tgy"},{"ghbnj"}});
        Human as2 = new Human("Saam", "stfghasas", 70);
        Human as3 = new Human("lfdfdaam", "stfgdfdfdhasas", 70);
        DomesticCat dc = new DomesticCat(Species.ROCK, "rocky", 5, 23, new String[]{"eat", "play"});
        fmly.addChild(as2);
        fmly.addChild(as3);
        System.out.println(dc.describePet()); // describe pet method


        fmly.deleteChild(as2);
        // fmly.deleteChild(1);
        System.out.printf("Number of family members: %d\n", fmly.countFamily());
//            pt.eat();
//            pt.foul();
//            pt.respond();

    }
}
