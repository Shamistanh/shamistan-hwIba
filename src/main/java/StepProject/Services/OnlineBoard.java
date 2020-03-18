package StepProject.Services;

import StepProject.DAO.DAO;
import StepProject.DAO.DAOFlight;
import StepProject.DAO.DAOFlightFileText;
import StepProject.DAO.Flight;

import java.util.Collection;

public class OnlineBoard {
    DAO<Flight> dao = new DAOFlightFileText("FLIGHTS.txt");
  public Collection<Flight> getALL(){

      return dao.getAll();
  }

}
