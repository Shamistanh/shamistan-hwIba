package StepProjectTRY4.entity;


import StepProjectTRY4.dao.Identifiable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Flight implements Serializable, Identifiable {
    private static long seats;
    private final long id;
    private final String cityFrom;
    private final String cityTo;
    private final LocalDateTime date;
   // private final int seats;

    static long counter = 0;

    private static final long serialVersionUID = 1L;

    public Flight(String cityFrom, String cityTo, LocalDateTime date, int seats) {
        this(++counter, cityFrom, cityTo, date, seats);
//    this.cityFrom = cityFrom;
//    this.cityTo = cityTo;
//    this.date = date;
//    this.seats = seats;
//    this.id = ++counter;
    }

    public Flight(long id, String cityFrom, String cityTo, LocalDateTime date, int seats) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.date = date;
        this.seats = seats;
        this.id = id;
    }

    public static void setCounter(long counter) {
        Flight.counter = counter;
    }

//    public static void setSteats(long seats) {
//        Flight.seats = seats;
//    }

    @Override
    public long getId() {
        return id;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public long getSeats() {
        return seats;
    }

    public String represent() {
        return String.format("%-20d  %-20s - %-20s : %20s : %3d",id, cityFrom, cityTo, date.format(DateTimeFormatter.ofPattern("YYYY-MM-dd hh:mm")), seats);
    }

    public Object setSeats(long l) {
        return seats-l;
    }
}
