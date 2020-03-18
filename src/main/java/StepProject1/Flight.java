package StepProject1;


import java.io.Serializable;
import java.util.Objects;

public class Flight implements Serializable {
    final int id;
    final String destination;
    final  String date;

    private static final long serialVersionUID = 1L;

    public Flight(int id, String destination, String date) {
        this.id = id;
        this.destination = destination;
        this.date = date;
    }
//    public static Flight parse(String line) {
//        String[] chunks = line.split(":");
//        return new Flight(
//                //Integer.parseInt(chunks[0]),
//                //chunks[1],
//               // Integer.parseInt(chunks[2])
//        );
//    }


    public String represent() {
        return String.format("%d:%s:%s", id, destination, date);
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
        return String.format("Student[id=%d, destination='%s', date=%s]", id, destination, date);
    }
}
