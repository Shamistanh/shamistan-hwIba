package HW5;

public class Main {

    public static void main(String[] args) {
        Pet pt = new Pet();

         Human hmn2 =new Human();
         Human fthr =new Human();
         fthr.setName("Vito");
         fthr.setSurname("Karleone");
         Human mthr =new Human();
         mthr.setName("Jane");
         mthr.setSurname("Karleone");
         hmn2.setName("Michael");
         hmn2.setSurname("Karloene");
         hmn2.setYear(72);
         hmn2.setFather(fthr);
         hmn2.setMother(mthr);
         hmn2.setIq(80);
         hmn2.setPet(pt);
         hmn2.setSchedule(new String[][]{{"Monday"},{"To go university"}});



       pt.setSpecies("Rock");
       pt.setAge(5);
       pt.setSpecies("Blue");
       pt.setNickname("smth");
       pt.setTricklevel(75);
       pt.setHabits(new String[]{"eat", "play", "run"});
        Family fmly =new Family();
        fmly.setMother(mthr);
        fmly.setFather(fthr);
        fmly.setPet(pt);
        fmly.setChildren(new Human[]{new Human()});
        System.out.println(fmly);


        System.out.println(hmn2);
        System.out.println(pt);
    }
}
//"Species " + pt.getSpecies()+ " age: "+ pt.getAge()+" nickname: "+ pt.getNickname()+" habits: "+pt.getHabits()+" Trick Level: "+pt.getTricklevel()