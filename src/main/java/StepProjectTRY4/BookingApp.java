package StepProjectTRY4;

import StepProjectTRY4.controller.FlightController;
import StepProjectTRY4.controller.BookingController;
import StepProjectTRY4.io.Console;
import StepProjectTRY4.io.UnixConsole;
import StepProjectTRY4.service.AppService;

import java.util.Scanner;

public class BookingApp {
    public static void main(String[] args) {
        Console console = new UnixConsole(new Scanner(System.in));
        Database db = new Database();
        AppService service = new AppService(db);
        FlightController controller = new FlightController(console, service);
        BookingController bookingController = new BookingController(console,service);
        if(!db.flights.getAll().isEmpty()){
            db.createInitialData();
       }
        console.printLn("Hello, Welcome to our website\nIf you want to login press 1\nto log out press 11,\nto show all flights in 24 hours press 2\nto make new booking press 3, \nto check your bookings press 4, \nto cancel booking press 5, \nto check online board press 6\nto quit program press 7");

        int u = -1;
        boolean quit = false;
        while (!quit) {
            console.print("Enter your choice:");
            String line = console.readLn();
            switch (line) {
                case "1": u = controller.login(); break;
                case "11": controller.logout(); break;
                case "2": controller.showAllFlights(); break;
                case "3": bookingController.makeBooking(); break;
                case "4": bookingController.myBookings(); break;
                case "5": bookingController.cancelBooking(); break;
                case "6": controller.menu(); break;
                case "7": console.printLn("Bye!"); quit = true; break;
                default : console.print("Wrong input");
            }
        }
    }
}
