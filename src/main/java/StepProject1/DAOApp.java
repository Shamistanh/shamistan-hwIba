//package StepProject1;
//
//public class DAOApp {
//    public static void main(String[] args) {
//        DAO<Flight> dao =
////        new DAOStudentMemory();
////        new DAOStudentFileText("students.txt");
//                new DAOFlight("students.bin");
//
//        dao.create(new Flight(1,"Jim", "JAn:2:22"));
//        dao.create(new Flight(2,"Jack", "Januaru:2:12"));
//        dao.create(new Flight(3,"Jeremy", "February:21:43"));
//
//        System.out.println("----");
//        dao.getAll().stream().forEach(System.out::println);
//        System.out.println("----");
//        dao.create(new Flight(4,"Baku", "February"));
//        dao.getAll().stream().forEach(System.out::println);
//        System.out.println("----");
//        dao.delete(2);
//        dao.getAll().stream().forEach(System.out::println);
//        System.out.println("----");
//        String s4 = dao.get(4).map(Flight::represent).orElse("No flight found");
//        String s5 = dao.get(5).map(Flight::represent).orElse("No flight found");
//        System.out.println(s4);
//        System.out.println(s5);
//    }
//}
