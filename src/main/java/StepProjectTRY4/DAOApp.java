package StepProjectTRY4;

import StepProjectTRY4.entity.User;

public class DAOApp {

    public static void main(String[] args) {
        Database db = new Database();
//    db.users.create(new User("alex", "123"));
        db.users.create(new User("jim2", "234"));
//    db.flights.create(new Flight("Kyiv", "Baki", LocalDateTime.now(), 100));
//    db.bookings.create(new Booking(1, 1, Arrays.asList(new Passenger("A","B"), new Passenger("C", "D"))));
        db.users.getAll().forEach(u -> System.out.println(u.represent()));
    }

}
