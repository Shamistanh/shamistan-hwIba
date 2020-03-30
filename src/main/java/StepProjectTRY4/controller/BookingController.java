package StepProjectTRY4.controller;

import StepProjectTRY4.Database;
import StepProjectTRY4.entity.Booking;
import StepProjectTRY4.entity.Flight;
import StepProjectTRY4.entity.Passenger;
import StepProjectTRY4.entity.User;
import StepProjectTRY4.io.Console;
import StepProjectTRY4.service.AppService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookingController {
    private Flight flight;
    private final Console console;
    private final AppService service;
    private long booking_id;
    private long user_id;
    private long flight_id;
    private int num_pass;
    private String pass_name;
    private String pass_surname;
    private FlightController fc;

    Database db = new Database();

    public BookingController(Console console, AppService service) {
        this.console = console;
        this.service = service;
    }


    public void makeBooking() {
       // try{
        FlightController fc = new FlightController(console,service);

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

           db.bookings.create(new Booking(fc.user.getId(),flight_id,passengers));
            console.printLn("Your booking created successfully");
            user_id = fc.user.getId();


            db.flights.updateSeats(db.flights.getAllBy(f->f.getId()==flight_id).stream().findAny().get(),num_pass);


            console.printLn(db.bookings.getAllBy(u -> u.getUser_id() == user_id).toString());
            //  System.out.println(db.bookings.getAll());
//        }catch (Exception ex){
//            console.printLn("You should login first");
//        }

    }



    public void cancelBooking() {
        int booking_id;

        try {
            console.print("Please enter id of booking which you want to cancel: ");
            booking_id  = Integer.parseInt(console.readLn());
            db.bookings.delete(booking_id);
            console.printLn("Booking cancelled successfully!\n Thank you for choosing us");
        }catch (Exception ex){
            console.print("Something went wrong");
        }




    }

    public void myBookings() {
        console.printLn(db.bookings.getAll().toString());


    }

}
