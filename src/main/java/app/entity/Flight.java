package app.entity;

import java.io.Serializable;
import java.util.Date;

public class Flight implements Serializable {
  private final static long SerialVersionUID = 1L;
  int id;
  String date;
  String destination;
  int capacity=0;
  public Flight(int id, String date, String destination, int capacity){
    this.id = id;
    this.date = date;
    this.destination = destination;
    this.capacity = capacity;
  }

  public static long getSerialVersionUID() {
    return SerialVersionUID;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Flight{" +
            "id=" + id +
            ", date='" + date + '\'' +
            ", destination='" + destination + '\'' +
            ", capacity=" + capacity +
            '}';
  }
}
