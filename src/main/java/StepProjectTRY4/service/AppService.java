package StepProjectTRY4.service;

import StepProjectTRY4.Database;
import StepProjectTRY4.entity.Flight;

import java.time.LocalDateTime;
import java.util.Collection;

public class AppService {

    private final Database db;

    public AppService(Database db) {
        this.db = db;
    }

    public Collection<Flight> getAllFlights() {
        return db.flights.getAllBy(f -> LocalDateTime.now().plusDays(100).isAfter(f.getDate()));
    }

    public int m2() {
        db.flights.getAll();
        return 0;
    }

}
