package app.entity;

import java.io.Serializable;
import java.util.List;

public class Booking implements Serializable {
  private final static long SerialVersionUID = 1L;
  int id;
  int user_id;
  int flight_id;
  List<Person> people;
  int seats;
   public Booking (int user_id, int flight_id, int seats,List<Person> people){
     this.people = people;
     this.user_id = user_id;
     this.flight_id = flight_id;
     this.seats = seats;
  }


  public List<Person> getPeople() {
    return people;
  }

  public void setPeople(List<Person> people) {
    this.people = people;
  }

  public int getUser_id() {
    return user_id;
  }

  public void setUser_id(int user_id) {
    this.user_id = user_id;
  }

  public int getFlight_id() {
    return flight_id;
  }

  public void setFlight_id(int flight_id) {
    this.flight_id = flight_id;
  }

  public int getSeats() {
    return seats;
  }

  public void setSeats(int seats) {
    this.seats = seats;
  }

  @Override
  public String toString() {
    return "Booking{" +
            "id=" + id +
            ", user_id=" + user_id +
            ", flight_id=" + flight_id +
            ", people=" + people +
            ", seats=" + seats +
            '}';
  }
}
