package app.service;

import app.dao.DAOBooking;
import app.dao.DAOFlight;
import app.dao.DAOUser;
import app.entity.Booking;
import app.entity.Flight;

import java.io.File;

public class Service {
  DAOBooking daoBooking;
  static DAOFlight daoFlight = new DAOFlight(new File("DAOFlight.txt"));
  DAOUser daoUser;
  Flight flight;
  Booking booking;
  public Service(DAOBooking daoBooking, DAOFlight daoFlight, DAOUser daoUser) {
    this.daoBooking = daoBooking;
    this.daoUser =daoUser;
    this.daoFlight = daoFlight;
  }

  public void getallFlights() {
    System.out.println(daoFlight.getAll());
  }



}
