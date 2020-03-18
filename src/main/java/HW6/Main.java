package HW6;

public class Main {
    public String name(DayOfWeek day){
        String name;
       switch (day){
           case Sunday: return "Sunday";
           case Monday: return "Monday";
           case Tuesday: return "Tuesday";
           case Wednesday: return "Wednesday";
           case Thursday: return "Thursday";
           case Friday: return "Friday";
           case Saturday: return "Saturday";

           default: throw new IllegalArgumentException("No day is found");

       }

    }
    public static void main(String[] args) {
        Human hmn2 =new Human();
        Pet pt = new Pet();
        Family fmly =new Family();
         Human fthr =new Human();
         fthr.setName("Vito");
         fthr.setSurname("Karleone");
         Human mthr =new Human();
         mthr.setName("Jane");
         mthr.setSurname("Karleone");

       // for (int i = 0; i <1000000 ; i++) {  use this for checking finalize method
            hmn2.setName("Michael");
            hmn2.setSurname("Karloene");
            hmn2.setYear(72);
            fmly.setFather(fthr);
            fmly.setMother(mthr);
            hmn2.setIq(80);
            fmly.setPet(pt);
            hmn2.setSchedule(new String[][]{{"Monday"},{"To go university"}});
          //  System.out.println(hmn2);


        //}



          //   pet with setters and getters
           pt.setSpecies(Species.ROCK);
           pt.setAge(5);
           pt.setNickname("smth");
           pt.setTricklevel(75);
           pt.setHabits(new String[]{"eat", "play", "run"});
        fmly.setMother(mthr);
        fmly.setFather(fthr);
        fmly.setPet(pt);
        fmly.setChildren(new Human[]{new Human()});

        Human as=new Human("Salam","sasasasas",70);
        Human as2=new Human("Saam","stfghasas",70);
        Human as3=new Human("lfdfdaam","stfgdfdfdhasas",70);
        fmly.addChild(as);
        fmly.addChild(as2);
        fmly.addChild(as3);
//        System.out.println(hmn2.describePet()); // describe pet method
//        System.out.println(hmn2.greetPet());


        System.out.printf("Number of family members: %d\n",fmly.countFamily());
        fmly.deleteChild(as);
        fmly.deleteChild(1);
        System.out.printf("Number of family members: %d\n",fmly.countFamily());
//            pt.eat();
//            pt.foul();
//            pt.respond();

    }
}
