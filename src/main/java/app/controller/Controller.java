package app.controller;


import app.dao.DAOBooking;
import app.dao.DAOFlight;
import app.dao.DAOUser;
import app.entity.Booking;
import app.entity.Flight;
import app.entity.Person;
import app.io.Console;
import app.io.ConsoleMain;
import app.service.Service;

import java.io.File;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Controller {
    private static int FLIGHTid;
  Service service;
  Console console;
  Scanner sc = new Scanner(System.in);
  DAOFlight daoFlight = new DAOFlight(new File("DAOFlight.txt"));
  DAOBooking daoBooking = new DAOBooking(new File("DAOBooking.txt"));
  DAOUser daoUser = new DAOUser(new File("DAOUser1.txt"));

  public Controller(ConsoleMain console, Service service) {
    this.service = service;
    this.console = console;
  }

  public void show() {
    service.getallFlights();
  }

  public void search() {
    System.out.print("Please enter ID of the flight ");
    String searchedID= sc.nextLine();
    FLIGHTid = Integer.parseInt(searchedID);
    System.out.println("id "+ FLIGHTid + " "+ " flight "+daoFlight.get(FLIGHTid));

  }

  public void book(int user_id) {
    System.out.println("Welcome to booking");
    int seats;
    int flight_id;
    String name="";
    String surname="";
    Person person;
    int remaining_places=0;

    List<Person> people = new ArrayList<>();
      System.out.println(" Please enter a flight id which you want to choose ");
      try {
        flight_id = Integer.parseInt(sc.nextLine());
      }catch (Exception ex){
        System.out.println("Invalid Input Please try again");
        flight_id = Integer.parseInt(sc.nextLine());
      }

      System.out.println("Please enter how many ticket are you going to purchase ");
      try {
        seats = Integer.parseInt(sc.nextLine());
      }catch (Exception ex){
        System.out.println("Invalid Input Please try again");
        seats = Integer.parseInt(sc.nextLine());
      }

    for (int i = 0; i <seats ; i++) {
        System.out.println("Please enter name of passenger ");
        try {
          name = sc.nextLine();
        }catch (Exception ex){
          System.out.println("Invalid Input Please try again");
          name = sc.nextLine();
        }

        System.out.println("Please enter surname of passenger ");
        try {
          surname= sc.nextLine();
        }catch (Exception ex){
          System.out.println("Invalid Input Please try again");
          surname= sc.nextLine();
        }

      person = new Person(name, surname);
      people.add(person);
    }
    Booking booking =new Booking(user_id,flight_id,seats,people);
      daoBooking.create(booking);
      System.out.println("Your booking and flight info "+ daoBooking.getAll().toString()+"\n"+daoFlight.get(flight_id));


    Flight flight = daoFlight.get(user_id).get();
    int all_places=flight.getCapacity();
    if(all_places-seats>=0){
      flight.setCapacity(all_places-seats);
    }else {
      System.out.println("There is no place(");
    }


  }


}
