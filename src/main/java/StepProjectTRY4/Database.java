package StepProjectTRY4;

import StepProjectTRY4.dao.DAO;
import StepProjectTRY4.dao.DAOAbstractFileBin;
import StepProjectTRY4.entity.Booking;
import StepProjectTRY4.entity.Flight;
import StepProjectTRY4.entity.User;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static StepProjectTRY4.util.RandomData.*;

public class Database {
    public final DAO<User> users;
    public final DAO<Flight> flights;
    public final DAO<Booking> bookings;

    public Database() {
        this.users = new DAOAbstractFileBin<>("users.bin");;
        this.flights = new DAOAbstractFileBin<>("flights.bin");
        this.bookings = new DAOAbstractFileBin<>("bookings.bin");

        setMaxCounters();
        if (flights.getAll().isEmpty()) createInitialData();
    }

    public void createInitialData() {
        List<Flight> fligts = IntStream.range(0, 20).mapToObj((n) -> new Flight(
                randomCityFrom(),
                randomCityTo(),
                randomData(),
                randomSeats()
        )).collect(Collectors.toList());
        fligts.forEach(f -> flights.create(f));
    }

    private void setMaxCounters() {
        long maxu = users.getAll().stream().mapToLong(User::getId).max().orElse(0);
        User.setCounter(maxu);
        long maxf = flights.getAll().stream().mapToLong(Flight::getId).max().orElse(0);
        Flight.setCounter(maxf);
        long maxb = bookings.getAll().stream().mapToLong(Booking::getId).max().orElse(0);
        Flight.setCounter(maxb);
        Booking.setCounter(maxb);

    }
}
