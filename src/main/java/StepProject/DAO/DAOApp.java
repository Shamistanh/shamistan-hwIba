package StepProject.DAO;


import StepProject.Services.getFlight;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DAOApp {
    public static void main(String[] args) {
        DAO<Flight> dao =
//        new DAOStudentMemory();
//        new DAOStudentFileText("students.txt");
                new DAOFlight("flights.txt");

//        dao.create(Flight.parse("1|Baku|18.07.2020 08:54"));
//        dao.create(Flight.parse("2|Ganja|13.09.2020 09:34"));
//        dao.create(Flight.parse("3|Sumgait|12.06.2020 12:54"));
//        dao.create(Flight.parse("4|Nakhchivan|11.07.2020 11:54"));
        getFlight fl = new getFlight();
       fl.generate();
//        System.out.println("----");
//        dao.getAll().stream().map(f -> f.represent()).forEach(System.out::println);
//        System.out.println("----");
//        dao.create(Flight.parse("4|Nakhchivan|11:07:2020 11:54"));
//        dao.getAll().stream().forEach(System.out::println);
//        System.out.println("----");
//        dao.delete(2);
//        dao.getAll().stream().forEach(System.out::println);
//        System.out.println("----");
//        String s4 = dao.get(4).map(Flight::represent).orElse("No flight found");
//        String s5 = dao.get(5).map(Flight::represent).orElse("No flight found");
//        System.out.println(s4);
//        System.out.println(s5);
    }
}
