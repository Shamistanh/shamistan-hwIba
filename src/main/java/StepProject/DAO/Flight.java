package StepProject.DAO;

import java.time.LocalDateTime;  // import the LocalDateTime class
import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Flight implements Serializable {
    final int id;
    final String destination;
    final LocalDateTime date;

    private static final long serialVersionUID = 1L;

    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    public Flight(int id, String destination, LocalDateTime date) {
        this.id = id;
        this.destination = destination;
        this.date = date;
    }
    public static Flight parse(String line) {
        String[] chunks = line.split("[|]");
        LocalDateTime ldt = LocalDateTime.parse(chunks[2], fmt);
        return new Flight(
                Integer.parseInt(chunks[0]),
                chunks[1],
                ldt
        );
    }


    public String represent() {
        return String.format("%d|%s|%s", id, destination, date.format(fmt));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return id == flight.id &&
                Objects.equals(destination, flight.destination) &&
                Objects.equals(date, flight.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, destination, date);
    }

    @Override
    public String toString() {
        return String.format("Flight[id=%d, destination='%s', date=%s]", id, destination, date);
    }
}
