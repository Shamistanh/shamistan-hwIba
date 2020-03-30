package StepProjectTRY4.controller;

import StepProjectTRY4.Database;
import StepProjectTRY4.entity.Booking;
import StepProjectTRY4.entity.Passenger;
import StepProjectTRY4.entity.User;
import StepProjectTRY4.service.AppService;
import StepProjectTRY4.entity.Flight;
import StepProjectTRY4.io.Console;
import java.time.LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlightController {
    private  String user_name;
    private String user_surname;
    static User user;
   private final Console console;
    private final AppService service;

  
    Database db = new Database();

    public FlightController(Console console, AppService service) {
        this.console = console;
        this.service = service;
    }



    public void menu(){
        try {
            console.print("Please enter id of flight which you want to get: ");
            String input = console.readLn();
            List<Flight> flight = (List<Flight>) db.flights.getAll();
            List<Flight> flights = flight.stream().filter(f->f.getId()==Long.parseLong(input)).collect(Collectors.toList());
            if(flights.isEmpty()){
                console.printLn("There is no such flight with this id");
            }else {
                flights.forEach(f -> System.out.println(f.represent()));
            }
        }catch (Exception ex){
            console.printLn("Wrong input..");
        }

    }


    public void showAllFlights() {
        Collection<Flight> allFlights = service.getAllFlights();
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.now().plusHours(24);
        Collection<Flight> flight = allFlights.stream().filter(f->f.getDate().isAfter(ldt) && f.getDate().isBefore(ldt2)).collect(Collectors.toList());
        if(flight.isEmpty()){
            console.printLn("Unfortunately, there is no flight planned in 24 hours");
        }else{
            flight.forEach(f -> System.out.println(f.represent()));
        }


    }

    public int login() {
        console.print("Please enter your username: ");
       user_name = console.readLn();
        console.print("Please enter your surname: ");
        user_surname = console.readLn();
        user =new User(user_name,user_surname);
        db.users.create(user);
        int u=Integer.parseInt(user.getId()+"");
       return u;

    }

    public void logout() {
       db.users.deleteBy(u->u.getLogin().equals(user_name)  && u.getSur().equals(user_surname));
       console.printLn("You logged out");
    }
}
