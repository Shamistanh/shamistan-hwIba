package StepProjectTRY4.controller;

import StepProjectTRY4.Database;
import StepProjectTRY4.entity.Booking;
import StepProjectTRY4.entity.Passenger;
import StepProjectTRY4.entity.User;
import StepProjectTRY4.service.AppService;
import StepProjectTRY4.entity.Flight;
import StepProjectTRY4.io.Console;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class AppController {
    private  String user_name;
    private String user_password;
    private User user;
    private final Console console;
    private final AppService service;
    private long booking_id;
    private long user_id;
    private long flight_id;
    private int num_pass;
    private String pass_name;
    private String pass_surname;
  
    Database db = new Database();

    public AppController(Console console, AppService service) {
        this.console = console;
        this.service = service;
    }


    public void cancelBooking() {
        int booking_id;
        console.print("Please enter id of booking which you want to cancel: ");
        booking_id  = Integer.parseInt(console.readLn());
        try {
            db.bookings.delete(booking_id);
            console.printLn("Booking cancelled successfully!\n Thank you for choosing us");
        }catch (Exception ex){
            console.print("There is no such booking");
        }




    }

    public void myBookings() {
        console.printLn(db.bookings.getAll().toString());


    }

    public void makeBooking() {
        try{

            List<Passenger> passengers = new ArrayList<>();
            //booking_id = Long.parseLong(console.readLn());
            console.print("Please enter a flight id: ");
            //  user_id =Long.parseLong(console.readLn());
            flight_id =Long.parseLong(console.readLn());
            console.print("Please enter number of tickets: ");
            num_pass = Integer.parseInt(console.readLn());
            for (int i = 0; i <num_pass ; i++) {
                console.print("Please enter name of passenger: ");
                pass_name =console.readLn();
                console.print("Please enter surname of passenger: ");
                pass_surname =console.readLn();
                passengers.add(new Passenger(pass_name, pass_surname));
            }

            db.bookings.create(new Booking(user.getId(),flight_id,passengers));
            console.printLn("Your booking created successfully");
            user_id = user.getId();
            console.printLn(db.bookings.getAllBy(u -> u.getUser_id() == user_id).toString());
          //  System.out.println(db.bookings.getAll());
        }catch (Exception ex){
            console.printLn("You should login first");
        }

    }

    public void showAllFlights() {
        Collection<Flight> allFlights = service.getAllFlights();
        allFlights.forEach(f -> System.out.println(f.represent()));
    }

    public int login() {
        console.print("Please enter your username: ");
       user_name = console.readLn();
        console.print("Please enter your password: ");
        user_password = console.readLn();
        user =new User(user_name,user_password);
        db.users.create(user);
        int u=Integer.parseInt(user.getId()+"");
       return u;

    }

    public void logout() {
       db.users.deleteBy(u->u.getLogin().equals(user_name)  && u.getPasswd().equals(user_password));
       console.printLn("You logged out");
    }
}
