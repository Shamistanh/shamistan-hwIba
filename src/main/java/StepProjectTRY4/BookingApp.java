package StepProjectTRY4;

import StepProjectTRY4.controller.AppController;
import StepProjectTRY4.io.Console;
import StepProjectTRY4.io.UnixConsole;
import StepProjectTRY4.service.AppService;

import java.util.Scanner;

public class BookingApp {
    public static void main(String[] args) {
        Console console = new UnixConsole(new Scanner(System.in));
        Database db = new Database();
        AppService service = new AppService(db);
        AppController controller = new AppController(console, service);
        if(db.flights.getAll().isEmpty()){
            db.createInitialData();
        }
        console.printLn("Hello, Welcome to our website\nIf you want to login press 1 to log out press 11, to show all flights press 2\n to make new booking press 3, to check your bookings press 4, to cancel booking press 5, to quiz program press 6");

        int u = -1;
        boolean quit = false;
        while (!quit) {
            console.print("Enter your choice:");
            String line = console.readLn();
            switch (line) {
                case "1": u = controller.login(); break;
                case "11": controller.logout(); break;
                case "2": controller.showAllFlights(); break;
                case "3": controller.makeBooking(); break;
                case "4": controller.myBookings(); break;
                case "5": controller.cancelBooking(); break;
                case "6": console.printLn("Bye!"); quit = true; break;
                default : console.print("Wrong input");
            }
        }
    }
}
