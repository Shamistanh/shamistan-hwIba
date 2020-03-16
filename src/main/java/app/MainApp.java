package app;


import app.Generation.generateFlight;
import app.controller.Controller;
import app.dao.DAOBooking;
import app.dao.DAOFlight;
import app.dao.DAOUser;
import app.entity.User;
import app.io.ConsoleMain;
import app.service.Authorization;
import app.service.Service;
import java.io.File;
import java.util.Collection;


public class MainApp {
    static User u;
    static int flag = 0;
    static int close = 0;
    static Object[] people;
    static int ID;
    static String choiceForBooking = "99";
    static Collection<User> allBy;
    static Authorization au = new Authorization();
    static ConsoleMain console;
    static DAOBooking daoBooking = new DAOBooking(new File("DAOBooking.txt"));
    static DAOFlight daoFlight = new DAOFlight(new File("DAOFlight.txt"));
    static DAOUser daoUser = new DAOUser(new File("DAOUser1.txt"));
    static Service service = new Service(daoBooking, daoFlight, daoUser);
    static Controller controller = new Controller(console, service);

    public static void main(String[] args) {

        console = new ConsoleMain();

        if (daoFlight.getAll().isEmpty()) {
            //for generating random flights
            generateFlight gf = new generateFlight();
            gf.genearate();
        }


        login();
        if (allBy.isEmpty()) {
            System.out.println("You can press 2 button for registering to our website, or press 1 to try to login again, or you can press 3 to exit from program");

            enteranceToSystem();


        } else {

            mainMenu();
        }
    }

    private static void mainMenu() {
        while (true) {
            System.out.print("Hello " + u.getUser_name() + " you have registered and your id: " + u.getId() + "\nFor checking all flights press 1\n For searching posssible flights press 2\n For booking flight press 3\n For exiting progrem press either 4\n");

            String input = console.readLn();
            switch (input) {
                case "1":
                    controller.show();
                    break;
                case "2":
                    controller.search();
                    break;
                case "3":
                    controller.book(u.getId());
                    break;
                case "4":
                    close = 1;
                    ;
                    break;
                default:
                    close = 1;
                    break;
            }
            if (close == 1) {
                break;
            }

        }
    }


    private static void enteranceToSystem() {
        while (true) {


            choiceForBooking = console.readLn();

            switch (choiceForBooking) {
                case "1":
                    login();
                    break;
                case "2":
                    au.register();
                    break;
                case "3":
                    flag = 1;
                    break;
            }
            if (flag == 1) {
                break;
            }
            mainMenu();
        }
    }

    private static void login() {

        System.out.print("Please enter username ");
        String username = console.readLn();
        System.out.println();
        System.out.print("Please enter password ");
        String password = console.readLn();

        u = daoUser.getAllby(u -> u.getUser_name().equals(username) && u.getPassword().equals(password)).get(0);

        allBy = daoUser.getAllBy(u -> u.getUser_name().equals(username) && u.getPassword().equals(password));

        if (!allBy.isEmpty()) {
            mainMenu();
        }


    }
}
